package SampleCodes;

public class ArmstrongNumber {

	public static void arm(int num) {

		int cube = 0;
		int r;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (t == cube) {
			System.out.println("value is armstrong number");
		} else {
			System.out.println("value is not armstrong number");
		}

	}

	public static void main(String[] args) {
		arm(17);

	}

}
