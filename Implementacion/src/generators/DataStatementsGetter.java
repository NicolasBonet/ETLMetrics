package generators;

import java.io.File;
import java.io.PrintStream;
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
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

/**
 * This class generates HTML Reports with all the statements found in the ETL Project set at Project Analyzer.
 * 
 * @author Nicolás Bonet Gonzalez
 */
public class DataStatementsGetter {
	
	/**
	 * INPUT_DIRECTORY is the location of model files
	 */
	private final static String INPUT_DIRECTORY = "/Users/nicolas/Documents/Repositorios/ETLMetrics/generated/models";
	
	/**
	 * EOL_FILE is the location of the EOL
	 */
	private final static String EOL_FILE = "finder/finder.eol";
	
	/**
	 * Here we store all our ETL Files
	 */
	private ArrayList<File> modelFiles;
	
	/**
	 * Here we store the total amount of constraints
	 */
	private int totalConstraints;
	
	protected ArrayList<String> registeredMetamodels = new ArrayList<String>(); 
	
	/**
	 * This is our constructor
	 */
	public DataStatementsGetter()
	{
		// Initialize
		modelFiles = new ArrayList<File>();
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
			// Parsing
			System.out.println("Parsing: " + modelFiles.get(i).getAbsolutePath());
			
			// Create an EolModule
			EolModule module = new EolModule();
			
			// Parse it!
			try {
				module.parse(new File(EOL_FILE));
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
				System.err.println("Error executing the EOL file: " + e.getMessage());
			}
			
			System.out.println("  ");
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
    	
    	// System.out.println("Loading file: " + binUri);
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new java.net.URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
    
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
    
    public int getTotalConstraints() {
		return totalConstraints;
	}

	public void setTotalConstraints(int totalConstraints) {
		this.totalConstraints = totalConstraints;
	}

	public void logLine(String string) {
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Empezando");
		
		new DataStatementsGetter();
		
		System.out.println("Terminando");
	}
}