/**
 */
package nl.tue.glt.ccl.metamodel.ccl.impl;

import nl.tue.glt.ccl.metamodel.ccl.CclPackage;
import nl.tue.glt.ccl.metamodel.ccl.MachineImage;
import nl.tue.glt.ccl.metamodel.ccl.Region;
import nl.tue.glt.ccl.metamodel.ccl.StorageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.MachineImageImpl#getStorageType <em>Storage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MachineImageImpl extends MinimalEObjectImpl.Container implements MachineImage {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final Region REGION_EDEFAULT = Region.CALIFORNIA;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected static final int VCPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected int vcpu = VCPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int STORAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected int storageSize = STORAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected static final StorageType STORAGE_TYPE_EDEFAULT = StorageType.BLS;

	/**
	 * The cached value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected StorageType storageType = STORAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclPackage.Literals.MACHINE_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		Region oldRegion = region;
		region = newRegion == null ? REGION_EDEFAULT : newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVcpu() {
		return vcpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpu(int newVcpu) {
		int oldVcpu = vcpu;
		vcpu = newVcpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__VCPU, oldVcpu, vcpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStorageSize() {
		return storageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageSize(int newStorageSize) {
		int oldStorageSize = storageSize;
		storageSize = newStorageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__STORAGE_SIZE,
					oldStorageSize, storageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageType getStorageType() {
		return storageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageType(StorageType newStorageType) {
		StorageType oldStorageType = storageType;
		storageType = newStorageType == null ? STORAGE_TYPE_EDEFAULT : newStorageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.MACHINE_IMAGE__STORAGE_TYPE,
					oldStorageType, storageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclPackage.MACHINE_IMAGE__REGION:
			return getRegion();
		case CclPackage.MACHINE_IMAGE__LABEL:
			return getLabel();
		case CclPackage.MACHINE_IMAGE__VCPU:
			return getVcpu();
		case CclPackage.MACHINE_IMAGE__MEMORY:
			return getMemory();
		case CclPackage.MACHINE_IMAGE__STORAGE_SIZE:
			return getStorageSize();
		case CclPackage.MACHINE_IMAGE__STORAGE_TYPE:
			return getStorageType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CclPackage.MACHINE_IMAGE__REGION:
			setRegion((Region) newValue);
			return;
		case CclPackage.MACHINE_IMAGE__LABEL:
			setLabel((String) newValue);
			return;
		case CclPackage.MACHINE_IMAGE__VCPU:
			setVcpu((Integer) newValue);
			return;
		case CclPackage.MACHINE_IMAGE__MEMORY:
			setMemory((Integer) newValue);
			return;
		case CclPackage.MACHINE_IMAGE__STORAGE_SIZE:
			setStorageSize((Integer) newValue);
			return;
		case CclPackage.MACHINE_IMAGE__STORAGE_TYPE:
			setStorageType((StorageType) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CclPackage.MACHINE_IMAGE__REGION:
			setRegion(REGION_EDEFAULT);
			return;
		case CclPackage.MACHINE_IMAGE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case CclPackage.MACHINE_IMAGE__VCPU:
			setVcpu(VCPU_EDEFAULT);
			return;
		case CclPackage.MACHINE_IMAGE__MEMORY:
			setMemory(MEMORY_EDEFAULT);
			return;
		case CclPackage.MACHINE_IMAGE__STORAGE_SIZE:
			setStorageSize(STORAGE_SIZE_EDEFAULT);
			return;
		case CclPackage.MACHINE_IMAGE__STORAGE_TYPE:
			setStorageType(STORAGE_TYPE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CclPackage.MACHINE_IMAGE__REGION:
			return region != REGION_EDEFAULT;
		case CclPackage.MACHINE_IMAGE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case CclPackage.MACHINE_IMAGE__VCPU:
			return vcpu != VCPU_EDEFAULT;
		case CclPackage.MACHINE_IMAGE__MEMORY:
			return memory != MEMORY_EDEFAULT;
		case CclPackage.MACHINE_IMAGE__STORAGE_SIZE:
			return storageSize != STORAGE_SIZE_EDEFAULT;
		case CclPackage.MACHINE_IMAGE__STORAGE_TYPE:
			return storageType != STORAGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (region: ");
		result.append(region);
		result.append(", label: ");
		result.append(label);
		result.append(", vcpu: ");
		result.append(vcpu);
		result.append(", memory: ");
		result.append(memory);
		result.append(", storageSize: ");
		result.append(storageSize);
		result.append(", storageType: ");
		result.append(storageType);
		result.append(')');
		return result.toString();
	}

} //MachineImageImpl
