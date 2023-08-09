// Main.cpp
#include <iostream>
using namespace std;

int main() {

	// Initialize Number Of Attempts And N
	int n, attempts = 0;
	do {
		cout << "Enter a number divisible 5 & 10 both: ";
		cin >> n;
		attempts++;
	} while (!(n % 5 == 0 && n % 10 == 0));

	// Display N And The Number Of Attempts Taken
	cout << "The number entered is : " << n << "." << endl;
	cout << "The number of attempts taken is : " << attempts << "." << endl;

	return 0;
}