package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class MetricsGenerator {
	
	/**
	 * INPUT_DIRECTORY is the location of model files
	 */
	private final static String INPUT_DIRECTORY = "/Users/mac/Documents/Repositorios/ETLMetrics/generated/models";
	
	/**
	 * OUTPUT_DIRECTORY is the output where generated reports will be placed
	 */
	private final static String OUTPUT_DIRECTORY = "/Users/mac/Documents/Repositorios/ETLMetrics/generated/reports";
	
	/**
	 * OPERATION_TYPE is the operation type used by HAETAE, it might be AST2vrETL or AST2trETL
	 */
	private final static String EVL_FILE = "/finder/BadSmellsFinder.evl";
	
	/**
	 * Here we store all our ETL Files
	 */
	private ArrayList<File> modelFiles;
	
	/**
	 * This is our constructor
	 */
	public MetricsGenerator()
	{
		// Initialize
		modelFiles = new ArrayList<File>();
		
		// Find all ETL files
		addModelFiles(INPUT_DIRECTORY);
		
		// Register metamodels
		registerMetamodel(URI.createFileURI("./metamodels/EOL.ecore"));
		registerMetamodel(URI.createFileURI("./metamodels/ETL.ecore"));
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
			// Parse EVL File
			EolLibraryModule module = new EvlModule();
			try {
				module.parse(modelFiles.get(i));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Unable to parse file, please ensure the file does not contain syntax errors");
			}
			
			// Retrieve our models
			module.getContext().getModelRepository().addModel(createEmfModel("ETL", modelFiles.get(i).getAbsolutePath(), true, false));

			// Unsatisfied constraints
			EvlModule evlModule = (EvlModule) module;
			Collection<UnsatisfiedConstraint> unsatisfied = evlModule.getContext().getUnsatisfiedConstraints();
			System.out.println(unsatisfied.toString());
			
			break;
		}
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		MetricsGenerator haetae = new MetricsGenerator();
		haetae.processFiles();
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
    
    protected void registerMetamodel(URI metamodelUri)
    {
    	Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());

		ResourceSet rs = new ResourceSetImpl();
		// enable extended metadata
		final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
		    extendedMetaData);
		
		Resource r = rs.getResource(metamodelUri, true);
		EObject eObject = r.getContents().get(0);
		if (eObject instanceof EPackage) {
		    EPackage p = (EPackage)eObject;
		    rs.getPackageRegistry().put(p.getNsURI(), p);
		}
    }
    
    protected EmfModel createEmfModel(String name, String model, boolean readOnLoad, boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		
		try {
			properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFileURI("./metamodels/EOL.ecore").toString());
			properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFileURI("./metamodels/ETL.ecore").toString());
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emfModel;
	}
    
    protected java.net.URI getFileURI(String fileName) throws URISyntaxException {
		
    	System.out.println("1: " + MetricsGenerator.class.toString());
    	System.out.println("2: " + MetricsGenerator.class.getClassLoader().toString());
    	
    	java.net.URI binUri = MetricsGenerator.class.getClassLoader().getResource(fileName).toURI();
    	java.net.URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new java.net.URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
}