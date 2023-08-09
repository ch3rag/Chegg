#include <iostream>
#define MAX 5
using namespace std;

// Function Prototypes
int * inputArray(int);
void displayArray(string, int *, int);
void getEvenNumbers(int *, int, int *, int&);
void getOddNumbers(int *, int, int *, int&);
void getPositiveNumbers(int *, int, int *, int&);
void getNegativeNumbers(int *, int, int *, int&);

int main() {

	// Size Of Input Array
	string choice = "y";
	int arr[MAX], evens[MAX], odds[MAX], positives[MAX], negatives[MAX];
	int evenSize, oddSize, positiveSize, negativeSize;

	do {
		// Input Array Of Size Using Helper Function
		int * arr = inputArray(MAX);

		// Display User Input
		displayArray("Your Input: ", arr, MAX);

		// Get Even Numbers
		getEvenNumbers(arr, MAX, evens, evenSize);
		// Display Even Numbers
		if (evenSize > 0) displayArray("The Even Integers Are: ", evens, evenSize);

		// Get Odd Numbers
		getOddNumbers(arr, MAX, odds, oddSize);
		// Display Odd Numbers
		if (oddSize > 0) displayArray("The Odd Integers Are: ", odds, oddSize);

		// Get Positive Numbers
		getPositiveNumbers(arr, MAX, positives, positiveSize);
		// Display Positive Numbers
		if (positiveSize > 0)  displayArray("The Positive Integers Are: ", positives, positiveSize);

		// Get Negative Numbers
		getNegativeNumbers(arr, MAX, negatives, negativeSize);
		// Display Negative Numbers
		if (negativeSize > 0) displayArray("The Negative Integers Are: ", negatives, negativeSize);
		
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


// Populates The Evens Array With Even Numbers
void getEvenNumbers(int * arr, int size, int * evens, int& evenSize) {
	evenSize = 0;
	for (int i = 0; i < size; i++) {
		if (arr[i] % 2 == 0) {
			evens[evenSize++] = arr[i];
		}
	}
}

// Populates The Odds Array With Odd Numbers
void getOddNumbers(int * arr, int size, int * odds, int& oddSize) {
	oddSize = 0;
	for (int i = 0; i < size; i++) {
		if (abs(arr[i]) % 2 == 1) {
			odds[oddSize++] = arr[i];
		}
	}
}

// Populates The Positives Array With Positive Numbers
void getPositiveNumbers(int * arr, int size, int * positives, int& positiveSize) {
	positiveSize = 0;
	for (int i = 0; i < size; i++) {
		if (arr[i] > 0) {
			positives[positiveSize++] = arr[i];
		}
	}
}

// Populates The Negatives Array With Negative Numbers
void getNegativeNumbers(int * arr, int size, int * negatives, int& negativeSize) {
	negativeSize = 0;
	for (int i = 0; i < size; i++) {
		if (arr[i] < 0) {
			negatives[negativeSize++] = arr[i];
		}
	}
}
