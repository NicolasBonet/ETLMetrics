/*
 * generated by Xtext
 */
package com.uniandes.config2sql.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractConfigValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.uniandes.config2sql.xtext.config.ConfigPackage.eINSTANCE);
		return result;
	}
}