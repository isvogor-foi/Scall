package AllocatorMetamodel.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Allocator_metamodelNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem
				&& !isOwnView(((AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup group = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) element;
			return AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem navigatorItem = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?uri://am?System", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.System_1000); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?uri://am?Software", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?uri://am?Hardware", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?uri://am?SWNode", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?uri://am?HWNode", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?uri://am?Resource", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?uri://am?Resource", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3004); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?uri://am?HWLink", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001); //$NON-NLS-1$
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?uri://am?SWLink", AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
						.isKnownElementType(elementType)) {
			image = AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup group = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem navigatorItem = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
				.getVisualID(view)) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return getSystem_1000Text(view);
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return getSoftware_2001Text(view);
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return getHardware_2002Text(view);
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return getSWNode_3001Text(view);
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return getHWNode_3002Text(view);
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_3003Text(view);
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_3004Text(view);
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return getHWLink_4001Text(view);
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return getSWLink_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSystem_1000Text(View view) {
		AllocatorMetamodel.System domainModelElement = (AllocatorMetamodel.System) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance()
					.logError(
							"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSoftware_2001Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.SoftwareNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHardware_2002Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.HardwareNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSWNode_3001Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.SWNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWNode_3002Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.HWNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_3003Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getResource_3004Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3004,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHWLink_4001Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSWLink_4002Text(View view) {
		IParser parser = AllocatorMetamodel.diagram.providers.Allocator_metamodelParserProvider
				.getParser(
						AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002,
						view.getElement() != null ? view.getElement() : view,
						AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
								.getType(AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().logError(
							"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return AllocatorMetamodel.diagram.edit.parts.SystemEditPart.MODEL_ID
				.equals(AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
						.getModelID(view));
	}

}
