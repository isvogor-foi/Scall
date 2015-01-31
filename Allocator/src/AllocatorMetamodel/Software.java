/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.Software#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.Software#getSWNodes <em>SW Nodes</em>}</li>
 *   <li>{@link AllocatorMetamodel.Software#getSWLinks <em>SW Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSoftware()
 * @model
 * @generated
 */
public interface Software extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSoftware_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.Software#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>SW Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.SWNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW Nodes</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSoftware_SWNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWNode> getSWNodes();

	/**
	 * Returns the value of the '<em><b>SW Links</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.SWLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW Links</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSoftware_SWLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SWLink> getSWLinks();

} // Software
