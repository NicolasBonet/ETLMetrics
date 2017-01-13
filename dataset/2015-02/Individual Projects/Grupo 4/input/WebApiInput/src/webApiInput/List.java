/**
 */
package webApiInput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.List#getClase <em>Clase</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getList()
 * @model
 * @generated
 */
public interface List extends EObject {
	/**
	 * Returns the value of the '<em><b>Clase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clase</em>' reference.
	 * @see #setClase(Clase)
	 * @see webApiInput.WebApiInputPackage#getList_Clase()
	 * @model required="true"
	 * @generated
	 */
	Clase getClase();

	/**
	 * Sets the value of the '{@link webApiInput.List#getClase <em>Clase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clase</em>' reference.
	 * @see #getClase()
	 * @generated
	 */
	void setClase(Clase value);

} // List
