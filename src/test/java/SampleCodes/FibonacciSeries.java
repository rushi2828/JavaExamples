package SampleCodes;

public class FibonacciSeries {
	
	public static int fibonaci(int num) {
		if(num==0)
			return 1;
		num = num*(num-1);
				return num;
			
	}
	
	//With recurcive
	public static int fibo(int num) {
		if(num==0)
			return 1;
		
		num=num*fibo(num-1);
		
		return num;
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(fibonaci(3));
//		System.out.println(fibo(3));
		
		String string = "test one, this";
		String[] parts = string.split(",");
		int part = parts.length;
		System.out.println(part);
//		String part1 = parts[0]; // 004
//		String part2 = parts[1];
		
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		

	}


}
