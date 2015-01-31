package allocator.plugin.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import allocator.customization.EditDialog;

public class DisplayMatricesAction implements IObjectActionDelegate{

	private Shell shell;
	private ISelection currentSelection;
	
	@Override
	public void run(IAction action) {
		EditDialog dlg = new EditDialog(this.shell);
		dlg.open();		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
