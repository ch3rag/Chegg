#include <stdio.h>
#include <ctype.h>
#include <string.h>
#define MAX 100

// A Function That Greets The User And Gets The First Name Of The User
void Greeting(char name[]);

// A Function That Gets A Word From The User And Makes A Copy Of That Word
void GetWord(char input[], char copy[]);

// A Function That Changes A Word To All Uppercase Letter
void UppercaseWord(char upper[]);

// Input Character Array(String)
// Display Number Of Vowels Each Of (A, E, I, O, U)
// Return Total Number Of Vowels
int CountVowels(char upper[]);

// Reverses A Word
void ReverseTheWord(char upper[], char reverse[]);

int main() {
	char name[MAX], word[MAX], upper[MAX], reverse[MAX];
	char choice;

	// Input Name And Display Greeting
	Greeting(name);

	// Ask If User Wants To Enter A Word
	printf("%s, would you like to enter a word Y (YES) or N (NO)? ", name);
	scanf("%c", &choice);

	// If User Choice is Yes
	if (choice == 'Y' || choice == 'y') {
		// Get Word From User
		GetWord(word, upper);

		// Print Original Word
		printf("\nPrinting the words in the main function:\n\n");
		printf("Original Word:\t%s\n", word);
		
		// Make It Upper Case
		UppercaseWord(upper);
		printf("Uppercase:\t%s\n", upper);

		// Reverse It
		ReverseTheWord(upper, reverse);
		printf("Reverse:\t%s\n", reverse);

		// Count Vowels
		int numVowels = CountVowels(upper);

		// Print Total Number of Vowels
		printf("Printing total number of vowels in the main function:\n");
		printf("The total number of vowels is: %d\n", numVowels);
	}

	printf("\nBye.");
	return 0;
}

// A Function That Greets The User And Gets The First Name Of The User
void Greeting(char name[]) {
	// Input First Name And Display Greeting
	printf("What is your first name? ");
	scanf(" %s", name);
	printf("\n *** Welcome to the character array practice program ***\n\n");
	fflush(stdin);
}


// A Function That Gets A Word From The User And Makes A Copy Of That Word
void GetWord(char input[], char copy[]) {
	// Input A Word
	printf("\nEnter A Word: ");
	scanf(" %s", input);

	// Create A Copy
	strcpy(copy, input);
}


// A Function That Changes A Word To All Uppercase Letter
void UppercaseWord(char upper[]) {
	// Length Of The String
	int len = (int)strlen(upper);

	// Use Loop To Change All Characters To Uppercase
	for (int i = 0; i < len; i++) {
		upper[i] = toupper(upper[i]);
	}
}

// Reverses A Word
void ReverseTheWord(char upper[], char reverse[]) {
	// Length Of The String
	int len = (int)strlen(upper);
	// Use A Loop To Reverse The Word
	for (int i = len - 1, j = 0; i >= 0; i--, j++) {
		reverse[j] = upper[i];
	}
	// Add Null At The End Of Reverse
	reverse[len] = '\0';
}


// Input Character Array(String)
// Display Number Of Vowels Each Of (A, E, I, O, U)
// Return Total Number Of Vowels
int CountVowels(char upper[]) {
	// Vowels
	char vowels[5] = {'A', 'E', 'I', 'O', 'U'};
	// Count Of A, E, I, O, U
	int vowelCount[5] = {0};
	// Length Of The Word
	int len = (int)strlen(upper);
	// Total Vowels
	int total = 0;

	// Loop Through All Characters
	for (int i = 0; i < len; i++) {
		for (int j = 0; j < 5; j++) {
			// If Current Character Is Vowel
			if (upper[i] == vowels[j]) {
				// Print It's Index
				printf("There is an '%c' located at index: %d\n",
					upper[i], i);
				// Increment Count Of Corresponding Vowel
				vowelCount[j]++;
				// Increment Total Vowels
				total++;
			}
		}
	}

	// Print Count Of Each Vowel
	for (int i = 0; i < 5; i++) {
		printf("The total number of %c's is: %d\n", vowels[i], vowelCount[i]);
	}
	// Return Total
	return total;
}
