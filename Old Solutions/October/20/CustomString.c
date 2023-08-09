#include "CustomString.h"
#include <stdio.h>
#include <string.h>
#define BUF 100

// Reverses The String
void reverse(char * str) {
	// Loop Through Half Of The String And Swap Chars

	for (int i = 0, len = strlen(str); i < len / 2; i++) {
		char temp = str[i];
		str[i] = str[len - i - 1];
		str[len - i - 1] = temp;
	}
}

// Converts The String To Lowercase
void lowercase(char * str) {
	// Loop Though Each Character In The String
	for (int i = 0; str[i] != '\0'; i++) {
		// Check If Current Character Is Upper Case Char
		char ch = str[i];
		if (ch >= 'A' && ch <= 'Z') {
			// Convert To Lowercase
			ch += ('a' - 'A');
			str[i] = ch;
		}
	}
}

// Compares To String
// Returns 1 If They Are Identical
// 0 Otherwise
int compare(char * str1, char * str2) {
	return !strcmp(str1, str2);
}

// Main
int main() {
	// Declare Two Strings
	char str1[BUF], str2[BUF];

	//Input String - 1
	printf("Enter String - 1: ");
	fgets(str1, BUF, stdin);
	// Remove Trailing New Line
	str1[strcspn(str1, "\n")] = 0;

	//Input String - 2
	printf("Enter String - 2: ");
	fgets(str2, BUF, stdin);
	// Remove Trailing New Line
	str2[strcspn(str2, "\n")] = 0;

	// Compare The String
	int result = compare(str1, str2);

	// Display The Result
	if (result) {
		printf("\nComparision: Strings Are Identical\n");
	} else {
		printf("\nComparision: Strings Are Not Identical\n");
	}

	// Reverse Both Strings
	reverse(str1);
	reverse(str2);

	// Print Reversed Strings
	printf("\nReversed String - 1: %s\n", str1);
	printf("Reversed String - 2: %s\n", str2);

	// Covert To Lowercase
	lowercase(str1);
	lowercase(str2);

	// Print Lowercase Strings
	printf("\nLowercase String - 1: %s\n", str1);
	printf("Lowercase String - 2: %s\n", str2);

	
	return 0;
}