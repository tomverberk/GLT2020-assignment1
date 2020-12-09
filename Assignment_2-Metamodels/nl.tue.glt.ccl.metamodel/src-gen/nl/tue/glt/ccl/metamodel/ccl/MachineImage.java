/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getRegion <em>Region</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getMemory <em>Memory</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageType <em>Storage Type</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage()
 * @model abstract="true"
 * @generated
 */
public interface MachineImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.ccl.metamodel.ccl.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Region
	 * @see #setRegion(Region)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_Region()
	 * @model required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Region
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcpu</em>' attribute.
	 * @see #setVcpu(int)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_Vcpu()
	 * @model required="true"
	 * @generated
	 */
	int getVcpu();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getVcpu <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpu</em>' attribute.
	 * @see #getVcpu()
	 * @generated
	 */
	void setVcpu(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_Memory()
	 * @model required="true"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

	/**
	 * Returns the value of the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Size</em>' attribute.
	 * @see #setStorageSize(int)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_StorageSize()
	 * @model required="true"
	 * @generated
	 */
	int getStorageSize();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageSize <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Size</em>' attribute.
	 * @see #getStorageSize()
	 * @generated
	 */
	void setStorageSize(int value);

	/**
	 * Returns the value of the '<em><b>Storage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.ccl.metamodel.ccl.StorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageType
	 * @see #setStorageType(StorageType)
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#getMachineImage_StorageType()
	 * @model required="true"
	 * @generated
	 */
	StorageType getStorageType();

	/**
	 * Sets the value of the '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageType <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type</em>' attribute.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageType
	 * @see #getStorageType()
	 * @generated
	 */
	void setStorageType(StorageType value);

} // MachineImage
