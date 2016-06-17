/**
 */
package com.uniandes.jsontosql.xtext.json;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.uniandes.jsontosql.xtext.json.JsonFactory
 * @model kind="package"
 * @generated
 */
public interface JsonPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "json";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uniandes.com/jsontosql/xtext/Json";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "json";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonPackage eINSTANCE = com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl.init();

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.DocumentImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Objects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__OBJECTS = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.ObjectImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 1;

  /**
   * The feature id for the '<em><b>Pairs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__PAIRS = 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.PairImpl <em>Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.PairImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getPair()
   * @generated
   */
  int PAIR = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.ValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getValue()
   * @generated
   */
  int VALUE = 3;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.StringValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.NumberValueImpl <em>Number Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.NumberValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getNumberValue()
   * @generated
   */
  int NUMBER_VALUE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.DecimalValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getDecimalValue()
   * @generated
   */
  int DECIMAL_VALUE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.ValueObjectImpl <em>Value Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.ValueObjectImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getValueObject()
   * @generated
   */
  int VALUE_OBJECT = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_OBJECT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.ArrayValueImpl <em>Array Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.ArrayValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getArrayValue()
   * @generated
   */
  int ARRAY_VALUE = 8;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.uniandes.jsontosql.xtext.json.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.uniandes.jsontosql.xtext.json.impl.BooleanValueImpl
   * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference list '{@link com.uniandes.jsontosql.xtext.json.Document#getObjects <em>Objects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Objects</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Document#getObjects()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Objects();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link com.uniandes.jsontosql.xtext.json.Object#getPairs <em>Pairs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pairs</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Object#getPairs()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Pairs();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pair</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Pair
   * @generated
   */
  EClass getPair();

  /**
   * Returns the meta object for the attribute '{@link com.uniandes.jsontosql.xtext.json.Pair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Pair#getName()
   * @see #getPair()
   * @generated
   */
  EAttribute getPair_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.uniandes.jsontosql.xtext.json.Pair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Pair#getValue()
   * @see #getPair()
   * @generated
   */
  EReference getPair_Value();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link com.uniandes.jsontosql.xtext.json.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.NumberValue
   * @generated
   */
  EClass getNumberValue();

  /**
   * Returns the meta object for the attribute '{@link com.uniandes.jsontosql.xtext.json.NumberValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.NumberValue#getValue()
   * @see #getNumberValue()
   * @generated
   */
  EAttribute getNumberValue_Value();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.DecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.DecimalValue
   * @generated
   */
  EClass getDecimalValue();

  /**
   * Returns the meta object for the attribute '{@link com.uniandes.jsontosql.xtext.json.DecimalValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.DecimalValue#getValue()
   * @see #getDecimalValue()
   * @generated
   */
  EAttribute getDecimalValue_Value();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.ValueObject <em>Value Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Object</em>'.
   * @see com.uniandes.jsontosql.xtext.json.ValueObject
   * @generated
   */
  EClass getValueObject();

  /**
   * Returns the meta object for the containment reference '{@link com.uniandes.jsontosql.xtext.json.ValueObject#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.ValueObject#getValue()
   * @see #getValueObject()
   * @generated
   */
  EReference getValueObject_Value();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.ArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.ArrayValue
   * @generated
   */
  EClass getArrayValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.uniandes.jsontosql.xtext.json.ArrayValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see com.uniandes.jsontosql.xtext.json.ArrayValue#getValues()
   * @see #getArrayValue()
   * @generated
   */
  EReference getArrayValue_Values();

  /**
   * Returns the meta object for class '{@link com.uniandes.jsontosql.xtext.json.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link com.uniandes.jsontosql.xtext.json.BooleanValue#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.uniandes.jsontosql.xtext.json.BooleanValue#isValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonFactory getJsonFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.DocumentImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__OBJECTS = eINSTANCE.getDocument_Objects();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.ObjectImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Pairs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__PAIRS = eINSTANCE.getObject_Pairs();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.PairImpl <em>Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.PairImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getPair()
     * @generated
     */
    EClass PAIR = eINSTANCE.getPair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAIR__NAME = eINSTANCE.getPair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAIR__VALUE = eINSTANCE.getPair_Value();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.ValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.StringValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.NumberValueImpl <em>Number Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.NumberValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getNumberValue()
     * @generated
     */
    EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_VALUE__VALUE = eINSTANCE.getNumberValue_Value();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.DecimalValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getDecimalValue()
     * @generated
     */
    EClass DECIMAL_VALUE = eINSTANCE.getDecimalValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_VALUE__VALUE = eINSTANCE.getDecimalValue_Value();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.ValueObjectImpl <em>Value Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.ValueObjectImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getValueObject()
     * @generated
     */
    EClass VALUE_OBJECT = eINSTANCE.getValueObject();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_OBJECT__VALUE = eINSTANCE.getValueObject_Value();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.ArrayValueImpl <em>Array Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.ArrayValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getArrayValue()
     * @generated
     */
    EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

    /**
     * The meta object literal for the '{@link com.uniandes.jsontosql.xtext.json.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.uniandes.jsontosql.xtext.json.impl.BooleanValueImpl
     * @see com.uniandes.jsontosql.xtext.json.impl.JsonPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

  }

} //JsonPackage
