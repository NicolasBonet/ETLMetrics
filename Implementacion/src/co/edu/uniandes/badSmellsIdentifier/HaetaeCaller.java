package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.EolLibraryModule;
import org.eclipse.epsilon.eol.ast2eol.context.Ast2EolContext;
import org.eclipse.epsilon.eol.dom.ModelDeclaration;
import org.eclipse.epsilon.eol.metamodel.EOLElement;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.etl.ast2etl.Ast2EtlContext;
import org.eclipse.epsilon.etl.visitor.resolution.type.impl.EtlTypeResolver;
import org.eclipse.epsilon.etl.visitor.resolution.variable.impl.EtlVariableResolver;

/**
 * This class invokes the Eclipse plugin HAETAE and it gathers all the models found at the INPUT_DIRECTORY and creates
 * their respective models at the OUTPUT_DIRECTORY. 
 * 
 * @author Nicolás Bonet Gonzalez
 */
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
	 * Here we store all our temporal metamodel Files
	 */
	private ArrayList<File> tempFiles;
	
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
				System.out.println("Running for " + etlFiles.get(i).getName() + " - " + etlFiles.get(i).getAbsolutePath());
				
				// Tidy up temp files
				tempFiles = new ArrayList<File>();
				
				// Now browser model declarations on this transformation
				for (int d = 0; d < module.getDeclaredModelDeclarations().size(); d++)
				{
					// Now check only the second parameter
					for (int q = 0; q < module.getDeclaredModelDeclarations().get(d).getChild(2).getChildren().size(); q++)
					{
						// Finally navigate the tree of chldrens
						for (int r = 0; r < module.getDeclaredModelDeclarations().get(d).getChild(2).getChildren().get(q).getChildren().size(); r++)
						{
							// If we've defined a path, try to load the metamodel!
							if (module.getDeclaredModelDeclarations().get(d).getChild(2).getChildren().get(q).getChildren().get(r).toString().equals("path"))
							{
								// Define the metamodel we are looking for
								String newName = module.getDeclaredModelDeclarations().get(d).getChild(2).getChildren().get(q).getChildren().get(r + 1).toString();
								File mmFile = new File(newName);
								tempFiles.add(mmFile);
								
								// Copy the ecore
								try {
									copyFileUsingFileStreams(new File(etlFiles.get(i).getAbsolutePath().replace(etlFiles.get(i).getName(), newName)), mmFile);
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
				
				EtlVariableResolver etlVR = new EtlVariableResolver();
				
				if (!etlFiles.get(i).getName().equals("Newsletter2HTML.etl"))
				{
					etlVR.run(eolElement);
				}
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
			
			// Delete temporal files
			for (int temp = 0; temp < tempFiles.size(); temp++)
			{
				tempFiles.get(temp).delete();
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
    
    /**
     * Private method used to copy ecore files
     * @param source
     * @param dest
     * @throws IOException
     */
    private static void copyFileUsingFileStreams(File source, File dest) throws IOException {
    	InputStream input = null;
    	OutputStream output = null;
    	try {
    		input = new FileInputStream(source);
    		output = new FileOutputStream(dest);
    		byte[] buf = new byte[1024];
    		int bytesRead;
    		while ((bytesRead = input.read(buf)) > 0) {
    			output.write(buf, 0, bytesRead);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	finally {
    	
    		input.close();
    		output.close();
    	}
    }
}