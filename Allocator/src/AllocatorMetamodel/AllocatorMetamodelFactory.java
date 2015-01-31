/**
 */
package AllocatorMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AllocatorMetamodel.AllocatorMetamodelPackage
 * @generated
 */
public interface AllocatorMetamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AllocatorMetamodelFactory eINSTANCE = AllocatorMetamodel.impl.AllocatorMetamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software</em>'.
	 * @generated
	 */
	Software createSoftware();

	/**
	 * Returns a new object of class '<em>Hardware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware</em>'.
	 * @generated
	 */
	Hardware createHardware();

	/**
	 * Returns a new object of class '<em>SW Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Node</em>'.
	 * @generated
	 */
	SWNode createSWNode();

	/**
	 * Returns a new object of class '<em>HW Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Node</em>'.
	 * @generated
	 */
	HWNode createHWNode();

	/**
	 * Returns a new object of class '<em>SW Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SW Link</em>'.
	 * @generated
	 */
	SWLink createSWLink();

	/**
	 * Returns a new object of class '<em>HW Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Link</em>'.
	 * @generated
	 */
	HWLink createHWLink();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AllocatorMetamodelPackage getAllocatorMetamodelPackage();

} //AllocatorMetamodelFactory
