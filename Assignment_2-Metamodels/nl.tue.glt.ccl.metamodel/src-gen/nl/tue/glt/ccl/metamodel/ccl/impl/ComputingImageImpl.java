/**
 */
package nl.tue.glt.ccl.metamodel.ccl.impl;

import nl.tue.glt.ccl.metamodel.ccl.CclPackage;
import nl.tue.glt.ccl.metamodel.ccl.ComputingImage;
import nl.tue.glt.ccl.metamodel.ccl.OperatingSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.ComputingImageImpl#getOs <em>Os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingImageImpl extends MachineImageImpl implements ComputingImage {
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final OperatingSystem OS_EDEFAULT = OperatingSystem.LINUX;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OperatingSystem os = OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclPackage.Literals.COMPUTING_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OperatingSystem newOs) {
		OperatingSystem oldOs = os;
		os = newOs == null ? OS_EDEFAULT : newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.COMPUTING_IMAGE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclPackage.COMPUTING_IMAGE__OS:
			return getOs();
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
		case CclPackage.COMPUTING_IMAGE__OS:
			setOs((OperatingSystem) newValue);
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
		case CclPackage.COMPUTING_IMAGE__OS:
			setOs(OS_EDEFAULT);
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
		case CclPackage.COMPUTING_IMAGE__OS:
			return os != OS_EDEFAULT;
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
		result.append(" (os: ");
		result.append(os);
		result.append(')');
		return result.toString();
	}

} //ComputingImageImpl
