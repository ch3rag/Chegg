#include <stdio.h>
#include <malloc.h>
#include <math.h>

// Function Prototypes
int * getData(int);
void calcMeanAndStdDev(int *, int);

// Main
int main() {
	// Size Of Array
	int n;
	// Input The Size Of The Array From The User
	printf("Enter a Positive Integer For Array Size: ");
	scanf("%d", &n);

	// Call GetData() To Get An Array Of Size = N
	int * arr = getData(n);

	// Display Mean And Standard Deviation By Calling Appropriate Function
	calcMeanAndStdDev(arr, n);

	// Free Memory
	free(arr);
	return 0;
}

// Function Definition

// Creates & Inputs An Array of Size N From The User
// Returns The Pointer To The Array To The Caller
int * getData(int n) {
	// Create Am Array of Size N
	int * arr = malloc(sizeof(int) * n);
	// Input Array From The User
	printf("Enter %d Integers:\n", n);

	for (int i = 0; i < n; i++) {
		scanf("%d", arr + i);
	}

	// Return The Array Pointer To The Caller
	return arr;
}

// Calculates The Mean And Standard Deviation Of An Array Of Integers
// And Displays It On The Console
// Params: Arr = Pointer To Array And N = Size Of The Array
void calcMeanAndStdDev(int * arr, int n) {
	// Calculate The Sum Of The Array
	int sum = 0;
	for (int i = 0; i < n; i++) {
		sum += *(arr + i);
	}

	// Calculate Mean
	double mean = (double)sum / n;

	// Calculate Standard Deviation
	double stdDev = 0;
	for (int i = 0; i < n; i++) {
		stdDev += pow((*(arr + i) - mean), 2);
	}

	stdDev /= n;
	stdDev = sqrt(stdDev);

	// Display Mean
	printf("Mean = %.2f\n", mean);
	// Display Standard Deviation
	printf("Standard Deviation = %.2f\n", stdDev);
}