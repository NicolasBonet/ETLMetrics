/**
 */
package proyectos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Presentacion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage#getTipoPresentacion()
 * @model
 * @generated
 */
public enum TipoPresentacion implements Enumerator {
	/**
	 * The '<em><b>Basico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASICO_VALUE
	 * @generated
	 * @ordered
	 */
	BASICO(0, "basico", "basico"),

	/**
	 * The '<em><b>Premium</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMIUM_VALUE
	 * @generated
	 * @ordered
	 */
	PREMIUM(0, "premium", "premium"),

	/**
	 * The '<em><b>Gold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOLD_VALUE
	 * @generated
	 * @ordered
	 */
	GOLD(0, "gold", "gold");

	/**
	 * The '<em><b>Basico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASICO
	 * @model name="basico"
	 * @generated
	 * @ordered
	 */
	public static final int BASICO_VALUE = 0;

	/**
	 * The '<em><b>Premium</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Premium</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREMIUM
	 * @model name="premium"
	 * @generated
	 * @ordered
	 */
	public static final int PREMIUM_VALUE = 0;

	/**
	 * The '<em><b>Gold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOLD
	 * @model name="gold"
	 * @generated
	 * @ordered
	 */
	public static final int GOLD_VALUE = 0;

	/**
	 * An array of all the '<em><b>Tipo Presentacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoPresentacion[] VALUES_ARRAY =
		new TipoPresentacion[] {
			BASICO,
			PREMIUM,
			GOLD,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Presentacion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoPresentacion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Presentacion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPresentacion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPresentacion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Presentacion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPresentacion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoPresentacion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Presentacion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoPresentacion get(int value) {
		switch (value) {
			case BASICO_VALUE: return BASICO;
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
	private TipoPresentacion(int value, String name, String literal) {
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
	
} //TipoPresentacion
