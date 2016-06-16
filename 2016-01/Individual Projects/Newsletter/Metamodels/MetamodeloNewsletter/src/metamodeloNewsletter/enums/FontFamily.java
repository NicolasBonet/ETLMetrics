/**
 */
package metamodeloNewsletter.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Family</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see metamodeloNewsletter.enums.EnumsPackage#getFontFamily()
 * @model
 * @generated
 */
public enum FontFamily implements Enumerator {
	/**
	 * The '<em><b>Arial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARIAL_VALUE
	 * @generated
	 * @ordered
	 */
	ARIAL(0, "arial", "Arial"),

	/**
	 * The '<em><b>Helvetica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELVETICA_VALUE
	 * @generated
	 * @ordered
	 */
	HELVETICA(0, "helvetica", "Helvetica"),

	/**
	 * The '<em><b>Times New Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMES_NEW_ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	TIMES_NEW_ROMAN(0, "timesNewRoman", "Times New Roman"),

	/**
	 * The '<em><b>Trebuchet MS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREBUCHET_MS_VALUE
	 * @generated
	 * @ordered
	 */
	TREBUCHET_MS(0, "trebuchetMS", "Trebuchet MS");

	/**
	 * The '<em><b>Arial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARIAL
	 * @model name="arial" literal="Arial"
	 * @generated
	 * @ordered
	 */
	public static final int ARIAL_VALUE = 0;

	/**
	 * The '<em><b>Helvetica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Helvetica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELVETICA
	 * @model name="helvetica" literal="Helvetica"
	 * @generated
	 * @ordered
	 */
	public static final int HELVETICA_VALUE = 0;

	/**
	 * The '<em><b>Times New Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Times New Roman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMES_NEW_ROMAN
	 * @model name="timesNewRoman" literal="Times New Roman"
	 * @generated
	 * @ordered
	 */
	public static final int TIMES_NEW_ROMAN_VALUE = 0;

	/**
	 * The '<em><b>Trebuchet MS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trebuchet MS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREBUCHET_MS
	 * @model name="trebuchetMS" literal="Trebuchet MS"
	 * @generated
	 * @ordered
	 */
	public static final int TREBUCHET_MS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Font Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontFamily[] VALUES_ARRAY =
		new FontFamily[] {
			ARIAL,
			HELVETICA,
			TIMES_NEW_ROMAN,
			TREBUCHET_MS,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Family</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontFamily> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamily result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontFamily result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Family</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FontFamily get(int value) {
		switch (value) {
			case ARIAL_VALUE: return ARIAL;
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
	private FontFamily(int value, String name, String literal) {
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
	
} //FontFamily
