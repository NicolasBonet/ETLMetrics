/**
 */
package com.uniandes.jsontosql.xtext.json;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.jsontosql.xtext.json.ValueObject#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getValueObject()
 * @model
 * @generated
 */
public interface ValueObject extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(com.uniandes.jsontosql.xtext.json.Object)
   * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getValueObject_Value()
   * @model containment="true"
   * @generated
   */
  com.uniandes.jsontosql.xtext.json.Object getValue();

  /**
   * Sets the value of the '{@link com.uniandes.jsontosql.xtext.json.ValueObject#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(com.uniandes.jsontosql.xtext.json.Object value);

} // ValueObject
