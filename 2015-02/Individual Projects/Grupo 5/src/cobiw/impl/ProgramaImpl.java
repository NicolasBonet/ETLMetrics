/**
 */
package cobiw.impl;

import cobiw.CobiwPackage;
import cobiw.Copy;
import cobiw.Join;
import cobiw.Programa;
import cobiw.TipoPrograma;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cobiw.impl.ProgramaImpl#getContiene <em>Contiene</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getUsa <em>Usa</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getJoins <em>Joins</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getObjetivo <em>Objetivo</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getNumeroRequerimiento <em>Numero Requerimiento</em>}</li>
 *   <li>{@link cobiw.impl.ProgramaImpl#getProgramaId <em>Programa Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramaImpl extends EObjectImpl implements Programa {
	/**
	 * The cached value of the '{@link #getContiene() <em>Contiene</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContiene()
	 * @generated
	 * @ordered
	 */
	protected EList<Copy> contiene;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoPrograma TIPO_EDEFAULT = TipoPrograma.LINEA;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoPrograma tipo = TIPO_EDEFAULT;

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
	 * The cached value of the '{@link #getUsa() <em>Usa</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsa()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> usa;

	/**
	 * The cached value of the '{@link #getJoins() <em>Joins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<Join> joins;

	/**
	 * The default value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOR_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAutor() <em>Autor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutor()
	 * @generated
	 * @ordered
	 */
	protected String autor = AUTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected String team = TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjetivo() <em>Objetivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetivo()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJETIVO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjetivo() <em>Objetivo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjetivo()
	 * @generated
	 * @ordered
	 */
	protected String objetivo = OBJETIVO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroRequerimiento() <em>Numero Requerimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRequerimiento()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_REQUERIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroRequerimiento() <em>Numero Requerimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRequerimiento()
	 * @generated
	 * @ordered
	 */
	protected String numeroRequerimiento = NUMERO_REQUERIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramaId() <em>Programa Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramaId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramaId() <em>Programa Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramaId()
	 * @generated
	 * @ordered
	 */
	protected String programaId = PROGRAMA_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CobiwPackage.Literals.PROGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Copy> getContiene() {
		if (contiene == null) {
			contiene = new EObjectContainmentEList<Copy>(Copy.class, this, CobiwPackage.PROGRAMA__CONTIENE);
		}
		return contiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoPrograma getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoPrograma newTipo) {
		TipoPrograma oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__TIPO, oldTipo, tipo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getUsa() {
		if (usa == null) {
			usa = new EObjectResolvingEList<Variable>(Variable.class, this, CobiwPackage.PROGRAMA__USA);
		}
		return usa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getJoins() {
		if (joins == null) {
			joins = new EObjectContainmentEList<Join>(Join.class, this, CobiwPackage.PROGRAMA__JOINS);
		}
		return joins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutor(String newAutor) {
		String oldAutor = autor;
		autor = newAutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__AUTOR, oldAutor, autor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(String newTeam) {
		String oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjetivo() {
		return objetivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjetivo(String newObjetivo) {
		String oldObjetivo = objetivo;
		objetivo = newObjetivo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__OBJETIVO, oldObjetivo, objetivo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroRequerimiento() {
		return numeroRequerimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRequerimiento(String newNumeroRequerimiento) {
		String oldNumeroRequerimiento = numeroRequerimiento;
		numeroRequerimiento = newNumeroRequerimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__NUMERO_REQUERIMIENTO, oldNumeroRequerimiento, numeroRequerimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramaId() {
		return programaId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramaId(String newProgramaId) {
		String oldProgramaId = programaId;
		programaId = newProgramaId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CobiwPackage.PROGRAMA__PROGRAMA_ID, oldProgramaId, programaId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CobiwPackage.PROGRAMA__CONTIENE:
				return ((InternalEList<?>)getContiene()).basicRemove(otherEnd, msgs);
			case CobiwPackage.PROGRAMA__JOINS:
				return ((InternalEList<?>)getJoins()).basicRemove(otherEnd, msgs);
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
			case CobiwPackage.PROGRAMA__CONTIENE:
				return getContiene();
			case CobiwPackage.PROGRAMA__TIPO:
				return getTipo();
			case CobiwPackage.PROGRAMA__NOMBRE:
				return getNombre();
			case CobiwPackage.PROGRAMA__USA:
				return getUsa();
			case CobiwPackage.PROGRAMA__JOINS:
				return getJoins();
			case CobiwPackage.PROGRAMA__AUTOR:
				return getAutor();
			case CobiwPackage.PROGRAMA__TEAM:
				return getTeam();
			case CobiwPackage.PROGRAMA__OBJETIVO:
				return getObjetivo();
			case CobiwPackage.PROGRAMA__NUMERO_REQUERIMIENTO:
				return getNumeroRequerimiento();
			case CobiwPackage.PROGRAMA__PROGRAMA_ID:
				return getProgramaId();
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
			case CobiwPackage.PROGRAMA__CONTIENE:
				getContiene().clear();
				getContiene().addAll((Collection<? extends Copy>)newValue);
				return;
			case CobiwPackage.PROGRAMA__TIPO:
				setTipo((TipoPrograma)newValue);
				return;
			case CobiwPackage.PROGRAMA__NOMBRE:
				setNombre((String)newValue);
				return;
			case CobiwPackage.PROGRAMA__USA:
				getUsa().clear();
				getUsa().addAll((Collection<? extends Variable>)newValue);
				return;
			case CobiwPackage.PROGRAMA__JOINS:
				getJoins().clear();
				getJoins().addAll((Collection<? extends Join>)newValue);
				return;
			case CobiwPackage.PROGRAMA__AUTOR:
				setAutor((String)newValue);
				return;
			case CobiwPackage.PROGRAMA__TEAM:
				setTeam((String)newValue);
				return;
			case CobiwPackage.PROGRAMA__OBJETIVO:
				setObjetivo((String)newValue);
				return;
			case CobiwPackage.PROGRAMA__NUMERO_REQUERIMIENTO:
				setNumeroRequerimiento((String)newValue);
				return;
			case CobiwPackage.PROGRAMA__PROGRAMA_ID:
				setProgramaId((String)newValue);
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
			case CobiwPackage.PROGRAMA__CONTIENE:
				getContiene().clear();
				return;
			case CobiwPackage.PROGRAMA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__USA:
				getUsa().clear();
				return;
			case CobiwPackage.PROGRAMA__JOINS:
				getJoins().clear();
				return;
			case CobiwPackage.PROGRAMA__AUTOR:
				setAutor(AUTOR_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__TEAM:
				setTeam(TEAM_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__OBJETIVO:
				setObjetivo(OBJETIVO_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__NUMERO_REQUERIMIENTO:
				setNumeroRequerimiento(NUMERO_REQUERIMIENTO_EDEFAULT);
				return;
			case CobiwPackage.PROGRAMA__PROGRAMA_ID:
				setProgramaId(PROGRAMA_ID_EDEFAULT);
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
			case CobiwPackage.PROGRAMA__CONTIENE:
				return contiene != null && !contiene.isEmpty();
			case CobiwPackage.PROGRAMA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case CobiwPackage.PROGRAMA__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case CobiwPackage.PROGRAMA__USA:
				return usa != null && !usa.isEmpty();
			case CobiwPackage.PROGRAMA__JOINS:
				return joins != null && !joins.isEmpty();
			case CobiwPackage.PROGRAMA__AUTOR:
				return AUTOR_EDEFAULT == null ? autor != null : !AUTOR_EDEFAULT.equals(autor);
			case CobiwPackage.PROGRAMA__TEAM:
				return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
			case CobiwPackage.PROGRAMA__OBJETIVO:
				return OBJETIVO_EDEFAULT == null ? objetivo != null : !OBJETIVO_EDEFAULT.equals(objetivo);
			case CobiwPackage.PROGRAMA__NUMERO_REQUERIMIENTO:
				return NUMERO_REQUERIMIENTO_EDEFAULT == null ? numeroRequerimiento != null : !NUMERO_REQUERIMIENTO_EDEFAULT.equals(numeroRequerimiento);
			case CobiwPackage.PROGRAMA__PROGRAMA_ID:
				return PROGRAMA_ID_EDEFAULT == null ? programaId != null : !PROGRAMA_ID_EDEFAULT.equals(programaId);
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", autor: ");
		result.append(autor);
		result.append(", team: ");
		result.append(team);
		result.append(", objetivo: ");
		result.append(objetivo);
		result.append(", numeroRequerimiento: ");
		result.append(numeroRequerimiento);
		result.append(", programaId: ");
		result.append(programaId);
		result.append(')');
		return result.toString();
	}

} //ProgramaImpl
