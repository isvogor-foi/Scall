/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.HWLink#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWLink#getHWDesc <em>HW Desc</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWLink#getHWSrc <em>HW Src</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWLink#getUnit <em>Unit</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWLink#getValue <em>Value</em>}</li>
 *   <li>{@link AllocatorMetamodel.HWLink#getBandwith <em>Bandwith</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink()
 * @model
 * @generated
 */
public interface HWLink extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>HW Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW Desc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW Desc</em>' reference.
	 * @see #setHWDesc(HWNode)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_HWDesc()
	 * @model
	 * @generated
	 */
	HWNode getHWDesc();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getHWDesc <em>HW Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HW Desc</em>' reference.
	 * @see #getHWDesc()
	 * @generated
	 */
	void setHWDesc(HWNode value);

	/**
	 * Returns the value of the '<em><b>HW Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HW Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HW Src</em>' reference.
	 * @see #setHWSrc(HWNode)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_HWSrc()
	 * @model
	 * @generated
	 */
	HWNode getHWSrc();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getHWSrc <em>HW Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HW Src</em>' reference.
	 * @see #getHWSrc()
	 * @generated
	 */
	void setHWSrc(HWNode value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Bandwith</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwith</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwith</em>' attribute.
	 * @see #setBandwith(float)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getHWLink_Bandwith()
	 * @model
	 * @generated
	 */
	float getBandwith();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.HWLink#getBandwith <em>Bandwith</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwith</em>' attribute.
	 * @see #getBandwith()
	 * @generated
	 */
	void setBandwith(float value);

} // HWLink
