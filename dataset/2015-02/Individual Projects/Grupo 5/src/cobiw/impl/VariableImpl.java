/**
 */
package cobiw.impl;

import cobiw.CobiwPackage;
import cobiw.TipoVariable;
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
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cobiw.impl.VariableImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getLongitud <em>Longitud</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#isEsOccurs <em>Es Occurs</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#isEsLlave <em>Es Llave</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getConformada <em>Conformada</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getEsSalida <em>Es Salida</em>}</li>
 *   <li>{@link cobiw.impl.VariableImpl#getValor <em>Valor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends EObjectImpl implements Variable {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoVariable TIPO_EDEFAULT = TipoVariable.PADRE;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoVariable tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected static final int LONGITUD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLongitud() <em>Longitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitud()
	 * @generated
	 * @ordered
	 */
	protected int longitud = LONGITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECISION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected int precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsOccurs() <em>Es Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_OCCURS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsOccurs() <em>Es Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsOccurs()
	 * @generated
	 * @ordered
	 */
	protected boolean esOccurs = ES_OCCURS_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsLlave() <em>Es Llave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsLlave()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_LLAVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsLlave() <em>Es Llave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsLlave()
	 * @generated
	 * @ordered
	 */
	protected boolean esLlave = ES_LLAVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConformada() <em>Conformada</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformada()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> conformada;

	/**
	 * The default value of the '{@link #getEsSalida() <em>Es Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsSalida()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ES_SALIDA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEsSalida() <em>Es Salida</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsSalida()
	 * @generated
	 * @ordered
	 */
	protected Boolean esSalida = ES_SALIDA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobiwPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoVariable getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoVariable newTipo) {
		TipoVariable oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitud(int newLongitud) {
		int oldLongitud = longitud;
		longitud = newLongitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__LONGITUD, oldLongitud, longitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(int newPrecision) {
		int oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsOccurs() {
		return esOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsOccurs(boolean newEsOccurs) {
		boolean oldEsOccurs = esOccurs;
		esOccurs = newEsOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__ES_OCCURS, oldEsOccurs, esOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsLlave() {
		return esLlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsLlave(boolean newEsLlave) {
		boolean oldEsLlave = esLlave;
		esLlave = newEsLlave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__ES_LLAVE, oldEsLlave, esLlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getConformada() {
		if (conformada == null) {
			conformada = new EObjectContainmentEList<Variable>(Variable.class, this, CobiwPackage.VARIABLE__CONFORMADA);
		}
		return conformada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEsSalida() {
		return esSalida;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsSalida(Boolean newEsSalida) {
		Boolean oldEsSalida = esSalida;
		esSalida = newEsSalida;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__ES_SALIDA, oldEsSalida, esSalida));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.VARIABLE__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobiwPackage.VARIABLE__CONFORMADA:
				return ((InternalEList<?>)getConformada()).basicRemove(otherEnd, msgs);
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
			case CobiwPackage.VARIABLE__NOMBRE:
				return getNombre();
			case CobiwPackage.VARIABLE__TIPO:
				return getTipo();
			case CobiwPackage.VARIABLE__LONGITUD:
				return getLongitud();
			case CobiwPackage.VARIABLE__PRECISION:
				return getPrecision();
			case CobiwPackage.VARIABLE__ES_OCCURS:
				return isEsOccurs();
			case CobiwPackage.VARIABLE__ES_LLAVE:
				return isEsLlave();
			case CobiwPackage.VARIABLE__CONFORMADA:
				return getConformada();
			case CobiwPackage.VARIABLE__ES_SALIDA:
				return getEsSalida();
			case CobiwPackage.VARIABLE__VALOR:
				return getValor();
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
			case CobiwPackage.VARIABLE__NOMBRE:
				setNombre((String)newValue);
				return;
			case CobiwPackage.VARIABLE__TIPO:
				setTipo((TipoVariable)newValue);
				return;
			case CobiwPackage.VARIABLE__LONGITUD:
				setLongitud((Integer)newValue);
				return;
			case CobiwPackage.VARIABLE__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case CobiwPackage.VARIABLE__ES_OCCURS:
				setEsOccurs((Boolean)newValue);
				return;
			case CobiwPackage.VARIABLE__ES_LLAVE:
				setEsLlave((Boolean)newValue);
				return;
			case CobiwPackage.VARIABLE__CONFORMADA:
				getConformada().clear();
				getConformada().addAll((Collection<? extends Variable>)newValue);
				return;
			case CobiwPackage.VARIABLE__ES_SALIDA:
				setEsSalida((Boolean)newValue);
				return;
			case CobiwPackage.VARIABLE__VALOR:
				setValor((String)newValue);
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
			case CobiwPackage.VARIABLE__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__LONGITUD:
				setLongitud(LONGITUD_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__ES_OCCURS:
				setEsOccurs(ES_OCCURS_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__ES_LLAVE:
				setEsLlave(ES_LLAVE_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__CONFORMADA:
				getConformada().clear();
				return;
			case CobiwPackage.VARIABLE__ES_SALIDA:
				setEsSalida(ES_SALIDA_EDEFAULT);
				return;
			case CobiwPackage.VARIABLE__VALOR:
				setValor(VALOR_EDEFAULT);
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
			case CobiwPackage.VARIABLE__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CobiwPackage.VARIABLE__TIPO:
				return tipo != TIPO_EDEFAULT;
			case CobiwPackage.VARIABLE__LONGITUD:
				return longitud != LONGITUD_EDEFAULT;
			case CobiwPackage.VARIABLE__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case CobiwPackage.VARIABLE__ES_OCCURS:
				return esOccurs != ES_OCCURS_EDEFAULT;
			case CobiwPackage.VARIABLE__ES_LLAVE:
				return esLlave != ES_LLAVE_EDEFAULT;
			case CobiwPackage.VARIABLE__CONFORMADA:
				return conformada != null && !conformada.isEmpty();
			case CobiwPackage.VARIABLE__ES_SALIDA:
				return ES_SALIDA_EDEFAULT == null ? esSalida != null : !ES_SALIDA_EDEFAULT.equals(esSalida);
			case CobiwPackage.VARIABLE__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", longitud: ");
		result.append(longitud);
		result.append(", precision: ");
		result.append(precision);
		result.append(", esOccurs: ");
		result.append(esOccurs);
		result.append(", esLlave: ");
		result.append(esLlave);
		result.append(", esSalida: ");
		result.append(esSalida);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
