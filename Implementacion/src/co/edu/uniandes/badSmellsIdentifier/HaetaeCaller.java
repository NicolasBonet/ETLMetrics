package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.impl.EtlTypeResolver;
import org.eclipse.epsilon.etl.visitor.resolution.variable.impl.EtlVariableResolver;

public class HaetaeCaller {
	
	/**
	 * INPUT_DIRECTORY is the location of ETL Files
	 */
	private final static String INPUT_DIRECTORY = "/Users/nicolas/Documents/Repositorios/ETLMetrics";
	
	/**
	 * OUTPUT_DIRECTORY is the output where generated models will be placed
	 */
	private final static String OUTPUT_DIRECTORY = "/Users/nicolas/Documents/Repositorios/ETLMetrics/generated/models";
	
	/**
	 * OPERATION_TYPE is the operation type used by HAETAE, it might be AST2vrETL or AST2trETL
	 */
	private final static String OPERATION_TYPE = "AST2vrETL";
	
	/**
	 * Here we store all our ETL Files
	 */
	private ArrayList<File> etlFiles;
	
	/**
	 * This is our constructor
	 */
	public HaetaeCaller()
	{
		// Initialize
		etlFiles = new ArrayList<File>();
		
		// Find all ETL files
		addEtlFiles(INPUT_DIRECTORY);
	}
	
	/**
	 * This method get their model using HAETAE
	 * @param args
	 */
	public void processFiles()
	{
		// Process each one
		for (int i = 0; i < etlFiles.size(); i++)
		{
			// Parse ETL Files
			EolLibraryModule module = new EtlModule();
			
			try {
				module.parse(etlFiles.get(i));
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Unable to parse file, please ensure the file does not contain syntax errors");
			}

			// Assign the context
			Ast2EolContext context = new Ast2EtlContext(module);
			EOLElement eolElement = null;
			
			try {
				Ast2EtlContext leContext = (Ast2EtlContext) context;
				eolElement = leContext.getEtlElementCreatorFactory().createEOLElement(module.getAst(), null, leContext);
			} catch (Exception e) {
				System.out.println("Unable to parse file " + etlFiles.get(i).getAbsolutePath() + ", please ensure the file does not contain syntax errors");
				continue;
			}
			
			// See how to operate
			if (OPERATION_TYPE.equals("AST2vrETL")) {
				EtlVariableResolver etlVR = new EtlVariableResolver();
				etlVR.run(eolElement);
			}
			else if (OPERATION_TYPE.equals("AST2trETL")) {
				EtlVariableResolver etlVR = new EtlVariableResolver();
				etlVR.run(eolElement);
				EtlTypeResolver etlTR = new EtlTypeResolver();
				etlTR.run(eolElement);
			}
			
			// Save generated model
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(URI.createFileURI(new File(etlFiles.get(i).getAbsolutePath().replace(INPUT_DIRECTORY, OUTPUT_DIRECTORY) + ".model").getAbsolutePath()));
			resource.getContents().add(eolElement);
			boolean success2 = true;
			
			try {
				resource.save(null);
			} catch (IOException e) {
				success2 = false;
			}
			
			// If everything went just fine, report it!
			if (success2)
				System.out.println("Transformation completed, " + etlFiles.get(i).getName() + ".model saved to directory");
			else
				System.out.println("Unable to save file");
		}
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		HaetaeCaller haetae = new HaetaeCaller();
		haetae.processFiles();
	}
	
	/**
     * Recursive method that finds and stores all ETL
     * @param path
     */
    private void addEtlFiles( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null)
        	return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
            	addEtlFiles( f.getAbsolutePath() );
            }
            else if (f.getName().endsWith(".etl")) {
            	etlFiles.add(f);
            }
        }
    }
}