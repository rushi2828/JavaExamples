package SampleCodes;
import java.util.HashSet;

public class duplicateArray {

	public static void main(String[] args) {

		int[] test = { 1, 17, 3, 4, 5, 2, 7 };

		findDuplicate(test);
	}

	public static void findDuplicate(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int element : array) {
			if (!set.add(element)) {
				System.out.println("Duplicate Element :" + element);
			}
		}
		System.out.println("There is no duplicate value");

	}

}
