#include <stdio.h>
#include <ctype.h>

int main() {
	// Jar Number
	int jar;
	// Guess For Fruit
	char fruit;
	// Correct Labels Of Jar
	char jars[3] = { 'b', 'a', 'o' };
	// Discovered Jars
	int discoverd[3] = {0};
	// Number of Guesses
	int numGuesses = 0;
	// Number of Jars Discovered
	int numDiscoverd = 0;

	// Display Welcome Message
	printf("There are 3 jars containing fruit. Each jar is labeled incorrectly.");
	printf("\nSee if you can determine the correct labels!");
	printf("\n1. Oranges\n2. Both\n3. Apples");

	// Loop
	while (numDiscoverd < 3) {
		// Input Jar
		printf("\nWhich one would you like to look in? (choose 1, 2, or 3): ");
		scanf("%d", &jar);

		// Check If The User Already Guessed It
		if (discoverd[jar - 1]) {
			printf("You already correctly guessed this jar!");
			continue;
		}

		// Print First Fruit
		char firstFruit = 'a';
		if (jars[jar - 1] != 'b') {
			firstFruit = jars[jar - 1];
		}

		printf("The first fruit in Jar %d is: %c", jar, firstFruit);

		// Input Fruit Guess
		printf("\nWhat do you think this jar really contains? (a, o, or b): ");
		scanf(" %c", &fruit);

		// Check If Guess Is Right
		if (jars[jar - 1] == fruit || toupper(jars[jar - 1]) == fruit) {
			printf("That's correct! Good job!");
			discoverd[jar - 1] = 1;
			numDiscoverd++;
		} else {
			printf("Sorry, that is incorrect.");
		}

		// Increment Guesses
		numGuesses++;
	}

	// Display Game Summary
	printf("\n\nYou have correctly guessed all the labels.");
	printf("\nNumber of guesses: %d", numGuesses);

	return 0;
}