/**
 */
package AllocatorMetamodel.util;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.HWLink;
import AllocatorMetamodel.HWNode;
import AllocatorMetamodel.Hardware;
import AllocatorMetamodel.Resource;
import AllocatorMetamodel.SWLink;
import AllocatorMetamodel.SWNode;
import AllocatorMetamodel.Software;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AllocatorMetamodel.AllocatorMetamodelPackage
 * @generated
 */
public class AllocatorMetamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AllocatorMetamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatorMetamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AllocatorMetamodelPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatorMetamodelSwitch<Adapter> modelSwitch =
		new AllocatorMetamodelSwitch<Adapter>() {
			@Override
			public Adapter caseSystem(AllocatorMetamodel.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseSoftware(Software object) {
				return createSoftwareAdapter();
			}
			@Override
			public Adapter caseHardware(Hardware object) {
				return createHardwareAdapter();
			}
			@Override
			public Adapter caseSWNode(SWNode object) {
				return createSWNodeAdapter();
			}
			@Override
			public Adapter caseHWNode(HWNode object) {
				return createHWNodeAdapter();
			}
			@Override
			public Adapter caseSWLink(SWLink object) {
				return createSWLinkAdapter();
			}
			@Override
			public Adapter caseHWLink(HWLink object) {
				return createHWLinkAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.Software
	 * @generated
	 */
	public Adapter createSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.Hardware
	 * @generated
	 */
	public Adapter createHardwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.SWNode <em>SW Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.SWNode
	 * @generated
	 */
	public Adapter createSWNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.HWNode <em>HW Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.HWNode
	 * @generated
	 */
	public Adapter createHWNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.SWLink <em>SW Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.SWLink
	 * @generated
	 */
	public Adapter createSWLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.HWLink <em>HW Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.HWLink
	 * @generated
	 */
	public Adapter createHWLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AllocatorMetamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AllocatorMetamodel.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
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

} //AllocatorMetamodelAdapterFactory
