/**
 */
package webApiInput;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.Metodo#getParametros <em>Parametros</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getMetodo()
 * @model
 * @generated
 */
public interface Metodo extends TypedObject {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Parametro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parametros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getMetodo_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parametro> getParametros();

} // Metodo
