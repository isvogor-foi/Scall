/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.HWLink;
import AllocatorMetamodel.HWNode;
import AllocatorMetamodel.Hardware;

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
 * An implementation of the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AllocatorMetamodel.impl.HardwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HardwareImpl#getHWNodes <em>HW Nodes</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.HardwareImpl#getHWLinks <em>HW Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareImpl extends MinimalEObjectImpl.Container implements Hardware {
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
	 * The cached value of the '{@link #getHWNodes() <em>HW Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHWNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<HWNode> hwNodes;

	/**
	 * The cached value of the '{@link #getHWLinks() <em>HW Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHWLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<HWLink> hwLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HardwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocatorMetamodelPackage.Literals.HARDWARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.HARDWARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWNode> getHWNodes() {
		if (hwNodes == null) {
			hwNodes = new EObjectContainmentEList<HWNode>(HWNode.class, this, AllocatorMetamodelPackage.HARDWARE__HW_NODES);
		}
		return hwNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWLink> getHWLinks() {
		if (hwLinks == null) {
			hwLinks = new EObjectContainmentEList<HWLink>(HWLink.class, this, AllocatorMetamodelPackage.HARDWARE__HW_LINKS);
		}
		return hwLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocatorMetamodelPackage.HARDWARE__HW_NODES:
				return ((InternalEList<?>)getHWNodes()).basicRemove(otherEnd, msgs);
			case AllocatorMetamodelPackage.HARDWARE__HW_LINKS:
				return ((InternalEList<?>)getHWLinks()).basicRemove(otherEnd, msgs);
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
			case AllocatorMetamodelPackage.HARDWARE__NAME:
				return getName();
			case AllocatorMetamodelPackage.HARDWARE__HW_NODES:
				return getHWNodes();
			case AllocatorMetamodelPackage.HARDWARE__HW_LINKS:
				return getHWLinks();
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
			case AllocatorMetamodelPackage.HARDWARE__NAME:
				setName((String)newValue);
				return;
			case AllocatorMetamodelPackage.HARDWARE__HW_NODES:
				getHWNodes().clear();
				getHWNodes().addAll((Collection<? extends HWNode>)newValue);
				return;
			case AllocatorMetamodelPackage.HARDWARE__HW_LINKS:
				getHWLinks().clear();
				getHWLinks().addAll((Collection<? extends HWLink>)newValue);
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
			case AllocatorMetamodelPackage.HARDWARE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.HARDWARE__HW_NODES:
				getHWNodes().clear();
				return;
			case AllocatorMetamodelPackage.HARDWARE__HW_LINKS:
				getHWLinks().clear();
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
			case AllocatorMetamodelPackage.HARDWARE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocatorMetamodelPackage.HARDWARE__HW_NODES:
				return hwNodes != null && !hwNodes.isEmpty();
			case AllocatorMetamodelPackage.HARDWARE__HW_LINKS:
				return hwLinks != null && !hwLinks.isEmpty();
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

} //HardwareImpl
