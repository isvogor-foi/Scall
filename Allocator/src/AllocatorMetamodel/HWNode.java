/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.HWNode#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWNode#getHWResources <em>HW Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWNode()
 * @model
 * @generated
 */
public interface HWNode extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>HW Resources</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW Resources</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWNode_HWResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getHWResources();

} // HWNode
