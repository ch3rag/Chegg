#include <iostream>
using namespace std;

int main() {
	int numChickens;
	int myMoney;

	cin >> numChickens;
	cin >> myMoney;

	// If NumChickens Less Than 2
	if (numChickens < 2) {
		cout << "numChickens is less than the required amount to purchase." << endl;
	// NumChickens >= 2
	} else {
		// Declare And Initialize Int Variable Called TotalCost With NumChickens X 9
		int totalCost = numChickens * 9;
		// If TotalCost Is Less Than Or Equal To MyMoney Then
		if (totalCost <= myMoney) {
			cout << "Chickens successfully purchased." << endl;
		// Otherwise
		} else {
			cout << "Not enough money to buy all." << endl;
		}

		// If MyMoney Greater Than Or Equal To 9
		if (myMoney >= 9) {
			cout << "At lest one item was purchased." << endl;
		}
	}
}