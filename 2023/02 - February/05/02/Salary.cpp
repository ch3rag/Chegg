#include <iostream>
using namespace std;

// Main
int main() {
	// Declare Vars
	int workedHours;

	// Pay Rate
	const double PAY_RATE = 50.0;

	// Read Worked Hours From The User
	cout << "Input Worked Hours: ";
	cin >> workedHours;

	// Calculate Basic Salary
	double basicSalary = workedHours * PAY_RATE;

	// Calculate TAX
	double tax = basicSalary * 0.15;

	// Calculate Net Salary
	double netSalary = basicSalary - tax;

	// Display Result
	cout << "Pay Rate: " << PAY_RATE << " SAR/Hour" << endl;
	cout << "Basic Salary: " << basicSalary << " SAR" << endl;
	cout << "Tax: " << tax << " SAR" << endl;
	cout << "Net Salary: " << netSalary << " SAR" << endl;

}