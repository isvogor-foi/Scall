package AllocatorMetamodel.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Allocator_metamodelCreationWizard extends Wizard implements
		INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.diagram.part.Allocator_metamodelCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected AllocatorMetamodel.diagram.part.Allocator_metamodelCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizardTitle);
		setDefaultPageImageDescriptor(AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewAllocatorMetamodelWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new AllocatorMetamodel.diagram.part.Allocator_metamodelCreationWizardPage(
				"DiagramModelFile", getSelection(), "allocatormetamodel_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new AllocatorMetamodel.diagram.part.Allocator_metamodelCreationWizardPage(
				"DomainModelFile", getSelection(), "allocatormetamodel") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".allocatormetamodel_diagram".length()); //$NON-NLS-1$
					setFileName(AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "allocatormetamodel")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								AllocatorMetamodel.diagram.part.Messages.Allocator_metamodelCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				AllocatorMetamodel.diagram.part.Allocator_metamodelDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
