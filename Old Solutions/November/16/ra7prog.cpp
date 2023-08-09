#include <iostream>
#include <fstream>
#include <stack>
#include <string>
using namespace std;

bool BalancedDelimiters(string & inputString) {
	// Create A Stack To Hold Characters
	stack<char> myStack;

	// Scan The String
	for (int i = 0; i < inputString.length(); i++) {
		// Get Current Character
		char ch = inputString[i];
		// If Character is Opening Braces, Push It Onto Stack
		if (ch == '(' || ch == '[' || ch == '{') {
			myStack.push(ch);
		}

		// If Character is Closing Braces Then
		if (ch == ')' || ch == ']' || ch == '}') {
			
			// If Stack is Empty, String Does Not Contain Balanced Delimiters
			// CASE 4
			if (myStack.empty()) {
				cout << "Stack is empty and the scanning of input string is not completed." << endl;
				return false;
			}

			// Peek The Top Element Of Stack
			char top = myStack.top();
			if ((top != '(' && ch == ')')
				|| (top != '[' && ch == ']')
				|| (top != '{' && ch == '}')) {
					// Mismatched Braces
					// CASE 3
					cout << "Stack is not empty and the scanning of input string is not completed." << endl;
					return false;
			} else {
				// Matched Braces
				myStack.pop();
			}
		}
	}

	if (myStack.empty()) {
		// CASE 1
		cout << "Stack is empty and the scanning of input string is completed." << endl;
		return true;
	} else {
		// CASE 2
		cout << "Stack is not empty and the scanning of input string is completed." << endl;
		return false;
	}
}

int main(int argc, char *argv []) {
	string sentence;
	bool balancedDelimiters;
		
	ifstream file;
	if (argc >= 2) {
		file.open(argv[1]);
		if(!file) {
			/* Error */
			cerr << "File cannot be opened: " << argv[1] << endl;
			exit (1);
		}
	} else {
		cerr << "No file is found" << endl;
		exit(1);
	}
		 
	getline(file, sentence);
	if(sentence.length() == 0) {
		cout << "File is empty." << endl;
		return 0;
	}
	
	balancedDelimiters = BalancedDelimiters(sentence);

	if (balancedDelimiters) {
		cout << "\"" << sentence << "\"" << " contains balanced delimiters." << endl;
	} else {
		cout << "\"" << sentence << "\"" << " does not contain balanced delimiters." << endl;
	}
}