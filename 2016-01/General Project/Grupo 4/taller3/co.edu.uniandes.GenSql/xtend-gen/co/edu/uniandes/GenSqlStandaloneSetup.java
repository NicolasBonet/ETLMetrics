/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes;

import co.edu.uniandes.GenSqlStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GenSqlStandaloneSetup extends GenSqlStandaloneSetupGenerated {
  public static void doSetup() {
    GenSqlStandaloneSetup _genSqlStandaloneSetup = new GenSqlStandaloneSetup();
    _genSqlStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}