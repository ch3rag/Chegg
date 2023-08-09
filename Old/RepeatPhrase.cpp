// RepeatPhrase.cpp

#include <iostream>
#include <string>
using namespace std;

int main() {

	// Input Phrase from the User
	cout << "Enter A Phrase: ";
	string phrase;
	getline(cin, phrase);

	// Input How Many Times User Wants to Repeat It
	cout << "Enter The Times To Repeat: ";
	int repeat;
	cin >> repeat;

	// Repeat the Phrase Using a Loop
	for (int i = 0; i < repeat; i++) {
		cout << phrase << " ";
	}

	return 0;
}
