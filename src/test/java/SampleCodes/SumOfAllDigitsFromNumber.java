package SampleCodes;

public class SumOfAllDigitsFromNumber {

	public static void main(String[] args) {
			
		sumOfallDigits(12345);
	}
	
	static void sumOfallDigits(int digit){
		
		int sum = 0;
		
		while(digit!=0) {
			int lastDigit = digit%10;
			
			sum += lastDigit;
			
			digit = digit/10;
			
		}
		
		System.out.println("Sum of all the int value is ----> "+sum);
		
		
	}

}
