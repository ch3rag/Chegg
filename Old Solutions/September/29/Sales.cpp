#include <iostream>
#include <iomanip>
#include <fstream>
#include <sstream>
#include <cmath>
#define MAX 20
using namespace std;

// Function To Perform Insertion Sort On The Records
void insertionSortRecords(string names[], int sales[], int n) {
	for (int i = 1; i < n; i++) {
		for (int j = i; j > 0 && sales[j - 1] < sales[j]; j--) {
			// Swap Sales Amount
			int salesCopy = sales[j];
			sales[j] = sales[j - 1];
			sales[j - 1] = salesCopy;

			// Swap Name
			string nameCopy = names[j];
			names[j] = names[j - 1];
			names[j - 1] = nameCopy;
		}
	}
}

// Computes Total Sales
int getTotalSales(int sales[], int n) {
	// Sum All The Sales Amount And Accumulate Them In Total
	int total = 0;
	for (int i = 0; i < n; i++) {
		total += sales[i];
	}
	// Return Total
	return total;
}

// Print Report On The Console
void displayReport(string names[], int sales[], int n) {
	// Get Total Sales
	int total = getTotalSales(sales, n);
	

	// Print Header
	cout << "-------------------------------------------------------------------" << endl;
	cout << "----------------- HOUSE FIND MONTHLY SALES REPORT -----------------" << endl;
	cout << "-------------------------------------------------------------------" << endl;
	cout << left
		 << setw(12) << "Agent Name"
		 << setw(25) << "Monthly Sales(in $1000s)"
		 << setw(25) << "Percent To Total Sales"
		 << setw(10) << "Bonus" << endl;
	cout << "-------------------------------------------------------------------" << endl;

	// Print Records
	for (int i = 0; i < n; i++) {
		// Compute Percentage Of Total Sales
		double percentOfTotal = (100.0 / total) * sales[i];
		// Format Percentage Of Total Sales
		stringstream percentOfTotalSS;
		percentOfTotalSS << fixed << setprecision(2) << percentOfTotal << " %";

		// Compute Bonus
		int bonus = ceil(total * 0.12 * percentOfTotal) / 100;

		// Print Record
		cout << setw(12) << names[i]
			 << setw(25) << "$ " + to_string(sales[i])
			 << setw(25) << percentOfTotalSS.str()
			 << setw(10) << "$ " + to_string(bonus) << endl;
	}

	// Print Total Sales
	cout << "-------------------------------------------------------------------" << endl;
	cout << setw(12) << "Total Sales"
		 << setw(25) << "$ " + to_string(total) << endl;
	cout << "-------------------------------------------------------------------" << endl;

}

// Main
int main() {
	// Parallel Arrays To Store Name And Sales Amount
	string names[MAX];
	int sales[MAX];

	// Number Of Records
	int n;

	// Open Input File
	ifstream in("Sales.txt");

	// Stores A Line From The File
	string line;

	// Read File Line By Line
	for (n = 0; getline(in, line); n++) {
		stringstream ss(line);
		ss >> names[n] >> sales[n];
	}

	// Sort The Records Based On Amount Of Sales
	// We Are Using Insertion Sort Algorithm
	insertionSortRecords(names, sales, n);

	// Display Report
	displayReport(names, sales, n);

	return 0;
}
