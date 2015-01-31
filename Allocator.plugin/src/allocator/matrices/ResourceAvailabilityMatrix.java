package allocator.matrices;

public class ResourceAvailabilityMatrix extends Matrix{
	private static ResourceAvailabilityMatrix instance;
	private int[][] resourceAvailabilityMatrix; 

	private ResourceAvailabilityMatrix(){}
	
	public static ResourceAvailabilityMatrix getInstance(){
		if(instance == null) {
			instance = new ResourceAvailabilityMatrix();
		}
		return instance;
	}
	
	public void setSize(int rows, int columns){
		this.setRows(rows);
		this.setColumns(columns);
		
		resourceAvailabilityMatrix = new int[rows][columns];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j< columns;j++){
				resourceAvailabilityMatrix[i][j] = 0;
			}
		}
	}
	
	@Override
	public void printMatrix(){
		for(int i=0; i<resourceAvailabilityMatrix.length; i++){
			for(int j=0; j< resourceAvailabilityMatrix[0].length;j++){
				System.out.print(" " + resourceAvailabilityMatrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setValue(int row, int column, int value){
		resourceAvailabilityMatrix[row][column] = value; 
	}
	
	public int[][] getValues(){
		return resourceAvailabilityMatrix;
	}
	
	@Override
	public String[][] getValuesAsString() {
		String[][] values = new String[super.getRowsCount()][super.getColumnsCount()];
		for(int i = 0; i < super.getRowsCount(); i++){
			for(int j = 0; j < super.getColumnsCount(); j++){
				values[i][j] = "" + resourceAvailabilityMatrix[i][j];
			}
		}
		return values;
	}
}
