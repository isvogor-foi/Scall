/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.SWLink;
import AllocatorMetamodel.SWNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SW Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AllocatorMetamodel.impl.SWLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SWLinkImpl#getSWDesc <em>SW Desc</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SWLinkImpl#getSWSrc <em>SW Src</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SWLinkImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SWLinkImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SWLinkImpl extends MinimalEObjectImpl.Container implements SWLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSWDesc() <em>SW Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWDesc()
	 * @generated
	 * @ordered
	 */
	protected SWNode swDesc;

	/**
	 * The cached value of the '{@link #getSWSrc() <em>SW Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWSrc()
	 * @generated
	 * @ordered
	 */
	protected SWNode swSrc;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SWLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocatorMetamodelPackage.Literals.SW_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SW_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWNode getSWDesc() {
		if (swDesc != null && swDesc.eIsProxy()) {
			InternalEObject oldSWDesc = (InternalEObject)swDesc;
			swDesc = (SWNode)eResolveProxy(oldSWDesc);
			if (swDesc != oldSWDesc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocatorMetamodelPackage.SW_LINK__SW_DESC, oldSWDesc, swDesc));
			}
		}
		return swDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWNode basicGetSWDesc() {
		return swDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSWDesc(SWNode newSWDesc) {
		SWNode oldSWDesc = swDesc;
		swDesc = newSWDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SW_LINK__SW_DESC, oldSWDesc, swDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWNode getSWSrc() {
		if (swSrc != null && swSrc.eIsProxy()) {
			InternalEObject oldSWSrc = (InternalEObject)swSrc;
			swSrc = (SWNode)eResolveProxy(oldSWSrc);
			if (swSrc != oldSWSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocatorMetamodelPackage.SW_LINK__SW_SRC, oldSWSrc, swSrc));
			}
		}
		return swSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SWNode basicGetSWSrc() {
		return swSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSWSrc(SWNode newSWSrc) {
		SWNode oldSWSrc = swSrc;
		swSrc = newSWSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SW_LINK__SW_SRC, oldSWSrc, swSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SW_LINK__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SW_LINK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SW_LINK__NAME:
				return getName();
			case AllocatorMetamodelPackage.SW_LINK__SW_DESC:
				if (resolve) return getSWDesc();
				return basicGetSWDesc();
			case AllocatorMetamodelPackage.SW_LINK__SW_SRC:
				if (resolve) return getSWSrc();
				return basicGetSWSrc();
			case AllocatorMetamodelPackage.SW_LINK__UNIT:
				return getUnit();
			case AllocatorMetamodelPackage.SW_LINK__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SW_LINK__NAME:
				setName((String)newValue);
				return;
			case AllocatorMetamodelPackage.SW_LINK__SW_DESC:
				setSWDesc((SWNode)newValue);
				return;
			case AllocatorMetamodelPackage.SW_LINK__SW_SRC:
				setSWSrc((SWNode)newValue);
				return;
			case AllocatorMetamodelPackage.SW_LINK__UNIT:
				setUnit((String)newValue);
				return;
			case AllocatorMetamodelPackage.SW_LINK__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SW_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.SW_LINK__SW_DESC:
				setSWDesc((SWNode)null);
				return;
			case AllocatorMetamodelPackage.SW_LINK__SW_SRC:
				setSWSrc((SWNode)null);
				return;
			case AllocatorMetamodelPackage.SW_LINK__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.SW_LINK__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SW_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocatorMetamodelPackage.SW_LINK__SW_DESC:
				return swDesc != null;
			case AllocatorMetamodelPackage.SW_LINK__SW_SRC:
				return swSrc != null;
			case AllocatorMetamodelPackage.SW_LINK__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case AllocatorMetamodelPackage.SW_LINK__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", Unit: ");
		result.append(unit);
		result.append(", Value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //SWLinkImpl
