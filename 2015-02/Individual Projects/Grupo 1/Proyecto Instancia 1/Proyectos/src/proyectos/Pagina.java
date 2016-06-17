/**
 */
package proyectos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Pagina#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.Pagina#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getPagina()
 * @model abstract="true"
 * @generated
 */
public interface Pagina extends EObject {
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
	 * @see proyectos.ProyectosPackage#getPagina_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Estilo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Estilo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estilo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estilo</em>' attribute.
	 * @see proyectos.Estilo
	 * @see #setEstilo(Estilo)
	 * @see proyectos.ProyectosPackage#getPagina_Estilo()
	 * @model
	 * @generated
	 */
	Estilo getEstilo();

	/**
	 * Sets the value of the '{@link proyectos.Pagina#getEstilo <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estilo</em>' attribute.
	 * @see proyectos.Estilo
	 * @see #getEstilo()
	 * @generated
	 */
	void setEstilo(Estilo value);

} // Pagina
