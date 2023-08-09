#include <stdio.h>

// Part - A
// Prints All The Integers Larger Than 5
void printLargerThanFive(int arr[], int size) {
	printf("Integers Larger Than 5: ");
	// Loop Through The Array
	for (int i = 0; i < size; i++) {
		// Check If The Current Integer Is Greater Than 5
		if (arr[i] > 5) {
			// Print It
			printf("%d ", arr[i]);
		}
	}
	printf("\n");
}

// Part - B
// Returns The Number Of Odd Values In The Array
int numOddValues(int arr[], int size) {
	// Accumulator For Number Of Odd Values
	int count = 0;
	// Loop Through The Array
	for (int i = 0; i < size; i++) {
		// Check If The Current Integer Is Odd
		if (arr[i] % 2 == 1) {
			// Increment Accumulator
			count++;
		}
	}
	// Return The Count
	return count;
}

// Part - C
// Returns The Sum Of All Even Number In The Array
int sumEvenValues(int arr[], int size) {
	// Accumulator For Sum Of Odd Values
	int sum = 0;
	// Loop Through The Array
	for (int i = 0; i < size; i++) {
		// Check If The Current Integer Is Even
		if (arr[i] % 2 == 0) {
			// Add Current Array Value To Accumulator
			sum += arr[i];
		}
	}
	// Return Sum
	return sum;
}

// Part - D
// Returns 1 If All Elements Of Array - 1 Are Smaller Than Array Array - 2
// Returns 0 Otherwise
int isArr1SmallerThanArr2(int arr1[], int size1, int arr2[], int size2) {
	// Loop Through Arr1
	for (int i = 0; i < size1; i++) {
		// Loop Through Arr2
		for (int j = 0; j < size2; j++) {
			// Check If Current Element Of Arr1 Is Greater Than Arr2
			if (arr1[i] > arr2[j]) {
				return 0;
			}
		}
	}
	return 1;
}

// Main
int main() {
	// Sample Array
	int array[] = {3, 5, 8, 9, 7, 2, 0, 10};

	// Display Array
	printf("Test Array: ");
	for (int i = 0; i < 8; i++) {
		printf("%d ", array[i]);
	}
	printf("\n");
	
	// Test Part - A
	printLargerThanFive(array, 8);

	// Test Part - B
	int numOdds = numOddValues(array, 8);
	printf("Number Of Odd Values: %d\n", numOdds);

	// Test Part - C
	int sumOfEvens = sumEvenValues(array, 8);
	printf("Sum Of Even Values: %d\n", sumOfEvens);

	//  Test Part - D
	int arr1[] = {1, 5, 3};
	int arr2[] = {8, 7};
	printf("All Elements Of Arr1 < Arr2? %d\n", isArr1SmallerThanArr2(arr1, 3, arr2, 2));
	printf("All Elements Of Arr1 < Array? %d\n", isArr1SmallerThanArr2(arr1, 3, array, 8));
	return 0;
}