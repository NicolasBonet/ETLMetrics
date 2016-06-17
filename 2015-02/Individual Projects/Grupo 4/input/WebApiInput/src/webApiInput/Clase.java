/**
 */
package webApiInput;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link webApiInput.Clase#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link webApiInput.Clase#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link webApiInput.Clase#getEnums <em>Enums</em>}</li>
 *   <li>{@link webApiInput.Clase#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link webApiInput.Clase#getSuper <em>Super</em>}</li>
 *   <li>{@link webApiInput.Clase#getConstructores <em>Constructores</em>}</li>
 * </ul>
 * </p>
 *
 * @see webApiInput.WebApiInputPackage#getClase()
 * @model
 * @generated
 */
public interface Clase extends AttributesObject, Tipo {
	/**
	 * Returns the value of the '<em><b>Propiedades</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Propiedad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propiedades</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propiedades</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getClase_Propiedades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Propiedad> getPropiedades();

	/**
	 * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Metodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metodos</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getClase_Metodos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metodo> getMetodos();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Enum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getClase_Enums()
	 * @model containment="true"
	 * @generated
	 */
	EList<webApiInput.Enum> getEnums();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see webApiInput.WebApiInputPackage#getClase_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link webApiInput.Clase#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Super</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super</em>' attribute.
	 * @see #setSuper(String)
	 * @see webApiInput.WebApiInputPackage#getClase_Super()
	 * @model
	 * @generated
	 */
	String getSuper();

	/**
	 * Sets the value of the '{@link webApiInput.Clase#getSuper <em>Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super</em>' attribute.
	 * @see #getSuper()
	 * @generated
	 */
	void setSuper(String value);

	/**
	 * Returns the value of the '<em><b>Constructores</b></em>' containment reference list.
	 * The list contents are of type {@link webApiInput.Constructor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constructores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructores</em>' containment reference list.
	 * @see webApiInput.WebApiInputPackage#getClase_Constructores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constructor> getConstructores();

} // Clase
