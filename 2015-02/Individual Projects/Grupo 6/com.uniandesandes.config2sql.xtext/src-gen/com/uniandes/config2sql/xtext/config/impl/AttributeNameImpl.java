/**
 */
package com.uniandes.config2sql.xtext.config.impl;

import com.uniandes.config2sql.xtext.config.AttributeName;
import com.uniandes.config2sql.xtext.config.ConfigPackage;
import com.uniandes.config2sql.xtext.config.Field;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.impl.AttributeNameImpl#getOldField <em>Old Field</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.impl.AttributeNameImpl#getFinalField <em>Final Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeNameImpl extends MinimalEObjectImpl.Container implements AttributeName
{
  /**
   * The default value of the '{@link #getOldField() <em>Old Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldField()
   * @generated
   * @ordered
   */
  protected static final String OLD_FIELD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOldField() <em>Old Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOldField()
   * @generated
   * @ordered
   */
  protected String oldField = OLD_FIELD_EDEFAULT;

  /**
   * The cached value of the '{@link #getFinalField() <em>Final Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalField()
   * @generated
   * @ordered
   */
  protected Field finalField;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeNameImpl()
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
    return ConfigPackage.Literals.ATTRIBUTE_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOldField()
  {
    return oldField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOldField(String newOldField)
  {
    String oldOldField = oldField;
    oldField = newOldField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ATTRIBUTE_NAME__OLD_FIELD, oldOldField, oldField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field getFinalField()
  {
    if (finalField != null && finalField.eIsProxy())
    {
      InternalEObject oldFinalField = (InternalEObject)finalField;
      finalField = (Field)eResolveProxy(oldFinalField);
      if (finalField != oldFinalField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD, oldFinalField, finalField));
      }
    }
    return finalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field basicGetFinalField()
  {
    return finalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinalField(Field newFinalField)
  {
    Field oldFinalField = finalField;
    finalField = newFinalField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD, oldFinalField, finalField));
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
      case ConfigPackage.ATTRIBUTE_NAME__OLD_FIELD:
        return getOldField();
      case ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD:
        if (resolve) return getFinalField();
        return basicGetFinalField();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ConfigPackage.ATTRIBUTE_NAME__OLD_FIELD:
        setOldField((String)newValue);
        return;
      case ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD:
        setFinalField((Field)newValue);
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
      case ConfigPackage.ATTRIBUTE_NAME__OLD_FIELD:
        setOldField(OLD_FIELD_EDEFAULT);
        return;
      case ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD:
        setFinalField((Field)null);
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
      case ConfigPackage.ATTRIBUTE_NAME__OLD_FIELD:
        return OLD_FIELD_EDEFAULT == null ? oldField != null : !OLD_FIELD_EDEFAULT.equals(oldField);
      case ConfigPackage.ATTRIBUTE_NAME__FINAL_FIELD:
        return finalField != null;
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
    result.append(" (oldField: ");
    result.append(oldField);
    result.append(')');
    return result.toString();
  }

} //AttributeNameImpl
