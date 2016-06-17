/**
 */
package com.uniandes.jsontosql.xtext.json.impl;

import com.uniandes.jsontosql.xtext.json.ArrayValue;
import com.uniandes.jsontosql.xtext.json.JsonPackage;
import com.uniandes.jsontosql.xtext.json.Value;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.uniandes.jsontosql.xtext.json.impl.ArrayValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayValueImpl extends ValueImpl implements ArrayValue
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Value> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayValueImpl()
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
    return JsonPackage.Literals.ARRAY_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<Value>(Value.class, this, JsonPackage.ARRAY_VALUE__VALUES);
    }
    return values;
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
      case JsonPackage.ARRAY_VALUE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case JsonPackage.ARRAY_VALUE__VALUES:
        return getValues();
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
      case JsonPackage.ARRAY_VALUE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Value>)newValue);
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
      case JsonPackage.ARRAY_VALUE__VALUES:
        getValues().clear();
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
      case JsonPackage.ARRAY_VALUE__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayValueImpl
