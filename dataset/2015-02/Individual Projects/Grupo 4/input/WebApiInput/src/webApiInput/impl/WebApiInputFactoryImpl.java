/**
 */
package webApiInput.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import webApiInput.Atributo;
import webApiInput.CSharp;
import webApiInput.Clase;
import webApiInput.Constructor;
import webApiInput.EnumLiteral;
import webApiInput.List;
import webApiInput.Metodo;
import webApiInput.Parametro;
import webApiInput.Propiedad;
import webApiInput.PropiedadAtributo;
import webApiInput.WebApiInputFactory;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebApiInputFactoryImpl extends EFactoryImpl implements WebApiInputFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WebApiInputFactory init() {
		try {
			WebApiInputFactory theWebApiInputFactory = (WebApiInputFactory)EPackage.Registry.INSTANCE.getEFactory(WebApiInputPackage.eNS_URI);
			if (theWebApiInputFactory != null) {
				return theWebApiInputFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WebApiInputFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApiInputFactoryImpl() {
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
			case WebApiInputPackage.CSHARP: return createCSharp();
			case WebApiInputPackage.ENUM: return createEnum();
			case WebApiInputPackage.ENUM_LITERAL: return createEnumLiteral();
			case WebApiInputPackage.CLASE: return createClase();
			case WebApiInputPackage.PROPIEDAD: return createPropiedad();
			case WebApiInputPackage.ATRIBUTO: return createAtributo();
			case WebApiInputPackage.METODO: return createMetodo();
			case WebApiInputPackage.PARAMETRO: return createParametro();
			case WebApiInputPackage.PROPIEDAD_ATRIBUTO: return createPropiedadAtributo();
			case WebApiInputPackage.LIST: return createList();
			case WebApiInputPackage.CONSTRUCTOR: return createConstructor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSharp createCSharp() {
		CSharpImpl cSharp = new CSharpImpl();
		return cSharp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public webApiInput.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad createPropiedad() {
		PropiedadImpl propiedad = new PropiedadImpl();
		return propiedad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodo createMetodo() {
		MetodoImpl metodo = new MetodoImpl();
		return metodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametro createParametro() {
		ParametroImpl parametro = new ParametroImpl();
		return parametro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadAtributo createPropiedadAtributo() {
		PropiedadAtributoImpl propiedadAtributo = new PropiedadAtributoImpl();
		return propiedadAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApiInputPackage getWebApiInputPackage() {
		return (WebApiInputPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WebApiInputPackage getPackage() {
		return WebApiInputPackage.eINSTANCE;
	}

} //WebApiInputFactoryImpl
