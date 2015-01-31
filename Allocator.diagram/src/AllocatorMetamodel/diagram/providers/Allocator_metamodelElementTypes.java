package AllocatorMetamodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Allocator_metamodelElementTypes {

	/**
	 * @generated
	 */
	private Allocator_metamodelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType System_1000 = getElementType("Allocator.diagram.System_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Software_2001 = getElementType("Allocator.diagram.Software_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Hardware_2002 = getElementType("Allocator.diagram.Hardware_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SWNode_3001 = getElementType("Allocator.diagram.SWNode_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_3003 = getElementType("Allocator.diagram.Resource_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWNode_3002 = getElementType("Allocator.diagram.HWNode_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Resource_3004 = getElementType("Allocator.diagram.Resource_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HWLink_4001 = getElementType("Allocator.diagram.HWLink_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SWLink_4002 = getElementType("Allocator.diagram.SWLink_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(System_1000,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getSystem());

			elements.put(Software_2001,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getSoftware());

			elements.put(Hardware_2002,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getHardware());

			elements.put(SWNode_3001,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getSWNode());

			elements.put(Resource_3003,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getResource());

			elements.put(HWNode_3002,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getHWNode());

			elements.put(Resource_3004,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getResource());

			elements.put(HWLink_4001,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getHWLink());

			elements.put(SWLink_4002,
					AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
							.getSWLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(System_1000);
			KNOWN_ELEMENT_TYPES.add(Software_2001);
			KNOWN_ELEMENT_TYPES.add(Hardware_2002);
			KNOWN_ELEMENT_TYPES.add(SWNode_3001);
			KNOWN_ELEMENT_TYPES.add(Resource_3003);
			KNOWN_ELEMENT_TYPES.add(HWNode_3002);
			KNOWN_ELEMENT_TYPES.add(Resource_3004);
			KNOWN_ELEMENT_TYPES.add(HWLink_4001);
			KNOWN_ELEMENT_TYPES.add(SWLink_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AllocatorMetamodel.diagram.edit.parts.SystemEditPart.VISUAL_ID:
			return System_1000;
		case AllocatorMetamodel.diagram.edit.parts.SoftwareEditPart.VISUAL_ID:
			return Software_2001;
		case AllocatorMetamodel.diagram.edit.parts.HardwareEditPart.VISUAL_ID:
			return Hardware_2002;
		case AllocatorMetamodel.diagram.edit.parts.SWNodeEditPart.VISUAL_ID:
			return SWNode_3001;
		case AllocatorMetamodel.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return Resource_3003;
		case AllocatorMetamodel.diagram.edit.parts.HWNodeEditPart.VISUAL_ID:
			return HWNode_3002;
		case AllocatorMetamodel.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return Resource_3004;
		case AllocatorMetamodel.diagram.edit.parts.HWLinkEditPart.VISUAL_ID:
			return HWLink_4001;
		case AllocatorMetamodel.diagram.edit.parts.SWLinkEditPart.VISUAL_ID:
			return SWLink_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
