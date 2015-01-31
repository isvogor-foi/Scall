package AllocatorMetamodel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class HWLinkReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public HWLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AllocatorMetamodel.HWLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof AllocatorMetamodel.HWNode && newEnd instanceof AllocatorMetamodel.HWNode)) {
			return false;
		}
		AllocatorMetamodel.HWNode target = getLink().getHWDesc();
		if (!(getLink().eContainer() instanceof AllocatorMetamodel.Hardware)) {
			return false;
		}
		AllocatorMetamodel.Hardware container = (AllocatorMetamodel.Hardware) getLink()
				.eContainer();
		return AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistHWLink_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AllocatorMetamodel.HWNode && newEnd instanceof AllocatorMetamodel.HWNode)) {
			return false;
		}
		AllocatorMetamodel.HWNode source = getLink().getHWSrc();
		if (!(getLink().eContainer() instanceof AllocatorMetamodel.Hardware)) {
			return false;
		}
		AllocatorMetamodel.Hardware container = (AllocatorMetamodel.Hardware) getLink()
				.eContainer();
		return AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistHWLink_4001(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setHWSrc(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setHWDesc(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.HWLink getLink() {
		return (AllocatorMetamodel.HWLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.HWNode getOldSource() {
		return (AllocatorMetamodel.HWNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.HWNode getNewSource() {
		return (AllocatorMetamodel.HWNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.HWNode getOldTarget() {
		return (AllocatorMetamodel.HWNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.HWNode getNewTarget() {
		return (AllocatorMetamodel.HWNode) newEnd;
	}
}
