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
public class SWLinkReorientCommand extends EditElementCommand {

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
	public SWLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof AllocatorMetamodel.SWLink) {
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
		if (!(oldEnd instanceof AllocatorMetamodel.SWNode && newEnd instanceof AllocatorMetamodel.SWNode)) {
			return false;
		}
		AllocatorMetamodel.SWNode target = getLink().getSWDesc();
		if (!(getLink().eContainer() instanceof AllocatorMetamodel.Software)) {
			return false;
		}
		AllocatorMetamodel.Software container = (AllocatorMetamodel.Software) getLink()
				.eContainer();
		return AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistSWLink_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AllocatorMetamodel.SWNode && newEnd instanceof AllocatorMetamodel.SWNode)) {
			return false;
		}
		AllocatorMetamodel.SWNode source = getLink().getSWSrc();
		if (!(getLink().eContainer() instanceof AllocatorMetamodel.Software)) {
			return false;
		}
		AllocatorMetamodel.Software container = (AllocatorMetamodel.Software) getLink()
				.eContainer();
		return AllocatorMetamodel.diagram.edit.policies.Allocator_metamodelBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistSWLink_4002(container, getLink(),
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
		getLink().setSWSrc(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSWDesc(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.SWLink getLink() {
		return (AllocatorMetamodel.SWLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.SWNode getOldSource() {
		return (AllocatorMetamodel.SWNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.SWNode getNewSource() {
		return (AllocatorMetamodel.SWNode) newEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.SWNode getOldTarget() {
		return (AllocatorMetamodel.SWNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.SWNode getNewTarget() {
		return (AllocatorMetamodel.SWNode) newEnd;
	}
}
