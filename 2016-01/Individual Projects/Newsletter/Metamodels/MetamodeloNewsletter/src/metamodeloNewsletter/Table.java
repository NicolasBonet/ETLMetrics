/**
 */
package metamodeloNewsletter;

import metamodeloNewsletter.enums.Color;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Table#getRows <em>Rows</em>}</li>
 *   <li>{@link metamodeloNewsletter.Table#getWidth <em>Width</em>}</li>
 *   <li>{@link metamodeloNewsletter.Table#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloNewsletter.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getTable_Rows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Row> getRows();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getTable_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Table#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The default value is <code>"white"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #setBackgroundColor(Color)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getTable_BackgroundColor()
	 * @model default="white"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Table#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

} // Table
