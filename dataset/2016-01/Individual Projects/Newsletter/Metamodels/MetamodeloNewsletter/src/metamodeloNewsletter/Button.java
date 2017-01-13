/**
 */
package metamodeloNewsletter;

import metamodeloNewsletter.enums.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Button#getText <em>Text</em>}</li>
 *   <li>{@link metamodeloNewsletter.Button#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Element {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(Text)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getButton_Text()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getText();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Button#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(Text value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"white"</code>.
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
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getButton_Color()
	 * @model default="white"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Button#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see metamodeloNewsletter.enums.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // Button
