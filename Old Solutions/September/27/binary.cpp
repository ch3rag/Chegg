#include <iostream>
using namespace std;

// Performs Binary Search On The Sorted Array
int binarySearch(int arr[], int min, int max, int key) {
	// If Search Is In Valid Range
	if (min <= max) {
		// Find Middle Index Of This Range
		int middle = min + (max - min) / 2;
		// If Middle Element Equals Key, Return The Index
		if (arr[middle] == key) {
			return middle;
		} else if (arr[middle] > key) {
			// If Middle Element Is Greater Than The  Key
			// We Need To Search In The Left Part Of The Range
			return binarySearch(arr, min, middle - 1, key);
		} else {
			// Else Middle Element Is Less Than The  Key
			// We Need To Search In The Right Part Of The Range
			return binarySearch(arr, middle + 1, max, key);
		}
	}
	// Min > Max
	// Key Not Found
	return -1;
}

// Sorts The Array In Ascending Order
// Using Insertion Sort Algorithm
void insertionSort(int arr[], int n) {
	for (int i = 1; i < n; i++) {
		for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
			int copy = arr[j];
			arr[j] = arr[j - 1];
			arr[j - 1] = copy;
		}
	}
}

// Prints The Array
void printArr(int arr[], int n) {
	for (int i = 0; i < n; i++) {
		cout << arr[i] << " ";
	}
	cout << endl;
}

// Test Binary Search Using Main()
int main() {
	// Key
	int key;

	// Declare A Test Array Of 10 Elements
	int arr[10] = { -1, 15, 2, 5, 7, -15, 22, 12, 77, 1 };
	
	// Print The Array Before Sorting
	cout << "Array Before Sorting: ";
	printArr(arr, 10);

	// Sort The Array Using Insertion Sort Algorithm
	insertionSort(arr, 10);

	// Print The Array After Sorting
	cout << "Array After Sorting: ";
	printArr(arr, 10);

	// Input Key
	cout << "Enter Key To Find: ";
	cin >> key;

	// Use Binary Search To Find The Key
	int index = binarySearch(arr, 0, 9, key);

	// Print Result
	if (index != -1) {
		cout << key << " Is Located At Index: " << index << endl;
	} else {
		cout << "Key Not Found!";
	}
	
	// Print Empty Line
	cout << endl;
	return 0;
}
