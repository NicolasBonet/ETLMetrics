/**
 */
package com.uniandes.config2sql.xtext.config;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Config#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.uniandes.config2sql.xtext.config.Config#getMergeFields <em>Merge Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject
{
  /**
   * Returns the value of the '<em><b>Connection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection</em>' containment reference.
   * @see #setConnection(Connection)
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConfig_Connection()
   * @model containment="true"
   * @generated
   */
  Connection getConnection();

  /**
   * Sets the value of the '{@link com.uniandes.config2sql.xtext.config.Config#getConnection <em>Connection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection</em>' containment reference.
   * @see #getConnection()
   * @generated
   */
  void setConnection(Connection value);

  /**
   * Returns the value of the '<em><b>Merge Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.uniandes.config2sql.xtext.config.MergedField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Merge Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Merge Fields</em>' containment reference list.
   * @see com.uniandes.config2sql.xtext.config.ConfigPackage#getConfig_MergeFields()
   * @model containment="true"
   * @generated
   */
  EList<MergedField> getMergeFields();

} // Config
