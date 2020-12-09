/**
 */
package nl.tue.glt.graph.metamodel.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.graph.metamodel.graph.GraphPackage#getStyle()
 * @model
 * @generated
 */
public enum Style implements Enumerator {
	/**
	 * The '<em><b>SOLID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	SOLID(0, "SOLID", "SOLID"),

	/**
	 * The '<em><b>DOTTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTTED_VALUE
	 * @generated
	 * @ordered
	 */
	DOTTED(1, "DOTTED", "DOTTED"),

	/**
	 * The '<em><b>DASHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHED_VALUE
	 * @generated
	 * @ordered
	 */
	DASHED(2, "DASHED", "DASHED");

	/**
	 * The '<em><b>SOLID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLID_VALUE = 0;

	/**
	 * The '<em><b>DOTTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOTTED_VALUE = 1;

	/**
	 * The '<em><b>DASHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DASHED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Style[] VALUES_ARRAY = new Style[] { SOLID, DOTTED, DASHED, };

	/**
	 * A public read-only list of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Style> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style get(int value) {
		switch (value) {
		case SOLID_VALUE:
			return SOLID;
		case DOTTED_VALUE:
			return DOTTED;
		case DASHED_VALUE:
			return DASHED;
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
	private Style(int value, String name, String literal) {
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

} //Style
