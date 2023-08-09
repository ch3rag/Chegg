#include <stdio.h>
#include <string.h>
#include <stdlib.h>
// Buffer Size
#define MAX 100
int main() {

	// Display Welcome Messages
	printf("Welcome to Maths Tester Pro.\n");
	// Choices
	printf("Select a difficulty:\n");
	printf("1) Easy\n2) Medium\n3) Hard\n");
	
	// Stores Level
	int level = 0;
	// Buffer For User Input
	char lvlStr[MAX];
	char buffer[MAX];

	// Infinite Loop
	while (1) {
		// Print Prompt >
		printf("> ");
		// Input Level As String
		scanf("%s", lvlStr);
		// Consume Stdin
		fflush(stdin);
		// Convert String To Int
		level = atoi(lvlStr);
		// Check If The Input Was Valid Int With  Values 1, 2 Or 3
		if (strlen(lvlStr) == strlen(itoa(level, buffer, 10))) {
			if (level == 1 || level == 2 || level == 3) {
				break;
			}
		}
		// If We Are Here, User Input Is Invalid!
		printf("Invalid Choice! Enter 1, 2, or 3.\n");
	}

	// Print User's Choice
	printf("You Chose Difficulty Level %d.\n", level);
	return 0;
}