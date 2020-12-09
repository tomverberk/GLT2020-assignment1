/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage
 * @generated
 */
public interface CclFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclFactory eINSTANCE = nl.tue.glt.ccl.metamodel.ccl.impl.CclFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Resources</em>'.
	 * @generated
	 */
	CloudResources createCloudResources();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Computing Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Image</em>'.
	 * @generated
	 */
	ComputingImage createComputingImage();

	/**
	 * Returns a new object of class '<em>Storage Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Image</em>'.
	 * @generated
	 */
	StorageImage createStorageImage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CclPackage getCclPackage();

} //CclFactory
