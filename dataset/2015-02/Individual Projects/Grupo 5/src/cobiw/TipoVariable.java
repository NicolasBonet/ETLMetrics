/**
 */
package cobiw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Variable</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cobiw.CobiwPackage#getTipoVariable()
 * @model
 * @generated
 */
public enum TipoVariable implements Enumerator {
	/**
	 * The '<em><b>Numerica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERICA_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERICA(0, "numerica", "numerica"),

	/**
	 * The '<em><b>Caracter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CARACTER(1, "caracter", "caracter"), /**
	 * The '<em><b>Padre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PADRE_VALUE
	 * @generated
	 * @ordered
	 */
	PADRE(2, "padre", "padre");

	/**
	 * The '<em><b>Numerica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numerica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERICA
	 * @model name="numerica"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERICA_VALUE = 0;

	/**
	 * The '<em><b>Caracter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caracter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARACTER
	 * @model name="caracter"
	 * @generated
	 * @ordered
	 */
	public static final int CARACTER_VALUE = 1;

	/**
	 * The '<em><b>Padre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Padre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PADRE
	 * @model name="padre"
	 * @generated
	 * @ordered
	 */
	public static final int PADRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Tipo Variable</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoVariable[] VALUES_ARRAY =
		new TipoVariable[] {
			NUMERICA,
			CARACTER,
			PADRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Variable</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoVariable> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Variable</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoVariable get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoVariable result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Variable</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoVariable getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoVariable result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Variable</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoVariable get(int value) {
		switch (value) {
			case NUMERICA_VALUE: return NUMERICA;
			case CARACTER_VALUE: return CARACTER;
			case PADRE_VALUE: return PADRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoVariable(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoVariable
