/**
 */
package webApiInput;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSharp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.CSharp#getClases <em>Clases</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getCSharp()
 * @model
 * @generated
 */
public interface CSharp extends EObject {
	/**
	 * Returns the value of the '<em><b>Clases</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Clase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clases</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getCSharp_Clases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clase> getClases();

} // CSharp
