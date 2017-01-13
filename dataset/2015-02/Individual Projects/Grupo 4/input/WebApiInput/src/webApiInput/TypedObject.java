/**
 */
package webApiInput;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.TypedObject#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 *   <li>{@link webApiInput.TypedObject#getTipo <em>Tipo</em>}</li>
 *   <li>{@link webApiInput.TypedObject#getLista <em>Lista</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getTypedObject()
 * @model abstract="true"
 * @generated
 */
public interface TypedObject extends AttributesObject {
	/**
	 * Returns the value of the '<em><b>Tipo Primitivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Primitivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Primitivo</em>' attribute.
	 * @see #setTipoPrimitivo(String)
	 * @see webApiInput.WebApiInputPackage#getTypedObject_TipoPrimitivo()
	 * @model
	 * @generated
	 */
	String getTipoPrimitivo();

	/**
	 * Sets the value of the '{@link webApiInput.TypedObject#getTipoPrimitivo <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Primitivo</em>' attribute.
	 * @see #getTipoPrimitivo()
	 * @generated
	 */
	void setTipoPrimitivo(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' reference.
	 * @see #setTipo(Tipo)
	 * @see webApiInput.WebApiInputPackage#getTypedObject_Tipo()
	 * @model
	 * @generated
	 */
	Tipo getTipo();

	/**
	 * Sets the value of the '{@link webApiInput.TypedObject#getTipo <em>Tipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' reference.
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(Tipo value);

	/**
	 * Returns the value of the '<em><b>Lista</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.List}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lista</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getTypedObject_Lista()
	 * @model containment="true"
	 * @generated
	 */
	EList<List> getLista();

} // TypedObject
