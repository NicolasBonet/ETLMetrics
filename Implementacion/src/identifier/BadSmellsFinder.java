package identifier;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

/**
 * This class invokes finds all the model files generated with HaetaeCaller and invokes an EVL file from the location
 * EVL_FILE to gather all the statements found on those model files and creates a report at the OUTPUT directory. This class
 * shouldn't be invoked directly!
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class BadSmellsFinder {
	
	/**
	 * OPERATION_TYPE is the operation type used by HAETAE, it might be AST2vrETL or AST2trETL
	 */
	private final static String EVL_FILE = "finder/BadSmellsFinder.evl";
	
	/**
	 * modelsDirectory is the location of model files
	 */
	private String modelsDirectory;
	
	/**
	 * reportsDirectory is the output where generated reports will be placed
	 */
	private String reportsDirectory;
	
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
	public BadSmellsFinder(String modelsDirectory, String reportsDirectory)
	{
		// Initialize
		this.modelFiles = new ArrayList<File>();
		this.evlConstraints = new HashMap<File, ArrayList<String>>();
		this.totalConstraints = 0;
		this.reportsDirectory = reportsDirectory;
		this.modelsDirectory = modelsDirectory;
		
		// Find all ETL files
		addModelFiles(this.modelsDirectory);
		
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
			// Parsing
			System.out.println("Parsing: " + modelFiles.get(i).getAbsolutePath());
			
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
					createEmfModel("ETL", modelFiles.get(i).getAbsolutePath(), "/metamodels/ETL.ecore", true, true)
				);
			} catch (EolModelLoadingException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				// e1.printStackTrace();
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
    
    /**
     * Crea un EmfModel para ser usado por el EVL como parametro de ejecución.
     */
    protected EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI("EOL.ecore").toString());
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI("ETL.ecore").toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				"file:/" + model);
		
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

    protected java.net.URI getFileURI(String fileName) throws URISyntaxException {
		
    	java.net.URI binUri = this.getClass().getClassLoader().getResource(fileName).toURI();
    	java.net.URI uri = null;
    	
    	if (binUri.toString().indexOf("bin") > -1) {
			uri = new java.net.URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
    
    /**
     * Registra los metamodelos EOL y ETL.
     */
    protected void registerMetamodels()
    {
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
    	
    	ResourceSet resourceSet = new ResourceSetImpl(); 
		Resource myMetaModel = resourceSet.getResource(URI.createFileURI("metamodels/EOL.ecore"), true);
		EPackage univEPackage = (EPackage) myMetaModel.getContents().get(0);
		resourceSet.getPackageRegistry().put(univEPackage.getNsURI(), univEPackage);
		
		Resource myMetaModel2 = resourceSet.getResource(URI.createFileURI("metamodels/ETL.ecore"), true);
		EPackage univEPackage2 = (EPackage) myMetaModel2.getContents().get(0);
		resourceSet.getPackageRegistry().put(univEPackage2.getNsURI(), univEPackage2);
		
		System.out.println(univEPackage.toString());
		System.out.println(univEPackage2.toString());
		System.out.println("Tam: " + resourceSet.getPackageRegistry().size());
    }
    
    /**
     * Getters y setters
     */
    
    public String getOutputDirectory()
    {
    	return reportsDirectory;
    }
    
    public String getInputDirectory()
    {
    	return modelsDirectory;
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

	/**
     * Metodo que registrar los logs
     */
	public void logLine(String string) {
		System.out.println(string);
	}
}