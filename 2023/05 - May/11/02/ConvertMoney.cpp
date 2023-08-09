#include <iostream>
#include <iomanip>
#define RATE_EUR 1.06
#define RATE_PSO 9.73
#define RATE_YEN 124.35

using namespace std;

// Program Converts American Money To Foreign Currency

// Function Prototypes
void convertMulti(float dollars, float& euros, float& pesos);
void convertMulti(float dollars, float& euros, float& pesos, float& yen);
float convertToYen(float dollars);
float convertToEuros(float dollars);
float convertToPesos(float dollars);

// Main
int main() {
	// Floats For Each Currency
	float dollars;
	float euros;
	float pesos;
	float yen;

	// Format Floats Output
	cout << fixed << showpoint << setprecision(2);

	// Convert Dollars -> Euros And Pesos
	cout << "Please input the amount of American Dollars you want converted "
		 << endl;
	cout << "to euros and pesos" << endl;
	cin >> dollars;

	// Fill In The Code To Call convertMulti With Parameters Dollars, Euros And Pesos
	convertMulti(dollars, euros, pesos);

	// Fill In The Code To Output The Value Of Those Dollars Converted To Both Euros And Pesos
	cout << "$" << dollars << " is converted to " << euros << " euros and " << pesos << " pesos" << endl << endl;

	// Convert Dollars -> Euros, Pesos And Yen
	cout << "Please input the amount of American Dollars you want converted\n";
	cout << "to euros, pesos and yen" << endl;
	cin >> dollars;

	// Fill In The Code To Call convertMulti With Parameters Dollars, Euros, Pesos, And Yen
	convertMulti(dollars, euros, pesos, yen);

	// Fill In The Code To Output The Value Of Those Dollars Converted To Euros, Pesos And Yen
	cout << "$" << dollars << " is converted to " << euros << " euros, " << pesos << " pesos and " << yen << " yen" << endl << endl;

	// Convert Dollars -> Yen
	cout << "Please input the amount of American Dollars you want converted\n";
	cout << "to yen" << endl;
	cin >> dollars;

	// Fill In The Code To Call convertToYen
	yen = convertToYen(dollars);

	// Fill In The Code To Output The Value Of Those Dollars Converted Yen
	cout << "$" << dollars << " is converted to " << yen << " yen" << endl << endl;

	// Convert Dollars -> Euros
	cout << "Please input the amount of American Dollars you want converted\n";
	cout << "to euros" << endl;
	cin >> dollars;

	// Fill In The Code To Call convertToEuros
	euros = convertToEuros(dollars);

	// Fill In The Code To Output The Value Of Those Dollars Converted To Euros
	cout << "$" << dollars << " is converted to " << euros << " euros" << endl << endl;

	// Convert Dollars -> Pesos
	cout << "Please input the amount of American Dollars you want converted\n";
	cout << "to pesos" << endl;
	cin >> dollars;

	// Fill In The Code To Call convertToPesos
	pesos = convertToPesos(dollars);

	// Fill In The Code To Output The Value Of Those Dollars Converted To Pesos
	cout << "$" << dollars << " is converted to " << pesos << " pesos" << endl << endl;

	return 0;
}

// Takes A Dollar Value And Converts To Euros And Pesos
void convertMulti(float dollars, float& euros, float& pesos) {
	// Convert Dollars To Euros
	euros = convertToEuros(dollars);
	// Convert Dollars To Pesos
	pesos = convertToPesos(dollars);
}

// Takes A Dollar Value And Converts To Euros, Pesos And Yen
void convertMulti(float dollars, float& euros, float& pesos, float& yen) {
	// Call convertMulti Overload To Convert Dollars To Euro And Pesos
	convertMulti(dollars, euros, pesos);
	// Convert Dollars To Yen
	yen = convertToYen(dollars);
}

// Converts Dollars To Euros
float convertToEuros(float dollars) {
	return dollars * RATE_EUR;
}


// Converts Dollars To Pesos
float convertToPesos(float dollars) {
	return dollars * RATE_PSO;
}

// Converts Dollars To Yen
float convertToYen(float dollars) {
	return dollars * RATE_YEN;
}
