/**
 */
package proyectos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estilo Imagen</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see proyectos.ProyectosPackage#getEstiloImagen()
 * @model
 * @generated
 */
public enum EstiloImagen implements Enumerator {
	/**
	 * The '<em><b>Compacta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPACTA_VALUE
	 * @generated
	 * @ordered
	 */
	COMPACTA(0, "compacta", "compacta"), /**
	 * The '<em><b>Completa</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETA_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETA(0, "completa", "completa");

	/**
	 * The '<em><b>Compacta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compacta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPACTA
	 * @model name="compacta"
	 * @generated
	 * @ordered
	 */
	public static final int COMPACTA_VALUE = 0;

	/**
	 * The '<em><b>Completa</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Completa</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETA
	 * @model name="completa"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETA_VALUE = 0;

	/**
	 * An array of all the '<em><b>Estilo Imagen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstiloImagen[] VALUES_ARRAY =
		new EstiloImagen[] {
			COMPACTA,
			COMPLETA,
		};

	/**
	 * A public read-only list of all the '<em><b>Estilo Imagen</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EstiloImagen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estilo Imagen</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloImagen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstiloImagen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo Imagen</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloImagen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstiloImagen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo Imagen</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloImagen get(int value) {
		switch (value) {
			case COMPACTA_VALUE: return COMPACTA;
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
	private EstiloImagen(int value, String name, String literal) {
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
	
} //EstiloImagen
