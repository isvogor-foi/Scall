package allocator.matrices;

@SuppressWarnings("unused")
public class CommunicationMatrix extends Matrix{
	private static CommunicationMatrix instance;
	private int[][] communicationMatrix; 
	
	private CommunicationMatrix(){}
	
	public static CommunicationMatrix getInstance(){
		if(instance == null) {
			instance = new CommunicationMatrix();
		}
		return instance;
	}
	
	public void setSize(int rows, int columns){
		super.setRows(rows);
		super.setColumns(columns);
		communicationMatrix = new int[rows][columns];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j< columns;j++){
				communicationMatrix[i][j] = 0;
			}
		}
	}
	
	@Override
	public void printMatrix(){
		for(int i=0; i<communicationMatrix.length; i++){
			for(int j=0; j< communicationMatrix[0].length;j++){
				System.out.print(" " + communicationMatrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setValue(int row, int column, int value){
		communicationMatrix[row][column] = value; 
	}
	
	public int[][] getValues(){
		return communicationMatrix;
	}
	
	@Override
	public String[][] getValuesAsString() {
		String[][] values = new String[super.getRowsCount()][super.getColumnsCount()];
		for(int i = 0; i < super.getRowsCount(); i++){
			for(int j = 0; j < super.getColumnsCount(); j++){
				values[i][j] = "" + communicationMatrix[i][j];
			}
		}
		return values;
	}

}
