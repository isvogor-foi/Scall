package allocator.matrices;

@SuppressWarnings("unused")
public class PlatformCommunicationMatrix extends Matrix{
	private static PlatformCommunicationMatrix instance;
	private float[][] platformCommunicationMatrix; 

	private PlatformCommunicationMatrix(){}
	
	public static PlatformCommunicationMatrix getInstance(){
		if(instance == null) {
			instance = new PlatformCommunicationMatrix();
		}
		return instance;
	}
	
	public void setSize(int rows, int columns){
		super.setRows(rows);
		super.setColumns(columns);
		platformCommunicationMatrix = new float[rows][columns];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j< columns;j++){
				platformCommunicationMatrix[i][j] = 0;
			}
		}
	}
	
	@Override
	public void printMatrix(){
		for(int i=0; i<platformCommunicationMatrix.length; i++){
			for(int j=0; j< platformCommunicationMatrix[0].length;j++){
				System.out.print(" " + platformCommunicationMatrix[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void setValue(int row, int column, float value){
		platformCommunicationMatrix[row][column] = value; 
	}
	
	public float[][] getValues(){
		return platformCommunicationMatrix;
	}
	
	@Override
	public String[][] getValuesAsString() {
		String[][] values = new String[super.getRowsCount()][super.getColumnsCount()];
		for(int i = 0; i < super.getRowsCount(); i++){
			for(int j = 0; j < super.getColumnsCount(); j++){
				values[i][j] = "" + platformCommunicationMatrix[i][j];
			}
		}
		return values;
	}
}
