package FromVSCodeJava;

public class PatternProblems {
	public static void main(String[] args) {
//		pp1(5);
		pp2(5);
//		pp3(5);
//		demo(5);
	}

	// Right angle program-->
	// *
	// * *
	// * * *
	// * * * *
	// * * * * *
	private static void pp1(int count) {
		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("<------------->");
	}

	// Pyramid triangle
	//     *
	//    * *
	//   * * *
	//  * * * *
	// * * * * *
	//
	public static void pp2(int count) {
		for (int i = 1; i <= count; i++) { // outer loop for no. of rows
			for (int j = 0; j< count - i; j++) { // inner loop to handle number of spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("<------------->");
	}

	// Reverse pyramid
	// * * * * *
	// * * * *
	// * * *
	// * *
	// *
	public static void pp3(int count) {
		for (int i = count; i >= 1; --i) { // outer loop for no. of rows
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("<------------->");
	}
	
	
	
	//Practising purpose
	public static void demo(int count) {
		for (int i = 1; i <= count; i++) { // outer loop for no. of rows
			for (int j = 0; j< count - i; j++) { // inner loop to handle number of spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("<------------->");
	}
}
