#include <stdio.h>

// ID: ____________
// NAME: __________

int main() {
	char name[50];
	float cgpa, distance, allowance, newAllowance;

	printf("Enter your name: ");
	fgets(name, 50, stdin);

	printf("Enter distance to college in Kilometers: ");
	scanf("%f", &distance);
	
	printf("Enter your cgpa: ");
	scanf("%f", &cgpa);

	printf("Present allowance: ");
	scanf("%f", &allowance);


	if (cgpa > 3.5 && distance >= 50) {
		newAllowance = allowance * 2;
	} else if (cgpa > 3.0 && distance >= 50) {
		newAllowance = allowance * 1.5;
	} else {
		newAllowance = allowance;
	}

	printf("***** Student Details *****\n");
	printf("Student Name: %s\n", name);
	printf("Student CGPA: %f\n", cgpa);
	printf("Distance to college: %sn", name);
	printf("** Based on your CGPA and distance **");
	printf("New allowance: %f", newAllowance)

	return 0;
}