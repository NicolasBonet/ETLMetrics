package co.edu.uniandes.badSmellsIdentifier;

import java.io.File;
import java.io.IOException;

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
	
	public static void main(String[] args) {
		
		// The array of files
		File[] files = new File[1];
		
		// Process each one
		for (int i = 0; i < files.length; i++)
		{
			EolLibraryModule module = new EtlModule();
			
			try {
				module.parse(files[i]);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Unable to parse file, please ensure the file does not contain syntax errors");
			}

			Ast2EolContext context = new Ast2EtlContext(module);
			EOLElement eolElement = null;
			
			try {
				Ast2EtlContext leContext = (Ast2EtlContext) context;
				eolElement = leContext.getEtlElementCreatorFactory().createEOLElement(module.getAst(), null, leContext);
			} catch (Exception e) {
				System.out.println("Unable to parse file, please ensure the file does not contain syntax errors");
				continue;
			}
			
			if (getOperationType().equals("AST2vrETL")) {
				EtlVariableResolver etlVR = new EtlVariableResolver();
				etlVR.run(eolElement);
			}
			else if (getOperationType().equals("AST2trETL")) {
				EtlVariableResolver etlVR = new EtlVariableResolver();
				etlVR.run(eolElement);
				EtlTypeResolver etlTR = new EtlTypeResolver();
				etlTR.run(eolElement);
			}
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
			Resource resource = resourceSet.createResource(URI.createFileURI(new File(files[i].getAbsolutePath() + ".model").getAbsolutePath()));
			resource.getContents().add(eolElement);
			boolean success2 = true;
			
			try {
				resource.save(null);
			} catch (IOException e) {
				success2 = false;
				System.out.println("Unable to save file");
			}
			
			if (success2)
				System.out.println("Transformation completed, " + files[i].getName() + ".etl.model saved to directory");
		}
	}
	
	private static String getOperationType()
	{
		return "AST2vrETL";
		//return "AST2trETL";
	}
}