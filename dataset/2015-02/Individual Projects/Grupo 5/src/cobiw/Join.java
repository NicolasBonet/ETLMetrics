/**
 */
package cobiw;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cobiw.Join#getNomArchivoSalida <em>Nom Archivo Salida</em>}</li>
 *   <li>{@link cobiw.Join#getReferenciaOrigen <em>Referencia Origen</em>}</li>
 *   <li>{@link cobiw.Join#getReferenciaDestino <em>Referencia Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @see cobiw.CobiwPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Archivo Salida</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Archivo Salida</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Archivo Salida</em>' attribute.
	 * @see #setNomArchivoSalida(String)
	 * @see cobiw.CobiwPackage#getJoin_NomArchivoSalida()
	 * @model
	 * @generated
	 */
	String getNomArchivoSalida();

	/**
	 * Sets the value of the '{@link cobiw.Join#getNomArchivoSalida <em>Nom Archivo Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Archivo Salida</em>' attribute.
	 * @see #getNomArchivoSalida()
	 * @generated
	 */
	void setNomArchivoSalida(String value);

	/**
	 * Returns the value of the '<em><b>Referencia Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia Origen</em>' reference.
	 * @see #setReferenciaOrigen(Variable)
	 * @see cobiw.CobiwPackage#getJoin_ReferenciaOrigen()
	 * @model required="true"
	 * @generated
	 */
	Variable getReferenciaOrigen();

	/**
	 * Sets the value of the '{@link cobiw.Join#getReferenciaOrigen <em>Referencia Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia Origen</em>' reference.
	 * @see #getReferenciaOrigen()
	 * @generated
	 */
	void setReferenciaOrigen(Variable value);

	/**
	 * Returns the value of the '<em><b>Referencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia Destino</em>' reference.
	 * @see #setReferenciaDestino(Variable)
	 * @see cobiw.CobiwPackage#getJoin_ReferenciaDestino()
	 * @model required="true"
	 * @generated
	 */
	Variable getReferenciaDestino();

	/**
	 * Sets the value of the '{@link cobiw.Join#getReferenciaDestino <em>Referencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia Destino</em>' reference.
	 * @see #getReferenciaDestino()
	 * @generated
	 */
	void setReferenciaDestino(Variable value);

} // Join
