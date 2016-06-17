/**
 */
package proyectos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Colores</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage#getColores()
 * @model
 * @generated
 */
public enum Colores implements Enumerator {
	/**
	 * The '<em><b>Blanco</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLANCO_VALUE
	 * @generated
	 * @ordered
	 */
	BLANCO(0, "blanco", "blanco"),

	/**
	 * The '<em><b>Negro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGRO_VALUE
	 * @generated
	 * @ordered
	 */
	NEGRO(0, "negro", "negro"),

	/**
	 * The '<em><b>Azul</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZUL_VALUE
	 * @generated
	 * @ordered
	 */
	AZUL(0, "azul", "azul"),

	/**
	 * The '<em><b>Verde</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERDE_VALUE
	 * @generated
	 * @ordered
	 */
	VERDE(0, "verde", "verde"),

	/**
	 * The '<em><b>Rojo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROJO_VALUE
	 * @generated
	 * @ordered
	 */
	ROJO(0, "rojo", "rojo"),

	/**
	 * The '<em><b>Gris</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRIS_VALUE
	 * @generated
	 * @ordered
	 */
	GRIS(0, "gris", "gris");

	/**
	 * The '<em><b>Blanco</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blanco</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLANCO
	 * @model name="blanco"
	 * @generated
	 * @ordered
	 */
	public static final int BLANCO_VALUE = 0;

	/**
	 * The '<em><b>Negro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGRO
	 * @model name="negro"
	 * @generated
	 * @ordered
	 */
	public static final int NEGRO_VALUE = 0;

	/**
	 * The '<em><b>Azul</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Azul</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AZUL
	 * @model name="azul"
	 * @generated
	 * @ordered
	 */
	public static final int AZUL_VALUE = 0;

	/**
	 * The '<em><b>Verde</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verde</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERDE
	 * @model name="verde"
	 * @generated
	 * @ordered
	 */
	public static final int VERDE_VALUE = 0;

	/**
	 * The '<em><b>Rojo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rojo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROJO
	 * @model name="rojo"
	 * @generated
	 * @ordered
	 */
	public static final int ROJO_VALUE = 0;

	/**
	 * The '<em><b>Gris</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gris</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRIS
	 * @model name="gris"
	 * @generated
	 * @ordered
	 */
	public static final int GRIS_VALUE = 0;

	/**
	 * An array of all the '<em><b>Colores</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Colores[] VALUES_ARRAY =
		new Colores[] {
			BLANCO,
			NEGRO,
			AZUL,
			VERDE,
			ROJO,
			GRIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Colores</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Colores> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Colores</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colores get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colores result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colores</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colores getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Colores result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Colores</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Colores get(int value) {
		switch (value) {
			case BLANCO_VALUE: return BLANCO;
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
	private Colores(int value, String name, String literal) {
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
	
} //Colores
