package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class SoftwareSoftwareCompartmentItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SoftwareSoftwareCompartmentItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.SWNodeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
