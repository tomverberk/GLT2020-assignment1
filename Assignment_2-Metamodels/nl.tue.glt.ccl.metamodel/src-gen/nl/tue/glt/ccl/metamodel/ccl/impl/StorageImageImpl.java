/**
 */
package nl.tue.glt.ccl.metamodel.ccl.impl;

import nl.tue.glt.ccl.metamodel.ccl.CclPackage;
import nl.tue.glt.ccl.metamodel.ccl.DBEngine;
import nl.tue.glt.ccl.metamodel.ccl.StorageImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.ccl.metamodel.ccl.impl.StorageImageImpl#getDbEngine <em>Db Engine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageImageImpl extends MachineImageImpl implements StorageImage {
	/**
	 * The default value of the '{@link #getDbEngine() <em>Db Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbEngine()
	 * @generated
	 * @ordered
	 */
	protected static final DBEngine DB_ENGINE_EDEFAULT = DBEngine.MYSQL;

	/**
	 * The cached value of the '{@link #getDbEngine() <em>Db Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbEngine()
	 * @generated
	 * @ordered
	 */
	protected DBEngine dbEngine = DB_ENGINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CclPackage.Literals.STORAGE_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBEngine getDbEngine() {
		return dbEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbEngine(DBEngine newDbEngine) {
		DBEngine oldDbEngine = dbEngine;
		dbEngine = newDbEngine == null ? DB_ENGINE_EDEFAULT : newDbEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CclPackage.STORAGE_IMAGE__DB_ENGINE, oldDbEngine,
					dbEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CclPackage.STORAGE_IMAGE__DB_ENGINE:
			return getDbEngine();
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
		case CclPackage.STORAGE_IMAGE__DB_ENGINE:
			setDbEngine((DBEngine) newValue);
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
		case CclPackage.STORAGE_IMAGE__DB_ENGINE:
			setDbEngine(DB_ENGINE_EDEFAULT);
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
		case CclPackage.STORAGE_IMAGE__DB_ENGINE:
			return dbEngine != DB_ENGINE_EDEFAULT;
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
		result.append(" (dbEngine: ");
		result.append(dbEngine);
		result.append(')');
		return result.toString();
	}

} //StorageImageImpl
