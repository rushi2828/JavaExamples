package SampleCodes;

public class PalindromeNumber {

	public static void main(String[] args) {
		paliindrome(151);

	}

	
	public static void paliindrome(int num) {
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;  // 
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is not palindrome");
		}
		
	}
}
