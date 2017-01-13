/**
 */
package metamodeloNewsletter;

import metamodeloNewsletter.enums.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Divider#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getDivider()
 * @model
 * @generated
 */
public interface Divider extends Element {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"black"</code>.
	 * The literals are from the enumeration {@link metamodeloNewsletter.enums.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #setColor(Color)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getDivider_Color()
	 * @model default="black"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Divider#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Divider
