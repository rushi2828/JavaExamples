package SampleCodes;

public class ReverseStringRevised {

	public static void main(String[] args) {

		// Iterative method

		String str = "I am Engineer";

		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(strArray[i]);
		}

	}
	
	
    //Recursive method
	static String resursiveMethod(String str1) {
		
		if((null==str1) || (str1.length()<=1)) {
			return str1;
			
		}
		
		return resursiveMethod(str1.substring(1) + str1.charAt(0));
		

	
		
	}

}
