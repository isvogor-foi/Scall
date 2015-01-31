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
public class HWLinkEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public HWLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new AllocatorMetamodel.diagram.edit.policies.HWLinkItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart) {
			((AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureHWLinkNameFigure());
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
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart) {
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
		return new HWLinkFigure();
	}

	/**
	 * @generated
	 */
	public HWLinkFigure getPrimaryShape() {
		return (HWLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class HWLinkFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureHWLinkNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHWLinkUnitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHWLinkValueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureHWLinkBandwithFigure;

		/**
		 * @generated
		 */
		public HWLinkFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureHWLinkNameFigure = new WrappingLabel();

			fFigureHWLinkNameFigure.setText("<...>");

			this.add(fFigureHWLinkNameFigure);

			fFigureHWLinkUnitFigure = new WrappingLabel();

			fFigureHWLinkUnitFigure.setText("<...>");

			this.add(fFigureHWLinkUnitFigure);

			fFigureHWLinkValueFigure = new WrappingLabel();

			fFigureHWLinkValueFigure.setText("<...>");

			this.add(fFigureHWLinkValueFigure);

			fFigureHWLinkBandwithFigure = new WrappingLabel();

			fFigureHWLinkBandwithFigure.setText("<...>");

			this.add(fFigureHWLinkBandwithFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHWLinkNameFigure() {
			return fFigureHWLinkNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHWLinkUnitFigure() {
			return fFigureHWLinkUnitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHWLinkValueFigure() {
			return fFigureHWLinkValueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureHWLinkBandwithFigure() {
			return fFigureHWLinkBandwithFigure;
		}

	}

}
