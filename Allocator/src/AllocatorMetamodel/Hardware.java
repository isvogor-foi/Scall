/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.Hardware#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.Hardware#getHWNodes <em>HW Nodes</em>}</li>
 *   <li>{@link AllocatorMetamodel.Hardware#getHWLinks <em>HW Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHardware()
 * @model
 * @generated
 */
public interface Hardware extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHardware_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.Hardware#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>HW Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.HWNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW Nodes</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHardware_HWNodes()
	 * @model containment="true" 
	 * @generated
	 */
	EList<HWNode> getHWNodes();

	/**
	 * Returns the value of the '<em><b>HW Links</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.HWLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW Links</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHardware_HWLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<HWLink> getHWLinks();

} // Hardware
