/**
 */
package com.uniandes.config2sql.xtext.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.MergedField#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.MergedField#getFields <em>Fields</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.MergedField#getAttributeNames <em>Attribute Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getMergedField()
 * @model
 * @generated
 */
public interface MergedField extends EObject
{
  /**
   * Returns the value of the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name</em>' attribute.
   * @see #setTableName(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getMergedField_TableName()
   * @model
   * @generated
   */
  String getTableName();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.MergedField#getTableName <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name</em>' attribute.
   * @see #getTableName()
   * @generated
   */
  void setTableName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.uniandes.config2sql.xtext.config.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getMergedField_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Attribute Names</b></em>' containment reference list.
   * The list contents are of type {@link com.uniandes.config2sql.xtext.config.AttributeName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Names</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Names</em>' containment reference list.
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getMergedField_AttributeNames()
   * @model containment="true"
   * @generated
   */
  EList<AttributeName> getAttributeNames();

} // MergedField
