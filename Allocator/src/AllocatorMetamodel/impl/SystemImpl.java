/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.Hardware;
import AllocatorMetamodel.Software;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AllocatorMetamodel.impl.SystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SystemImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SystemImpl#getSoftwares <em>Softwares</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemImpl extends MinimalEObjectImpl.Container implements AllocatorMetamodel.System {
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
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Hardware> platforms;

	/**
	 * The cached value of the '{@link #getSoftwares() <em>Softwares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwares()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> softwares;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocatorMetamodelPackage.Literals.SYSTEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hardware> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectContainmentEList<Hardware>(Hardware.class, this, AllocatorMetamodelPackage.SYSTEM__PLATFORMS);
		}
		return platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getSoftwares() {
		if (softwares == null) {
			softwares = new EObjectContainmentEList<Software>(Software.class, this, AllocatorMetamodelPackage.SYSTEM__SOFTWARES);
		}
		return softwares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SYSTEM__PLATFORMS:
				return ((InternalEList<?>)getPlatforms()).basicRemove(otherEnd, msgs);
			case AllocatorMetamodelPackage.SYSTEM__SOFTWARES:
				return ((InternalEList<?>)getSoftwares()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SYSTEM__NAME:
				return getName();
			case AllocatorMetamodelPackage.SYSTEM__PLATFORMS:
				return getPlatforms();
			case AllocatorMetamodelPackage.SYSTEM__SOFTWARES:
				return getSoftwares();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SYSTEM__NAME:
				setName((String)newValue);
				return;
			case AllocatorMetamodelPackage.SYSTEM__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends Hardware>)newValue);
				return;
			case AllocatorMetamodelPackage.SYSTEM__SOFTWARES:
				getSoftwares().clear();
				getSoftwares().addAll((Collection<? extends Software>)newValue);
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
			case AllocatorMetamodelPackage.SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.SYSTEM__PLATFORMS:
				getPlatforms().clear();
				return;
			case AllocatorMetamodelPackage.SYSTEM__SOFTWARES:
				getSoftwares().clear();
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
			case AllocatorMetamodelPackage.SYSTEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocatorMetamodelPackage.SYSTEM__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
			case AllocatorMetamodelPackage.SYSTEM__SOFTWARES:
				return softwares != null && !softwares.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SystemImpl
