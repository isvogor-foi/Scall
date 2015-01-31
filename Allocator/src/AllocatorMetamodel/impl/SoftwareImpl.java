/**
 */
package AllocatorMetamodel.impl;

import AllocatorMetamodel.AllocatorMetamodelPackage;
import AllocatorMetamodel.SWLink;
import AllocatorMetamodel.SWNode;
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
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AllocatorMetamodel.impl.SoftwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SoftwareImpl#getSWNodes <em>SW Nodes</em>}</li>
 *   <li>{@link AllocatorMetamodel.impl.SoftwareImpl#getSWLinks <em>SW Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftwareImpl extends MinimalEObjectImpl.Container implements Software {
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
	 * The cached value of the '{@link #getSWNodes() <em>SW Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<SWNode> swNodes;

	/**
	 * The cached value of the '{@link #getSWLinks() <em>SW Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSWLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SWLink> swLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllocatorMetamodelPackage.Literals.SOFTWARE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AllocatorMetamodelPackage.SOFTWARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SWNode> getSWNodes() {
		if (swNodes == null) {
			swNodes = new EObjectContainmentEList<SWNode>(SWNode.class, this, AllocatorMetamodelPackage.SOFTWARE__SW_NODES);
		}
		return swNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SWLink> getSWLinks() {
		if (swLinks == null) {
			swLinks = new EObjectContainmentEList<SWLink>(SWLink.class, this, AllocatorMetamodelPackage.SOFTWARE__SW_LINKS);
		}
		return swLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllocatorMetamodelPackage.SOFTWARE__SW_NODES:
				return ((InternalEList<?>)getSWNodes()).basicRemove(otherEnd, msgs);
			case AllocatorMetamodelPackage.SOFTWARE__SW_LINKS:
				return ((InternalEList<?>)getSWLinks()).basicRemove(otherEnd, msgs);
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
			case AllocatorMetamodelPackage.SOFTWARE__NAME:
				return getName();
			case AllocatorMetamodelPackage.SOFTWARE__SW_NODES:
				return getSWNodes();
			case AllocatorMetamodelPackage.SOFTWARE__SW_LINKS:
				return getSWLinks();
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
			case AllocatorMetamodelPackage.SOFTWARE__NAME:
				setName((String)newValue);
				return;
			case AllocatorMetamodelPackage.SOFTWARE__SW_NODES:
				getSWNodes().clear();
				getSWNodes().addAll((Collection<? extends SWNode>)newValue);
				return;
			case AllocatorMetamodelPackage.SOFTWARE__SW_LINKS:
				getSWLinks().clear();
				getSWLinks().addAll((Collection<? extends SWLink>)newValue);
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
			case AllocatorMetamodelPackage.SOFTWARE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AllocatorMetamodelPackage.SOFTWARE__SW_NODES:
				getSWNodes().clear();
				return;
			case AllocatorMetamodelPackage.SOFTWARE__SW_LINKS:
				getSWLinks().clear();
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
			case AllocatorMetamodelPackage.SOFTWARE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AllocatorMetamodelPackage.SOFTWARE__SW_NODES:
				return swNodes != null && !swNodes.isEmpty();
			case AllocatorMetamodelPackage.SOFTWARE__SW_LINKS:
				return swLinks != null && !swLinks.isEmpty();
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

} //SoftwareImpl
