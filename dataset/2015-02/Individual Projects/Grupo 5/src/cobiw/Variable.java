/**
 */
package cobiw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cobiw.Variable#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cobiw.Variable#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cobiw.Variable#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link cobiw.Variable#getPrecision <em>Precision</em>}</li>
 *   <li>{@link cobiw.Variable#isEsOccurs <em>Es Occurs</em>}</li>
 *   <li>{@link cobiw.Variable#isEsLlave <em>Es Llave</em>}</li>
 *   <li>{@link cobiw.Variable#getConformada <em>Conformada</em>}</li>
 *   <li>{@link cobiw.Variable#getEsSalida <em>Es Salida</em>}</li>
 *   <li>{@link cobiw.Variable#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @see cobiw.CobiwPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cobiw.CobiwPackage#getVariable_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The default value is <code>"padre"</code>.
	 * The literals are from the enumeration {@link cobiw.TipoVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see cobiw.TipoVariable
	 * @see #setTipo(TipoVariable)
	 * @see cobiw.CobiwPackage#getVariable_Tipo()
	 * @model default="padre"
	 * @generated
	 */
	TipoVariable getTipo();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see cobiw.TipoVariable
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoVariable value);

	/**
	 * Returns the value of the '<em><b>Longitud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitud</em>' attribute.
	 * @see #setLongitud(int)
	 * @see cobiw.CobiwPackage#getVariable_Longitud()
	 * @model
	 * @generated
	 */
	int getLongitud();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getLongitud <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitud</em>' attribute.
	 * @see #getLongitud()
	 * @generated
	 */
	void setLongitud(int value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see cobiw.CobiwPackage#getVariable_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

	/**
	 * Returns the value of the '<em><b>Es Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Occurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Occurs</em>' attribute.
	 * @see #setEsOccurs(boolean)
	 * @see cobiw.CobiwPackage#getVariable_EsOccurs()
	 * @model
	 * @generated
	 */
	boolean isEsOccurs();

	/**
	 * Sets the value of the '{@link cobiw.Variable#isEsOccurs <em>Es Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Occurs</em>' attribute.
	 * @see #isEsOccurs()
	 * @generated
	 */
	void setEsOccurs(boolean value);

	/**
	 * Returns the value of the '<em><b>Es Llave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Llave</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Llave</em>' attribute.
	 * @see #setEsLlave(boolean)
	 * @see cobiw.CobiwPackage#getVariable_EsLlave()
	 * @model
	 * @generated
	 */
	boolean isEsLlave();

	/**
	 * Sets the value of the '{@link cobiw.Variable#isEsLlave <em>Es Llave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Llave</em>' attribute.
	 * @see #isEsLlave()
	 * @generated
	 */
	void setEsLlave(boolean value);

	/**
	 * Returns the value of the '<em><b>Conformada</b></em>' containment reference list.
	 * The list contents are of type {@link cobiw.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformada</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformada</em>' containment reference list.
	 * @see cobiw.CobiwPackage#getVariable_Conformada()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getConformada();

	/**
	 * Returns the value of the '<em><b>Es Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Salida</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Salida</em>' attribute.
	 * @see #setEsSalida(Boolean)
	 * @see cobiw.CobiwPackage#getVariable_EsSalida()
	 * @model
	 * @generated
	 */
	Boolean getEsSalida();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getEsSalida <em>Es Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Salida</em>' attribute.
	 * @see #getEsSalida()
	 * @generated
	 */
	void setEsSalida(Boolean value);

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
	 * @see cobiw.CobiwPackage#getVariable_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link cobiw.Variable#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // Variable
