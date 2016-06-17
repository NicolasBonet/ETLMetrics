/**
 */
package webApiInput.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webApiInput.Atributo;
import webApiInput.PropiedadAtributo;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webApiInput.impl.AtributoImpl#getPropiedades <em>Propiedades</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributoImpl extends ValueObjectImpl implements Atributo {
	/**
	 * The cached value of the '{@link #getPropiedades() <em>Propiedades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropiedades()
	 * @generated
	 * @ordered
	 */
	protected EList<PropiedadAtributo> propiedades;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApiInputPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropiedadAtributo> getPropiedades() {
		if (propiedades == null) {
			propiedades = new EObjectContainmentEList<PropiedadAtributo>(PropiedadAtributo.class, this, WebApiInputPackage.ATRIBUTO__PROPIEDADES);
		}
		return propiedades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApiInputPackage.ATRIBUTO__PROPIEDADES:
				return ((InternalEList<?>)getPropiedades()).basicRemove(otherEnd, msgs);
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
			case WebApiInputPackage.ATRIBUTO__PROPIEDADES:
				return getPropiedades();
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
			case WebApiInputPackage.ATRIBUTO__PROPIEDADES:
				getPropiedades().clear();
				getPropiedades().addAll((Collection<? extends PropiedadAtributo>)newValue);
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
			case WebApiInputPackage.ATRIBUTO__PROPIEDADES:
				getPropiedades().clear();
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
			case WebApiInputPackage.ATRIBUTO__PROPIEDADES:
				return propiedades != null && !propiedades.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AtributoImpl
