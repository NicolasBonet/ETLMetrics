/**
 */
package metamodeloNewsletter.impl;

import metamodeloNewsletter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodeloNewsletterFactoryImpl extends EFactoryImpl implements MetamodeloNewsletterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodeloNewsletterFactory init() {
		try {
			MetamodeloNewsletterFactory theMetamodeloNewsletterFactory = (MetamodeloNewsletterFactory)EPackage.Registry.INSTANCE.getEFactory(MetamodeloNewsletterPackage.eNS_URI);
			if (theMetamodeloNewsletterFactory != null) {
				return theMetamodeloNewsletterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodeloNewsletterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodeloNewsletterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetamodeloNewsletterPackage.NEWSLETTER: return createNewsletter();
			case MetamodeloNewsletterPackage.TABLE: return createTable();
			case MetamodeloNewsletterPackage.ROW: return createRow();
			case MetamodeloNewsletterPackage.CELL: return createCell();
			case MetamodeloNewsletterPackage.TEXT: return createText();
			case MetamodeloNewsletterPackage.BUTTON: return createButton();
			case MetamodeloNewsletterPackage.IMAGE: return createImage();
			case MetamodeloNewsletterPackage.VIDEO: return createVideo();
			case MetamodeloNewsletterPackage.DIVIDER: return createDivider();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Newsletter createNewsletter() {
		NewsletterImpl newsletter = new NewsletterImpl();
		return newsletter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divider createDivider() {
		DividerImpl divider = new DividerImpl();
		return divider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodeloNewsletterPackage getMetamodeloNewsletterPackage() {
		return (MetamodeloNewsletterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodeloNewsletterPackage getPackage() {
		return MetamodeloNewsletterPackage.eINSTANCE;
	}

} //MetamodeloNewsletterFactoryImpl
