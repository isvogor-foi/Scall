package AllocatorMetamodel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class SystemItemSemanticEditPolicy
		extends
		AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SystemItemSemanticEditPolicy() {
		super(
				AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.System_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.SoftwareCreateCommand(
					req));
		}
		if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002 == req
				.getElementType()) {
			return getGEFWrapper(new AllocatorMetamodel.diagram.edit.commands.HardwareCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
