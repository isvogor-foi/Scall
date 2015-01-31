/**
 */
package AllocatorMetamodel.tests;

import AllocatorMetamodel.AllocatorMetamodelFactory;
import AllocatorMetamodel.Hardware;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareTest extends TestCase {

	/**
	 * The fixture for this Hardware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hardware fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareTest.class);
	}

	/**
	 * Constructs a new Hardware test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Hardware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Hardware fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Hardware test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hardware getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AllocatorMetamodelFactory.eINSTANCE.createHardware());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HardwareTest
