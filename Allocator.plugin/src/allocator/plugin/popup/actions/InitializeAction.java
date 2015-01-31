package allocator.plugin.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import allocator.plugin.popup.actionhandlers.InitializerActionHandler;

public class InitializeAction implements IObjectActionDelegate {

	private Shell shell;
	private InitializerActionHandler initializerActionHandler;
	private ISelection currentSelection;
	
	/**
	 * Constructor for .
	 */
	public InitializeAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		initializerActionHandler = new InitializerActionHandler(currentSelection, shell);
		//MessageDialog.openInformation(shell,"Plugin","Analyze was executed.");
		
		MessageBox dialog = new MessageBox(this.shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
		dialog.setText("Information");
		dialog.setMessage("Values are initialized. If you change the model, please reinitialize the matrices.");
		dialog.open(); 
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	
	public void selectionChanged(IAction action, ISelection selection) {
		currentSelection = selection;
	}

}
