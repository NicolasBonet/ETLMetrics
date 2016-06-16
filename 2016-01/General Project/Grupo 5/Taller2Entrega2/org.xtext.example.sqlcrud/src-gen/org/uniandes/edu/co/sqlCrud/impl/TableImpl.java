/**
 * generated by Xtext 2.9.1
 */
package org.uniandes.edu.co.sqlCrud.impl;

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

import org.uniandes.edu.co.sqlCrud.Columna;
import org.uniandes.edu.co.sqlCrud.ForeignKey;
import org.uniandes.edu.co.sqlCrud.PrimaryKey;
import org.uniandes.edu.co.sqlCrud.SqlCrudPackage;
import org.uniandes.edu.co.sqlCrud.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.TableImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.TableImpl#getColumnas <em>Columnas</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.TableImpl#getPrkey <em>Prkey</em>}</li>
 *   <li>{@link org.uniandes.edu.co.sqlCrud.impl.TableImpl#getForkeys <em>Forkeys</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table
{
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
   * The cached value of the '{@link #getColumnas() <em>Columnas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnas()
   * @generated
   * @ordered
   */
  protected EList<Columna> columnas;

  /**
   * The cached value of the '{@link #getPrkey() <em>Prkey</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrkey()
   * @generated
   * @ordered
   */
  protected PrimaryKey prkey;

  /**
   * The cached value of the '{@link #getForkeys() <em>Forkeys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForkeys()
   * @generated
   * @ordered
   */
  protected EList<ForeignKey> forkeys;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SqlCrudPackage.Literals.TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.TABLE__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Columna> getColumnas()
  {
    if (columnas == null)
    {
      columnas = new EObjectContainmentEList<Columna>(Columna.class, this, SqlCrudPackage.TABLE__COLUMNAS);
    }
    return columnas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey getPrkey()
  {
    return prkey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrkey(PrimaryKey newPrkey, NotificationChain msgs)
  {
    PrimaryKey oldPrkey = prkey;
    prkey = newPrkey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SqlCrudPackage.TABLE__PRKEY, oldPrkey, newPrkey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrkey(PrimaryKey newPrkey)
  {
    if (newPrkey != prkey)
    {
      NotificationChain msgs = null;
      if (prkey != null)
        msgs = ((InternalEObject)prkey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.TABLE__PRKEY, null, msgs);
      if (newPrkey != null)
        msgs = ((InternalEObject)newPrkey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SqlCrudPackage.TABLE__PRKEY, null, msgs);
      msgs = basicSetPrkey(newPrkey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SqlCrudPackage.TABLE__PRKEY, newPrkey, newPrkey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ForeignKey> getForkeys()
  {
    if (forkeys == null)
    {
      forkeys = new EObjectContainmentEList<ForeignKey>(ForeignKey.class, this, SqlCrudPackage.TABLE__FORKEYS);
    }
    return forkeys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SqlCrudPackage.TABLE__COLUMNAS:
        return ((InternalEList<?>)getColumnas()).basicRemove(otherEnd, msgs);
      case SqlCrudPackage.TABLE__PRKEY:
        return basicSetPrkey(null, msgs);
      case SqlCrudPackage.TABLE__FORKEYS:
        return ((InternalEList<?>)getForkeys()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SqlCrudPackage.TABLE__NOMBRE:
        return getNombre();
      case SqlCrudPackage.TABLE__COLUMNAS:
        return getColumnas();
      case SqlCrudPackage.TABLE__PRKEY:
        return getPrkey();
      case SqlCrudPackage.TABLE__FORKEYS:
        return getForkeys();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SqlCrudPackage.TABLE__NOMBRE:
        setNombre((String)newValue);
        return;
      case SqlCrudPackage.TABLE__COLUMNAS:
        getColumnas().clear();
        getColumnas().addAll((Collection<? extends Columna>)newValue);
        return;
      case SqlCrudPackage.TABLE__PRKEY:
        setPrkey((PrimaryKey)newValue);
        return;
      case SqlCrudPackage.TABLE__FORKEYS:
        getForkeys().clear();
        getForkeys().addAll((Collection<? extends ForeignKey>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SqlCrudPackage.TABLE__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case SqlCrudPackage.TABLE__COLUMNAS:
        getColumnas().clear();
        return;
      case SqlCrudPackage.TABLE__PRKEY:
        setPrkey((PrimaryKey)null);
        return;
      case SqlCrudPackage.TABLE__FORKEYS:
        getForkeys().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SqlCrudPackage.TABLE__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case SqlCrudPackage.TABLE__COLUMNAS:
        return columnas != null && !columnas.isEmpty();
      case SqlCrudPackage.TABLE__PRKEY:
        return prkey != null;
      case SqlCrudPackage.TABLE__FORKEYS:
        return forkeys != null && !forkeys.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //TableImpl
