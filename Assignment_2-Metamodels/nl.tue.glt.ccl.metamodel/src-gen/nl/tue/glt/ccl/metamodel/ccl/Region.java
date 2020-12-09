/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Region</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getRegion()
 * @model
 * @generated
 */
public enum Region implements Enumerator {
	/**
	 * The '<em><b>CALIFORNIA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALIFORNIA_VALUE
	 * @generated
	 * @ordered
	 */
	CALIFORNIA(0, "CALIFORNIA", "CALIFORNIA"),

	/**
	 * The '<em><b>CAPETOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPETOWN_VALUE
	 * @generated
	 * @ordered
	 */
	CAPETOWN(1, "CAPETOWN", "CAPETOWN"),

	/**
	 * The '<em><b>FRANKFURT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRANKFURT_VALUE
	 * @generated
	 * @ordered
	 */
	FRANKFURT(2, "FRANKFURT", "FRANKFURT"),

	/**
	 * The '<em><b>BOGOTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOGOTA_VALUE
	 * @generated
	 * @ordered
	 */
	BOGOTA(3, "BOGOTA", "BOGOTA"),

	/**
	 * The '<em><b>SEOUL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEOUL_VALUE
	 * @generated
	 * @ordered
	 */
	SEOUL(4, "SEOUL", "SEOUL");

	/**
	 * The '<em><b>CALIFORNIA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALIFORNIA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALIFORNIA_VALUE = 0;

	/**
	 * The '<em><b>CAPETOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPETOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAPETOWN_VALUE = 1;

	/**
	 * The '<em><b>FRANKFURT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRANKFURT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FRANKFURT_VALUE = 2;

	/**
	 * The '<em><b>BOGOTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOGOTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOGOTA_VALUE = 3;

	/**
	 * The '<em><b>SEOUL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEOUL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEOUL_VALUE = 4;

	/**
	 * An array of all the '<em><b>Region</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Region[] VALUES_ARRAY = new Region[] { CALIFORNIA, CAPETOWN, FRANKFURT, BOGOTA, SEOUL, };

	/**
	 * A public read-only list of all the '<em><b>Region</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Region> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Region</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Region get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Region result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Region</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Region getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Region result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Region</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Region get(int value) {
		switch (value) {
		case CALIFORNIA_VALUE:
			return CALIFORNIA;
		case CAPETOWN_VALUE:
			return CAPETOWN;
		case FRANKFURT_VALUE:
			return FRANKFURT;
		case BOGOTA_VALUE:
			return BOGOTA;
		case SEOUL_VALUE:
			return SEOUL;
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
	private Region(int value, String name, String literal) {
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

} //Region
