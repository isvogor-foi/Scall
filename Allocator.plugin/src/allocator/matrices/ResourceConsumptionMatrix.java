package allocator.matrices;

@SuppressWarnings("unused")
public class ResourceConsumptionMatrix {

	private static ResourceConsumptionMatrix instance;
	private int[][][] resourceConsumptionMatrix; 
	
	private int rows;
	private int columns;
	private int depth;
	
	private ResourceConsumptionMatrix(){}
	
	public static ResourceConsumptionMatrix getInstance(){
		if(instance == null) {
			instance = new ResourceConsumptionMatrix();
		}
		return instance;
	}
	
	public void setSize(int depth, int rows, int columns){
		this.depth = depth;
		this.rows = rows;
		this.columns = columns;
		resourceConsumptionMatrix = new int[depth][rows][columns];
		
		for(int i = 0; i < resourceConsumptionMatrix.length; i++){
			for(int j = 0; j < resourceConsumptionMatrix[0].length; j++){
				for(int k = 0; k < resourceConsumptionMatrix[0][0].length; k++){
					resourceConsumptionMatrix[i][j][k] = 0;
				}
			}
		}
	}
	
	public void printMatrix(){
		for(int i = 0; i < resourceConsumptionMatrix.length; i++){
			for(int j = 0; j < resourceConsumptionMatrix[0].length; j++){
				for(int k = 0; k < resourceConsumptionMatrix[0][0].length; k++){
					System.out.print(" " + resourceConsumptionMatrix[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("---");
		}
	}
	
	public void setValue(int depth, int row, int column, int value){
		resourceConsumptionMatrix[depth][row][column] = value; 
	}
	
	public int[][][] getValues(){
		return resourceConsumptionMatrix;
	}
	
	private int getRowsCount(){
		return rows;
	}
	
	public int getColumnsCount(){
		return columns;
	}
	
	public int getDepthCount(){
		return depth;
	}
	
}
