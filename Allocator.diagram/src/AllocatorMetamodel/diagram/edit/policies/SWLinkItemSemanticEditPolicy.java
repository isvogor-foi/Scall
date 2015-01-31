package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class SWLinkItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SWLinkItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
