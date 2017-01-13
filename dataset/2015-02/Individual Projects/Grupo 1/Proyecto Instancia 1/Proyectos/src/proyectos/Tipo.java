/**
 */
package proyectos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tipo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link proyectos.Tipo#getColorFondo <em>Color Fondo</em>}</li>
 *   <li>{@link proyectos.Tipo#getColorFuente <em>Color Fuente</em>}</li>
 *   <li>{@link proyectos.Tipo#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see proyectos.ProyectosPackage#getTipo()
 * @model abstract="true"
 * @generated
 */
public interface Tipo extends EObject {
	/**
	 * Returns the value of the '<em><b>Color Fondo</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Colores}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Fondo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Fondo</em>' attribute.
	 * @see proyectos.Colores
	 * @see #setColorFondo(Colores)
	 * @see proyectos.ProyectosPackage#getTipo_ColorFondo()
	 * @model
	 * @generated
	 */
	Colores getColorFondo();

	/**
	 * Sets the value of the '{@link proyectos.Tipo#getColorFondo <em>Color Fondo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fondo</em>' attribute.
	 * @see proyectos.Colores
	 * @see #getColorFondo()
	 * @generated
	 */
	void setColorFondo(Colores value);

	/**
	 * Returns the value of the '<em><b>Color Fuente</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Colores}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Fuente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Fuente</em>' attribute.
	 * @see proyectos.Colores
	 * @see #setColorFuente(Colores)
	 * @see proyectos.ProyectosPackage#getTipo_ColorFuente()
	 * @model
	 * @generated
	 */
	Colores getColorFuente();

	/**
	 * Sets the value of the '{@link proyectos.Tipo#getColorFuente <em>Color Fuente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Fuente</em>' attribute.
	 * @see proyectos.Colores
	 * @see #getColorFuente()
	 * @generated
	 */
	void setColorFuente(Colores value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link proyectos.Layout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see proyectos.Layout
	 * @see #setLayout(Layout)
	 * @see proyectos.ProyectosPackage#getTipo_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link proyectos.Tipo#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see proyectos.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // Tipo
