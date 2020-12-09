/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.Resource#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.Resource#getMachineImages <em>Machine Images</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getResource_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.Resource#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Machine Images</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.ccl.metamodel.ccl.MachineImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Images</em>' containment reference list.
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getResource_MachineImages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MachineImage> getMachineImages();

} // Resource
