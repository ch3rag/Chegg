import java.util.Arrays;

// Test Class
public class TestSorter {
	// Main
	public static void main(String[] args) {
		// Array To Sort
		int[] numbers = {4, 10, 7, 2, 1, 6, 9, 3, 8, 5};
		
		// Before Sort
		System.out.println("Before Sort: " + Arrays.toString(numbers));

		// Sort The Array
		Sorter.sort(numbers);

		// After Sort
		System.out.println("After Sort:  " + Arrays.toString(numbers));
		Sorter.sort(numbers);
	}
}
