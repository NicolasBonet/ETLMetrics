/**
 */
package cobiw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cobiw.Programa#getContiene <em>Contiene</em>}</li>
 *   <li>{@link cobiw.Programa#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cobiw.Programa#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cobiw.Programa#getUsa <em>Usa</em>}</li>
 *   <li>{@link cobiw.Programa#getJoins <em>Joins</em>}</li>
 *   <li>{@link cobiw.Programa#getAutor <em>Autor</em>}</li>
 *   <li>{@link cobiw.Programa#getTeam <em>Team</em>}</li>
 *   <li>{@link cobiw.Programa#getObjetivo <em>Objetivo</em>}</li>
 *   <li>{@link cobiw.Programa#getNumeroRequerimiento <em>Numero Requerimiento</em>}</li>
 *   <li>{@link cobiw.Programa#getProgramaId <em>Programa Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see cobiw.CobiwPackage#getPrograma()
 * @model
 * @generated
 */
public interface Programa extends EObject {
	/**
	 * Returns the value of the '<em><b>Contiene</b></em>' containment reference list.
	 * The list contents are of type {@link cobiw.Copy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contiene</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contiene</em>' containment reference list.
	 * @see cobiw.CobiwPackage#getPrograma_Contiene()
	 * @model containment="true"
	 * @generated
	 */
	EList<Copy> getContiene();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link cobiw.TipoPrograma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see cobiw.TipoPrograma
	 * @see #setTipo(TipoPrograma)
	 * @see cobiw.CobiwPackage#getPrograma_Tipo()
	 * @model
	 * @generated
	 */
	TipoPrograma getTipo();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see cobiw.TipoPrograma
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoPrograma value);

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
	 * @see cobiw.CobiwPackage#getPrograma_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Usa</b></em>' reference list.
	 * The list contents are of type {@link cobiw.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usa</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usa</em>' reference list.
	 * @see cobiw.CobiwPackage#getPrograma_Usa()
	 * @model
	 * @generated
	 */
	EList<Variable> getUsa();

	/**
	 * Returns the value of the '<em><b>Joins</b></em>' containment reference list.
	 * The list contents are of type {@link cobiw.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joins</em>' containment reference list.
	 * @see cobiw.CobiwPackage#getPrograma_Joins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getJoins();

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autor</em>' attribute.
	 * @see #setAutor(String)
	 * @see cobiw.CobiwPackage#getPrograma_Autor()
	 * @model default=""
	 * @generated
	 */
	String getAutor();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getAutor <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' attribute.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(String value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' attribute.
	 * @see #setTeam(String)
	 * @see cobiw.CobiwPackage#getPrograma_Team()
	 * @model default=""
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Objetivo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objetivo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objetivo</em>' attribute.
	 * @see #setObjetivo(String)
	 * @see cobiw.CobiwPackage#getPrograma_Objetivo()
	 * @model
	 * @generated
	 */
	String getObjetivo();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getObjetivo <em>Objetivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objetivo</em>' attribute.
	 * @see #getObjetivo()
	 * @generated
	 */
	void setObjetivo(String value);

	/**
	 * Returns the value of the '<em><b>Numero Requerimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Requerimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Requerimiento</em>' attribute.
	 * @see #setNumeroRequerimiento(String)
	 * @see cobiw.CobiwPackage#getPrograma_NumeroRequerimiento()
	 * @model
	 * @generated
	 */
	String getNumeroRequerimiento();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getNumeroRequerimiento <em>Numero Requerimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Requerimiento</em>' attribute.
	 * @see #getNumeroRequerimiento()
	 * @generated
	 */
	void setNumeroRequerimiento(String value);

	/**
	 * Returns the value of the '<em><b>Programa Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programa Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programa Id</em>' attribute.
	 * @see #setProgramaId(String)
	 * @see cobiw.CobiwPackage#getPrograma_ProgramaId()
	 * @model
	 * @generated
	 */
	String getProgramaId();

	/**
	 * Sets the value of the '{@link cobiw.Programa#getProgramaId <em>Programa Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programa Id</em>' attribute.
	 * @see #getProgramaId()
	 * @generated
	 */
	void setProgramaId(String value);

} // Programa
