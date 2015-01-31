package allocator.matrices;

public abstract class Matrix {
	private String[] rowNames;
	private String[] columnNames;
	
	private int rows;
	private int columns;
	
	public void setRowNames(int rowNumber, String value){
		rowNames[rowNumber] = value;
	}
	
	public void setColumnNames(int columnNumber, String value){
		columnNames[columnNumber] = value;
	}
	
	public int getRowsCount(){
		return rows;
	}
	
	public void setRowNamesArray(String[] rowNames) {
		System.out.println("changing row names");
		this.rowNames = rowNames;
	}

	public void setColumnNamesArray(String[] columnNames) {
		System.out.println("changing col names");
		this.columnNames = columnNames;
	}

	public int getColumnsCount(){
		return columns;
	}
	
	public String[] getRowNames() { return rowNames; }
	public String[] getColumnNames() { return columnNames; }

	public void setRows(int rows) {
		this.rows = rows;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public String[][] getValuesAsString() {
		return null;
	}
	
	public void printMatrix(){}

	
}
