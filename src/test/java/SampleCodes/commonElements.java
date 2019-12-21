package SampleCodes;
import java.util.Arrays;
import java.util.HashSet;

public class commonElements {

	public static void main(String[] args) {
		
		
		int[] i1 = {1,2,3,4,5,6,7,8};
		int[] i2 = {5,6,7,8,9,10,11,12};
		
		HashSet<int[]> set1 = new HashSet<int[]>(Arrays.asList(i1));
		HashSet<int[]> set2 = new HashSet<int[]>(Arrays.asList(i2));
		
		set1.retainAll(set2);
		System.out.println(set1);

	}

}
