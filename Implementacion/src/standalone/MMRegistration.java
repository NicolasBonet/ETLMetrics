package standalone;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MMRegistration {
	public static void main(String[] args) {
		
		ResourceSet ecoreResourceSet = new ResourceSetImpl();
		ecoreResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		Resource ecoreResource = ecoreResourceSet.createResource(URI.createFileURI(new File("metamodels/EOL.ecore").getAbsolutePath()));
		try {
			ecoreResource.load(null);
			ecoreResource = ecoreResourceSet.createResource(URI.createFileURI(new File("metamodels/ETL.ecore").getAbsolutePath()));
			ecoreResource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (EObject o : ecoreResource.getContents()) {
			EPackage ePackage = (EPackage) o;
			ecoreResourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
		}
	}
}
