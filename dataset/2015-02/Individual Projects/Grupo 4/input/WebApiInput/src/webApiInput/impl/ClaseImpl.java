/**
 */
package webApiInput.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webApiInput.Clase;
import webApiInput.Constructor;
import webApiInput.Metodo;
import webApiInput.Propiedad;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webApiInput.impl.ClaseImpl#getPropiedades <em>Propiedades</em>}</li>
 *   <li>{@link webApiInput.impl.ClaseImpl#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link webApiInput.impl.ClaseImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link webApiInput.impl.ClaseImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link webApiInput.impl.ClaseImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link webApiInput.impl.ClaseImpl#getConstructores <em>Constructores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaseImpl extends AttributesObjectImpl implements Clase {
	/**
	 * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropiedades()
	 * @generated
	 * @ordered
	 */
	protected EList<Propiedad> propiedades;

	/**
	 * The cached value of the '{@link #getMetodos() <em>Metodos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetodos()
	 * @generated
	 * @ordered
	 */
	protected EList<Metodo> metodos;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<webApiInput.Enum> enums;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuper() <em>Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected String super_ = SUPER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstructores() <em>Constructores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructores()
	 * @generated
	 * @ordered
	 */
	protected EList<Constructor> constructores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApiInputPackage.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Propiedad> getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList<Propiedad>(Propiedad.class, this, WebApiInputPackage.CLASE__PROPIEDADES);
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metodo> getMetodos() {
		if (metodos == null) {
			metodos = new EObjectContainmentEList<Metodo>(Metodo.class, this, WebApiInputPackage.CLASE__METODOS);
		}
		return metodos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<webApiInput.Enum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<webApiInput.Enum>(webApiInput.Enum.class, this, WebApiInputPackage.CLASE__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApiInputPackage.CLASE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(String newSuper) {
		String oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApiInputPackage.CLASE__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constructor> getConstructores() {
		if (constructores == null) {
			constructores = new EObjectContainmentEList<Constructor>(Constructor.class, this, WebApiInputPackage.CLASE__CONSTRUCTORES);
		}
		return constructores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApiInputPackage.CLASE__PROPIEDADES:
				return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
			case WebApiInputPackage.CLASE__METODOS:
				return ((InternalEList<?>)getMetodos()).basicRemove(otherEnd, msgs);
			case WebApiInputPackage.CLASE__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
			case WebApiInputPackage.CLASE__CONSTRUCTORES:
				return ((InternalEList<?>)getConstructores()).basicRemove(otherEnd, msgs);
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
			case WebApiInputPackage.CLASE__PROPIEDADES:
				return getPropiedades();
			case WebApiInputPackage.CLASE__METODOS:
				return getMetodos();
			case WebApiInputPackage.CLASE__ENUMS:
				return getEnums();
			case WebApiInputPackage.CLASE__NAMESPACE:
				return getNamespace();
			case WebApiInputPackage.CLASE__SUPER:
				return getSuper();
			case WebApiInputPackage.CLASE__CONSTRUCTORES:
				return getConstructores();
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
			case WebApiInputPackage.CLASE__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection<? extends Propiedad>)newValue);
				return;
			case WebApiInputPackage.CLASE__METODOS:
				getMetodos().clear();
				getMetodos().addAll((Collection<? extends Metodo>)newValue);
				return;
			case WebApiInputPackage.CLASE__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends webApiInput.Enum>)newValue);
				return;
			case WebApiInputPackage.CLASE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case WebApiInputPackage.CLASE__SUPER:
				setSuper((String)newValue);
				return;
			case WebApiInputPackage.CLASE__CONSTRUCTORES:
				getConstructores().clear();
				getConstructores().addAll((Collection<? extends Constructor>)newValue);
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
			case WebApiInputPackage.CLASE__PROPIEDADES:
				getPropiedades().clear();
				return;
			case WebApiInputPackage.CLASE__METODOS:
				getMetodos().clear();
				return;
			case WebApiInputPackage.CLASE__ENUMS:
				getEnums().clear();
				return;
			case WebApiInputPackage.CLASE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case WebApiInputPackage.CLASE__SUPER:
				setSuper(SUPER_EDEFAULT);
				return;
			case WebApiInputPackage.CLASE__CONSTRUCTORES:
				getConstructores().clear();
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
			case WebApiInputPackage.CLASE__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
			case WebApiInputPackage.CLASE__METODOS:
				return metodos != null && !metodos.isEmpty();
			case WebApiInputPackage.CLASE__ENUMS:
				return enums != null && !enums.isEmpty();
			case WebApiInputPackage.CLASE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case WebApiInputPackage.CLASE__SUPER:
				return SUPER_EDEFAULT == null ? super_ != null : !SUPER_EDEFAULT.equals(super_);
			case WebApiInputPackage.CLASE__CONSTRUCTORES:
				return constructores != null && !constructores.isEmpty();
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", super: ");
		result.append(super_);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
