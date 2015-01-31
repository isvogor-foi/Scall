package allocator.customization;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import allocator.matrices.NodeNames;

public class ResultDialog extends Dialog{

	public Object[] result; 
	protected Table table;
	
	public ResultDialog(Shell parentShell, Object[] result) {
		super(parentShell);
		super.setShellStyle(SWT.TITLE | SWT.CLOSE);
		
		this.result = result;
	}
	
	// display only ok button
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
	    Button ok = createButton(parent, IDialogConstants.OK_ID, "Close", true);
	}
	
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));;
		
		// get node names for rows
		NodeNames nodeNames = NodeNames.getInstance();
		String[] componentNames = new String[nodeNames.getComponentNames().size()];
		for(int i = 0; i < nodeNames.getComponentNames().size(); i++){
			componentNames[i] = nodeNames.getComponentNames().get(i);
		}
		
		tableSetup(container, nodeNames.getComponentNames().size(), 1, componentNames, new String[]{"Allocated to"});
		return container;
	}
	

	private void tableSetup(Composite container, int rows, int columns, String[] rowNames, String[] columnNames) {
		NodeNames nodeNames = NodeNames.getInstance();
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;

		container.setLayout(gridLayout);
		
		this.table = new Table(container, SWT.BORDER | SWT.MULTI | SWT.PUSH);
		GridData data = new  GridData(SWT.FILL, SWT.FILL, true, true);
		data.horizontalSpan = 2;
		this.table.setLayoutData(data);
		this.table.setLinesVisible(true);

		String[] columnTitles = new String[columns + 1];
		columnTitles[0] = " ";
		for(int i = 1; i < columns + 1; i++){
			columnTitles[i] = columnNames[i-1];
		}
		// set headers 
		for(int i = 0; i < columns + 1; i++){
			TableColumn column = new TableColumn(this.table, SWT.NONE);
			column.setWidth(100);
		}
		
		List<Integer> results = new ArrayList<Integer>();
		List<Double> res = (List<Double>) result[0];
		for(int i = 0; i < res.size(); i++){
			results.add(res.get(i).intValue());
		}
		
		for(int i = 0; i < rows + 1; i++){
			TableItem item = new TableItem(table, SWT.NONE);
			if(i == 0 )
				item.setText(columnTitles);	
			else
				item.setText(new String[]{rowNames[i - 1], nodeNames.getComputationaUnitNames().get(results.get(i - 1))});	
		}
		
		
		
		// validity
		Label lblValidityText = new Label(container, SWT.NONE);
		lblValidityText.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		lblValidityText.setText("Solution valid: ");
		
		Label lblValidityValue = new Label(container, SWT.NONE);
		lblValidityValue.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		if(result[7].toString().equals("false")){
			lblValidityValue.setForeground(container.getDisplay().getSystemColor(SWT.COLOR_RED));

		} else{
			lblValidityValue.setForeground(container.getDisplay().getSystemColor(SWT.COLOR_DARK_GREEN));

		}
		lblValidityValue.setText(result[7].toString());
		
		// time
		Label lblTimeText = new Label(container, SWT.NONE);
		lblTimeText.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		lblTimeText.setText("Calculation time: ");
		
		Label lblTimeValue = new Label(container, SWT.NONE);
		lblTimeValue.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		lblTimeValue.setText(result[4].toString());
		
		//consistency
		Label lblConsistencyText = new Label(container, SWT.NONE);
		lblConsistencyText.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		lblConsistencyText.setText("Consistency ratio: ");
		
		Label lblConsistencyValue = new Label(container, SWT.NONE);
		lblConsistencyValue.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		
		lblConsistencyValue.setText(result[6].toString().substring(0, 10));
	}
	
	
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Solution dialog");
	}
	
	@Override
	protected Point getInitialSize() {
		return new Point(550, 400);
	}

	@Override
	protected boolean isResizable(){
		return true;
	}
	
}
