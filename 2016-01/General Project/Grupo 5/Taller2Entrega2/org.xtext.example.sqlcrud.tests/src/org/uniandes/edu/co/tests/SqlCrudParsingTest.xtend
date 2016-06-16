/*
 * generated by Xtext 2.9.1
 */
package org.uniandes.edu.co.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.uniandes.edu.co.sqlCrud.Database

@RunWith(XtextRunner)
@InjectWith(SqlCrudInjectorProvider)
class SqlCrudParsingTest{

	@Inject
	ParseHelper<Database> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
