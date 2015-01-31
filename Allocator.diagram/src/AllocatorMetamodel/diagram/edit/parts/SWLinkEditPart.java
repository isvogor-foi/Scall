package AllocatorMetamodel.diagram.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class SWLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public SWLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new AllocatorMetamodel.diagram.edit.policies.SWLinkItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart) {
			((AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureSWLinkNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new SWLinkFigure();
	}

	/**
	 * @generated
	 */
	public SWLinkFigure getPrimaryShape() {
		return (SWLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SWLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSWLinkNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSWLinkUnitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSWLinkValueFigure;

		/**
		 * @generated
		 */
		public SWLinkFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.green);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSWLinkNameFigure = new WrappingLabel();

			fFigureSWLinkNameFigure.setText("<...>");

			this.add(fFigureSWLinkNameFigure);

			fFigureSWLinkUnitFigure = new WrappingLabel();

			fFigureSWLinkUnitFigure.setText("<...>");

			this.add(fFigureSWLinkUnitFigure);

			fFigureSWLinkValueFigure = new WrappingLabel();

			fFigureSWLinkValueFigure.setText("<...>");

			this.add(fFigureSWLinkValueFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSWLinkNameFigure() {
			return fFigureSWLinkNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSWLinkUnitFigure() {
			return fFigureSWLinkUnitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSWLinkValueFigure() {
			return fFigureSWLinkValueFigure;
		}

	}

}
