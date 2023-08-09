#include <stdio.h>
#define MAX 100
int main() {
	printf("*** Welcome to Lab 9 ***\n");

	// Declare A String
	char str[MAX];

	// Input The String
	// It Will Contain New Line Character At The End
	printf("Please Enter A String: ");
	fgets(str, MAX, stdin);

	// Find String Length
	int len = 0;
	while (str[len] != '\0') {
		len++;
	}
	
	// Remove New Line Character From The End Of String
	str[len - 1] = '\0';
	// We Remove A Character So Decrease Length By 1
	len--;

	printf("Your Entered: %s\n", str);
	// Modify The String
	int mid = len / 2;

	// Swap The First Half Characters
	for (int i = 0; i < mid / 2; i++) {
		char temp = str[i];
		str[i] = str[mid - i - 1];
		str[mid - i - 1] = temp;
	}

	// Swap The Second Half Characters
	for (int i = mid; i < len - mid / 2 - 1; i++) {
		char temp = str[i];
		str[i] = str[len + mid - i - 1];
		str[len + mid - i - 1] = temp;
	}

	// Print The Result
	printf("The Modified String is: %s\n", str);
	
	printf("*** Thanks for doing Lab 9 ***");
}