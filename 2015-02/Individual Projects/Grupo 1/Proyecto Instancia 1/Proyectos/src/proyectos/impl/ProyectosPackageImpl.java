/**
 */
package proyectos.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import proyectos.Catalogo;
import proyectos.Contacto;
import proyectos.Estilo;
import proyectos.EstiloImagen;
import proyectos.Mapa;
import proyectos.MarketPlace;
import proyectos.Pagina;
import proyectos.Promocion;
import proyectos.ProyectosFactory;
import proyectos.ProyectosPackage;
import proyectos.TipoPresentacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectosPackageImpl extends EPackageImpl implements ProyectosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paginaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promocionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estiloEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoPresentacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estiloImagenEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see proyectos.ProyectosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProyectosPackageImpl() {
		super(eNS_URI, ProyectosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProyectosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProyectosPackage init() {
		if (isInited) return (ProyectosPackage)EPackage.Registry.INSTANCE.getEPackage(ProyectosPackage.eNS_URI);

		// Obtain or create and register package
		ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProyectosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProyectosPackage.createPackageContents();

		// Initialize created meta-data
		theProyectosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProyectosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProyectosPackage.eNS_URI, theProyectosPackage);
		return theProyectosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarketPlace() {
		return marketPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarketPlace_Paginas() {
		return (EReference)marketPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketPlace_Nombre() {
		return (EAttribute)marketPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMarketPlace_Presentacion() {
		return (EAttribute)marketPlaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagina() {
		return paginaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_Nombre() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagina_Estilo() {
		return (EAttribute)paginaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPromocion() {
		return promocionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapa() {
		return mapaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContacto() {
		return contactoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogo() {
		return catalogoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstilo() {
		return estiloEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoPresentacion() {
		return tipoPresentacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstiloImagen() {
		return estiloImagenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosFactory getProyectosFactory() {
		return (ProyectosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		marketPlaceEClass = createEClass(MARKET_PLACE);
		createEReference(marketPlaceEClass, MARKET_PLACE__PAGINAS);
		createEAttribute(marketPlaceEClass, MARKET_PLACE__NOMBRE);
		createEAttribute(marketPlaceEClass, MARKET_PLACE__PRESENTACION);

		paginaEClass = createEClass(PAGINA);
		createEAttribute(paginaEClass, PAGINA__NOMBRE);
		createEAttribute(paginaEClass, PAGINA__ESTILO);

		promocionEClass = createEClass(PROMOCION);

		mapaEClass = createEClass(MAPA);

		contactoEClass = createEClass(CONTACTO);

		catalogoEClass = createEClass(CATALOGO);

		// Create enums
		estiloEEnum = createEEnum(ESTILO);
		tipoPresentacionEEnum = createEEnum(TIPO_PRESENTACION);
		estiloImagenEEnum = createEEnum(ESTILO_IMAGEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		promocionEClass.getESuperTypes().add(this.getPagina());
		mapaEClass.getESuperTypes().add(this.getPagina());
		contactoEClass.getESuperTypes().add(this.getPagina());
		catalogoEClass.getESuperTypes().add(this.getPagina());

		// Initialize classes, features, and operations; add parameters
		initEClass(marketPlaceEClass, MarketPlace.class, "MarketPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketPlace_Paginas(), this.getPagina(), null, "paginas", null, 1, -1, MarketPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketPlace_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, MarketPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketPlace_Presentacion(), this.getTipoPresentacion(), "presentacion", null, 0, 1, MarketPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paginaEClass, Pagina.class, "Pagina", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagina_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagina_Estilo(), this.getEstilo(), "estilo", null, 0, 1, Pagina.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(promocionEClass, Promocion.class, "Promocion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapaEClass, Mapa.class, "Mapa", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactoEClass, Contacto.class, "Contacto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogoEClass, Catalogo.class, "Catalogo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(estiloEEnum, Estilo.class, "Estilo");
		addEEnumLiteral(estiloEEnum, Estilo.EMPRESARIAL);
		addEEnumLiteral(estiloEEnum, Estilo.CLASICO);
		addEEnumLiteral(estiloEEnum, Estilo.MODERNO);
		addEEnumLiteral(estiloEEnum, Estilo.PROFESIONAL);

		initEEnum(tipoPresentacionEEnum, TipoPresentacion.class, "TipoPresentacion");
		addEEnumLiteral(tipoPresentacionEEnum, TipoPresentacion.BASICO);
		addEEnumLiteral(tipoPresentacionEEnum, TipoPresentacion.PREMIUM);
		addEEnumLiteral(tipoPresentacionEEnum, TipoPresentacion.GOLD);

		initEEnum(estiloImagenEEnum, EstiloImagen.class, "EstiloImagen");
		addEEnumLiteral(estiloImagenEEnum, EstiloImagen.COMPACTA);
		addEEnumLiteral(estiloImagenEEnum, EstiloImagen.COMPLETA);

		// Create resource
		createResource(eNS_URI);
	}

} //ProyectosPackageImpl
