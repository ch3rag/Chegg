#include <iostream>
#include <limits.h>
#include <vector>
#include <cmath>
using namespace std;

// Returns The Maximum Number In The Vector
int GetMaxInt(vector<int> listInts) {
	// Assign Max Minimum Possible Value
	int max = INT_MIN;
	// Loop Through Each Number In The Vector
	for (int i = 0; i < listInts.size(); i++) {
		// If Current Value Is Greater Than Max
		if (listInts[i] > max) {
			// Assign Max To Current Value
			max = listInts[i];
		}
	}

	// Return Maximum Value
	return max;
}

// Print Normalized Vector
void PrintDiffMax(vector<int> listInts) {
	// Get Maximum Value
	int max = GetMaxInt(listInts);
	// Loop Through Each Value In The Vector
	for (int i = 0; i < listInts.size(); i++) {
		// Normalized Value = |Current - Max|
		cout << abs(listInts[i] - max) << " ";
	}
}

int main() {
	// N = Number Of Integers
	// V = Temporary Variable To Hold Input
	int n, v;

	// Input Count Of Integers
	cin >> n;

	// Create A Vector
	vector<int> listInts;

	// Loop N Times
	for (int i = 0; i < n; i++) {
		// Input A Value And Add It To Vector
		cin >> v;
		listInts.push_back(v);
	}

	// Print Normalized Vector
	PrintDiffMax(listInts);

	return 0;
}