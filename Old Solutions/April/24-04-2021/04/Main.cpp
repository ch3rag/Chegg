#include <iostream>
using namespace std;

int numWords(string sentence, int threshold) {
	int wordLength = 0;
	int count = 0;
	sentence.append(" ");
	for (int i = 0; i < sentence.length(); i++) {
		if (sentence[i] == ' ') {
			if (wordLength > threshold) {
				count++;
			}
			wordLength = 0;
		} else {
			wordLength++;
		}
	}
	return count;
}

int main() {

	char sentence[100];
	int threshold;
	cout << "Enter A Sentence: ";
	cin.getline(sentence, sizeof(sentence));
	cout << "Enter Threshold: ";
	cin >> threshold;
	cout << "Result: " << numWords(sentence, threshold);
	return 0;
}
