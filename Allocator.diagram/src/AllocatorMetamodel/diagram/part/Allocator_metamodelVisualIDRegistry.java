package AllocatorMetamodel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Allocator_metamodelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Allocator.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
					.equals(view.getType())) {
				return AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE.getSystem()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((AllocatorMetamodel.System) domainElement)) {
			return AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getModelID(containerView);
		if (!AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSoftware().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID;
			}
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHardware().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSWNode().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHWNode().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())) {
				return AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getModelID(containerView);
		if (!AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.SoftwareNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.HardwareNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.SWNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.ResourceUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.ResourceValueEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.HWNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			if (AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE.getHWLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID;
		}
		if (AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE.getSWLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(AllocatorMetamodel.System element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID:
		case AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID:
		case AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID:
		case AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return false;
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
