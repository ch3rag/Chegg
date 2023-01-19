// Names.c

#include <stdio.h>

// Main
int main() {
	// Family Name
	char fName[] = "United";
	
	// Open The Names File For Reading
	FILE* filePtr = fopen("XYZ1234Lab2names.txt", "r");

	// Check If File Exists
	if (filePtr == NULL) {
		printf("XYZ1234Lab2names.txt does not exist.");
	} else {
		// Array To Store The Name
		char nName[50];

		// Reading Loop
		// Read The File Till End Of The Using Fscanf
		int lineNumber = 0;
		while (fscanf(filePtr, "%[^\n]\n", nName) != EOF) {
			printf("Line %d of the file contains the name %s.\n", lineNumber++, nName);
		}
		// Close The File
		fclose(filePtr);
	}
	return 0;
}