/**
 */
package proyectos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see proyectos.ProyectosFactory
 * @model kind="package"
 * @generated
 */
public interface ProyectosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "proyectos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/proyectos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "proyectos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProyectosPackage eINSTANCE = proyectos.impl.ProyectosPackageImpl.init();

	/**
	 * The meta object id for the '{@link proyectos.impl.MarketPlaceImpl <em>Market Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.MarketPlaceImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getMarketPlace()
	 * @generated
	 */
	int MARKET_PLACE = 0;

	/**
	 * The feature id for the '<em><b>Paginas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE__PAGINAS = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE__NOMBRE = 1;

	/**
	 * The feature id for the '<em><b>Presentacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE__PRESENTACION = 2;

	/**
	 * The number of structural features of the '<em>Market Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Market Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.PaginaImpl <em>Pagina</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.PaginaImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getPagina()
	 * @generated
	 */
	int PAGINA = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA__ESTILO = 1;

	/**
	 * The number of structural features of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pagina</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGINA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.PromocionImpl <em>Promocion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.PromocionImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getPromocion()
	 * @generated
	 */
	int PROMOCION = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION__ESTILO = PAGINA__ESTILO;

	/**
	 * The number of structural features of the '<em>Promocion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Promocion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOCION_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.MapaImpl <em>Mapa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.MapaImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getMapa()
	 * @generated
	 */
	int MAPA = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA__ESTILO = PAGINA__ESTILO;

	/**
	 * The number of structural features of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPA_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.ContactoImpl <em>Contacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.ContactoImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getContacto()
	 * @generated
	 */
	int CONTACTO = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO__ESTILO = PAGINA__ESTILO;

	/**
	 * The number of structural features of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Contacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACTO_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.impl.CatalogoImpl <em>Catalogo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.impl.CatalogoImpl
	 * @see proyectos.impl.ProyectosPackageImpl#getCatalogo()
	 * @generated
	 */
	int CATALOGO = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__NOMBRE = PAGINA__NOMBRE;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO__ESTILO = PAGINA__ESTILO;

	/**
	 * The number of structural features of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_FEATURE_COUNT = PAGINA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catalogo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGO_OPERATION_COUNT = PAGINA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link proyectos.Estilo <em>Estilo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.Estilo
	 * @see proyectos.impl.ProyectosPackageImpl#getEstilo()
	 * @generated
	 */
	int ESTILO = 6;

	/**
	 * The meta object id for the '{@link proyectos.TipoPresentacion <em>Tipo Presentacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.TipoPresentacion
	 * @see proyectos.impl.ProyectosPackageImpl#getTipoPresentacion()
	 * @generated
	 */
	int TIPO_PRESENTACION = 7;

	/**
	 * The meta object id for the '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see proyectos.EstiloImagen
	 * @see proyectos.impl.ProyectosPackageImpl#getEstiloImagen()
	 * @generated
	 */
	int ESTILO_IMAGEN = 8;

	/**
	 * Returns the meta object for class '{@link proyectos.MarketPlace <em>Market Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Place</em>'.
	 * @see proyectos.MarketPlace
	 * @generated
	 */
	EClass getMarketPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link proyectos.MarketPlace#getPaginas <em>Paginas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paginas</em>'.
	 * @see proyectos.MarketPlace#getPaginas()
	 * @see #getMarketPlace()
	 * @generated
	 */
	EReference getMarketPlace_Paginas();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.MarketPlace#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectos.MarketPlace#getNombre()
	 * @see #getMarketPlace()
	 * @generated
	 */
	EAttribute getMarketPlace_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.MarketPlace#getPresentacion <em>Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentacion</em>'.
	 * @see proyectos.MarketPlace#getPresentacion()
	 * @see #getMarketPlace()
	 * @generated
	 */
	EAttribute getMarketPlace_Presentacion();

	/**
	 * Returns the meta object for class '{@link proyectos.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagina</em>'.
	 * @see proyectos.Pagina
	 * @generated
	 */
	EClass getPagina();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see proyectos.Pagina#getNombre()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link proyectos.Pagina#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo</em>'.
	 * @see proyectos.Pagina#getEstilo()
	 * @see #getPagina()
	 * @generated
	 */
	EAttribute getPagina_Estilo();

	/**
	 * Returns the meta object for class '{@link proyectos.Promocion <em>Promocion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promocion</em>'.
	 * @see proyectos.Promocion
	 * @generated
	 */
	EClass getPromocion();

	/**
	 * Returns the meta object for class '{@link proyectos.Mapa <em>Mapa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapa</em>'.
	 * @see proyectos.Mapa
	 * @generated
	 */
	EClass getMapa();

	/**
	 * Returns the meta object for class '{@link proyectos.Contacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contacto</em>'.
	 * @see proyectos.Contacto
	 * @generated
	 */
	EClass getContacto();

	/**
	 * Returns the meta object for class '{@link proyectos.Catalogo <em>Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogo</em>'.
	 * @see proyectos.Catalogo
	 * @generated
	 */
	EClass getCatalogo();

	/**
	 * Returns the meta object for enum '{@link proyectos.Estilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estilo</em>'.
	 * @see proyectos.Estilo
	 * @generated
	 */
	EEnum getEstilo();

	/**
	 * Returns the meta object for enum '{@link proyectos.TipoPresentacion <em>Tipo Presentacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Presentacion</em>'.
	 * @see proyectos.TipoPresentacion
	 * @generated
	 */
	EEnum getTipoPresentacion();

	/**
	 * Returns the meta object for enum '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estilo Imagen</em>'.
	 * @see proyectos.EstiloImagen
	 * @generated
	 */
	EEnum getEstiloImagen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProyectosFactory getProyectosFactory();

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
		 * The meta object literal for the '{@link proyectos.impl.MarketPlaceImpl <em>Market Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.MarketPlaceImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getMarketPlace()
		 * @generated
		 */
		EClass MARKET_PLACE = eINSTANCE.getMarketPlace();

		/**
		 * The meta object literal for the '<em><b>Paginas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_PLACE__PAGINAS = eINSTANCE.getMarketPlace_Paginas();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_PLACE__NOMBRE = eINSTANCE.getMarketPlace_Nombre();

		/**
		 * The meta object literal for the '<em><b>Presentacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_PLACE__PRESENTACION = eINSTANCE.getMarketPlace_Presentacion();

		/**
		 * The meta object literal for the '{@link proyectos.impl.PaginaImpl <em>Pagina</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.PaginaImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getPagina()
		 * @generated
		 */
		EClass PAGINA = eINSTANCE.getPagina();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__NOMBRE = eINSTANCE.getPagina_Nombre();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGINA__ESTILO = eINSTANCE.getPagina_Estilo();

		/**
		 * The meta object literal for the '{@link proyectos.impl.PromocionImpl <em>Promocion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.PromocionImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getPromocion()
		 * @generated
		 */
		EClass PROMOCION = eINSTANCE.getPromocion();

		/**
		 * The meta object literal for the '{@link proyectos.impl.MapaImpl <em>Mapa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.MapaImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getMapa()
		 * @generated
		 */
		EClass MAPA = eINSTANCE.getMapa();

		/**
		 * The meta object literal for the '{@link proyectos.impl.ContactoImpl <em>Contacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.ContactoImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getContacto()
		 * @generated
		 */
		EClass CONTACTO = eINSTANCE.getContacto();

		/**
		 * The meta object literal for the '{@link proyectos.impl.CatalogoImpl <em>Catalogo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.impl.CatalogoImpl
		 * @see proyectos.impl.ProyectosPackageImpl#getCatalogo()
		 * @generated
		 */
		EClass CATALOGO = eINSTANCE.getCatalogo();

		/**
		 * The meta object literal for the '{@link proyectos.Estilo <em>Estilo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.Estilo
		 * @see proyectos.impl.ProyectosPackageImpl#getEstilo()
		 * @generated
		 */
		EEnum ESTILO = eINSTANCE.getEstilo();

		/**
		 * The meta object literal for the '{@link proyectos.TipoPresentacion <em>Tipo Presentacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.TipoPresentacion
		 * @see proyectos.impl.ProyectosPackageImpl#getTipoPresentacion()
		 * @generated
		 */
		EEnum TIPO_PRESENTACION = eINSTANCE.getTipoPresentacion();

		/**
		 * The meta object literal for the '{@link proyectos.EstiloImagen <em>Estilo Imagen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see proyectos.EstiloImagen
		 * @see proyectos.impl.ProyectosPackageImpl#getEstiloImagen()
		 * @generated
		 */
		EEnum ESTILO_IMAGEN = eINSTANCE.getEstiloImagen();

	}

} //ProyectosPackage
