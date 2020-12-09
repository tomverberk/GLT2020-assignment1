/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.ComputingImage#getOs <em>Os</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getComputingImage()
 * @model
 * @generated
 */
public interface ComputingImage extends MachineImage {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.ccl.metamodel.ccl.OperatingSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.OperatingSystem
	 * @see #setOs(OperatingSystem)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getComputingImage_Os()
	 * @model required="true"
	 * @generated
	 */
	OperatingSystem getOs();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.ComputingImage#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.OperatingSystem
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OperatingSystem value);

} // ComputingImage
