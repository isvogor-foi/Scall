package AllocatorMetamodel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class Allocator_metamodelModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof AllocatorMetamodel.diagram.edit.parts.SystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002);
			return types;
		}
		if (editPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003);
			return types;
		}
		if (editPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3004);
			return types;
		}
		if (editPart instanceof AllocatorMetamodel.diagram.edit.parts.SoftwareSoftwareCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001);
			return types;
		}
		if (editPart instanceof AllocatorMetamodel.diagram.edit.parts.HardwareHardwareCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) {
			return ((AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
						.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelModelingAssistantProviderMessage);
		dialog.setTitle(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
