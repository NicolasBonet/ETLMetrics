/**
 */
package com.uniandes.jsontosql.xtext.json;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.uniandes.jsontosql.xtext.json.Object#getPairs <em>Pairs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends EObject
{
  /**
   * Returns the value of the '<em><b>Pairs</b></em>' containment reference list.
   * The list contents are of type {@link com.uniandes.jsontosql.xtext.json.Pair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pairs</em>' containment reference list.
   * @see com.uniandes.jsontosql.xtext.json.JsonPackage#getObject_Pairs()
   * @model containment="true"
   * @generated
   */
  EList<Pair> getPairs();

} // Object
