package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class HWNodeHWResourceCompartmentItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HWNodeHWResourceCompartmentItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3004 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.Resource2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
