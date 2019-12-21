package SampleCodes;
import java.util.HashSet;

public class DuplicateArrayRevised {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,4,5,6,7};

		findDuplicate(array);
		
	}
	
	private static void findDuplicate(int[] array) {
		
		HashSet<Integer > set = new HashSet<Integer>();
		
		for(int element: array ) {
			if(!set.add(element)) {
				System.out.println("Duplicate element is---> "+element);
			}
		}
	}



}
