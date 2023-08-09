#include <iostream>
using namespace std;

// Returns True If The String Only Contains Digits Or Space
// Also Returns Number Of Blank Spaces
bool isSimpleDigitAndBlanks(const char * str, int &numSpaces) {
	// Flag To Track If The String Only Contains Digits Or Spaces
	bool isValid = true;
	// Re-Initialize NumSpaces
	numSpaces = 0;
	// Loop Until End Of String
	for (int i = 0; *(str + i) != '\0'; i++) {
		// Get Current Character
		char ch = *(str + i);
		// If Character is A Space, Increment NumSpaces And
		// Skip Rest Of The Loop
		if (ch == ' ') {
			numSpaces++;
			continue;
		}

		// If String Contains Any Character Other Than 0..9
		// Set Flag To False
		if (isValid && (ch < '0' || ch > '9')) {
			isValid = false;
		}
	}
	// Return IsValid
	return isValid;
}

// Test The Code Using Main
int main() {
	// Number of Spaces
	int numSpaces;
	// Input String
	string input;

	// Input A String From The User
	cout << "Enter A String: ";
	getline(cin, input);

	// Check Validity And Count Spaces
	bool result = isSimpleDigitAndBlanks(input.c_str(), numSpaces);

	// Display The Result
	cout << "isSimpleDigitsAndBlanks(" << input << ") = " << (result? "True" : "False")
		 << ", Spaces = " << numSpaces << endl << endl;

	return 0;		
}