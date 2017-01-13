/**
 */
package com.uniandes.jsontosql.xtext.json;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.jsontosql.xtext.json.ArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link com.uniandes.jsontosql.xtext.json.Value}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getArrayValue_Values()
   * @model containment="true"
   * @generated
   */
  EList<Value> getValues();

} // ArrayValue
