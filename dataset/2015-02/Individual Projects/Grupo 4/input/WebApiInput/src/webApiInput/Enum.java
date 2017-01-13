/**
 */
package webApiInput;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.Enum#getValores <em>Valores</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends webApiInput.Object, Tipo {
	/**
	 * Returns the value of the '<em><b>Valores</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getEnum_Valores()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getValores();

} // Enum
