/**
 */
package proyectos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import proyectos.Estilo;
import proyectos.Pagina;
import proyectos.ProyectosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pagina</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link proyectos.impl.PaginaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link proyectos.impl.PaginaImpl#getEstilo <em>Estilo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PaginaImpl extends MinimalEObjectImpl.Container implements Pagina {
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
	 * The default value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected static final Estilo ESTILO_EDEFAULT = Estilo.EMPRESARIAL;

	/**
	 * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected Estilo estilo = ESTILO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaginaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProyectosPackage.Literals.PAGINA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Estilo getEstilo() {
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstilo(Estilo newEstilo) {
		Estilo oldEstilo = estilo;
		estilo = newEstilo == null ? ESTILO_EDEFAULT : newEstilo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProyectosPackage.PAGINA__ESTILO, oldEstilo, estilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProyectosPackage.PAGINA__NOMBRE:
				return getNombre();
			case ProyectosPackage.PAGINA__ESTILO:
				return getEstilo();
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
			case ProyectosPackage.PAGINA__NOMBRE:
				setNombre((String)newValue);
				return;
			case ProyectosPackage.PAGINA__ESTILO:
				setEstilo((Estilo)newValue);
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
			case ProyectosPackage.PAGINA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ProyectosPackage.PAGINA__ESTILO:
				setEstilo(ESTILO_EDEFAULT);
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
			case ProyectosPackage.PAGINA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ProyectosPackage.PAGINA__ESTILO:
				return estilo != ESTILO_EDEFAULT;
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
		result.append(", estilo: ");
		result.append(estilo);
		result.append(')');
		return result.toString();
	}

} //PaginaImpl
