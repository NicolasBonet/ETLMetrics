/**
 */
package com.uniandes.config2sql.xtext.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.AttributeName#getOldField <em>Old Field</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.AttributeName#getFinalField <em>Final Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getAttributeName()
 * @model
 * @generated
 */
public interface AttributeName extends EObject
{
  /**
   * Returns the value of the '<em><b>Old Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Old Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Old Field</em>' attribute.
   * @see #setOldField(String)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getAttributeName_OldField()
   * @model
   * @generated
   */
  String getOldField();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.AttributeName#getOldField <em>Old Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Old Field</em>' attribute.
   * @see #getOldField()
   * @generated
   */
  void setOldField(String value);

  /**
   * Returns the value of the '<em><b>Final Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final Field</em>' reference.
   * @see #setFinalField(Field)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getAttributeName_FinalField()
   * @model
   * @generated
   */
  Field getFinalField();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.AttributeName#getFinalField <em>Final Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final Field</em>' reference.
   * @see #getFinalField()
   * @generated
   */
  void setFinalField(Field value);

} // AttributeName
