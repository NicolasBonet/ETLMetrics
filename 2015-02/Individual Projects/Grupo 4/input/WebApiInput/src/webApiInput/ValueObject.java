/**
 */
package webApiInput;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.ValueObject#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getValueObject()
 * @model abstract="true"
 * @generated
 */
public interface ValueObject extends webApiInput.Object {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see webApiInput.WebApiInputPackage#getValueObject_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link webApiInput.ValueObject#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // ValueObject
