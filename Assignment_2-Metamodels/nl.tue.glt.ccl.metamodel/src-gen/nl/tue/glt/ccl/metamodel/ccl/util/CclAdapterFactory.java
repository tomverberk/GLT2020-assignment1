/**
 */
package nl.tue.glt.ccl.metamodel.ccl.util;

import nl.tue.glt.ccl.metamodel.ccl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.ccl.metamodel.ccl.CclPackage
 * @generated
 */
public class CclAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CclPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CclAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CclPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CclSwitch<Adapter> modelSwitch = new CclSwitch<Adapter>() {
		@Override
		public Adapter caseCloudResources(CloudResources object) {
			return createCloudResourcesAdapter();
		}

		@Override
		public Adapter caseResource(Resource object) {
			return createResourceAdapter();
		}

		@Override
		public Adapter caseMachineImage(MachineImage object) {
			return createMachineImageAdapter();
		}

		@Override
		public Adapter caseComputingImage(ComputingImage object) {
			return createComputingImageAdapter();
		}

		@Override
		public Adapter caseStorageImage(StorageImage object) {
			return createStorageImageAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.glt.ccl.metamodel.ccl.CloudResources <em>Cloud Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.glt.ccl.metamodel.ccl.CloudResources
	 * @generated
	 */
	public Adapter createCloudResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.glt.ccl.metamodel.ccl.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.glt.ccl.metamodel.ccl.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.glt.ccl.metamodel.ccl.MachineImage <em>Machine Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.glt.ccl.metamodel.ccl.MachineImage
	 * @generated
	 */
	public Adapter createMachineImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.glt.ccl.metamodel.ccl.ComputingImage <em>Computing Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.glt.ccl.metamodel.ccl.ComputingImage
	 * @generated
	 */
	public Adapter createComputingImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nl.tue.glt.ccl.metamodel.ccl.StorageImage <em>Storage Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nl.tue.glt.ccl.metamodel.ccl.StorageImage
	 * @generated
	 */
	public Adapter createStorageImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CclAdapterFactory
