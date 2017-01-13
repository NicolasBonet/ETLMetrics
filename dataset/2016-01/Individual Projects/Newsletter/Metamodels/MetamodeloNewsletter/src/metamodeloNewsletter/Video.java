/**
 */
package metamodeloNewsletter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.Video#getPreview <em>Preview</em>}</li>
 *   <li>{@link metamodeloNewsletter.Video#getTitle <em>Title</em>}</li>
 *   <li>{@link metamodeloNewsletter.Video#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends Element {
	/**
	 * Returns the value of the '<em><b>Preview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preview</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preview</em>' containment reference.
	 * @see #setPreview(Image)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Preview()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Image getPreview();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getPreview <em>Preview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preview</em>' containment reference.
	 * @see #getPreview()
	 * @generated
	 */
	void setPreview(Image value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(Text)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Title()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Text getTitle();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Text value);

	/**
	 * Returns the value of the '<em><b>Button</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Button</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' containment reference.
	 * @see #setButton(Button)
	 * @see metamodeloNewsletter.MetamodeloNewsletterPackage#getVideo_Button()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Button getButton();

	/**
	 * Sets the value of the '{@link metamodeloNewsletter.Video#getButton <em>Button</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' containment reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Button value);

} // Video
