import java.util.Arrays;
import java.util.Scanner;

// Problems.java

public class Problems {
	// Problem - 1
	public static int[] problem1(int[] arr1, int[] arr2) {
		// Create An Array Of Length Of Arr1 + Arr2
		int[] acc = new int[arr1.length + arr2.length];
		// Count Of Items In Acc
		int accCount = 0;

		// Copy Arr1 In Acc
		System.arraycopy(arr1, 0, acc, 0, arr1.length);
		accCount = arr1.length;

		// Loop  Though Each Item In Arr2
		for (int i = 0; i < arr2.length; i++) {
			// Flag To Check If Current Element Of Arr2 Is In Acc
			boolean found = false;
			// Loop Through Acc
			for (int j = 0; j < accCount; j++) {
				if (acc[j] == arr2[i]) {
					found = true;
				}
			}

			// If Current Element Of Arr2 Is Not Found In Acc, Add It
			if (!found) {
				acc[accCount++] = arr2[i];
			}
		}
		
		// Return Union Length
		return Arrays.copyOf(acc, accCount);
	}

	// Problem - 2
	public static String problem2() {
		// Create A Scanner
		Scanner input = new Scanner(System.in);
		// Create A String Builder
		StringBuilder sb = new StringBuilder();

		// While Input String Is Not "Stop"
		while (true) {
			// Get String Input
			String inputStr = input.nextLine();
			// Check If It's Empty
			if (inputStr.isEmpty()) {
				// If Yes, Throw IllegalStateException
				input.close();
				throw new IllegalStateException();
			} else if (inputStr.equalsIgnoreCase("Stop")) {
				break;
			}
			// Else, Capitalize First Letter Of Input And Lowercase Rest Of It
			inputStr = inputStr.substring(0, 1).toUpperCase() + inputStr.substring(1).toLowerCase();
			// Append It To StringBuilder
			sb.append(inputStr + "#");
		}

		// Clean Up
		input.close();
		// Return The Result
		return sb.substring(0, sb.length() - 1);
	}

	// Problem - 3
	public static String[] problem3(String[] arr) {
		// Create A Result Array Of Length Of Arr
		String[] result = new String[arr.length];
		// Count Of Items In Result Array
		int count = 0;
		// Loop Through Array Arr
		for (int i = 0; i < arr.length; i++) {
			// If Current Item In Arr Is Less Than Or Equal To 5 Characters In Length
			if (arr[i].length() <= 5) {
				// Add It To Result
				result[count++] = arr[i];
			}
		}

		// Result Sub-Array Of Result
		return Arrays.copyOf(result, count);
	}

	// Problem - 4
	public static int problem4(int[] arr) {
		// Sum
		int sum = 0;
		// Loop Through Arr
		for (int i = 0; i < arr.length; i++) {
			// If Current Item In Arr Is Two Digit
			if (arr[i] >= 10 && arr[i] <= 99) {
				// Add It To Sum
				sum += arr[i];
			}
		}

		// Return The Sum
		return sum;
	}

	// Main
	// Problem - 5
	public static void main(String[] args) {
		// Test Problem - 1
		System.out.println("Problem - 1\n");
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {4, 5, 6, 7, 8};

		int[] union = problem1(array1, array2);

		System.out.println("Union: "  + Arrays.toString(union));

		// Test Problem - 2
		System.out.println("\nProblem - 2\n");
		System.out.println(problem2());

		// Test Problem - 3
		System.out.println("\nProblem - 3\n");
		String[] array3 = {"python", "java", "javascript", "c++"};
		System.out.println(Arrays.toString(problem3(array3)));

		// Test Problem - 4
		System.out.println("\nProblem - 4\n");
		int[] array4 = {21, 5, 125, 56, 9, 280, 23, 100};
		System.out.println("Sum: " + problem4(array4));
	}
}
