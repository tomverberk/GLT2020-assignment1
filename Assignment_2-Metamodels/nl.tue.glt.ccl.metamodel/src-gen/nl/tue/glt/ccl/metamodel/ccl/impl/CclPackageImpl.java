/**
 */
package nl.tue.glt.ccl.metamodel.ccl.impl;

import nl.tue.glt.ccl.metamodel.ccl.CclFactory;
import nl.tue.glt.ccl.metamodel.ccl.CclPackage;
import nl.tue.glt.ccl.metamodel.ccl.CloudResources;
import nl.tue.glt.ccl.metamodel.ccl.ComputingImage;
import nl.tue.glt.ccl.metamodel.ccl.DBEngine;
import nl.tue.glt.ccl.metamodel.ccl.MachineImage;
import nl.tue.glt.ccl.metamodel.ccl.OperatingSystem;
import nl.tue.glt.ccl.metamodel.ccl.Region;
import nl.tue.glt.ccl.metamodel.ccl.Resource;
import nl.tue.glt.ccl.metamodel.ccl.StorageImage;
import nl.tue.glt.ccl.metamodel.ccl.StorageType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CclPackageImpl extends EPackageImpl implements CclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computingImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storageImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatingSystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum storageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbEngineEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CclPackageImpl() {
		super(eNS_URI, CclFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CclPackage init() {
		if (isInited)
			return (CclPackage) EPackage.Registry.INSTANCE.getEPackage(CclPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCclPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CclPackageImpl theCclPackage = registeredCclPackage instanceof CclPackageImpl
				? (CclPackageImpl) registeredCclPackage
				: new CclPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCclPackage.createPackageContents();

		// Initialize created meta-data
		theCclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCclPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CclPackage.eNS_URI, theCclPackage);
		return theCclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudResources() {
		return cloudResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudResources_Resources() {
		return (EReference) cloudResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Label() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_MachineImages() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachineImage() {
		return machineImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_Region() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_Label() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_Vcpu() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_Memory() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_StorageSize() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMachineImage_StorageType() {
		return (EAttribute) machineImageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputingImage() {
		return computingImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComputingImage_Os() {
		return (EAttribute) computingImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStorageImage() {
		return storageImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStorageImage_DbEngine() {
		return (EAttribute) storageImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRegion() {
		return regionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatingSystem() {
		return operatingSystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStorageType() {
		return storageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDBEngine() {
		return dbEngineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclFactory getCclFactory() {
		return (CclFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		cloudResourcesEClass = createEClass(CLOUD_RESOURCES);
		createEReference(cloudResourcesEClass, CLOUD_RESOURCES__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__LABEL);
		createEReference(resourceEClass, RESOURCE__MACHINE_IMAGES);

		machineImageEClass = createEClass(MACHINE_IMAGE);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__REGION);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__LABEL);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__VCPU);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__MEMORY);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__STORAGE_SIZE);
		createEAttribute(machineImageEClass, MACHINE_IMAGE__STORAGE_TYPE);

		computingImageEClass = createEClass(COMPUTING_IMAGE);
		createEAttribute(computingImageEClass, COMPUTING_IMAGE__OS);

		storageImageEClass = createEClass(STORAGE_IMAGE);
		createEAttribute(storageImageEClass, STORAGE_IMAGE__DB_ENGINE);

		// Create enums
		regionEEnum = createEEnum(REGION);
		operatingSystemEEnum = createEEnum(OPERATING_SYSTEM);
		storageTypeEEnum = createEEnum(STORAGE_TYPE);
		dbEngineEEnum = createEEnum(DB_ENGINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computingImageEClass.getESuperTypes().add(this.getMachineImage());
		storageImageEClass.getESuperTypes().add(this.getMachineImage());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudResourcesEClass, CloudResources.class, "CloudResources", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudResources_Resources(), this.getResource(), null, "resources", null, 0, -1,
				CloudResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Label(), ecorePackage.getEString(), "label", null, 0, 1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_MachineImages(), this.getMachineImage(), null, "machineImages", null, 0, -1,
				Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineImageEClass, MachineImage.class, "MachineImage", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMachineImage_Region(), this.getRegion(), "region", null, 1, 1, MachineImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImage_Label(), ecorePackage.getEString(), "label", null, 1, 1, MachineImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImage_Vcpu(), ecorePackage.getEInt(), "vcpu", null, 1, 1, MachineImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImage_Memory(), ecorePackage.getEInt(), "memory", null, 1, 1, MachineImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImage_StorageSize(), ecorePackage.getEInt(), "storageSize", null, 1, 1,
				MachineImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMachineImage_StorageType(), this.getStorageType(), "storageType", null, 1, 1,
				MachineImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(computingImageEClass, ComputingImage.class, "ComputingImage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComputingImage_Os(), this.getOperatingSystem(), "os", null, 1, 1, ComputingImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storageImageEClass, StorageImage.class, "StorageImage", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStorageImage_DbEngine(), this.getDBEngine(), "dbEngine", null, 1, 1, StorageImage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(regionEEnum, Region.class, "Region");
		addEEnumLiteral(regionEEnum, Region.CALIFORNIA);
		addEEnumLiteral(regionEEnum, Region.CAPETOWN);
		addEEnumLiteral(regionEEnum, Region.FRANKFURT);
		addEEnumLiteral(regionEEnum, Region.BOGOTA);
		addEEnumLiteral(regionEEnum, Region.SEOUL);

		initEEnum(operatingSystemEEnum, OperatingSystem.class, "OperatingSystem");
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.LINUX);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.REDHAT);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.UBUNTU);
		addEEnumLiteral(operatingSystemEEnum, OperatingSystem.WINDOWS);

		initEEnum(storageTypeEEnum, StorageType.class, "StorageType");
		addEEnumLiteral(storageTypeEEnum, StorageType.BLS);
		addEEnumLiteral(storageTypeEEnum, StorageType.SSD);

		initEEnum(dbEngineEEnum, DBEngine.class, "DBEngine");
		addEEnumLiteral(dbEngineEEnum, DBEngine.MYSQL);
		addEEnumLiteral(dbEngineEEnum, DBEngine.POSTGRESQL);
		addEEnumLiteral(dbEngineEEnum, DBEngine.MARIADB);
		addEEnumLiteral(dbEngineEEnum, DBEngine.ORACLE);
		addEEnumLiteral(dbEngineEEnum, DBEngine.SQLSERVER);

		// Create resource
		createResource(eNS_URI);
	}

} //CclPackageImpl
