/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelFactory;
import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.HWLink;
import AllocatorMetamodel.HWNode;
import AllocatorMetamodel.Hardware;
import AllocatorMetamodel.Resource;
import AllocatorMetamodel.SWLink;
import AllocatorMetamodel.SWNode;
import AllocatorMetamodel.Software;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllocatorMetamodelFactoryImpl extends EFactoryImpl implements AllocatorMetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AllocatorMetamodelFactory init() {
		try {
			AllocatorMetamodelFactory theAllocatorMetamodelFactory = (AllocatorMetamodelFactory)EPackage.Registry.INSTANCE.getEFactory(AllocatorMetamodelPackage.eNS_URI);
			if (theAllocatorMetamodelFactory != null) {
				return theAllocatorMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AllocatorMetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatorMetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AllocatorMetamodelPackage.SYSTEM: return createSystem();
			case AllocatorMetamodelPackage.SOFTWARE: return createSoftware();
			case AllocatorMetamodelPackage.HARDWARE: return createHardware();
			case AllocatorMetamodelPackage.SW_NODE: return createSWNode();
			case AllocatorMetamodelPackage.HW_NODE: return createHWNode();
			case AllocatorMetamodelPackage.SW_LINK: return createSWLink();
			case AllocatorMetamodelPackage.HW_LINK: return createHWLink();
			case AllocatorMetamodelPackage.RESOURCE: return createResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatorMetamodel.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software createSoftware() {
		SoftwareImpl software = new SoftwareImpl();
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hardware createHardware() {
		HardwareImpl hardware = new HardwareImpl();
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWNode createSWNode() {
		SWNodeImpl swNode = new SWNodeImpl();
		return swNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWNode createHWNode() {
		HWNodeImpl hwNode = new HWNodeImpl();
		return hwNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWLink createSWLink() {
		SWLinkImpl swLink = new SWLinkImpl();
		return swLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWLink createHWLink() {
		HWLinkImpl hwLink = new HWLinkImpl();
		return hwLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatorMetamodelPackage getAllocatorMetamodelPackage() {
		return (AllocatorMetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AllocatorMetamodelPackage getPackage() {
		return AllocatorMetamodelPackage.eINSTANCE;
	}

} //AllocatorMetamodelFactoryImpl
