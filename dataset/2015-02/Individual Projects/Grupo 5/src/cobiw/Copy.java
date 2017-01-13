/**
 */
package cobiw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cobiw.Copy#getCompuesto <em>Compuesto</em>}</li>
 *   <li>{@link cobiw.Copy#getNombreArchivo <em>Nombre Archivo</em>}</li>
 *   <li>{@link cobiw.Copy#isEsEntrada <em>Es Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @see cobiw.CobiwPackage#getCopy()
 * @model
 * @generated
 */
public interface Copy extends EObject {
	/**
	 * Returns the value of the '<em><b>Compuesto</b></em>' containment reference list.
	 * The list contents are of type {@link cobiw.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compuesto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compuesto</em>' containment reference list.
	 * @see cobiw.CobiwPackage#getCopy_Compuesto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getCompuesto();

	/**
	 * Returns the value of the '<em><b>Nombre Archivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Archivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Archivo</em>' attribute.
	 * @see #setNombreArchivo(String)
	 * @see cobiw.CobiwPackage#getCopy_NombreArchivo()
	 * @model
	 * @generated
	 */
	String getNombreArchivo();

	/**
	 * Sets the value of the '{@link cobiw.Copy#getNombreArchivo <em>Nombre Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Archivo</em>' attribute.
	 * @see #getNombreArchivo()
	 * @generated
	 */
	void setNombreArchivo(String value);

	/**
	 * Returns the value of the '<em><b>Es Entrada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Entrada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Entrada</em>' attribute.
	 * @see #setEsEntrada(boolean)
	 * @see cobiw.CobiwPackage#getCopy_EsEntrada()
	 * @model
	 * @generated
	 */
	boolean isEsEntrada();

	/**
	 * Sets the value of the '{@link cobiw.Copy#isEsEntrada <em>Es Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Entrada</em>' attribute.
	 * @see #isEsEntrada()
	 * @generated
	 */
	void setEsEntrada(boolean value);

} // Copy
