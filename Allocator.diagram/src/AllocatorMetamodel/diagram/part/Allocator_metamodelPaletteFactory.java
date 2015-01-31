package AllocatorMetamodel.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Allocator_metamodelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAllocatorMetamodel1Group());
	}

	/**
	 * Creates "AllocatorMetamodel" palette tool group
	 * @generated
	 */
	private PaletteContainer createAllocatorMetamodel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				AllocatorMetamodel.diagram.part.Messages.AllocatorMetamodel1Group_title);
		paletteContainer.setId("createAllocatorMetamodel1Group"); //$NON-NLS-1$
		paletteContainer.add(createSoftware1CreationTool());
		paletteContainer.add(createHardware2CreationTool());
		paletteContainer.add(createSWNode3CreationTool());
		paletteContainer.add(createHWNode4CreationTool());
		paletteContainer.add(createSWLink5CreationTool());
		paletteContainer.add(createHWLink6CreationTool());
		paletteContainer.add(createResource7CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftware1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				AllocatorMetamodel.diagram.part.Messages.Software1CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.Software1CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001));
		entry.setId("createSoftware1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Software_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardware2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				AllocatorMetamodel.diagram.part.Messages.Hardware2CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.Hardware2CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002));
		entry.setId("createHardware2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Hardware_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSWNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				AllocatorMetamodel.diagram.part.Messages.SWNode3CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.SWNode3CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001));
		entry.setId("createSWNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWNode_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWNode4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				AllocatorMetamodel.diagram.part.Messages.HWNode4CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.HWNode4CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002));
		entry.setId("createHWNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWNode_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSWLink5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				AllocatorMetamodel.diagram.part.Messages.SWLink5CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.SWLink5CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002));
		entry.setId("createSWLink5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.SWLink_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHWLink6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				AllocatorMetamodel.diagram.part.Messages.HWLink6CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.HWLink6CreationTool_desc,
				Collections
						.singletonList(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001));
		entry.setId("createHWLink6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.HWLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003);
		types.add(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3004);
		NodeToolEntry entry = new NodeToolEntry(
				AllocatorMetamodel.diagram.part.Messages.Resource7CreationTool_title,
				AllocatorMetamodel.diagram.part.Messages.Resource7CreationTool_desc,
				types);
		entry.setId("createResource7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
				.getImageDescriptor(AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes.Resource_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
