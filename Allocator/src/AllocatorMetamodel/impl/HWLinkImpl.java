/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.HWLink;
import AllocatorMetamodel.HWNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getHWDesc <em>HW Desc</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getHWSrc <em>HW Src</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HWLinkImpl#getBandwith <em>Bandwith</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWLinkImpl extends MinimalEObjectImpl.Container implements HWLink {
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
	 * The cached value of the '{@link #getHWDesc() <em>HW Desc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHWDesc()
	 * @generated
	 * @ordered
	 */
	protected HWNode hwDesc;

	/**
	 * The cached value of the '{@link #getHWSrc() <em>HW Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHWSrc()
	 * @generated
	 * @ordered
	 */
	protected HWNode hwSrc;

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
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBandwith() <em>Bandwith</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwith()
	 * @generated
	 * @ordered
	 */
	protected static final float BANDWITH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBandwith() <em>Bandwith</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwith()
	 * @generated
	 * @ordered
	 */
	protected float bandwith = BANDWITH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocatorMetamodelPackage.Literals.HW_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWNode getHWDesc() {
		if (hwDesc != null && hwDesc.eIsProxy()) {
			InternalEObject oldHWDesc = (InternalEObject)hwDesc;
			hwDesc = (HWNode)eResolveProxy(oldHWDesc);
			if (hwDesc != oldHWDesc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocatorMetamodelPackage.HW_LINK__HW_DESC, oldHWDesc, hwDesc));
			}
		}
		return hwDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWNode basicGetHWDesc() {
		return hwDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHWDesc(HWNode newHWDesc) {
		HWNode oldHWDesc = hwDesc;
		hwDesc = newHWDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__HW_DESC, oldHWDesc, hwDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWNode getHWSrc() {
		if (hwSrc != null && hwSrc.eIsProxy()) {
			InternalEObject oldHWSrc = (InternalEObject)hwSrc;
			hwSrc = (HWNode)eResolveProxy(oldHWSrc);
			if (hwSrc != oldHWSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AllocatorMetamodelPackage.HW_LINK__HW_SRC, oldHWSrc, hwSrc));
			}
		}
		return hwSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWNode basicGetHWSrc() {
		return hwSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHWSrc(HWNode newHWSrc) {
		HWNode oldHWSrc = hwSrc;
		hwSrc = newHWSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__HW_SRC, oldHWSrc, hwSrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBandwith() {
		return bandwith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBandwith(float newBandwith) {
		float oldBandwith = bandwith;
		bandwith = newBandwith;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HW_LINK__BANDWITH, oldBandwith, bandwith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocatorMetamodelPackage.HW_LINK__NAME:
				return getName();
			case AllocatorMetamodelPackage.HW_LINK__HW_DESC:
				if (resolve) return getHWDesc();
				return basicGetHWDesc();
			case AllocatorMetamodelPackage.HW_LINK__HW_SRC:
				if (resolve) return getHWSrc();
				return basicGetHWSrc();
			case AllocatorMetamodelPackage.HW_LINK__UNIT:
				return getUnit();
			case AllocatorMetamodelPackage.HW_LINK__VALUE:
				return getValue();
			case AllocatorMetamodelPackage.HW_LINK__BANDWITH:
				return getBandwith();
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
			case AllocatorMetamodelPackage.HW_LINK__NAME:
				setName((String)newValue);
				return;
			case AllocatorMetamodelPackage.HW_LINK__HW_DESC:
				setHWDesc((HWNode)newValue);
				return;
			case AllocatorMetamodelPackage.HW_LINK__HW_SRC:
				setHWSrc((HWNode)newValue);
				return;
			case AllocatorMetamodelPackage.HW_LINK__UNIT:
				setUnit((String)newValue);
				return;
			case AllocatorMetamodelPackage.HW_LINK__VALUE:
				setValue((Float)newValue);
				return;
			case AllocatorMetamodelPackage.HW_LINK__BANDWITH:
				setBandwith((Float)newValue);
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
			case AllocatorMetamodelPackage.HW_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.HW_LINK__HW_DESC:
				setHWDesc((HWNode)null);
				return;
			case AllocatorMetamodelPackage.HW_LINK__HW_SRC:
				setHWSrc((HWNode)null);
				return;
			case AllocatorMetamodelPackage.HW_LINK__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.HW_LINK__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.HW_LINK__BANDWITH:
				setBandwith(BANDWITH_EDEFAULT);
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
			case AllocatorMetamodelPackage.HW_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocatorMetamodelPackage.HW_LINK__HW_DESC:
				return hwDesc != null;
			case AllocatorMetamodelPackage.HW_LINK__HW_SRC:
				return hwSrc != null;
			case AllocatorMetamodelPackage.HW_LINK__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case AllocatorMetamodelPackage.HW_LINK__VALUE:
				return value != VALUE_EDEFAULT;
			case AllocatorMetamodelPackage.HW_LINK__BANDWITH:
				return bandwith != BANDWITH_EDEFAULT;
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
		result.append(", Bandwith: ");
		result.append(bandwith);
		result.append(')');
		return result.toString();
	}

} //HWLinkImpl
