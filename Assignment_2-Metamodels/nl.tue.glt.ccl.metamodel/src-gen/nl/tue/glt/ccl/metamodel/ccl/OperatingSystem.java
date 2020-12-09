/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operating System</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getOperatingSystem()
 * @model
 * @generated
 */
public enum OperatingSystem implements Enumerator {
	/**
	 * The '<em><b>LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(0, "LINUX", "LINUX"),

	/**
	 * The '<em><b>REDHAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDHAT_VALUE
	 * @generated
	 * @ordered
	 */
	REDHAT(1, "REDHAT", "REDHAT"),

	/**
	 * The '<em><b>UBUNTU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU_VALUE
	 * @generated
	 * @ordered
	 */
	UBUNTU(2, "UBUNTU", "UBUNTU"),

	/**
	 * The '<em><b>WINDOWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(3, "WINDOWS", "WINDOWS");

	/**
	 * The '<em><b>LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 0;

	/**
	 * The '<em><b>REDHAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDHAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDHAT_VALUE = 1;

	/**
	 * The '<em><b>UBUNTU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UBUNTU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UBUNTU_VALUE = 2;

	/**
	 * The '<em><b>WINDOWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatingSystem[] VALUES_ARRAY = new OperatingSystem[] { LINUX, REDHAT, UBUNTU, WINDOWS, };

	/**
	 * A public read-only list of all the '<em><b>Operating System</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatingSystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatingSystem result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operating System</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatingSystem get(int value) {
		switch (value) {
		case LINUX_VALUE:
			return LINUX;
		case REDHAT_VALUE:
			return REDHAT;
		case UBUNTU_VALUE:
			return UBUNTU;
		case WINDOWS_VALUE:
			return WINDOWS;
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
	private OperatingSystem(int value, String name, String literal) {
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

} //OperatingSystem
