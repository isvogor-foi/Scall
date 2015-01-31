package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HardwareHardwareCompartmentItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HardwareHardwareCompartmentItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.HWNodeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
