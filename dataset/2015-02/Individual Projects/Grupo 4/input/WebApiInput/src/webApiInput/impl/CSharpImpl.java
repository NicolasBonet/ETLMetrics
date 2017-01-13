/**
 */
package webApiInput.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webApiInput.CSharp;
import webApiInput.Clase;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSharp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link webApiInput.impl.CSharpImpl#getClases <em>Clases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSharpImpl extends MinimalEObjectImpl.Container implements CSharp {
	/**
	 * The cached value of the '{@link #getClases() <em>Clases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClases()
	 * @generated
	 * @ordered
	 */
	protected EList<Clase> clases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSharpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WebApiInputPackage.Literals.CSHARP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clase> getClases() {
		if (clases == null) {
			clases = new EObjectContainmentEList<Clase>(Clase.class, this, WebApiInputPackage.CSHARP__CLASES);
		}
		return clases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WebApiInputPackage.CSHARP__CLASES:
				return ((InternalEList<?>)getClases()).basicRemove(otherEnd, msgs);
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
			case WebApiInputPackage.CSHARP__CLASES:
				return getClases();
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
			case WebApiInputPackage.CSHARP__CLASES:
				getClases().clear();
				getClases().addAll((Collection<? extends Clase>)newValue);
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
			case WebApiInputPackage.CSHARP__CLASES:
				getClases().clear();
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
			case WebApiInputPackage.CSHARP__CLASES:
				return clases != null && !clases.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CSharpImpl
