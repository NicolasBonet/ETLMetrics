/**
 */
package com.uniandes.config2sql.xtext.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Field#getName <em>Name</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Field#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Field#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.uniandes.config2sql.xtext.config.FieldType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.uniandes.config2sql.xtext.config.FieldType
   * @see #setType(FieldType)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getField_Type()
   * @model
   * @generated
   */
  FieldType getType();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Field#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.uniandes.config2sql.xtext.config.FieldType
   * @see #getType()
   * @generated
   */
  void setType(FieldType value);

} // Field
