/**
 */
package nl.tue.glt.ccl.metamodel.ccl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.tue.glt.ccl.metamodel.ccl.CclFactory
 * @model kind="package"
 * @generated
 */
public interface CclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ccl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://glt.tue.nl/ccl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ccl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CclPackage eINSTANCE = nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.CloudResourcesImpl <em>Cloud Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CloudResourcesImpl
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getCloudResources()
	 * @generated
	 */
	int CLOUD_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCES__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Cloud Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cloud Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.ResourceImpl
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Machine Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MACHINE_IMAGES = 1;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl <em>Machine Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getMachineImage()
	 * @generated
	 */
	int MACHINE_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__REGION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__VCPU = 2;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__MEMORY = 3;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__STORAGE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE__STORAGE_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Machine Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.ComputingImageImpl <em>Computing Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.ComputingImageImpl
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getComputingImage()
	 * @generated
	 */
	int COMPUTING_IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__REGION = MACHINE_IMAGE__REGION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__LABEL = MACHINE_IMAGE__LABEL;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__VCPU = MACHINE_IMAGE__VCPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__MEMORY = MACHINE_IMAGE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__STORAGE_SIZE = MACHINE_IMAGE__STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__STORAGE_TYPE = MACHINE_IMAGE__STORAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE__OS = MACHINE_IMAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computing Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE_FEATURE_COUNT = MACHINE_IMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computing Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_IMAGE_OPERATION_COUNT = MACHINE_IMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.StorageImageImpl <em>Storage Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.StorageImageImpl
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getStorageImage()
	 * @generated
	 */
	int STORAGE_IMAGE = 4;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__REGION = MACHINE_IMAGE__REGION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__LABEL = MACHINE_IMAGE__LABEL;

	/**
	 * The feature id for the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__VCPU = MACHINE_IMAGE__VCPU;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__MEMORY = MACHINE_IMAGE__MEMORY;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__STORAGE_SIZE = MACHINE_IMAGE__STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__STORAGE_TYPE = MACHINE_IMAGE__STORAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Db Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE__DB_ENGINE = MACHINE_IMAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storage Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE_FEATURE_COUNT = MACHINE_IMAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storage Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_IMAGE_OPERATION_COUNT = MACHINE_IMAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.Region <em>Region</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.Region
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 5;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.OperatingSystem <em>Operating System</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.OperatingSystem
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 6;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.StorageType <em>Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageType
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 7;

	/**
	 * The meta object id for the '{@link nl.tue.glt.ccl.metamodel.ccl.DBEngine <em>DB Engine</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.ccl.metamodel.ccl.DBEngine
	 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getDBEngine()
	 * @generated
	 */
	int DB_ENGINE = 8;

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.ccl.metamodel.ccl.CloudResources <em>Cloud Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Resources</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.CloudResources
	 * @generated
	 */
	EClass getCloudResources();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.ccl.metamodel.ccl.CloudResources#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.CloudResources#getResources()
	 * @see #getCloudResources()
	 * @generated
	 */
	EReference getCloudResources_Resources();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.ccl.metamodel.ccl.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.Resource#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Resource#getLabel()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.ccl.metamodel.ccl.Resource#getMachineImages <em>Machine Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Machine Images</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Resource#getMachineImages()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_MachineImages();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage <em>Machine Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Image</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage
	 * @generated
	 */
	EClass getMachineImage();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getRegion()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_Region();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getLabel()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_Label();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getVcpu <em>Vcpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vcpu</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getVcpu()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_Vcpu();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getMemory()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_Memory();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageSize <em>Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Size</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageSize()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_StorageSize();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage#getStorageType()
	 * @see #getMachineImage()
	 * @generated
	 */
	EAttribute getMachineImage_StorageType();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.ccl.metamodel.ccl.ComputingImage <em>Computing Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Image</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.ComputingImage
	 * @generated
	 */
	EClass getComputingImage();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.ComputingImage#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.ComputingImage#getOs()
	 * @see #getComputingImage()
	 * @generated
	 */
	EAttribute getComputingImage_Os();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.ccl.metamodel.ccl.StorageImage <em>Storage Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Image</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageImage
	 * @generated
	 */
	EClass getStorageImage();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.ccl.metamodel.ccl.StorageImage#getDbEngine <em>Db Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Engine</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageImage#getDbEngine()
	 * @see #getStorageImage()
	 * @generated
	 */
	EAttribute getStorageImage_DbEngine();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.ccl.metamodel.ccl.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Region</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Region
	 * @generated
	 */
	EEnum getRegion();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.ccl.metamodel.ccl.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operating System</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.OperatingSystem
	 * @generated
	 */
	EEnum getOperatingSystem();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.ccl.metamodel.ccl.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Type</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageType
	 * @generated
	 */
	EEnum getStorageType();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.ccl.metamodel.ccl.DBEngine <em>DB Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DB Engine</em>'.
	 * @see nl.tue.glt.ccl.metamodel.ccl.DBEngine
	 * @generated
	 */
	EEnum getDBEngine();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CclFactory getCclFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.CloudResourcesImpl <em>Cloud Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CloudResourcesImpl
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getCloudResources()
		 * @generated
		 */
		EClass CLOUD_RESOURCES = eINSTANCE.getCloudResources();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_RESOURCES__RESOURCES = eINSTANCE.getCloudResources_Resources();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.ResourceImpl
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LABEL = eINSTANCE.getResource_Label();

		/**
		 * The meta object literal for the '<em><b>Machine Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__MACHINE_IMAGES = eINSTANCE.getResource_MachineImages();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl <em>Machine Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getMachineImage()
		 * @generated
		 */
		EClass MACHINE_IMAGE = eINSTANCE.getMachineImage();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__REGION = eINSTANCE.getMachineImage_Region();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__LABEL = eINSTANCE.getMachineImage_Label();

		/**
		 * The meta object literal for the '<em><b>Vcpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__VCPU = eINSTANCE.getMachineImage_Vcpu();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__MEMORY = eINSTANCE.getMachineImage_Memory();

		/**
		 * The meta object literal for the '<em><b>Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__STORAGE_SIZE = eINSTANCE.getMachineImage_StorageSize();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE_IMAGE__STORAGE_TYPE = eINSTANCE.getMachineImage_StorageType();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.ComputingImageImpl <em>Computing Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.ComputingImageImpl
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getComputingImage()
		 * @generated
		 */
		EClass COMPUTING_IMAGE = eINSTANCE.getComputingImage();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_IMAGE__OS = eINSTANCE.getComputingImage_Os();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.impl.StorageImageImpl <em>Storage Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.StorageImageImpl
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getStorageImage()
		 * @generated
		 */
		EClass STORAGE_IMAGE = eINSTANCE.getStorageImage();

		/**
		 * The meta object literal for the '<em><b>Db Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_IMAGE__DB_ENGINE = eINSTANCE.getStorageImage_DbEngine();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.Region <em>Region</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.Region
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getRegion()
		 * @generated
		 */
		EEnum REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.OperatingSystem <em>Operating System</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.OperatingSystem
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EEnum OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.StorageType <em>Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.StorageType
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getStorageType()
		 * @generated
		 */
		EEnum STORAGE_TYPE = eINSTANCE.getStorageType();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.ccl.metamodel.ccl.DBEngine <em>DB Engine</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.ccl.metamodel.ccl.DBEngine
		 * @see nl.tue.glt.ccl.metamodel.ccl.impl.CclPackageImpl#getDBEngine()
		 * @generated
		 */
		EEnum DB_ENGINE = eINSTANCE.getDBEngine();

	}

} //CclPackage
