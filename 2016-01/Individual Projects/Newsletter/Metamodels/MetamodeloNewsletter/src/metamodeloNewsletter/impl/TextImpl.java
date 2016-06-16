/**
 */
package metamodeloNewsletter.impl;

import metamodeloNewsletter.MetamodeloNewsletterPackage;
import metamodeloNewsletter.Text;

import metamodeloNewsletter.enums.Align;
import metamodeloNewsletter.enums.Color;
import metamodeloNewsletter.enums.FontFamily;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#getContent <em>Content</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#isBold <em>Bold</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#isItalic <em>Italic</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#isUnderline <em>Underline</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#isStrikethrough <em>Strikethrough</em>}</li>
 *   <li>{@link metamodeloNewsletter.impl.TextImpl#getTextAlign <em>Text Align</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextImpl extends ElementImpl implements Text {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = "Text";

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final FontFamily FONT_FAMILY_EDEFAULT = FontFamily.ARIAL;

	/**
	 * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected FontFamily fontFamily = FONT_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = "3";

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color FONT_COLOR_EDEFAULT = Color.BLACK;

	/**
	 * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontColor()
	 * @generated
	 * @ordered
	 */
	protected Color fontColor = FONT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOLD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBold()
	 * @generated
	 * @ordered
	 */
	protected boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ITALIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isItalic()
	 * @generated
	 * @ordered
	 */
	protected boolean italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDERLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnderline() <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnderline()
	 * @generated
	 * @ordered
	 */
	protected boolean underline = UNDERLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrikethrough() <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikethrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRIKETHROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrikethrough() <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrikethrough()
	 * @generated
	 * @ordered
	 */
	protected boolean strikethrough = STRIKETHROUGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align TEXT_ALIGN_EDEFAULT = Align.LEFT;

	/**
	 * The cached value of the '{@link #getTextAlign() <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAlign()
	 * @generated
	 * @ordered
	 */
	protected Align textAlign = TEXT_ALIGN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodeloNewsletterPackage.Literals.TEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFamily getFontFamily() {
		return fontFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFamily(FontFamily newFontFamily) {
		FontFamily oldFontFamily = fontFamily;
		fontFamily = newFontFamily == null ? FONT_FAMILY_EDEFAULT : newFontFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__FONT_FAMILY, oldFontFamily, fontFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFontColor() {
		return fontColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontColor(Color newFontColor) {
		Color oldFontColor = fontColor;
		fontColor = newFontColor == null ? FONT_COLOR_EDEFAULT : newFontColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__FONT_COLOR, oldFontColor, fontColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(boolean newBold) {
		boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(boolean newItalic) {
		boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnderline() {
		return underline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderline(boolean newUnderline) {
		boolean oldUnderline = underline;
		underline = newUnderline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__UNDERLINE, oldUnderline, underline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrikethrough() {
		return strikethrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrikethrough(boolean newStrikethrough) {
		boolean oldStrikethrough = strikethrough;
		strikethrough = newStrikethrough;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__STRIKETHROUGH, oldStrikethrough, strikethrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align getTextAlign() {
		return textAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAlign(Align newTextAlign) {
		Align oldTextAlign = textAlign;
		textAlign = newTextAlign == null ? TEXT_ALIGN_EDEFAULT : newTextAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodeloNewsletterPackage.TEXT__TEXT_ALIGN, oldTextAlign, textAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.TEXT__CONTENT:
				return getContent();
			case MetamodeloNewsletterPackage.TEXT__FONT_FAMILY:
				return getFontFamily();
			case MetamodeloNewsletterPackage.TEXT__FONT_SIZE:
				return getFontSize();
			case MetamodeloNewsletterPackage.TEXT__FONT_COLOR:
				return getFontColor();
			case MetamodeloNewsletterPackage.TEXT__BOLD:
				return isBold();
			case MetamodeloNewsletterPackage.TEXT__ITALIC:
				return isItalic();
			case MetamodeloNewsletterPackage.TEXT__UNDERLINE:
				return isUnderline();
			case MetamodeloNewsletterPackage.TEXT__STRIKETHROUGH:
				return isStrikethrough();
			case MetamodeloNewsletterPackage.TEXT__TEXT_ALIGN:
				return getTextAlign();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.TEXT__CONTENT:
				setContent((String)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_FAMILY:
				setFontFamily((FontFamily)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_COLOR:
				setFontColor((Color)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__BOLD:
				setBold((Boolean)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__UNDERLINE:
				setUnderline((Boolean)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__STRIKETHROUGH:
				setStrikethrough((Boolean)newValue);
				return;
			case MetamodeloNewsletterPackage.TEXT__TEXT_ALIGN:
				setTextAlign((Align)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.TEXT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__FONT_COLOR:
				setFontColor(FONT_COLOR_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__UNDERLINE:
				setUnderline(UNDERLINE_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__STRIKETHROUGH:
				setStrikethrough(STRIKETHROUGH_EDEFAULT);
				return;
			case MetamodeloNewsletterPackage.TEXT__TEXT_ALIGN:
				setTextAlign(TEXT_ALIGN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodeloNewsletterPackage.TEXT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case MetamodeloNewsletterPackage.TEXT__FONT_FAMILY:
				return fontFamily != FONT_FAMILY_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case MetamodeloNewsletterPackage.TEXT__FONT_COLOR:
				return fontColor != FONT_COLOR_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__BOLD:
				return bold != BOLD_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__ITALIC:
				return italic != ITALIC_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__UNDERLINE:
				return underline != UNDERLINE_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__STRIKETHROUGH:
				return strikethrough != STRIKETHROUGH_EDEFAULT;
			case MetamodeloNewsletterPackage.TEXT__TEXT_ALIGN:
				return textAlign != TEXT_ALIGN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(", fontFamily: ");
		result.append(fontFamily);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontColor: ");
		result.append(fontColor);
		result.append(", bold: ");
		result.append(bold);
		result.append(", italic: ");
		result.append(italic);
		result.append(", underline: ");
		result.append(underline);
		result.append(", strikethrough: ");
		result.append(strikethrough);
		result.append(", textAlign: ");
		result.append(textAlign);
		result.append(')');
		return result.toString();
	}

} //TextImpl
