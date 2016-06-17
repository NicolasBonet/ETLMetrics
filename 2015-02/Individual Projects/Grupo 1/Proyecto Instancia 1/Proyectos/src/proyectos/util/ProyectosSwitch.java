/**
 */
package proyectos.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import proyectos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage
 * @generated
 */
public class ProyectosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosSwitch() {
		if (modelPackage == null) {
			modelPackage = ProyectosPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProyectosPackage.MARKET_PLACE: {
				MarketPlace marketPlace = (MarketPlace)theEObject;
				T result = caseMarketPlace(marketPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectosPackage.PAGINA: {
				Pagina pagina = (Pagina)theEObject;
				T result = casePagina(pagina);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectosPackage.PROMOCION: {
				Promocion promocion = (Promocion)theEObject;
				T result = casePromocion(promocion);
				if (result == null) result = casePagina(promocion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectosPackage.MAPA: {
				Mapa mapa = (Mapa)theEObject;
				T result = caseMapa(mapa);
				if (result == null) result = casePagina(mapa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectosPackage.CONTACTO: {
				Contacto contacto = (Contacto)theEObject;
				T result = caseContacto(contacto);
				if (result == null) result = casePagina(contacto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProyectosPackage.CATALOGO: {
				Catalogo catalogo = (Catalogo)theEObject;
				T result = caseCatalogo(catalogo);
				if (result == null) result = casePagina(catalogo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Market Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Market Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarketPlace(MarketPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagina</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagina(Pagina object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promocion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promocion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePromocion(Promocion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapa(Mapa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contacto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contacto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContacto(Contacto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catalogo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catalogo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatalogo(Catalogo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProyectosSwitch
