package AllocatorMetamodel.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Allocator_metamodelNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) {
			AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem item = (AllocatorMetamodel.diagram.navigator.Allocator_metamodelNavigatorItem) element;
			return AllocatorMetamodel.diagram.part.Allocator_metamodelVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
