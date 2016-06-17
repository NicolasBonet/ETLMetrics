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

import webApiInput.List;
import webApiInput.Tipo;
import webApiInput.TypedObject;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webApiInput.impl.TypedObjectImpl#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 *   <li>{@link webApiInput.impl.TypedObjectImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link webApiInput.impl.TypedObjectImpl#getLista <em>Lista</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypedObjectImpl extends AttributesObjectImpl implements TypedObject {
	/**
	 * The default value of the '{@link #getTipoPrimitivo() <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_PRIMITIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoPrimitivo() <em>Tipo Primitivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPrimitivo()
	 * @generated
	 * @ordered
	 */
	protected String tipoPrimitivo = TIPO_PRIMITIVO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected Tipo tipo;

	/**
	 * The cached value of the '{@link #getLista() <em>Lista</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLista()
	 * @generated
	 * @ordered
	 */
	protected EList<List> lista;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApiInputPackage.Literals.TYPED_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTipoPrimitivo() {
		return tipoPrimitivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoPrimitivo(String newTipoPrimitivo) {
		String oldTipoPrimitivo = tipoPrimitivo;
		tipoPrimitivo = newTipoPrimitivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApiInputPackage.TYPED_OBJECT__TIPO_PRIMITIVO, oldTipoPrimitivo, tipoPrimitivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo getTipo() {
		if (tipo != null && tipo.eIsProxy()) {
			InternalEObject oldTipo = (InternalEObject)tipo;
			tipo = (Tipo)eResolveProxy(oldTipo);
			if (tipo != oldTipo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WebApiInputPackage.TYPED_OBJECT__TIPO, oldTipo, tipo));
			}
		}
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tipo basicGetTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(Tipo newTipo) {
		Tipo oldTipo = tipo;
		tipo = newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WebApiInputPackage.TYPED_OBJECT__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getLista() {
		if (lista == null) {
			lista = new EObjectContainmentEList<List>(List.class, this, WebApiInputPackage.TYPED_OBJECT__LISTA);
		}
		return lista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApiInputPackage.TYPED_OBJECT__LISTA:
				return ((InternalEList<?>)getLista()).basicRemove(otherEnd, msgs);
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
			case WebApiInputPackage.TYPED_OBJECT__TIPO_PRIMITIVO:
				return getTipoPrimitivo();
			case WebApiInputPackage.TYPED_OBJECT__TIPO:
				if (resolve) return getTipo();
				return basicGetTipo();
			case WebApiInputPackage.TYPED_OBJECT__LISTA:
				return getLista();
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
			case WebApiInputPackage.TYPED_OBJECT__TIPO_PRIMITIVO:
				setTipoPrimitivo((String)newValue);
				return;
			case WebApiInputPackage.TYPED_OBJECT__TIPO:
				setTipo((Tipo)newValue);
				return;
			case WebApiInputPackage.TYPED_OBJECT__LISTA:
				getLista().clear();
				getLista().addAll((Collection<? extends List>)newValue);
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
			case WebApiInputPackage.TYPED_OBJECT__TIPO_PRIMITIVO:
				setTipoPrimitivo(TIPO_PRIMITIVO_EDEFAULT);
				return;
			case WebApiInputPackage.TYPED_OBJECT__TIPO:
				setTipo((Tipo)null);
				return;
			case WebApiInputPackage.TYPED_OBJECT__LISTA:
				getLista().clear();
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
			case WebApiInputPackage.TYPED_OBJECT__TIPO_PRIMITIVO:
				return TIPO_PRIMITIVO_EDEFAULT == null ? tipoPrimitivo != null : !TIPO_PRIMITIVO_EDEFAULT.equals(tipoPrimitivo);
			case WebApiInputPackage.TYPED_OBJECT__TIPO:
				return tipo != null;
			case WebApiInputPackage.TYPED_OBJECT__LISTA:
				return lista != null && !lista.isEmpty();
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
		result.append(" (tipoPrimitivo: ");
		result.append(tipoPrimitivo);
		result.append(')');
		return result.toString();
	}

} //TypedObjectImpl
