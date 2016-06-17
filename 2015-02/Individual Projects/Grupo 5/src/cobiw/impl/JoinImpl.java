/**
 */
package cobiw.impl;

import cobiw.CobiwPackage;
import cobiw.Join;
import cobiw.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cobiw.impl.JoinImpl#getNomArchivoSalida <em>Nom Archivo Salida</em>}</li>
 *   <li>{@link cobiw.impl.JoinImpl#getReferenciaOrigen <em>Referencia Origen</em>}</li>
 *   <li>{@link cobiw.impl.JoinImpl#getReferenciaDestino <em>Referencia Destino</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JoinImpl extends EObjectImpl implements Join {
	/**
	 * The default value of the '{@link #getNomArchivoSalida() <em>Nom Archivo Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomArchivoSalida()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ARCHIVO_SALIDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomArchivoSalida() <em>Nom Archivo Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomArchivoSalida()
	 * @generated
	 * @ordered
	 */
	protected String nomArchivoSalida = NOM_ARCHIVO_SALIDA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenciaOrigen() <em>Referencia Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenciaOrigen()
	 * @generated
	 * @ordered
	 */
	protected Variable referenciaOrigen;

	/**
	 * The cached value of the '{@link #getReferenciaDestino() <em>Referencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenciaDestino()
	 * @generated
	 * @ordered
	 */
	protected Variable referenciaDestino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobiwPackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomArchivoSalida() {
		return nomArchivoSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomArchivoSalida(String newNomArchivoSalida) {
		String oldNomArchivoSalida = nomArchivoSalida;
		nomArchivoSalida = newNomArchivoSalida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.JOIN__NOM_ARCHIVO_SALIDA, oldNomArchivoSalida, nomArchivoSalida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReferenciaOrigen() {
		if (referenciaOrigen != null && referenciaOrigen.eIsProxy()) {
			InternalEObject oldReferenciaOrigen = (InternalEObject)referenciaOrigen;
			referenciaOrigen = (Variable)eResolveProxy(oldReferenciaOrigen);
			if (referenciaOrigen != oldReferenciaOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobiwPackage.JOIN__REFERENCIA_ORIGEN, oldReferenciaOrigen, referenciaOrigen));
			}
		}
		return referenciaOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReferenciaOrigen() {
		return referenciaOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenciaOrigen(Variable newReferenciaOrigen) {
		Variable oldReferenciaOrigen = referenciaOrigen;
		referenciaOrigen = newReferenciaOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.JOIN__REFERENCIA_ORIGEN, oldReferenciaOrigen, referenciaOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReferenciaDestino() {
		if (referenciaDestino != null && referenciaDestino.eIsProxy()) {
			InternalEObject oldReferenciaDestino = (InternalEObject)referenciaDestino;
			referenciaDestino = (Variable)eResolveProxy(oldReferenciaDestino);
			if (referenciaDestino != oldReferenciaDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CobiwPackage.JOIN__REFERENCIA_DESTINO, oldReferenciaDestino, referenciaDestino));
			}
		}
		return referenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReferenciaDestino() {
		return referenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenciaDestino(Variable newReferenciaDestino) {
		Variable oldReferenciaDestino = referenciaDestino;
		referenciaDestino = newReferenciaDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.JOIN__REFERENCIA_DESTINO, oldReferenciaDestino, referenciaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CobiwPackage.JOIN__NOM_ARCHIVO_SALIDA:
				return getNomArchivoSalida();
			case CobiwPackage.JOIN__REFERENCIA_ORIGEN:
				if (resolve) return getReferenciaOrigen();
				return basicGetReferenciaOrigen();
			case CobiwPackage.JOIN__REFERENCIA_DESTINO:
				if (resolve) return getReferenciaDestino();
				return basicGetReferenciaDestino();
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
			case CobiwPackage.JOIN__NOM_ARCHIVO_SALIDA:
				setNomArchivoSalida((String)newValue);
				return;
			case CobiwPackage.JOIN__REFERENCIA_ORIGEN:
				setReferenciaOrigen((Variable)newValue);
				return;
			case CobiwPackage.JOIN__REFERENCIA_DESTINO:
				setReferenciaDestino((Variable)newValue);
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
			case CobiwPackage.JOIN__NOM_ARCHIVO_SALIDA:
				setNomArchivoSalida(NOM_ARCHIVO_SALIDA_EDEFAULT);
				return;
			case CobiwPackage.JOIN__REFERENCIA_ORIGEN:
				setReferenciaOrigen((Variable)null);
				return;
			case CobiwPackage.JOIN__REFERENCIA_DESTINO:
				setReferenciaDestino((Variable)null);
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
			case CobiwPackage.JOIN__NOM_ARCHIVO_SALIDA:
				return NOM_ARCHIVO_SALIDA_EDEFAULT == null ? nomArchivoSalida != null : !NOM_ARCHIVO_SALIDA_EDEFAULT.equals(nomArchivoSalida);
			case CobiwPackage.JOIN__REFERENCIA_ORIGEN:
				return referenciaOrigen != null;
			case CobiwPackage.JOIN__REFERENCIA_DESTINO:
				return referenciaDestino != null;
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
		result.append(" (nomArchivoSalida: ");
		result.append(nomArchivoSalida);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
