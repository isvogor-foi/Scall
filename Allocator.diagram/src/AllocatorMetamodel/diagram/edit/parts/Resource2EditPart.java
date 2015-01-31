package AllocatorMetamodel.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Resource2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Resource2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new AllocatorMetamodel.diagram.edit.policies.Resource2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new ResourceFigure();
	}

	/**
	 * @generated
	 */
	public ResourceFigure getPrimaryShape() {
		return (ResourceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart) {
			((AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureResourceNameFigure());
			return true;
		}
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart) {
			((AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureResourceUnitFigure());
			return true;
		}
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart) {
			((AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureResourceValueFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart) {
			return true;
		}
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart) {
			return true;
		}
		if (childEditPart instanceof AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 61);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getType(AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ResourceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceUnitFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureResourceValueFigure;

		/**
		 * @generated
		 */
		public ResourceFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setBackgroundColor(THIS_BACK);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(100),
					getMapMode().DPtoLP(61)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureResourceNameFigure = new WrappingLabel();

			fFigureResourceNameFigure.setText("<...>");

			this.add(fFigureResourceNameFigure);

			fFigureResourceUnitFigure = new WrappingLabel();

			fFigureResourceUnitFigure.setText("<...>");

			this.add(fFigureResourceUnitFigure);

			fFigureResourceValueFigure = new WrappingLabel();

			fFigureResourceValueFigure.setText("<...>");

			this.add(fFigureResourceValueFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceNameFigure() {
			return fFigureResourceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceUnitFigure() {
			return fFigureResourceUnitFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureResourceValueFigure() {
			return fFigureResourceValueFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 207, 252, 218);

}
