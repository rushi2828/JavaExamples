package SampleCodes;

public class SecondLargetNumber {

	public static void main(String[] args) {
		
		secondLargestNumber(new int[] {34, 45, 55, 66,77});

	}

	static int secondLargestNumber(int[] input) {
		int largestNumber, secondlargestNumber;

		if (input[0] > input[1]) {
			largestNumber = input[0];
			secondlargestNumber = input[1];
		}

		else {
			largestNumber = input[1];
			secondlargestNumber = input[0];
		}
		
		for(int i =2; i<input.length; i++) {
			if(input[i] > largestNumber) {
				secondlargestNumber = largestNumber;
				largestNumber = input[i];
			}
			else if (input[i] < largestNumber && input[i] > secondlargestNumber)
            {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
 
				secondlargestNumber = input[i];
            }
        }
 
        return secondlargestNumber;
			
		}

	}

