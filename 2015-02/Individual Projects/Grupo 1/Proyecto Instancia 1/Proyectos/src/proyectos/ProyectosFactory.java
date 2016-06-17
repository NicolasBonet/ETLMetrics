/**
 */
package proyectos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage
 * @generated
 */
public interface ProyectosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectosFactory eINSTANCE = proyectos.impl.ProyectosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Market Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Market Place</em>'.
	 * @generated
	 */
	MarketPlace createMarketPlace();

	/**
	 * Returns a new object of class '<em>Promocion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Promocion</em>'.
	 * @generated
	 */
	Promocion createPromocion();

	/**
	 * Returns a new object of class '<em>Mapa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapa</em>'.
	 * @generated
	 */
	Mapa createMapa();

	/**
	 * Returns a new object of class '<em>Contacto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contacto</em>'.
	 * @generated
	 */
	Contacto createContacto();

	/**
	 * Returns a new object of class '<em>Catalogo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalogo</em>'.
	 * @generated
	 */
	Catalogo createCatalogo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProyectosPackage getProyectosPackage();

} //ProyectosFactory
