package AllocatorMetamodel.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Allocator_metamodelParserProvider extends AbstractProvider
		implements IParserProvider {

	/**
	 * @generated
	 */
	private IParser softwareName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSoftwareName_5001Parser() {
		if (softwareName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSoftware_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			softwareName_5001Parser = parser;
		}
		return softwareName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser hardwareName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getHardwareName_5002Parser() {
		if (hardwareName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHardware_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			hardwareName_5002Parser = parser;
		}
		return hardwareName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser sWNodeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSWNodeName_5003Parser() {
		if (sWNodeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSWNode_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			sWNodeName_5003Parser = parser;
		}
		return sWNodeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5004Parser() {
		if (resourceName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceName_5004Parser = parser;
		}
		return resourceName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceUnit_5005Parser;

	/**
	 * @generated
	 */
	private IParser getResourceUnit_5005Parser() {
		if (resourceUnit_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Unit() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceUnit_5005Parser = parser;
		}
		return resourceUnit_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceValue_5006Parser;

	/**
	 * @generated
	 */
	private IParser getResourceValue_5006Parser() {
		if (resourceValue_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Value() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceValue_5006Parser = parser;
		}
		return resourceValue_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser hWNodeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getHWNodeName_5010Parser() {
		if (hWNodeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHWNode_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			hWNodeName_5010Parser = parser;
		}
		return hWNodeName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_5007Parser() {
		if (resourceName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceName_5007Parser = parser;
		}
		return resourceName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceUnit_5008Parser;

	/**
	 * @generated
	 */
	private IParser getResourceUnit_5008Parser() {
		if (resourceUnit_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Unit() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceUnit_5008Parser = parser;
		}
		return resourceUnit_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceValue_5009Parser;

	/**
	 * @generated
	 */
	private IParser getResourceValue_5009Parser() {
		if (resourceValue_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getResource_Value() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			resourceValue_5009Parser = parser;
		}
		return resourceValue_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser hWLinkName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getHWLinkName_6001Parser() {
		if (hWLinkName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getHWLink_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			hWLinkName_6001Parser = parser;
		}
		return hWLinkName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser sWLinkName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getSWLinkName_6002Parser() {
		if (sWLinkName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { AllocatorMetamodel.AllocatorMetamodelPackage.eINSTANCE
					.getSWLink_Name() };
			AllocatorMetamodel.diagram.parsers.MessageFormatParser parser = new AllocatorMetamodel.diagram.parsers.MessageFormatParser(
					features);
			sWLinkName_6002Parser = parser;
		}
		return sWLinkName_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case AllocatorMetamodel.diagram.edit.parts.SoftwareNameEditPart.VISUAL_ID:
			return getSoftwareName_5001Parser();
		case AllocatorMetamodel.diagram.edit.parts.HardwareNameEditPart.VISUAL_ID:
			return getHardwareName_5002Parser();
		case AllocatorMetamodel.diagram.edit.parts.SWNodeNameEditPart.VISUAL_ID:
			return getSWNodeName_5003Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_5004Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceUnitEditPart.VISUAL_ID:
			return getResourceUnit_5005Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceValueEditPart.VISUAL_ID:
			return getResourceValue_5006Parser();
		case AllocatorMetamodel.diagram.edit.parts.HWNodeNameEditPart.VISUAL_ID:
			return getHWNodeName_5010Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_5007Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceUnit2EditPart.VISUAL_ID:
			return getResourceUnit_5008Parser();
		case AllocatorMetamodel.diagram.edit.parts.ResourceValue2EditPart.VISUAL_ID:
			return getResourceValue_5009Parser();
		case AllocatorMetamodel.diagram.edit.parts.HWLinkNameEditPart.VISUAL_ID:
			return getHWLinkName_6001Parser();
		case AllocatorMetamodel.diagram.edit.parts.SWLinkNameEditPart.VISUAL_ID:
			return getSWLinkName_6002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AllocatorMetamodel.diagram.providers.Allocator_metamodelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
