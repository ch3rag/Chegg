#include <stdio.h>
#include <string.h>

// Birthdays Struct To Store Information About One's Birthday
typedef struct birthdays {
	// Stores The Actual Birth Date As String
	char birthdate[10];
	// Store Name Of The Person
	char name[15];
	// Store Age Of The Person
	int age;
} birthdays;

int main() {
	// Test Birth Day Struct
	birthdays myBirthday;
	strcpy(myBirthday.birthdate, "08/29/98");
	strcpy(myBirthday.name, "Alex");
	myBirthday.age = 19;

	// Print BirthDay Info
	printf("Name: %s\n", myBirthday.name);
	printf("BirthDate: %s\n", myBirthday.birthdate);
	printf("Age: %d\n", myBirthday.age);

}
