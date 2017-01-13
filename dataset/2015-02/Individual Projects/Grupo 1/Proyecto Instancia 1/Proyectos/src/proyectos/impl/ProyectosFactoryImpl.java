/**
 */
package proyectos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import proyectos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectosFactoryImpl extends EFactoryImpl implements ProyectosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProyectosFactory init() {
		try {
			ProyectosFactory theProyectosFactory = (ProyectosFactory)EPackage.Registry.INSTANCE.getEFactory(ProyectosPackage.eNS_URI);
			if (theProyectosFactory != null) {
				return theProyectosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProyectosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosFactoryImpl() {
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
			case ProyectosPackage.MARKET_PLACE: return createMarketPlace();
			case ProyectosPackage.PROMOCION: return createPromocion();
			case ProyectosPackage.MAPA: return createMapa();
			case ProyectosPackage.CONTACTO: return createContacto();
			case ProyectosPackage.CATALOGO: return createCatalogo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectosPackage.ESTILO:
				return createEstiloFromString(eDataType, initialValue);
			case ProyectosPackage.TIPO_PRESENTACION:
				return createTipoPresentacionFromString(eDataType, initialValue);
			case ProyectosPackage.ESTILO_IMAGEN:
				return createEstiloImagenFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ProyectosPackage.ESTILO:
				return convertEstiloToString(eDataType, instanceValue);
			case ProyectosPackage.TIPO_PRESENTACION:
				return convertTipoPresentacionToString(eDataType, instanceValue);
			case ProyectosPackage.ESTILO_IMAGEN:
				return convertEstiloImagenToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketPlace createMarketPlace() {
		MarketPlaceImpl marketPlace = new MarketPlaceImpl();
		return marketPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Promocion createPromocion() {
		PromocionImpl promocion = new PromocionImpl();
		return promocion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapa createMapa() {
		MapaImpl mapa = new MapaImpl();
		return mapa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contacto createContacto() {
		ContactoImpl contacto = new ContactoImpl();
		return contacto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Catalogo createCatalogo() {
		CatalogoImpl catalogo = new CatalogoImpl();
		return catalogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estilo createEstiloFromString(EDataType eDataType, String initialValue) {
		Estilo result = Estilo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstiloToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPresentacion createTipoPresentacionFromString(EDataType eDataType, String initialValue) {
		TipoPresentacion result = TipoPresentacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoPresentacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloImagen createEstiloImagenFromString(EDataType eDataType, String initialValue) {
		EstiloImagen result = EstiloImagen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstiloImagenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosPackage getProyectosPackage() {
		return (ProyectosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProyectosPackage getPackage() {
		return ProyectosPackage.eINSTANCE;
	}

} //ProyectosFactoryImpl
