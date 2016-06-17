/**
 */
package com.uniandes.jsontosql.xtext.json;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.jsontosql.xtext.json.DecimalValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getDecimalValue()
 * @model
 * @generated
 */
public interface DecimalValue extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(double)
   * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getDecimalValue_Value()
   * @model
   * @generated
   */
  double getValue();

  /**
   * Sets the value of the '{@link com.uniandes.jsontosql.xtext.json.DecimalValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(double value);

} // DecimalValue
