import java.util.Arrays;

public class BubbleSort {

	// Uses Bubble Sort Algorithm To Sort Array Of Comparable Objects
	// An Object Of Type T Is Comparable If It Extends Comparable<T> Interface
	// Hence Providing An Implementation Of int compareTo() Method
	// Algorithm:
	// The Flag "Swap" Is Set To True Initially, It Denotes Whether Any Swaps
	// Were Performed During Iteration
	// While Flag "Swap" Is True:
	//		Set Flag "Swap" To False
	// 		Iterate Through Each Element In The Array Except Last
	// 			If Two Adjacent Elements (I & I + 1) Are Out Of Order Then:
	// 				Swap Them And Set Flag "Swap" To True
	public static <T extends Comparable<T>> void bubbleSort(T [] arr) {
		// Initially Swap Is True
		boolean swap = true;
		while (swap) {
			// Set Swap To False
			swap = false;
			// Loop From I = 0 To N - 1
			for (int i = 0; i < arr.length - 1; i++) {
				// Compare Adjacent Items
				if (arr[i].compareTo(arr[i + 1]) == 1) {
					// Out Of Order, Swap Them
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					// Set Swap Flag
					swap = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// Test Bubble Sort
		Integer[] intArray = {0, -1, 5, 2, 8, -9, 1};
		Double[] doubleArray = {1.0, 3.14, 9.8, 1.67, -3.4, 0.001, 0.232};

		// Sort
		bubbleSort(intArray);
		bubbleSort(doubleArray);
		
		// Display
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(doubleArray));
	}
}
