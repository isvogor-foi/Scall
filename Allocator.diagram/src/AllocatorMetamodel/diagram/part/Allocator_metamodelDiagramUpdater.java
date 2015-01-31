package AllocatorMetamodel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Allocator_metamodelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getSemanticChildren(
			View view) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000SemanticChildren(view);
		case AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart.VISUAL_ID:
			return getSoftwareSoftwareCompartment_7001SemanticChildren(view);
		case AllocatorMetamodel.diagram.edit.parts.SWNodeSWResourceCompartmentEditPart.VISUAL_ID:
			return getSWNodeSWResourceCompartment_7003SemanticChildren(view);
		case AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart.VISUAL_ID:
			return getHardwareHardwareCompartment_7002SemanticChildren(view);
		case AllocatorMetamodel.diagram.edit.parts.HWNodeHWResourceCompartmentEditPart.VISUAL_ID:
			return getHWNodeHWResourceCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getSystem_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AllocatorMetamodel.System modelElement = (AllocatorMetamodel.System) view
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSoftwares().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.Software childElement = (AllocatorMetamodel.Software) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPlatforms().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.Hardware childElement = (AllocatorMetamodel.Hardware) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getSoftwareSoftwareCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AllocatorMetamodel.Software modelElement = (AllocatorMetamodel.Software) containerView
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSWNodes().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.SWNode childElement = (AllocatorMetamodel.SWNode) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getSWNodeSWResourceCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AllocatorMetamodel.SWNode modelElement = (AllocatorMetamodel.SWNode) containerView
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSWResources().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.Resource childElement = (AllocatorMetamodel.Resource) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getHardwareHardwareCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AllocatorMetamodel.Hardware modelElement = (AllocatorMetamodel.Hardware) containerView
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHWNodes().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.HWNode childElement = (AllocatorMetamodel.HWNode) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getHWNodeHWResourceCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		AllocatorMetamodel.HWNode modelElement = (AllocatorMetamodel.HWNode) containerView
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHWResources().iterator(); it
				.hasNext();) {
			AllocatorMetamodel.Resource childElement = (AllocatorMetamodel.Resource) it
					.next();
			int visualID = AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID) {
				result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getContainedLinks(
			View view) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return getSoftware_2001ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return getHardware_2002ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return getSWNode_3001ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_3003ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return getHWNode_3002ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3004ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return getHWLink_4001ContainedLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return getSWLink_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getIncomingLinks(
			View view) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return getSoftware_2001IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return getHardware_2002IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return getSWNode_3001IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_3003IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return getHWNode_3002IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3004IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return getHWLink_4001IncomingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return getSWLink_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return getSoftware_2001OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return getHardware_2002OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return getSWNode_3001OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_3003OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return getHWNode_3002OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3004OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return getHWLink_4001OutgoingLinks(view);
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return getSWLink_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSystem_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSoftware_2001ContainedLinks(
			View view) {
		AllocatorMetamodel.Software modelElement = (AllocatorMetamodel.Software) view
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SWLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHardware_2002ContainedLinks(
			View view) {
		AllocatorMetamodel.Hardware modelElement = (AllocatorMetamodel.Hardware) view
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_HWLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWNode_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWNode_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWLink_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSoftware_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHardware_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWNode_3001IncomingLinks(
			View view) {
		AllocatorMetamodel.SWNode modelElement = (AllocatorMetamodel.SWNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SWLink_4002(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWNode_3002IncomingLinks(
			View view) {
		AllocatorMetamodel.HWNode modelElement = (AllocatorMetamodel.HWNode) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_HWLink_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWLink_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSoftware_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHardware_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWNode_3001OutgoingLinks(
			View view) {
		AllocatorMetamodel.SWNode modelElement = (AllocatorMetamodel.SWNode) view
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SWLink_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWNode_3002OutgoingLinks(
			View view) {
		AllocatorMetamodel.HWNode modelElement = (AllocatorMetamodel.HWNode) view
				.getElement();
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_HWLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getResource_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getHWLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getSWLink_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getContainedTypeModelFacetLinks_HWLink_4001(
			AllocatorMetamodel.Hardware container) {
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		for (Iterator<?> links = container.getHWLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AllocatorMetamodel.HWLink) {
				continue;
			}
			AllocatorMetamodel.HWLink link = (AllocatorMetamodel.HWLink) linkObject;
			if (AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.HWNode dst = link.getHWDesc();
			AllocatorMetamodel.HWNode src = link.getHWSrc();
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					dst,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001,
					AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getContainedTypeModelFacetLinks_SWLink_4002(
			AllocatorMetamodel.Software container) {
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		for (Iterator<?> links = container.getSWLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AllocatorMetamodel.SWLink) {
				continue;
			}
			AllocatorMetamodel.SWLink link = (AllocatorMetamodel.SWLink) linkObject;
			if (AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.SWNode dst = link.getSWDesc();
			AllocatorMetamodel.SWNode src = link.getSWSrc();
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					dst,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002,
					AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getIncomingTypeModelFacetLinks_HWLink_4001(
			AllocatorMetamodel.HWNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHWLink_HWDesc()
					|| false == setting.getEObject() instanceof AllocatorMetamodel.HWLink) {
				continue;
			}
			AllocatorMetamodel.HWLink link = (AllocatorMetamodel.HWLink) setting
					.getEObject();
			if (AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.HWNode src = link.getHWSrc();
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					target,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001,
					AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getIncomingTypeModelFacetLinks_SWLink_4002(
			AllocatorMetamodel.SWNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSWLink_SWDesc()
					|| false == setting.getEObject() instanceof AllocatorMetamodel.SWLink) {
				continue;
			}
			AllocatorMetamodel.SWLink link = (AllocatorMetamodel.SWLink) setting
					.getEObject();
			if (AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.SWNode src = link.getSWSrc();
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					target,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002,
					AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_HWLink_4001(
			AllocatorMetamodel.HWNode source) {
		AllocatorMetamodel.Hardware container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof AllocatorMetamodel.Hardware) {
				container = (AllocatorMetamodel.Hardware) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		for (Iterator<?> links = container.getHWLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AllocatorMetamodel.HWLink) {
				continue;
			}
			AllocatorMetamodel.HWLink link = (AllocatorMetamodel.HWLink) linkObject;
			if (AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.HWNode dst = link.getHWDesc();
			AllocatorMetamodel.HWNode src = link.getHWSrc();
			if (src != source) {
				continue;
			}
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					dst,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001,
					AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getOutgoingTypeModelFacetLinks_SWLink_4002(
			AllocatorMetamodel.SWNode source) {
		AllocatorMetamodel.Software container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof AllocatorMetamodel.Software) {
				container = (AllocatorMetamodel.Software) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> result = new LinkedList<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor>();
		for (Iterator<?> links = container.getSWLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof AllocatorMetamodel.SWLink) {
				continue;
			}
			AllocatorMetamodel.SWLink link = (AllocatorMetamodel.SWLink) linkObject;
			if (AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID != AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AllocatorMetamodel.SWNode dst = link.getSWDesc();
			AllocatorMetamodel.SWNode src = link.getSWSrc();
			if (src != source) {
				continue;
			}
			result.add(new AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor(
					src,
					dst,
					link,
					AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002,
					AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<AllocatorMetamodel.diagram.part.Allocator_metamodelNodeDescriptor> getSemanticChildren(
				View view) {
			return Allocator_metamodelDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getContainedLinks(
				View view) {
			return Allocator_metamodelDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getIncomingLinks(
				View view) {
			return Allocator_metamodelDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<AllocatorMetamodel.diagram.part.Allocator_metamodelLinkDescriptor> getOutgoingLinks(
				View view) {
			return Allocator_metamodelDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
