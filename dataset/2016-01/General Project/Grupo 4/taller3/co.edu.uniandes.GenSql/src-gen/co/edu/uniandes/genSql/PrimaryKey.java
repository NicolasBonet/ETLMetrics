/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.genSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.genSql.PrimaryKey#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.genSql.GenSqlPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Columns</b></em>' reference list.
   * The list contents are of type {@link co.edu.uniandes.genSql.Column}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' reference list.
   * @see co.edu.uniandes.genSql.GenSqlPackage#getPrimaryKey_Columns()
   * @model
   * @generated
   */
  EList<Column> getColumns();

} // PrimaryKey