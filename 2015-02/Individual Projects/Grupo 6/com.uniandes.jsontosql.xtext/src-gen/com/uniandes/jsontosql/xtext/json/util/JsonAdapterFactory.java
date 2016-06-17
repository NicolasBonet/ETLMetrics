/**
 */
package com.uniandes.jsontosql.xtext.json.util;

import com.uniandes.jsontosql.xtext.json.ArrayValue;
import com.uniandes.jsontosql.xtext.json.BooleanValue;
import com.uniandes.jsontosql.xtext.json.DecimalValue;
import com.uniandes.jsontosql.xtext.json.Document;
import com.uniandes.jsontosql.xtext.json.JsonPackage;
import com.uniandes.jsontosql.xtext.json.NumberValue;
import com.uniandes.jsontosql.xtext.json.Pair;
import com.uniandes.jsontosql.xtext.json.StringValue;
import com.uniandes.jsontosql.xtext.json.Value;
import com.uniandes.jsontosql.xtext.json.ValueObject;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.uniandes.jsontosql.xtext.json.JsonPackage
 * @generated
 */
public class JsonAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JsonPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JsonPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonSwitch<Adapter> modelSwitch =
    new JsonSwitch<Adapter>()
    {
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseObject(com.uniandes.jsontosql.xtext.json.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter casePair(Pair object)
      {
        return createPairAdapter();
      }
      @Override
      public Adapter caseValue(Value object)
      {
        return createValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseNumberValue(NumberValue object)
      {
        return createNumberValueAdapter();
      }
      @Override
      public Adapter caseDecimalValue(DecimalValue object)
      {
        return createDecimalValueAdapter();
      }
      @Override
      public Adapter caseValueObject(ValueObject object)
      {
        return createValueObjectAdapter();
      }
      @Override
      public Adapter caseArrayValue(ArrayValue object)
      {
        return createArrayValueAdapter();
      }
      @Override
      public Adapter caseBooleanValue(BooleanValue object)
      {
        return createBooleanValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.Pair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.Pair
   * @generated
   */
  public Adapter createPairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.Value
   * @generated
   */
  public Adapter createValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.NumberValue
   * @generated
   */
  public Adapter createNumberValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.DecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.DecimalValue
   * @generated
   */
  public Adapter createDecimalValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.ValueObject <em>Value Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.ValueObject
   * @generated
   */
  public Adapter createValueObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.ArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.ArrayValue
   * @generated
   */
  public Adapter createArrayValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.uniandes.jsontosql.xtext.json.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.uniandes.jsontosql.xtext.json.BooleanValue
   * @generated
   */
  public Adapter createBooleanValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JsonAdapterFactory
