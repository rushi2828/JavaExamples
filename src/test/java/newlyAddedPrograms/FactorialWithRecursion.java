package newlyAddedPrograms;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
	
	public static int factorial(int a) {
		if(a==1) {
			return 1;
		}
		
			return (a * (a-1));
						
	}

}
