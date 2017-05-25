/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.examples.standalone.evl;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.IEvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.epsilon.examples.standalone.EpsilonStandaloneExample;
import org.eclipse.epsilon.examples.standalone.HTMLMetricsGenerator;
import org.eclipse.epsilon.examples.standalone.ProjectInfo;

/**
 * This example demonstrates using the 
 * Epsilon Validation Language, the model validation language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class EvlStandaloneExample {
	
	protected IEvlModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();
	protected Object result;
	
	// Array of ETL files
	private ArrayList<File> modelFiles;
	private ArrayList<File> etlFiles;
	private HashMap<String, Integer> counterEtlFiles;
	private HashMap<String, Integer> counterModelFiles;

	private final static String modelPath = "/Users/nicolas/Desktop/Dataset/Models";
	private final static String etlPath = "/Users/nicolas/Desktop/Dataset/ETL";
	private final static String reportsPath = "/Users/nicolas/Desktop/Dataset/Reports";
	private ArrayList<String> categories;
	
	public String getCategory(String category){
		if (!category.equals("Senior") && !category.equals("Github"))
			return "Junior";
		else
			return category;
	}

	public static void main(String[] args) throws Exception {
		new EvlStandaloneExample();
	}
	
	public EvlStandaloneExample() throws Exception
	{
		// Contadores
		counterEtlFiles = new HashMap<String, Integer>();
		counterModelFiles = new HashMap<String, Integer>();
		
		// Find categories
		categories = new ArrayList<String>();
		
		File root = new File( etlPath );
        File[] list = root.listFiles();
        
        if (list != null)
        {
	        for ( File f : list )
	            if ( f.isDirectory() )
	            	categories.add(f.getName());
        }
        
        // Store everything here
        ArrayList<Dato> datosDeProyectos = new ArrayList<Dato>();
        
        double minOperations = Integer.MAX_VALUE;
        double maxOperations = Integer.MIN_VALUE;
        double minRules = Integer.MAX_VALUE;
        double maxRules = Integer.MIN_VALUE;
		
        // Browse them
		for (int cat = 0; cat < categories.size(); cat++)
		{
			String mainKey = getCategory(categories.get(cat));
			modelFiles = new ArrayList<File>();
			etlFiles = new ArrayList<File>();
			
			addFiles(etlPath + "/" + categories.get(cat), "etl");
			
			removeFiles(modelPath + "/" + categories.get(cat), "model");
			HaetaeCaller haetae = new HaetaeCaller(etlPath + "/" + categories.get(cat), modelPath + "/" + categories.get(cat), etlFiles);
			haetae.processFiles();
			addFiles(modelPath + "/" + categories.get(cat), "model");
			
			for (int i = 0; i < modelFiles.size(); i++)
			{
				Dato proyecto = new Dato(mainKey, modelFiles.get(i).getName());
				proyecto.setBadSmells(execute(modelFiles.get(i).getAbsolutePath()));
				
				ProjectInfo projectMetrics = new ProjectInfo(modelFiles.get(i).getAbsolutePath().replace(modelPath, etlPath).replace(".etl.model", ".etl"));
				projectMetrics.getOperationsInfo();
				
				HashMap<String, Double> metrics = new HashMap<String, Double>();
				
				try{
					metrics.put("loc", projectMetrics.getLoc());
					metrics.put("rules", projectMetrics.getRules());
					metrics.put("lazy", projectMetrics.getLazyRules());
					metrics.put("hwc", projectMetrics.getOperationsHwc());
					metrics.put("hnc", projectMetrics.getOperationsHnc());
					metrics.put("if", projectMetrics.getNumIf());
					metrics.put("iterators", projectMetrics.getNumIterators());
					metrics.put("self", projectMetrics.getNumSelf());
					metrics.put("vars", projectMetrics.getPromVars());
					metrics.put("operationsperrule", projectMetrics.getCallsOperationsPerRule());
					metrics.put("lazyperrule", projectMetrics.getCallsToLazyRules());
					metrics.put("uselessoperations", projectMetrics.getUselessOperations());
					metrics.put("uselessparameters", projectMetrics.getUselessParameters());
					
					if (projectMetrics.getRules() < minRules)
						minRules = projectMetrics.getRules();
					
					if (projectMetrics.getRules() > maxRules)
						maxRules = projectMetrics.getRules();
					
					if (projectMetrics.getOperations() < minOperations)
						minOperations = projectMetrics.getOperations();
					
					if (projectMetrics.getOperations() > maxOperations)
						maxOperations = projectMetrics.getOperations();
				}
				catch (IOException exception) {
					exception.printStackTrace();
				}
				
				proyecto.setMetrics(metrics);
				datosDeProyectos.add(proyecto);
			}
			
			
			// new ExcelGenerator(reportsPath, modelPath + "/" + categories.get(cat), hmap, categories.get(cat));
			// new HTMLMetricsGenerator(etlPath + "/" + categories.get(cat), reportsPath + "/" + categories.get(cat));
		}
		
		System.out.println("Min operations: " + minOperations + " - max operations: " + maxOperations + " - min rules: " + minRules + " - max rules: " + maxRules);
		
		new ExcelPrincipalGenerator(this, datosDeProyectos);
	}
	
	public IEvlModule createModule() {
		return new EvlModule();
	}

	public List<IModel> getModels(String modelPath) throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("ETL", modelPath, "models/ETL.ecore", true, false));
		return models;
	}

	public String getSource() throws Exception {
		return "evl/BadSmellsFinder.evl";
	}
	
	public ArrayList<String> execute(String modelPath) throws Exception {
		
		System.out.println("Analyzing: " + modelPath);
		
		ArrayList<String> result = new ArrayList<String>();
		module = createModule();
		module.getContext().getModelRepository().dispose();
		module.parse(getFileURI(getSource()));
		
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return result;
		}
		
		for (IModel model : getModels(modelPath)) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}
		
		module.execute();
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			// System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				// System.err.println(uc.getMessage());
				result.add(uc.getMessage());
			}
		}
		else {
			// System.out.println("All constraints have been satisfied");
		}
		
		module.getContext().getModelRepository().dispose();
		return result;
	}
	
	public List<Variable> getParameters() {
		return parameters;
	}
	
	protected EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI(metamodel).toString());
		
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				"file:" + model);
		
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected EmfModel createEmfModelByURI(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	protected URI getFileURI(String fileName) throws URISyntaxException {
		
		URI binUri = EpsilonStandaloneExample.class.
				getResource(fileName).toURI();
		URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
	
	/**
     * Recursive method that removes all files with the defined extension
     */
    private void removeFiles( String path, String extension ) {

    	// Lists all files in folder
    	File folder = new File(path);
    	File fList[] = folder.listFiles();
    	
    	// None?
    	if (fList == null)
    		return;
    	
    	// Searches the extension
    	for (int i = 0; i < fList.length; i++) {
    	    String pes = fList[i].getName();
    	    if (pes.endsWith("." + extension)) {
    	        fList[i].delete();
    	    }
    	}
    }
	
	/**
     * Recursive method that finds and stores all ETL and Ecores
     */
    private void addFiles( String path, String extension ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;
        
        int c = 0;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addFiles( f.getAbsolutePath(), extension );
            }
            else if (f.getName().endsWith("." + extension)) {
            	if (extension.equals("model"))
            		modelFiles.add(f);
            	else
            		etlFiles.add(f);
            	c++;
            }
        }
        
        if (c > 0)
        	System.out.println(extension.toUpperCase() + " Files - " + path + ": " + c);
    }
    
    public ArrayList<File> getModelFiles() {
		return modelFiles;
	}

	public void setModelFiles(ArrayList<File> modelFiles) {
		this.modelFiles = modelFiles;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public String getReportsPath() {
		return reportsPath;
	}

	public HashMap<String, Integer> getCounterEtlFiles() {
		return counterEtlFiles;
	}

	public void setCounterEtlFiles(HashMap<String, Integer> counterEtlFiles) {
		this.counterEtlFiles = counterEtlFiles;
	}

	public HashMap<String, Integer> getCounterModelFiles() {
		return counterModelFiles;
	}

	public void setCounterModelFiles(HashMap<String, Integer> counterModelFiles) {
		this.counterModelFiles = counterModelFiles;
	}

	public ArrayList<File> getEtlFiles() {
		return etlFiles;
	}

	public void setEtlFiles(ArrayList<File> etlFiles) {
		this.etlFiles = etlFiles;
	}

	public String getModelpath() {
		return modelPath;
	}
	
	public String getEtlpath() {
		return etlPath;
	}

	public static String getReportspath() {
		return reportsPath;
	}
}
