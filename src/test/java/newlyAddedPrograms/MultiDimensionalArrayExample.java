package newlyAddedPrograms;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2},{3,4},{5,6},{7,8}};
		print2D(arr);
		
	}
	
	public static void print2D (int arr[][]) {
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {     // Check condiiton
				System.out.print(arr[i][j]+" ");
			}
		}
	

	}
}
