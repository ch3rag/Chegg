#include <iostream>
#include <random>
using namespace std;


// CoinFlip() Function
// Flips The Coin & Returns "Heads" Or "Tails"
string CoinFlip() {
	// Rand() Function Is Used To Generate A Random Number
	// It Generates Random Number Between 0 And RAND_MAX
	// We Will Use Modulo Operator To Limit The Max Value To 1
	// Rand() % 2 Will Result In Value Either 0 Or 1
	int randomNum = rand() % 2;

	// Return Tails Or Heads According To Value Of RandomNum
	if (randomNum) {
		return "Heads";
	} else {
		return "Tails";
	}
}

int main() {
	// We Will Seed The Random Number Generator With Value 2
	// For Testing Purpose
	// This Will Make Sure Output Is Same For Every Run
	srand(2);

	// Input Number Of Coin Flips
	int numFlips;

	cout << "Enter Number Of Coin Flips: ";
	cin >> numFlips;

	// Create A Loop To Flip The Coin NumFlip Times
	for (int i = 0; i < numFlips; i++) {
		// Call CoinFlip And Save The Result
		string result = CoinFlip();
		// Display The Result Onto The Console
		cout << result << endl;
	}
}