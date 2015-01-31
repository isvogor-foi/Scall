/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.SWNode#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.SWNode#getSWResources <em>SW Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWNode()
 * @model
 * @generated
 */
public interface SWNode extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>SW Resources</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW Resources</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWNode_SWResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getSWResources();

} // SWNode
