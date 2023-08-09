#include <stdio.h>
#include <stdlib.h>

// Gets Seed From The User
int getSeed() {
	int seed;
	// Infinite Loop
	while(1) {
		// Input Seed
		printf("Enter Seed for Random Number Generator: ");
		int ret = scanf("%d", &seed);

		if (ret != 1) {
			// Non-Numeric Input
			printf("Error: Incorrectly formatted Input\n");
			fflush(stdin);
		} else if (seed <= 0) {
			// Out Of Range Input
			printf("Error: Seed Value Should Be > 0\n");
		} else {
			// Correct Input
			return seed;
		}
	}
}

// Inputs Range End Points
void inputRange(int * min, int * max) {
	// Infinite Loop
	int start, end;
	while(1) {
		// Input Seed
		printf("Enter Range Endpoints: ");
		int ret = scanf("%d %d", &start, &end);
		int valid = 1;

		if (ret != 2) {
			// Non-Numeric Input
			printf("Error: Incorrectly formatted Input\n");
			fflush(stdin);
			valid = 0;
		} else {
			// Start < 0
			if (start < 0) {
				printf("Error: Min Value Should Be Positive\n");
				valid = 0;
			}

			// End < 0
			if (end < 0) {
				printf("Error: Max Value Should Be Positive\n");
				valid = 0;
			}

			// Start - End < 4
			if (end - start < 4) {
				printf("Error: Max Value Should Be At Least 4 More Than Min Value\n");
				valid = 0;
			}
		}

		if (valid) {
			*min = start;
			*max = end;
			break;
		}
	}
}

int getNumGuesses() {
	int numGuesses;
	// Infinite Loop
	while(1) {
		// Input Number Of Guesses Per Round
		printf("Enter The Number Of Guesses Per Round: ");
		int ret = scanf("%d", &numGuesses);

		if (ret != 1) {
			// Non-Numeric Input
			printf("Error: Incorrectly formatted Input\n");
			fflush(stdin);
		} else if (numGuesses < 2) {
			// Out Of Range Input
			printf("Error: Must Allow At Least 2 Guesses\n");
		} else {
			// Correct Input
			return numGuesses;
		}
	}
}

int getNumRounds() {
	int numRounds;
	// Infinite Loop
	while(1) {
		// Input Number Of Rounds
		printf("Enter The Number Of Rounds For Game: ");
		int ret = scanf("%d", &numRounds);

		if (ret != 1) {
			// Non-Numeric Input
			printf("Error: Incorrectly formatted Input\n");
			fflush(stdin);
		} else if (numRounds < 1) {
			// Out Of Range Input
			printf("Error: Must Allow At Least 1 Round\n");
		} else {
			// Correct Input
			return numRounds;
		}
	}
}


int main() {

	// Input Seed
	int seed = getSeed();
	// Print Seed
	printf("Seed: %d\n\n", seed);
	// Input End Points
	int min, max;
	inputRange(&min, &max);
	// Display Range
	printf("Range End Points: %d %d\n\n", min, max);
	// Input Number Of Guesses
	int numGuesses = getNumGuesses();
	// Display Number Of Guesses
	printf("Number Of Guesses: %d\n\n", numGuesses);
	// Input Number Of Rounds
	int numRounds = getNumRounds();
	// Display Number Of Rounds
	printf("Number Of Rounds: %d\n", numRounds);

	// Seed RNG
	srand(seed);

	// Play Game
	int numWins = 0, numLosses = 0;
	// For Each Round
	for (int i = 0; i < numRounds; i++) {
		// Display Round #
		printf("\n\nROUND - %d\n\n", (i + 1));
		// Generate A Random Number For That Round
		int randomNum = rand() % (max + 1 - min) + min;
		// Flag If User Won
		int won = 0;
		// For Each Guess In The Round
		for (int j = 0; j < numGuesses; j++) {
			// Input Guess From The User
			int guess;
			printf("Enter Guess: #%d: ", (j + 1));
			scanf("%d", &guess);
			// Evaluate Guess
			if (guess < randomNum) {
				printf("%d is Too Low!\n", guess);
			} else if (guess > randomNum) {
				printf("%d is Too High!\n", guess);
			} else {
				// User Won
				printf("\nCorrect Guess!\n");
				numWins++;
				won = 1;
				break;
			}
		}
		// If User's Didn't Win Current Round
		if (!won) {
			printf("\nNo More Guesses! The Correct Answer Was %d\n", randomNum);
			numLosses++;
		}

		printf("\nCurrent Wins: %d\nCurrent Losses: %d\n", numWins, numLosses);
	}

	// Display Game Stats
	printf("\n\nFinal Stats:\n");
	printf("Wins: %d\nLosses: %d\nWinning Percentage: %.2f%%\n",
		numWins, numLosses, ((double)numWins / numRounds) * 100);

	return 0;
}
