/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GrammarSqlStandaloneSetup extends GrammarSqlStandaloneSetupGenerated {

	def static void doSetup() {
		new GrammarSqlStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
