/**
 */
package com.uniandes.config2sql.xtext.config.impl;

import com.uniandes.config2sql.xtext.config.AttributeName;
import com.uniandes.config2sql.xtext.config.ConfigPackage;
import com.uniandes.config2sql.xtext.config.Field;
import com.uniandes.config2sql.xtext.config.MergedField;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.impl.MergedFieldImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.impl.MergedFieldImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.impl.MergedFieldImpl#getAttributeNames <em>Attribute Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MergedFieldImpl extends MinimalEObjectImpl.Container implements MergedField
{
  /**
   * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected static final String TABLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableName()
   * @generated
   * @ordered
   */
  protected String tableName = TABLE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getAttributeNames() <em>Attribute Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeNames()
   * @generated
   * @ordered
   */
  protected EList<AttributeName> attributeNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MergedFieldImpl()
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
    return ConfigPackage.Literals.MERGED_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTableName()
  {
    return tableName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTableName(String newTableName)
  {
    String oldTableName = tableName;
    tableName = newTableName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.MERGED_FIELD__TABLE_NAME, oldTableName, tableName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, ConfigPackage.MERGED_FIELD__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeName> getAttributeNames()
  {
    if (attributeNames == null)
    {
      attributeNames = new EObjectContainmentEList<AttributeName>(AttributeName.class, this, ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES);
    }
    return attributeNames;
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
      case ConfigPackage.MERGED_FIELD__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES:
        return ((InternalEList<?>)getAttributeNames()).basicRemove(otherEnd, msgs);
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
      case ConfigPackage.MERGED_FIELD__TABLE_NAME:
        return getTableName();
      case ConfigPackage.MERGED_FIELD__FIELDS:
        return getFields();
      case ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES:
        return getAttributeNames();
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
      case ConfigPackage.MERGED_FIELD__TABLE_NAME:
        setTableName((String)newValue);
        return;
      case ConfigPackage.MERGED_FIELD__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES:
        getAttributeNames().clear();
        getAttributeNames().addAll((Collection<? extends AttributeName>)newValue);
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
      case ConfigPackage.MERGED_FIELD__TABLE_NAME:
        setTableName(TABLE_NAME_EDEFAULT);
        return;
      case ConfigPackage.MERGED_FIELD__FIELDS:
        getFields().clear();
        return;
      case ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES:
        getAttributeNames().clear();
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
      case ConfigPackage.MERGED_FIELD__TABLE_NAME:
        return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
      case ConfigPackage.MERGED_FIELD__FIELDS:
        return fields != null && !fields.isEmpty();
      case ConfigPackage.MERGED_FIELD__ATTRIBUTE_NAMES:
        return attributeNames != null && !attributeNames.isEmpty();
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
    result.append(" (tableName: ");
    result.append(tableName);
    result.append(')');
    return result.toString();
  }

} //MergedFieldImpl
