package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class ProjectsAnalyzer {
	
	/**
	 * INPUT_DIRECTORY is the location of model files
	 */
	private final static String INPUT_DIRECTORY = "/Users/nicolas/Documents/Repositorios/ETLMetrics/generated/models";
	
	/**
	 * OUTPUT_DIRECTORY is the output where generated reports will be placed
	 */
	private final static String OUTPUT_DIRECTORY = "/Users/nicolas/Documents/Repositorios/ETLMetrics/generated/reports";
	
	/**
	 * OPERATION_TYPE is the operation type used by HAETAE, it might be AST2vrETL or AST2trETL
	 */
	private final static String EVL_FILE = "finder/BadSmellsFinder.evl";
	
	/**
	 * Here we store all our ETL Files
	 */
	private ArrayList<File> modelFiles;
	
	/**
	 * Here we store all found EVL Constraints
	 */
	private HashMap<File, ArrayList<String>> evlConstraints;
	
	/**
	 * Here we store the total amount of constraints
	 */
	private int totalConstraints;
	
	protected ArrayList<String> registeredMetamodels = new ArrayList<String>(); 
	
	/**
	 * This is our constructor
	 */
	public ProjectsAnalyzer()
	{
		// Initialize
		modelFiles = new ArrayList<File>();
		evlConstraints = new HashMap<File, ArrayList<String>>();
		totalConstraints = 0;
		
		// Find all ETL files
		addModelFiles(INPUT_DIRECTORY);
		
		try{
			registerMetamodels();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		// Process them!
		processFiles();
	}
	
	/**
	 * This method get their model using HAETAE
	 * @param args
	 */
	public void processFiles()
	{
		// Process each one
		for (int i = 0; i < modelFiles.size(); i++)
		{
			// Create an EvlModule
			EvlModule module = new EvlModule();
			
			// Parse it!
			try {
				module.parse(new File(EVL_FILE));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Unable to parse file, please ensure the file does not contain syntax errors");
			}
			
			// Errors?
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
			}
			
			// Add required models
			try {
				module.getContext().getModelRepository().addModel(
					createEmfModel("ETL", modelFiles.get(i).getAbsolutePath(), "", true, true)
				);
			} catch (EolModelLoadingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// Execute!
			try {
				module.execute();
			} catch (EolRuntimeException e) {
				e.printStackTrace();
				System.err.println("Error executing the EVL file: " + e.getMessage());
			}
			
			// Check all unsatisfied constraints
			Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
			totalConstraints = unsatisfied.size();
			
			// Adding a list!
			ArrayList<String> constraints = new ArrayList<String>();
			if (evlConstraints.containsKey(modelFiles.get(i)))
			{
				constraints = evlConstraints.get(modelFiles.get(i));
			}
			
			// Add the to the list
			for (UnsatisfiedConstraint uc : unsatisfied)
			{
				constraints.add(uc.getMessage());
			}
			
			// Store it!
			evlConstraints.put(modelFiles.get(i), constraints);
			
			// Tidy up
			module.getContext().getModelRepository().dispose();
			
			// Retrieve our models
			/*System.out.println("Adding metamodels");
			module.getContext().getModelRepository().addModel(createEmfModel("ETL", modelFiles.get(i).getAbsolutePath(), true, false));
			System.out.println("Closing metamodels");
			
			// Unsatisfied constraints
			Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
			System.out.println("Model: " + modelFiles.get(i).getAbsolutePath().replace(INPUT_DIRECTORY, "") + " - Unsatisfied : " + unsatisfied.size());
		
			EvlStandaloneExample evlStandaloneExample = new EvlStandaloneExample();
			evlStandaloneExample.setModelUri(modelFiles.get(i).getAbsolutePath());
			
			try {
				evlStandaloneExample.execute();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Adding to the list!
			ArrayList<String> constraints = new ArrayList<String>();
			if (evlConstraints.containsKey(modelFiles.get(i)))
			{
				constraints = evlConstraints.get(modelFiles.get(i));
			}
			
			for (UnsatisfiedConstraint uc : unsatisfied)
			{
				constraints.add(uc.getMessage());
				totalConstraints++;
			}
			
			evlConstraints.put(modelFiles.get(i), constraints);
			*/
			
			
			// WORKING DUMMY DATA
			/*
			// Adding to the list!
			ArrayList<String> constraints = new ArrayList<String>();
			if (evlConstraints.containsKey(modelFiles.get(i)))
			{
				constraints = evlConstraints.get(modelFiles.get(i));
			}
			
			Random r = new Random();
			int Low = 1;
			int High = 25;
			int codeNumber = (r.nextInt(High-Low) + Low);
			String stringCodeNumber = codeNumber + "";
			
			if (codeNumber < 10)
				stringCodeNumber = "0" + codeNumber;
			
			constraints.add("[" + stringCodeNumber + "] Bla bla bla");
			evlConstraints.put(modelFiles.get(i), constraints);
			totalConstraints++;
			*/
		}
	}
	
	/**
     * Recursive method that finds and stores all ETL
     * @param path
     */
    private void addModelFiles( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addModelFiles( f.getAbsolutePath() );
            }
            else if (f.getName().endsWith(".model")) {
            	modelFiles.add(f);
            }
        }
    }
    
    protected EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
    	
		EmfModel emfModel = new EmfModel();
		emfModel.setName(name);
		emfModel.setReadOnLoad(readOnLoad);
		emfModel.setStoredOnDisposal(storeOnDisposal);
		emfModel.setMetamodelUri("http://www.eclipse.org/epsilon/etl");
		emfModel.setModelFile(model);
		
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
    }
    
    protected void registerMetamodels()
    {
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
    	
    	ResourceSet resourceSet = new ResourceSetImpl(); 
		Resource myMetaModel= resourceSet.getResource(URI.createFileURI("metamodels/EOL.ecore"), true);
		EPackage univEPackage = (EPackage) myMetaModel.getContents().get(0);
		resourceSet.getPackageRegistry().put("http://www.eclipse.org/epsilon/eol", univEPackage);
		
		Resource myMetaModel2 = resourceSet.getResource(URI.createFileURI("metamodels/ETL.ecore"), true);
		EPackage univEPackage2 = (EPackage) myMetaModel2.getContents().get(0);
		resourceSet.getPackageRegistry().put("http://www.eclipse.org/epsilon/etl", univEPackage2);
		System.out.println("Tam: " + resourceSet.getPackageRegistry().size());
    }
    
    /*protected EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
    	
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_ALIASES, name);
		properties.put(EmfModel.PROPERTY_EXPAND, true + "");
		
		if (metamodel.contains(","))
		{
			String[] metamodels = metamodel.split(",");
			String[] metamodelsUri = new String[metamodels.length];
			
			for (int i = 0; i < metamodels.length; i++)
			{
				metamodelsUri[i] = new File(metamodels[i]).toURI().toString();
			}
			
			StringBuilder sbStr = new StringBuilder();
		    for (int i = 0, il = metamodelsUri.length; i < il; i++) {
		        if (i > 0)
		            sbStr.append(",");
		        sbStr.append(metamodelsUri[i]);
		    }
		    
		    properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, sbStr.toString());
		}
		else
		{
			properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, new File(metamodel).toURI().toString());
		}
		
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
		properties.put(EmfModel.PROPERTY_MODEL_FILE, new File(model).toURI());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
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
    
    protected java.net.URI getFileURI(String fileName) throws URISyntaxException {
		
    	java.net.URI binUri = ProjectsAnalyzer.class.getResource(fileName).toURI();
    	java.net.URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new java.net.URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
    
    public void registerMetamodel(String metamodelFile) throws Exception {
		if (registeredMetamodels.contains(metamodelFile)) return;
		EmfUtil.register(
				URI.createURI(new File(metamodelFile).getAbsolutePath()),
				EPackage.Registry.INSTANCE);
		registeredMetamodels.add(metamodelFile);
	}*/
    
    public String getOutputDirectory()
    {
    	return OUTPUT_DIRECTORY;
    }
    
    public String getInputDirectory()
    {
    	return INPUT_DIRECTORY;
    }
    
    public ArrayList<File> getModelFiles()
    {
    	return modelFiles;
    }
    
    public void setModelFiles(ArrayList<File> modelFiles)
    {
    	this.modelFiles = modelFiles;
    }
    
    public HashMap<File, ArrayList<String>> getEvlConstraints()
    {
    	return evlConstraints;
    }
    
    public void setEvlConstraints(HashMap<File, ArrayList<String>> evlConstraints)
    {
    	this.evlConstraints = evlConstraints;
    }

	public int getTotalConstraints() {
		return totalConstraints;
	}

	public void setTotalConstraints(int totalConstraints) {
		this.totalConstraints = totalConstraints;
	}

	public void logLine(String string) {
		System.out.println(string);
	}
}