/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.StorageImage#getDbEngine <em>Db Engine</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getStorageImage()
 * @model
 * @generated
 */
public interface StorageImage extends MachineImage {
	/**
	 * Returns the value of the '<em><b>Db Engine</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.ccl.metamodel.ccl.DBEngine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Engine</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.DBEngine
	 * @see #setDbEngine(DBEngine)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getStorageImage_DbEngine()
	 * @model required="true"
	 * @generated
	 */
	DBEngine getDbEngine();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.StorageImage#getDbEngine <em>Db Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Engine</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.DBEngine
	 * @see #getDbEngine()
	 * @generated
	 */
	void setDbEngine(DBEngine value);

} // StorageImage
