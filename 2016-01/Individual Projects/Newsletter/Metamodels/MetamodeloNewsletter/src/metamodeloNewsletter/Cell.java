/**
 */
package metamodeloNewsletter;

import metamodeloNewsletter.enums.Color;
import metamodeloNewsletter.enums.VerticalAlign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Cell#getElements <em>Elements</em>}</li>
 *   <li>{@link metamodeloNewsletter.Cell#getWidth <em>Width</em>}</li>
 *   <li>{@link metamodeloNewsletter.Cell#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link metamodeloNewsletter.Cell#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link metamodeloNewsletter.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getCell_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

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
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getCell_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Cell#getWidth <em>Width</em>}' attribute.
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
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getCell_BackgroundColor()
	 * @model default="white"
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Cell#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

	/**
	 * Returns the value of the '<em><b>Vertical Alignment</b></em>' attribute.
	 * The default value is <code>"top"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.VerticalAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Alignment</em>' attribute.
	 * @see metamodeloNewsletter.enums.VerticalAlign
	 * @see #setVerticalAlignment(VerticalAlign)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getCell_VerticalAlignment()
	 * @model default="top"
	 * @generated
	 */
	VerticalAlign getVerticalAlignment();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Cell#getVerticalAlignment <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Alignment</em>' attribute.
	 * @see metamodeloNewsletter.enums.VerticalAlign
	 * @see #getVerticalAlignment()
	 * @generated
	 */
	void setVerticalAlignment(VerticalAlign value);

} // Cell
