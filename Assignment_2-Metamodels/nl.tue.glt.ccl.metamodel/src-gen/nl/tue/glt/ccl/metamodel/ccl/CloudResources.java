/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.CloudResources#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getCloudResources()
 * @model
 * @generated
 */
public interface CloudResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.ccl.metamodel.ccl.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getCloudResources_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // CloudResources
