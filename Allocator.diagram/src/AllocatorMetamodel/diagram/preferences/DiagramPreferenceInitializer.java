package AllocatorMetamodel.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		AllocatorMetamodel.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		AllocatorMetamodel.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		AllocatorMetamodel.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		AllocatorMetamodel.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		AllocatorMetamodel.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
