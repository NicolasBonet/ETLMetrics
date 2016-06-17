/**
 */
package proyectos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import proyectos.MarketPlace;
import proyectos.Pagina;
import proyectos.ProyectosPackage;
import proyectos.TipoPresentacion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Market Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.MarketPlaceImpl#getPaginas <em>Paginas</em>}</li>
 *   <li>{@link proyectos.impl.MarketPlaceImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.impl.MarketPlaceImpl#getPresentacion <em>Presentacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarketPlaceImpl extends MinimalEObjectImpl.Container implements MarketPlace {
	/**
	 * The cached value of the '{@link #getPaginas() <em>Paginas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaginas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pagina> paginas;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresentacion() <em>Presentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentacion()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPresentacion PRESENTACION_EDEFAULT = TipoPresentacion.BASICO;

	/**
	 * The cached value of the '{@link #getPresentacion() <em>Presentacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentacion()
	 * @generated
	 * @ordered
	 */
	protected TipoPresentacion presentacion = PRESENTACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.MARKET_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pagina> getPaginas() {
		if (paginas == null) {
			paginas = new EObjectContainmentEList<Pagina>(Pagina.class, this, ProyectosPackage.MARKET_PLACE__PAGINAS);
		}
		return paginas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.MARKET_PLACE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPresentacion getPresentacion() {
		return presentacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentacion(TipoPresentacion newPresentacion) {
		TipoPresentacion oldPresentacion = presentacion;
		presentacion = newPresentacion == null ? PRESENTACION_EDEFAULT : newPresentacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.MARKET_PLACE__PRESENTACION, oldPresentacion, presentacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProyectosPackage.MARKET_PLACE__PAGINAS:
				return ((InternalEList<?>)getPaginas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.MARKET_PLACE__PAGINAS:
				return getPaginas();
			case ProyectosPackage.MARKET_PLACE__NOMBRE:
				return getNombre();
			case ProyectosPackage.MARKET_PLACE__PRESENTACION:
				return getPresentacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProyectosPackage.MARKET_PLACE__PAGINAS:
				getPaginas().clear();
				getPaginas().addAll((Collection<? extends Pagina>)newValue);
				return;
			case ProyectosPackage.MARKET_PLACE__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectosPackage.MARKET_PLACE__PRESENTACION:
				setPresentacion((TipoPresentacion)newValue);
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
			case ProyectosPackage.MARKET_PLACE__PAGINAS:
				getPaginas().clear();
				return;
			case ProyectosPackage.MARKET_PLACE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectosPackage.MARKET_PLACE__PRESENTACION:
				setPresentacion(PRESENTACION_EDEFAULT);
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
			case ProyectosPackage.MARKET_PLACE__PAGINAS:
				return paginas != null && !paginas.isEmpty();
			case ProyectosPackage.MARKET_PLACE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectosPackage.MARKET_PLACE__PRESENTACION:
				return presentacion != PRESENTACION_EDEFAULT;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", presentacion: ");
		result.append(presentacion);
		result.append(')');
		return result.toString();
	}

} //MarketPlaceImpl
