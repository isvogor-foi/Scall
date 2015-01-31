/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see AllocatorMetamodel.AllocatorMetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface AllocatorMetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AllocatorMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uri://am";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocatorMetamodelPackage eINSTANCE = AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.SystemImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PLATFORMS = 1;

	/**
	 * The feature id for the '<em><b>Softwares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SOFTWARES = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.SoftwareImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>SW Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_NODES = 1;

	/**
	 * The feature id for the '<em><b>SW Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__SW_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.HardwareImpl <em>Hardware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.HardwareImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHardware()
	 * @generated
	 */
	int HARDWARE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__NAME = 0;

	/**
	 * The feature id for the '<em><b>HW Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__HW_NODES = 1;

	/**
	 * The feature id for the '<em><b>HW Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE__HW_LINKS = 2;

	/**
	 * The number of structural features of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hardware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.SWNodeImpl <em>SW Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.SWNodeImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSWNode()
	 * @generated
	 */
	int SW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>SW Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_NODE__SW_RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>SW Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SW Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.HWNodeImpl <em>HW Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.HWNodeImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHWNode()
	 * @generated
	 */
	int HW_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>HW Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_NODE__HW_RESOURCES = 1;

	/**
	 * The number of structural features of the '<em>HW Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>HW Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.SWLinkImpl <em>SW Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.SWLinkImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSWLink()
	 * @generated
	 */
	int SW_LINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>SW Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK__SW_DESC = 1;

	/**
	 * The feature id for the '<em><b>SW Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK__SW_SRC = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK__VALUE = 4;

	/**
	 * The number of structural features of the '<em>SW Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SW Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SW_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.HWLinkImpl <em>HW Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.HWLinkImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHWLink()
	 * @generated
	 */
	int HW_LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__NAME = 0;

	/**
	 * The feature id for the '<em><b>HW Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__HW_DESC = 1;

	/**
	 * The feature id for the '<em><b>HW Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__HW_SRC = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK__BANDWITH = 5;

	/**
	 * The number of structural features of the '<em>HW Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>HW Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AllocatorMetamodel.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AllocatorMetamodel.impl.ResourceImpl
	 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see AllocatorMetamodel.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.System#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platforms</em>'.
	 * @see AllocatorMetamodel.System#getPlatforms()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Platforms();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.System#getSoftwares <em>Softwares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Softwares</em>'.
	 * @see AllocatorMetamodel.System#getSoftwares()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Softwares();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see AllocatorMetamodel.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.Software#getSWNodes <em>SW Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SW Nodes</em>'.
	 * @see AllocatorMetamodel.Software#getSWNodes()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_SWNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.Software#getSWLinks <em>SW Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SW Links</em>'.
	 * @see AllocatorMetamodel.Software#getSWLinks()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_SWLinks();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.Hardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware</em>'.
	 * @see AllocatorMetamodel.Hardware
	 * @generated
	 */
	EClass getHardware();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.Hardware#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.Hardware#getName()
	 * @see #getHardware()
	 * @generated
	 */
	EAttribute getHardware_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.Hardware#getHWNodes <em>HW Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HW Nodes</em>'.
	 * @see AllocatorMetamodel.Hardware#getHWNodes()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_HWNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.Hardware#getHWLinks <em>HW Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HW Links</em>'.
	 * @see AllocatorMetamodel.Hardware#getHWLinks()
	 * @see #getHardware()
	 * @generated
	 */
	EReference getHardware_HWLinks();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.SWNode <em>SW Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Node</em>'.
	 * @see AllocatorMetamodel.SWNode
	 * @generated
	 */
	EClass getSWNode();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.SWNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.SWNode#getName()
	 * @see #getSWNode()
	 * @generated
	 */
	EAttribute getSWNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.SWNode#getSWResources <em>SW Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SW Resources</em>'.
	 * @see AllocatorMetamodel.SWNode#getSWResources()
	 * @see #getSWNode()
	 * @generated
	 */
	EReference getSWNode_SWResources();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.HWNode <em>HW Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Node</em>'.
	 * @see AllocatorMetamodel.HWNode
	 * @generated
	 */
	EClass getHWNode();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.HWNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.HWNode#getName()
	 * @see #getHWNode()
	 * @generated
	 */
	EAttribute getHWNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AllocatorMetamodel.HWNode#getHWResources <em>HW Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HW Resources</em>'.
	 * @see AllocatorMetamodel.HWNode#getHWResources()
	 * @see #getHWNode()
	 * @generated
	 */
	EReference getHWNode_HWResources();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.SWLink <em>SW Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SW Link</em>'.
	 * @see AllocatorMetamodel.SWLink
	 * @generated
	 */
	EClass getSWLink();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.SWLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.SWLink#getName()
	 * @see #getSWLink()
	 * @generated
	 */
	EAttribute getSWLink_Name();

	/**
	 * Returns the meta object for the reference '{@link AllocatorMetamodel.SWLink#getSWDesc <em>SW Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SW Desc</em>'.
	 * @see AllocatorMetamodel.SWLink#getSWDesc()
	 * @see #getSWLink()
	 * @generated
	 */
	EReference getSWLink_SWDesc();

	/**
	 * Returns the meta object for the reference '{@link AllocatorMetamodel.SWLink#getSWSrc <em>SW Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SW Src</em>'.
	 * @see AllocatorMetamodel.SWLink#getSWSrc()
	 * @see #getSWLink()
	 * @generated
	 */
	EReference getSWLink_SWSrc();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.SWLink#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see AllocatorMetamodel.SWLink#getUnit()
	 * @see #getSWLink()
	 * @generated
	 */
	EAttribute getSWLink_Unit();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.SWLink#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AllocatorMetamodel.SWLink#getValue()
	 * @see #getSWLink()
	 * @generated
	 */
	EAttribute getSWLink_Value();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.HWLink <em>HW Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Link</em>'.
	 * @see AllocatorMetamodel.HWLink
	 * @generated
	 */
	EClass getHWLink();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.HWLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.HWLink#getName()
	 * @see #getHWLink()
	 * @generated
	 */
	EAttribute getHWLink_Name();

	/**
	 * Returns the meta object for the reference '{@link AllocatorMetamodel.HWLink#getHWDesc <em>HW Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HW Desc</em>'.
	 * @see AllocatorMetamodel.HWLink#getHWDesc()
	 * @see #getHWLink()
	 * @generated
	 */
	EReference getHWLink_HWDesc();

	/**
	 * Returns the meta object for the reference '{@link AllocatorMetamodel.HWLink#getHWSrc <em>HW Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>HW Src</em>'.
	 * @see AllocatorMetamodel.HWLink#getHWSrc()
	 * @see #getHWLink()
	 * @generated
	 */
	EReference getHWLink_HWSrc();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.HWLink#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see AllocatorMetamodel.HWLink#getUnit()
	 * @see #getHWLink()
	 * @generated
	 */
	EAttribute getHWLink_Unit();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.HWLink#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AllocatorMetamodel.HWLink#getValue()
	 * @see #getHWLink()
	 * @generated
	 */
	EAttribute getHWLink_Value();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.HWLink#getBandwith <em>Bandwith</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwith</em>'.
	 * @see AllocatorMetamodel.HWLink#getBandwith()
	 * @see #getHWLink()
	 * @generated
	 */
	EAttribute getHWLink_Bandwith();

	/**
	 * Returns the meta object for class '{@link AllocatorMetamodel.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see AllocatorMetamodel.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AllocatorMetamodel.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.Resource#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see AllocatorMetamodel.Resource#getUnit()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Unit();

	/**
	 * Returns the meta object for the attribute '{@link AllocatorMetamodel.Resource#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AllocatorMetamodel.Resource#getValue()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AllocatorMetamodelFactory getAllocatorMetamodelFactory();

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
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.SystemImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PLATFORMS = eINSTANCE.getSystem_Platforms();

		/**
		 * The meta object literal for the '<em><b>Softwares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SOFTWARES = eINSTANCE.getSystem_Softwares();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.SoftwareImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__NAME = eINSTANCE.getSoftware_Name();

		/**
		 * The meta object literal for the '<em><b>SW Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_NODES = eINSTANCE.getSoftware_SWNodes();

		/**
		 * The meta object literal for the '<em><b>SW Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__SW_LINKS = eINSTANCE.getSoftware_SWLinks();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.HardwareImpl <em>Hardware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.HardwareImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHardware()
		 * @generated
		 */
		EClass HARDWARE = eINSTANCE.getHardware();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HARDWARE__NAME = eINSTANCE.getHardware_Name();

		/**
		 * The meta object literal for the '<em><b>HW Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__HW_NODES = eINSTANCE.getHardware_HWNodes();

		/**
		 * The meta object literal for the '<em><b>HW Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HARDWARE__HW_LINKS = eINSTANCE.getHardware_HWLinks();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.SWNodeImpl <em>SW Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.SWNodeImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSWNode()
		 * @generated
		 */
		EClass SW_NODE = eINSTANCE.getSWNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_NODE__NAME = eINSTANCE.getSWNode_Name();

		/**
		 * The meta object literal for the '<em><b>SW Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_NODE__SW_RESOURCES = eINSTANCE.getSWNode_SWResources();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.HWNodeImpl <em>HW Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.HWNodeImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHWNode()
		 * @generated
		 */
		EClass HW_NODE = eINSTANCE.getHWNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_NODE__NAME = eINSTANCE.getHWNode_Name();

		/**
		 * The meta object literal for the '<em><b>HW Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_NODE__HW_RESOURCES = eINSTANCE.getHWNode_HWResources();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.SWLinkImpl <em>SW Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.SWLinkImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getSWLink()
		 * @generated
		 */
		EClass SW_LINK = eINSTANCE.getSWLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_LINK__NAME = eINSTANCE.getSWLink_Name();

		/**
		 * The meta object literal for the '<em><b>SW Desc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_LINK__SW_DESC = eINSTANCE.getSWLink_SWDesc();

		/**
		 * The meta object literal for the '<em><b>SW Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SW_LINK__SW_SRC = eINSTANCE.getSWLink_SWSrc();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_LINK__UNIT = eINSTANCE.getSWLink_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SW_LINK__VALUE = eINSTANCE.getSWLink_Value();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.HWLinkImpl <em>HW Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.HWLinkImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getHWLink()
		 * @generated
		 */
		EClass HW_LINK = eINSTANCE.getHWLink();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_LINK__NAME = eINSTANCE.getHWLink_Name();

		/**
		 * The meta object literal for the '<em><b>HW Desc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_LINK__HW_DESC = eINSTANCE.getHWLink_HWDesc();

		/**
		 * The meta object literal for the '<em><b>HW Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_LINK__HW_SRC = eINSTANCE.getHWLink_HWSrc();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_LINK__UNIT = eINSTANCE.getHWLink_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_LINK__VALUE = eINSTANCE.getHWLink_Value();

		/**
		 * The meta object literal for the '<em><b>Bandwith</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HW_LINK__BANDWITH = eINSTANCE.getHWLink_Bandwith();

		/**
		 * The meta object literal for the '{@link AllocatorMetamodel.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AllocatorMetamodel.impl.ResourceImpl
		 * @see AllocatorMetamodel.impl.AllocatorMetamodelPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__UNIT = eINSTANCE.getResource_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__VALUE = eINSTANCE.getResource_Value();

	}

} //AllocatorMetamodelPackage
