#include <iostream>
using namespace std;

// Function Prototypes
int * inputArray(int);
void displayArray(string, int *, int);
int * filterArray(int *, int, bool (*)(int), int&);
bool isEven(int);
bool isOdd(int);
bool isPositive(int);
bool isNegative(int);

int main() {

	// Size Of Input Array
	int size = 20;
	string choice = "y";

	do {
		// Input Array Of Size Using Helper Function
		int * arr = inputArray(size);

		// Display User Input
		displayArray("Your Input: ", arr, size);

		// Get Even Numbers
		int evenSize;
		int * evenNumbers = filterArray(arr, size, isEven, evenSize);
		// Display Even Numbers
		if (evenSize > 0) {
			displayArray("The Even Integers Are: ", evenNumbers, evenSize);
			delete evenNumbers;
		}

		// Get Odd Numbers
		int oddSize;
		int * oddNumbers = filterArray(arr, size, isOdd, oddSize);
		// Display Odd Numbers
		if (oddSize > 0) {
			displayArray("The Odd Integers Are: ", oddNumbers, oddSize);
			delete oddNumbers;
		}

		// Get Positive Numbers
		int positiveSize;
		int * positiveNumbers = filterArray(arr, size, isPositive, positiveSize);
		// Display Positive Numbers
		if (positiveSize > 0) {
			displayArray("The Positive Integers Are: ", positiveNumbers, positiveSize);
			delete positiveNumbers;
		}

		// Get Negative Numbers
		int negativeSize;
		int * negativeNumbers = filterArray(arr, size, isNegative, negativeSize);
		// Display Negative Numbers
		if (negativeSize > 0) {
			displayArray("The Negative Integers Are: ", negativeNumbers, negativeSize);
			delete negativeNumbers;
		}

		delete arr;

		cout << "Would you like you process another 20 integers?" << endl
			 << "Press enter 'y' for Yes and 'n' for No: ";
		cin >> choice;
	} while(choice == "y");

	return 0;
}

// Inputs Array Of Arbitrary Size
int * inputArray(int size) {
	int * arr = new int[size];
	cout << "Please Enter " << size << " Integers." << endl;
	for (int i = 0; i < size; i++) {
		cout << "Integer [" << (i + 1) << "]: ";
		cin >> arr[i];
	}
	return arr;
}

// Displays Array Of Arbitrary Size
void displayArray(string message, int * arr, int size) {
	cout << message << endl;
	for (int i = 0; i < size; i++) {
		cout << " " << arr[i];
	}
	cout << endl;
}

// Filters The Array Based On The Function
// Arr = Input Array, Size = Input Array Size
// filterFn = A Function That Takes An Int And Returns A Bool
// outSize = Size Of Output Array
int * filterArray(int * arr, int size, bool (*filterFn)(int), int& outSize) {
	// Count Number Of Elements Of Output Array
	outSize = 0;
	for (int i = 0; i < size; i++) {
		if (filterFn(arr[i])) {
			outSize++;
		}
	}
	// Create New Array 
	int * outArr = NULL;

	if (outSize > 0) {
		outArr = new int[outSize];
		// Populate It
		for (int i = 0, j = 0; i < size; i++) {
			if (filterFn(arr[i])) {
				outArr[j++] = arr[i];
			}
		}
	}

	return outArr;
}

// Returns If The Number Is Even
bool isEven(int n) {
	return n % 2 == 0;
}

// Returns If The Number Is Odd
bool isOdd(int n) {
	return abs(n) % 2 == 1;
}

// Returns If The Number Is Positive
bool isPositive(int n) {
	return n > 0;
}

// Returns If The Number Is Negative
bool isNegative(int n) {
	return n < 0;
}
