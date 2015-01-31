package AllocatorMetamodel.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
