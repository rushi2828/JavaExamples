package SampleCodes;

public class PrintPyramidStar {

	public static void main(String[] args) {
		printPyramid(5);
		
	}
	
	public static void printPyramid(int n) {
		
		for(int i=0; i<=n; i++){
			for(int j=2*(n-1); j>=0; j--) {
				
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}

	
