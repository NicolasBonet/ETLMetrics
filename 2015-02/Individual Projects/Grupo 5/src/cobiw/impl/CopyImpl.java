/**
 */
package cobiw.impl;

import cobiw.CobiwPackage;
import cobiw.Copy;
import cobiw.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cobiw.impl.CopyImpl#getCompuesto <em>Compuesto</em>}</li>
 *   <li>{@link cobiw.impl.CopyImpl#getNombreArchivo <em>Nombre Archivo</em>}</li>
 *   <li>{@link cobiw.impl.CopyImpl#isEsEntrada <em>Es Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyImpl extends EObjectImpl implements Copy {
	/**
	 * The cached value of the '{@link #getCompuesto() <em>Compuesto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompuesto()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> compuesto;

	/**
	 * The default value of the '{@link #getNombreArchivo() <em>Nombre Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreArchivo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ARCHIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreArchivo() <em>Nombre Archivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreArchivo()
	 * @generated
	 * @ordered
	 */
	protected String nombreArchivo = NOMBRE_ARCHIVO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsEntrada() <em>Es Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsEntrada()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_ENTRADA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsEntrada() <em>Es Entrada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsEntrada()
	 * @generated
	 * @ordered
	 */
	protected boolean esEntrada = ES_ENTRADA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobiwPackage.Literals.COPY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getCompuesto() {
		if (compuesto == null) {
			compuesto = new EObjectContainmentEList<Variable>(Variable.class, this, CobiwPackage.COPY__COMPUESTO);
		}
		return compuesto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreArchivo() {
		return nombreArchivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreArchivo(String newNombreArchivo) {
		String oldNombreArchivo = nombreArchivo;
		nombreArchivo = newNombreArchivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.COPY__NOMBRE_ARCHIVO, oldNombreArchivo, nombreArchivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsEntrada() {
		return esEntrada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsEntrada(boolean newEsEntrada) {
		boolean oldEsEntrada = esEntrada;
		esEntrada = newEsEntrada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.COPY__ES_ENTRADA, oldEsEntrada, esEntrada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobiwPackage.COPY__COMPUESTO:
				return ((InternalEList<?>)getCompuesto()).basicRemove(otherEnd, msgs);
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
			case CobiwPackage.COPY__COMPUESTO:
				return getCompuesto();
			case CobiwPackage.COPY__NOMBRE_ARCHIVO:
				return getNombreArchivo();
			case CobiwPackage.COPY__ES_ENTRADA:
				return isEsEntrada();
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
			case CobiwPackage.COPY__COMPUESTO:
				getCompuesto().clear();
				getCompuesto().addAll((Collection<? extends Variable>)newValue);
				return;
			case CobiwPackage.COPY__NOMBRE_ARCHIVO:
				setNombreArchivo((String)newValue);
				return;
			case CobiwPackage.COPY__ES_ENTRADA:
				setEsEntrada((Boolean)newValue);
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
			case CobiwPackage.COPY__COMPUESTO:
				getCompuesto().clear();
				return;
			case CobiwPackage.COPY__NOMBRE_ARCHIVO:
				setNombreArchivo(NOMBRE_ARCHIVO_EDEFAULT);
				return;
			case CobiwPackage.COPY__ES_ENTRADA:
				setEsEntrada(ES_ENTRADA_EDEFAULT);
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
			case CobiwPackage.COPY__COMPUESTO:
				return compuesto != null && !compuesto.isEmpty();
			case CobiwPackage.COPY__NOMBRE_ARCHIVO:
				return NOMBRE_ARCHIVO_EDEFAULT == null ? nombreArchivo != null : !NOMBRE_ARCHIVO_EDEFAULT.equals(nombreArchivo);
			case CobiwPackage.COPY__ES_ENTRADA:
				return esEntrada != ES_ENTRADA_EDEFAULT;
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
		result.append(" (nombreArchivo: ");
		result.append(nombreArchivo);
		result.append(", esEntrada: ");
		result.append(esEntrada);
		result.append(')');
		return result.toString();
	}

} //CopyImpl
