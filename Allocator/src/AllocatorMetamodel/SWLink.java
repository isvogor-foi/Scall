/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SW Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AllocatorMetamodel.SWLink#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.SWLink#getSWDesc <em>SW Desc</em>}</li>
 *   <li>{@link AllocatorMetamodel.SWLink#getSWSrc <em>SW Src</em>}</li>
 *   <li>{@link AllocatorMetamodel.SWLink#getUnit <em>Unit</em>}</li>
 *   <li>{@link AllocatorMetamodel.SWLink#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink()
 * @model
 * @generated
 */
public interface SWLink extends EObject {
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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>SW Desc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW Desc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW Desc</em>' reference.
	 * @see #setSWDesc(SWNode)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink_SWDesc()
	 * @model
	 * @generated
	 */
	SWNode getSWDesc();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWLink#getSWDesc <em>SW Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SW Desc</em>' reference.
	 * @see #getSWDesc()
	 * @generated
	 */
	void setSWDesc(SWNode value);

	/**
	 * Returns the value of the '<em><b>SW Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SW Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SW Src</em>' reference.
	 * @see #setSWSrc(SWNode)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink_SWSrc()
	 * @model
	 * @generated
	 */
	SWNode getSWSrc();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWLink#getSWSrc <em>SW Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SW Src</em>' reference.
	 * @see #getSWSrc()
	 * @generated
	 */
	void setSWSrc(SWNode value);

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
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWLink#getUnit <em>Unit</em>}' attribute.
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
	 * @see #setValue(String)
	 * @see AllocatorMetamodel.AllocatorMetamodelPackage#getSWLink_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link AllocatorMetamodel.SWLink#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SWLink
