/**
 */
package proyectos.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import proyectos.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage
 * @generated
 */
public class ProyectosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProyectosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProyectosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProyectosPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProyectosSwitch<Adapter> modelSwitch =
		new ProyectosSwitch<Adapter>() {
			@Override
			public Adapter caseMarketPlace(MarketPlace object) {
				return createMarketPlaceAdapter();
			}
			@Override
			public Adapter casePagina(Pagina object) {
				return createPaginaAdapter();
			}
			@Override
			public Adapter casePromocion(Promocion object) {
				return createPromocionAdapter();
			}
			@Override
			public Adapter caseMapa(Mapa object) {
				return createMapaAdapter();
			}
			@Override
			public Adapter caseContacto(Contacto object) {
				return createContactoAdapter();
			}
			@Override
			public Adapter caseCatalogo(Catalogo object) {
				return createCatalogoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link proyectos.MarketPlace <em>Market Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.MarketPlace
	 * @generated
	 */
	public Adapter createMarketPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectos.Pagina <em>Pagina</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.Pagina
	 * @generated
	 */
	public Adapter createPaginaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectos.Promocion <em>Promocion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.Promocion
	 * @generated
	 */
	public Adapter createPromocionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectos.Mapa <em>Mapa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.Mapa
	 * @generated
	 */
	public Adapter createMapaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectos.Contacto <em>Contacto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.Contacto
	 * @generated
	 */
	public Adapter createContactoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link proyectos.Catalogo <em>Catalogo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see proyectos.Catalogo
	 * @generated
	 */
	public Adapter createCatalogoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProyectosAdapterFactory
