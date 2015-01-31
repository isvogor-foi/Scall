package allocator.matrices;

@SuppressWarnings("unused")
public class BandwithMatrix extends Matrix{
	private static BandwithMatrix instance;
	private float[][] bandwithMatrix; 

	
	private BandwithMatrix(){}
	
	public static BandwithMatrix getInstance(){
		if(instance == null) {
			instance = new BandwithMatrix();
		}
		return instance;
	}
	
	public void setSize(int rows, int columns){
		super.setRows(rows);
		super.setColumns(columns);
		
		bandwithMatrix = new float[rows][columns];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j< columns;j++){
				bandwithMatrix[i][j] = 0;
			}
		}
	}
	
	@Override
	public void printMatrix(){
		for(int i=0; i<bandwithMatrix.length; i++){
			for(int j=0; j< bandwithMatrix[0].length;j++){
				System.out.print(" " + bandwithMatrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setValue(int row, int column, float value){
		bandwithMatrix[row][column] = value; 
	}
	
	public float[][] getValues(){
		return bandwithMatrix;
	}
	
	@Override
	public String[][] getValuesAsString() {
		String[][] values = new String[super.getRowsCount()][super.getColumnsCount()];
		for(int i = 0; i < super.getRowsCount(); i++){
			for(int j = 0; j < super.getColumnsCount(); j++){
				values[i][j] = "" + bandwithMatrix[i][j];
			}
		}
		return values;
	}
	
}
