/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.System#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.System#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link AllocatorMetamodel.System#getSoftwares <em>Softwares</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.System#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.Hardware}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSystem_Platforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hardware> getPlatforms();

	/**
	 * Returns the value of the '<em><b>Softwares</b></em>' containment reference list.
	 * The list contents are of type {@link AllocatorMetamodel.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softwares</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softwares</em>' containment reference list.
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSystem_Softwares()
	 * @model containment="true"
	 * @generated
	 */
	EList<Software> getSoftwares();

} // System
