/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.genSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.genSql.Column#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.genSql.Column#getSQLType <em>SQL Type</em>}</li>
 *   <li>{@link co.edu.uniandes.genSql.Column#getLongitud <em>Longitud</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.genSql.GenSqlPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject
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
   * @see co.edu.uniandes.genSql.GenSqlPackage#getColumn_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.genSql.Column#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>SQL Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SQL Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SQL Type</em>' attribute.
   * @see #setSQLType(String)
   * @see co.edu.uniandes.genSql.GenSqlPackage#getColumn_SQLType()
   * @model
   * @generated
   */
  String getSQLType();

  /**
   * Sets the value of the '{@link co.edu.uniandes.genSql.Column#getSQLType <em>SQL Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SQL Type</em>' attribute.
   * @see #getSQLType()
   * @generated
   */
  void setSQLType(String value);

  /**
   * Returns the value of the '<em><b>Longitud</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Longitud</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Longitud</em>' attribute.
   * @see #setLongitud(String)
   * @see co.edu.uniandes.genSql.GenSqlPackage#getColumn_Longitud()
   * @model
   * @generated
   */
  String getLongitud();

  /**
   * Sets the value of the '{@link co.edu.uniandes.genSql.Column#getLongitud <em>Longitud</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Longitud</em>' attribute.
   * @see #getLongitud()
   * @generated
   */
  void setLongitud(String value);

} // Column