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
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
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

/**
 * This example demonstrates using the 
 * Epsilon Validation Language, the model validation language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class EvlStandaloneExample_Simplificado {
	
	protected IEvlModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();
	protected Object result;
	
	// Array of ETL files
	private ArrayList<File> modelFiles;
	private ArrayList<File> etlFiles;

	private final static String modelPath = "/Users/nicolas/Desktop/Dataset/Models";
	private final static String etlPath = "/Users/nicolas/Desktop/Dataset/ETL";
	private final static String reportsPath = "/Users/nicolas/Desktop/Dataset/Reports";

	public static void main(String[] args) throws Exception {
		EvlStandaloneExample_Simplificado evlStandaloneExample = new EvlStandaloneExample_Simplificado();
		
		for (int i = 0; i < evlStandaloneExample.getModelFiles().size(); i++)
		{
			ArrayList<String> constraints = evlStandaloneExample.execute(evlStandaloneExample.getModelFiles().get(i).getAbsolutePath());
			new ExcelGenerator_Simplificado(reportsPath, modelPath, evlStandaloneExample.getModelFiles().get(i).getAbsolutePath(), constraints);
		}
	}
	
	public EvlStandaloneExample_Simplificado()
	{
		modelFiles = new ArrayList<File>();
		etlFiles = new ArrayList<File>();
		
		addETLFiles(etlPath);
		HaetaeCaller haetae = new HaetaeCaller(etlPath, modelPath, etlFiles);
		haetae.processFiles();
		addModelFiles(modelPath);
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
     * Recursive method that finds and stores all ETL and Ecores
     */
    private void addModelFiles( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;
        
        int c = 0;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addModelFiles( f.getAbsolutePath() );
            }
            else if (f.getName().endsWith(".model")) {
            	modelFiles.add(f);
            	c++;
            }
        }
        
        if (c > 0)
        	System.out.println("Model Files - " + path + ": " + c);
    }
    
    /**
     * Recursive method that finds and stores all ETL and Ecores
     */
    private void addETLFiles( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;
        
        int c = 0;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addETLFiles( f.getAbsolutePath() );
            }
            else if (f.getName().endsWith(".etl")) {
            	etlFiles.add(f);
            	c++;
            }
        }
        
        if (c > 0)
        	System.out.println("ETL Files - " + path + ": " + c);
    }
    
    public ArrayList<File> getModelFiles() {
		return modelFiles;
	}

	public void setModelFiles(ArrayList<File> modelFiles) {
		this.modelFiles = modelFiles;
	}
}
