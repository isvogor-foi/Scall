package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SWNodeSWResourceCompartmentItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SWNodeSWResourceCompartmentItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.ResourceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
