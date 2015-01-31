package allocator.matrices;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;

@SuppressWarnings("unused")
public class PairwiseComparisonMatrix extends Matrix{
	private static PairwiseComparisonMatrix instance;
	
	private String[][] userInputMatrix;
	private float[][] pairwiseComparisonMatrix;

	
	private PairwiseComparisonMatrix(){}
	
	public static PairwiseComparisonMatrix getInstance(){
		if(instance == null) {
			instance = new PairwiseComparisonMatrix();
		}
		return instance;
	}
	
	public void setSize(int rows, int columns){
		super.setRows(rows);
		super.setColumns(columns);
		

		this.pairwiseComparisonMatrix = new float[rows][columns];
		this.userInputMatrix = new String[rows][columns];
		
		this.setRowNamesArray(new String[rows]);
		this.setColumnNamesArray(new String[columns]);
		
		for(int i=0; i<rows; i++){
			for(int j=0; j< columns;j++){
				this.pairwiseComparisonMatrix[i][j] = 0;
				this.userInputMatrix[i][j] = "";
			}
		}
	}
	
	@Override
	public void printMatrix(){
		for(int i=0; i<this.pairwiseComparisonMatrix.length; i++){
			for(int j=0; j< this.pairwiseComparisonMatrix[0].length;j++){
				System.out.print(" " + pairwiseComparisonMatrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setValue(int row, int column, String value){
		this.userInputMatrix[row][column] = value;
		if(value.contains("/")){
			String number = value.substring(value.indexOf("/") + 1, value.length());
			try{
				this.pairwiseComparisonMatrix[row][column] = (float)(1.0 / Float.parseFloat(number.trim()));
			}
			catch(NumberFormatException ex){
				MessageBox dialog = new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
				dialog.setText("My info");
				dialog.setMessage("Cannot parse the numbers. Please verify number format.");
				dialog.open(); 
			}
		}
		else{
			this.pairwiseComparisonMatrix[row][column] = Float.parseFloat(value); // seems not to work
		}
	}
	
	public float[][] getValues(){
		return pairwiseComparisonMatrix;
	}
	
	@Override
	public String[][] getValuesAsString() {
		String[][] values = new String[super.getRowsCount()][super.getColumnsCount()];
		for(int i = 0; i < super.getRowsCount(); i++){
			for(int j = 0; j < super.getColumnsCount(); j++){
				values[i][j] = "" + pairwiseComparisonMatrix[i][j];
			}
		}
		return values;
	}
	
}
