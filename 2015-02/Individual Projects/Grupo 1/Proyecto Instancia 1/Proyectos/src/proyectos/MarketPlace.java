/**
 */
package proyectos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.MarketPlace#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link proyectos.MarketPlace#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.MarketPlace#getPresentacion <em>Presentacion</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getMarketPlace()
 * @model
 * @generated
 */
public interface MarketPlace extends EObject {
	/**
	 * Returns the value of the '<em><b>Paginas</b></em>' containment reference list.
	 * The list contents are of type {@link proyectos.Pagina}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paginas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paginas</em>' containment reference list.
	 * @see proyectos.ProyectosPackage#getMarketPlace_Paginas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pagina> getPaginas();

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
	 * @see proyectos.ProyectosPackage#getMarketPlace_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link proyectos.MarketPlace#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Presentacion</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.TipoPresentacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentacion</em>' attribute.
	 * @see proyectos.TipoPresentacion
	 * @see #setPresentacion(TipoPresentacion)
	 * @see proyectos.ProyectosPackage#getMarketPlace_Presentacion()
	 * @model
	 * @generated
	 */
	TipoPresentacion getPresentacion();

	/**
	 * Sets the value of the '{@link proyectos.MarketPlace#getPresentacion <em>Presentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentacion</em>' attribute.
	 * @see proyectos.TipoPresentacion
	 * @see #getPresentacion()
	 * @generated
	 */
	void setPresentacion(TipoPresentacion value);

} // MarketPlace
