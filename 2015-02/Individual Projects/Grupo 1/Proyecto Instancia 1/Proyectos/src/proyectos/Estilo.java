/**
 */
package proyectos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estilo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage#getEstilo()
 * @model
 * @generated
 */
public enum Estilo implements Enumerator {
	/**
	 * The '<em><b>Empresarial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPRESARIAL_VALUE
	 * @generated
	 * @ordered
	 */
	EMPRESARIAL(0, "empresarial", "empresarial"),

	/**
	 * The '<em><b>Clasico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASICO_VALUE
	 * @generated
	 * @ordered
	 */
	CLASICO(0, "clasico", "clasico"),

	/**
	 * The '<em><b>Moderno</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODERNO_VALUE
	 * @generated
	 * @ordered
	 */
	MODERNO(0, "moderno", "moderno"),

	/**
	 * The '<em><b>Profesional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFESIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	PROFESIONAL(0, "profesional", "profesional");

	/**
	 * The '<em><b>Empresarial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empresarial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPRESARIAL
	 * @model name="empresarial"
	 * @generated
	 * @ordered
	 */
	public static final int EMPRESARIAL_VALUE = 0;

	/**
	 * The '<em><b>Clasico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clasico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASICO
	 * @model name="clasico"
	 * @generated
	 * @ordered
	 */
	public static final int CLASICO_VALUE = 0;

	/**
	 * The '<em><b>Moderno</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moderno</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODERNO
	 * @model name="moderno"
	 * @generated
	 * @ordered
	 */
	public static final int MODERNO_VALUE = 0;

	/**
	 * The '<em><b>Profesional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Profesional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROFESIONAL
	 * @model name="profesional"
	 * @generated
	 * @ordered
	 */
	public static final int PROFESIONAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Estilo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Estilo[] VALUES_ARRAY =
		new Estilo[] {
			EMPRESARIAL,
			CLASICO,
			MODERNO,
			PROFESIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Estilo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Estilo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estilo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Estilo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Estilo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Estilo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Estilo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Estilo get(int value) {
		switch (value) {
			case EMPRESARIAL_VALUE: return EMPRESARIAL;
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
	private Estilo(int value, String name, String literal) {
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
	
} //Estilo
