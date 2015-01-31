package AllocatorMetamodel.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Allocator_metamodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(view)) {

			case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SystemEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SoftwareNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SoftwareNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HardwareEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HardwareNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HardwareNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SWNodeNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SWNodeNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceUnitEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceUnitEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceValueEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceValueEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HWNodeNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HWNodeNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.Resource2EditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart(
						view);

			case AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart.VISUAL_ID:
				return new AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
