/**
 */
package webApiInput.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import webApiInput.Atributo;
import webApiInput.AttributesObject;
import webApiInput.CSharp;
import webApiInput.Clase;
import webApiInput.Constructor;
import webApiInput.EnumLiteral;
import webApiInput.List;
import webApiInput.Metodo;
import webApiInput.Parametro;
import webApiInput.Propiedad;
import webApiInput.PropiedadAtributo;
import webApiInput.Tipo;
import webApiInput.TypedObject;
import webApiInput.ValueObject;
import webApiInput.WebApiInputPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see webApiInput.WebApiInputPackage
 * @generated
 */
public class WebApiInputSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WebApiInputPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebApiInputSwitch() {
		if (modelPackage == null) {
			modelPackage = WebApiInputPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WebApiInputPackage.CSHARP: {
				CSharp cSharp = (CSharp)theEObject;
				T result = caseCSharp(cSharp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.ENUM: {
				webApiInput.Enum enum_ = (webApiInput.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseObject(enum_);
				if (result == null) result = caseTipo(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.ENUM_LITERAL: {
				EnumLiteral enumLiteral = (EnumLiteral)theEObject;
				T result = caseEnumLiteral(enumLiteral);
				if (result == null) result = caseObject(enumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.OBJECT: {
				webApiInput.Object object = (webApiInput.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.CLASE: {
				Clase clase = (Clase)theEObject;
				T result = caseClase(clase);
				if (result == null) result = caseAttributesObject(clase);
				if (result == null) result = caseTipo(clase);
				if (result == null) result = caseObject(clase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.PROPIEDAD: {
				Propiedad propiedad = (Propiedad)theEObject;
				T result = casePropiedad(propiedad);
				if (result == null) result = caseTypedObject(propiedad);
				if (result == null) result = caseAttributesObject(propiedad);
				if (result == null) result = caseObject(propiedad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = caseValueObject(atributo);
				if (result == null) result = caseObject(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.METODO: {
				Metodo metodo = (Metodo)theEObject;
				T result = caseMetodo(metodo);
				if (result == null) result = caseTypedObject(metodo);
				if (result == null) result = caseAttributesObject(metodo);
				if (result == null) result = caseObject(metodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.PARAMETRO: {
				Parametro parametro = (Parametro)theEObject;
				T result = caseParametro(parametro);
				if (result == null) result = caseTypedObject(parametro);
				if (result == null) result = caseAttributesObject(parametro);
				if (result == null) result = caseObject(parametro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.PROPIEDAD_ATRIBUTO: {
				PropiedadAtributo propiedadAtributo = (PropiedadAtributo)theEObject;
				T result = casePropiedadAtributo(propiedadAtributo);
				if (result == null) result = caseValueObject(propiedadAtributo);
				if (result == null) result = caseObject(propiedadAtributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.TYPED_OBJECT: {
				TypedObject typedObject = (TypedObject)theEObject;
				T result = caseTypedObject(typedObject);
				if (result == null) result = caseAttributesObject(typedObject);
				if (result == null) result = caseObject(typedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.ATTRIBUTES_OBJECT: {
				AttributesObject attributesObject = (AttributesObject)theEObject;
				T result = caseAttributesObject(attributesObject);
				if (result == null) result = caseObject(attributesObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.VALUE_OBJECT: {
				ValueObject valueObject = (ValueObject)theEObject;
				T result = caseValueObject(valueObject);
				if (result == null) result = caseObject(valueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.LIST: {
				List list = (List)theEObject;
				T result = caseList(list);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.TIPO: {
				Tipo tipo = (Tipo)theEObject;
				T result = caseTipo(tipo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WebApiInputPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseObject(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSharp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSharp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSharp(CSharp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(webApiInput.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumLiteral(EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(webApiInput.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClase(Clase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propiedad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropiedad(Propiedad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetodo(Metodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametro(Parametro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Propiedad Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Propiedad Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropiedadAtributo(PropiedadAtributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedObject(TypedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributesObject(AttributesObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueObject(ValueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseList(List object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tipo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipo(Tipo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WebApiInputSwitch
