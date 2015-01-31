package allocator.customization;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

import allocator.matrices.BandwithMatrix;
import allocator.matrices.CommunicationMatrix;
import allocator.matrices.Matrix;
import allocator.matrices.PairwiseComparisonMatrix;
import allocator.matrices.PlatformCommunicationMatrix;
import allocator.matrices.ResourceAvailabilityMatrix;

public class EditDialog extends Dialog {

	//private JTable table;
	private PairwiseComparisonMatrix pcm;
	protected Table table;
	protected Composite composite;
	protected String value;
	protected TableEditor editor;

	public EditDialog(Shell parentShell) {
		super(parentShell);
		super.setShellStyle(SWT.TITLE | SWT.CLOSE);
		
		pcm = PairwiseComparisonMatrix.getInstance();
		pcm.printMatrix();		
	}
	
	// display only ok button
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
	    Button ok = createButton(parent, IDialogConstants.OK_ID, "Close", true);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		this.composite = container;

		container.setLayout(gridLayout); 
		
		
		final Combo cmb = new Combo(container, SWT.PUSH); 
		cmb.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		cmb.add("Pairwise comparison matrix");
		cmb.add("Bandwith matrix");
		cmb.add("Communication matrix");
		cmb.add("Platform communication matrix");
		cmb.add("Resource availability matrix");
		cmb.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				Matrix matrix = PairwiseComparisonMatrix.getInstance();
				String selection = cmb.getText();
				switch(selection){
					case "Pairwise comparison matrix": // asymmetric
						matrix = PairwiseComparisonMatrix.getInstance();
						tableSetup(composite, matrix.getRowsCount(), matrix.getColumnsCount(), matrix.getRowNames(), matrix.getColumnNames(), matrix.getValuesAsString());
						enableTableEditability();
					break;
					case "Bandwith matrix": 	// symmetric  
						matrix = BandwithMatrix.getInstance();
						tableSetup(composite,matrix.getRowsCount(), matrix.getColumnsCount(), matrix.getRowNames(), matrix.getColumnNames(), matrix.getValuesAsString());

						break;
					case "Communication matrix":  // symmetric 
						matrix = CommunicationMatrix.getInstance();
						tableSetup(composite, matrix.getRowsCount(), matrix.getColumnsCount(), matrix.getRowNames(), matrix.getColumnNames(), matrix.getValuesAsString());

						break;
					case "Platform communication matrix": // symmetric
						matrix = PlatformCommunicationMatrix.getInstance();
						tableSetup(composite, matrix.getRowsCount(), matrix.getColumnsCount(), matrix.getRowNames(), matrix.getColumnNames(), matrix.getValuesAsString());

						break;
					case "Resource availability matrix": // asymmetric
						matrix = ResourceAvailabilityMatrix.getInstance();
						tableSetup(composite, matrix.getColumnsCount(), matrix.getRowsCount(), matrix.getColumnNames(),matrix.getRowNames(),  matrix.getValuesAsString());
						break;
				}
				matrix.printMatrix();

			}	
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		cmb.select(0);
		// add button
		
		Button button = new Button(container, SWT.PUSH);
		button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		button.setText("Save");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String value = table.getColumn(1).getText() + ", " + table.getItemCount() + " , " + table.getItem(1).getText(1); // exec 
				
				// set values for pcm
				for(int i = 1; i < table.getItemCount(); i++){
					for(int j = 1; j < table.getColumnCount(); j++){
						String val = table.getItem(i).getText(j);
						pcm.setValue(i - 1, j - 1, val);
					}
				} 
			}
		});
		
		// initial show
		tableSetup(composite, pcm.getRowsCount(), pcm.getColumnsCount(), pcm.getRowNames(), pcm.getRowNames(), pcm.getValuesAsString());
		
		enableTableEditability();
		return container;
	}

	// create table according to values (Along with rown names and column names)
	private void tableSetup(Composite container, int columns, int rows, String[] columnNames, String[] rowNames, String[][] values) {
		
//		for(int i = 1; i < rows; i++){
//			for(int j = 1; j < columns; j++){
//				System.out.println("" + values[j - 1][i -1]);
//			}
//		} 
//		
//		for(int i = 0; i < columns; i++){
//			System.out.println("" + columnNames[i]);
//		}
//		for(int i = 0; i < rows; i++){
//			System.out.println("" + rowNames[i]);
//		}
		
		
		if(this.table != null) this.table.dispose();
		
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
		for(int i = 0; i < rows + 1; i++){
			TableItem item = new TableItem(table, SWT.NONE);
			if(i == 0 )
				item.setText(columnTitles);	
			else
				item.setText(new String[]{rowNames[i-1]});
		}
		
		//
		 
		//PairwiseComparisonMatrix pcm = PairwiseComparisonMatrix.getInstance();
		for(int i = 1; i < table.getItemCount(); i++){
			for(int j = 1; j < table.getColumnCount(); j++){
				table.getItem(i).setText(j, "" + values[i - 1][j -1]);
			}
		} 
		
		// refresh to show control?
		this.composite.layout(true);
		
	}

	private void enableTableEditability() {
		editor = new TableEditor(table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		
		table.addListener(SWT.MouseDown, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Rectangle clientArea = table.getClientArea();
				Point pt = new Point(event.x, event.y);
				int index = table.getTopIndex();
				while (index < table.getItemCount()) {
					boolean visible = false;
					final TableItem item = table.getItem(index);
					
					for (int i = 0; i < table.getColumnCount(); i++) {
						Rectangle rect = item.getBounds(i);
						
						if (rect.contains(pt)) {
							final int column = i;
							if (i == 0 || index == 0) break;
							final Text text = new Text(table, SWT.NONE);
							
							Listener textListener = new Listener() {
								public void handleEvent(final Event e) {
									switch (e.type) {
									case SWT.FocusOut:
										item.setText(column, text.getText());
										text.dispose();
										break;
									case SWT.Traverse:
										switch (e.detail) {
										case SWT.TRAVERSE_RETURN:
											item.setText(column, text.getText());
											// FALL THROUGH
										case SWT.TRAVERSE_ESCAPE:
											text.dispose();
											e.doit = false;
										}
										break;
									}
								}
							};
							text.addListener(SWT.FocusOut, textListener);
							text.addListener(SWT.Traverse, textListener);
							editor.setEditor(text, item, i);
							text.setText(item.getText(i));
							text.selectAll();
							text.setFocus();
							return;
						}
						if (!visible && rect.intersects(clientArea)) {
							visible = true;
						}
					}
					if (!visible) return;
					index++;
				}
			}

		});
		
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Matrix editor");
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
