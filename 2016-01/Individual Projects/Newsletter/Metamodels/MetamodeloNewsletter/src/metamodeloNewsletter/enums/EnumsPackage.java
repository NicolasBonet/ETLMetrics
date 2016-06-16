/**
 */
package metamodeloNewsletter.enums;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metamodeloNewsletter.enums.EnumsFactory
 * @model kind="package"
 * @generated
 */
public interface EnumsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "enums";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "enums";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "enums";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnumsPackage eINSTANCE = metamodeloNewsletter.enums.impl.EnumsPackageImpl.init();

	/**
	 * The meta object id for the '{@link metamodeloNewsletter.enums.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloNewsletter.enums.Color
	 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 0;

	/**
	 * The meta object id for the '{@link metamodeloNewsletter.enums.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloNewsletter.enums.Align
	 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 1;

	/**
	 * The meta object id for the '{@link metamodeloNewsletter.enums.VerticalAlign <em>Vertical Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloNewsletter.enums.VerticalAlign
	 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getVerticalAlign()
	 * @generated
	 */
	int VERTICAL_ALIGN = 2;

	/**
	 * The meta object id for the '{@link metamodeloNewsletter.enums.FontFamily <em>Font Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metamodeloNewsletter.enums.FontFamily
	 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getFontFamily()
	 * @generated
	 */
	int FONT_FAMILY = 3;


	/**
	 * Returns the meta object for enum '{@link metamodeloNewsletter.enums.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see metamodeloNewsletter.enums.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link metamodeloNewsletter.enums.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see metamodeloNewsletter.enums.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the meta object for enum '{@link metamodeloNewsletter.enums.VerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Align</em>'.
	 * @see metamodeloNewsletter.enums.VerticalAlign
	 * @generated
	 */
	EEnum getVerticalAlign();

	/**
	 * Returns the meta object for enum '{@link metamodeloNewsletter.enums.FontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Family</em>'.
	 * @see metamodeloNewsletter.enums.FontFamily
	 * @generated
	 */
	EEnum getFontFamily();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnumsFactory getEnumsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metamodeloNewsletter.enums.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloNewsletter.enums.Color
		 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link metamodeloNewsletter.enums.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloNewsletter.enums.Align
		 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

		/**
		 * The meta object literal for the '{@link metamodeloNewsletter.enums.VerticalAlign <em>Vertical Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloNewsletter.enums.VerticalAlign
		 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getVerticalAlign()
		 * @generated
		 */
		EEnum VERTICAL_ALIGN = eINSTANCE.getVerticalAlign();

		/**
		 * The meta object literal for the '{@link metamodeloNewsletter.enums.FontFamily <em>Font Family</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metamodeloNewsletter.enums.FontFamily
		 * @see metamodeloNewsletter.enums.impl.EnumsPackageImpl#getFontFamily()
		 * @generated
		 */
		EEnum FONT_FAMILY = eINSTANCE.getFontFamily();

	}

} //EnumsPackage
