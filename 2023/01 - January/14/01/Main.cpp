/*
 * CECS 2203, Computer Programming I Lab
 * Winter 2022, Sec. 06
 * Date: January 12, 2023
 * Topic: Lab 4 - Arrays
 * File name: lab04.cpp
 * Name: [YOUR NAME HERE], ID#[YOUR ID NUMBER HERE]
 */
// Write the Required Preprocessor Directives
#include <iostream> 
#include <time.h>
using namespace std;

// This Method Receives an Integer Array and Its Size as Parameters
void setValues(int values[], int size);

// This Method Receives an Integer Array and Its Size as Parameters
int addValues(int values[], int size);

// This Method Receives an Integer Array and Its Size as Parameters
int highest(int values[], int size);

// This Method Receives an Integer Array and Its Size as Parameters
int lowest(int values[], int size);

// This Method Receives an Integer Array and Its Size as Parameters
float average(int values[], int size);

// This Method Receives an Integer Array and Its Size as Parameters
void printValues(int values[], int size);

void personalInfo();

int main()
{
	// Declare an Integer Constant Named Size and Initialize to 7
	const int SIZE = 7;
	

	// Declare an Integer Array Named Values Using the Constant as the Size
	// and Initialize All Elements to 0
	int values[SIZE] = { 0 };

	// Call the printValues Method
	printValues(values, SIZE);

	// Call the setValues Method to Populate the Array
	setValues(values, SIZE);

	// Call the printValues Method
	printValues(values, SIZE);

	// Print the Phrase "The sum of the values in the array is [sum], the highest value is
	// [high], the lowest value is [low], and the average of all values is [average]."
	// Call the Appropriate Functions to Obtain the Sum, Highest, Lowest, and Average Values.
	cout << "The sum of the values in the array is " << addValues(values, SIZE) << ", "
		 << "the highest value is " << highest(values, SIZE) << ", the lowest value is "
		 << lowest(values, SIZE) << ", and the average of all values is " << average(values, SIZE)
		 << "." << endl;

	// Call the personalInfo Method
	personalInfo();

	// For Visual Studio only!
	system("pause");
	return 0;
}

// the setValues Method Receives an Integer Array and Its Size as Parameters and Has No
// Return Value. If Uses the Pseudo Random Number Generator Function to Assign a Value
// between 1 and 100 to Every Element of the Array. Make Sure to Seed the Pseudo Random
// Number Generator before Calling the Rand Function. The Only Variable Declared in This
// Method Is the Counter Used in the for Iteration Control Structure.
void setValues(int values[], int size) {
	srand(time(NULL));
	for (int i = 0; i < size; i++) {
		values[i] = (rand() % 100) + 1;
	}
}

// The addValues Method Receives an Integer Array and Its Size as Parameters and Returns
// an Integer Value. Declare the Local Integer Variable suma and Initialize It to 0.
// the Method Implements a for Iteration Control Structure to Add All Values in the Array
// and Returns the Sum.
int addValues(int values[], int size) {
	int suma = 0;
	for (int i = 0; i < size; i++) {
		suma += values[i];
	}
	return suma;
}

// The highest Method Receives an Integer Array and Its Size as Parameters and Returns
// an Integer Value. Declare the Local Integer Variable high and Initialize It to the
// Value of the First Element of the Array. The Method Implements a for Iteration Control
// Structure to Find Out the Highest of All Values in the Array, and Returns Such Value.
int highest(int values[], int size) {
	int high = values[0];
	for (int i = 1; i < size; i++) {
		if (high < values[i]) {
			high = values[i];
		}
	}
	return high;
}

// the lowest Method Receives an Integer Array and Its Size as Parameters and Returns
// an Integer Value. Declare the Local Integer Variable low and Initialize It to the
// Value of the First Element of the Array. The Method Implements a for Iteration Control
// Structure to Find Out the Lowest of All Values in the Array, and Returns Such Value.
int lowest(int values[], int size) {
	int low = values[0];
	for (int i = 1; i < size; i++) {
		if (low > values[i]) {
			low = values[i];
		}
	}
	return low;
}

// The average Method Receives an Integer Array and Its Size as Parameters and Returns
// a Float Value. Declare the Local Float Variable suma and Initialize It to 0.
// the Method Implements a for Iteration Control Structure to Add All Values in the Array
// and Returns the Average.
float average(int values[], int size) {
	float suma = 0.0;
	for (int i = 0; i < size; i++) {
		suma += values[i];
	}
	return suma / size;
}

// the printValues Method Receives an Integer Array and Its Size as Parameters and Has No
// Return Value. It Prints the Contents of the Array Using the Phrase
// "The values stored in the array are: [first value], ..., [last value]."
// Use a for Iteration Control Structure to Print the Values, Making Sure That a Comma and
// a Space Are Printed after All but the Last Values. A Period and the End of Line Instruction
// Must Be Printed after the Last Value. Make Sure to Add a Blank Line after the Phrase Is Printed.
void printValues(int values[], int size) {
	cout << "The values stored in the array are: ";
	for (int i = 0; i < size; i++) {
		cout << values[i];
		if (i < size - 1) {
			cout << ", ";
		} else {
			cout << "." << endl;
		}
	}
}

// the personalInfo Method Prints a Statement with Your Personal Information Using
// The Phrase "***** Program developed by [YOUR NAME], ID# [YOUR ID NUMBER] *****"
// Where the Square Brackets and the Text within Is Substituted with Your Personal
// Information. Make Sure to Add a Blank Line after the Phrase Is Printed 

void personalInfo() {
	// My Actual Name And ID Number
	string myName = "Peter Parker";
	string myIdNumber = "1234ABC";

	cout << "***** Program developed by " << myName << ", ID# " << myIdNumber << " *****" << endl;
}