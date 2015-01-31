package allocator.plugin.popup.actions;

import java.io.IOException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import allocator.customization.AllocatorCaller;
import allocator.customization.ResultDialog;
import allocator.plugin.popup.actionhandlers.InitializerActionHandler;

public class RunAllocatorAction implements IObjectActionDelegate{

	private Shell shell;
	private InitializerActionHandler initializerActionHandler;
	private ISelection currentSelection;
	
	public RunAllocatorAction(){
		super();
	}
	
	@Override
	public void run(IAction action) {
		//initializerActionHandler = new InitializerActionHandler(currentSelection, shell);
		//MessageDialog.openInformation(shell,"Plugin","Analyze was executed.");
		
		AllocatorCaller ac = new AllocatorCaller();
		try {
			Object[] o = ac.runAllocator();
			ResultDialog rd = new ResultDialog(this.shell, o);
			rd.open();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			MessageBox dialog = new MessageBox(this.shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
			dialog.setText("My info");
			dialog.setMessage("Error...."  + e1.getMessage());
			dialog.open(); 
		}
		
		
//		MessageBox dialog = new MessageBox(this.shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
//		dialog.setText("My info");
//		dialog.setMessage("Ready for allocation call");
//		dialog.open(); 
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
