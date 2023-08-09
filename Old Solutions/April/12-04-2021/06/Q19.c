#include <stdio.h>

int main() {
	int f;
	printf("Enter Frequency: ");
	scanf("%d", &f);
	
	if (f < 3) {
		printf("Difficult to measure");
	} else if (f <= 30) {
		printf("Extremely low");
	} else if (f <= 300) {
		printf("Super low");
	} else if (f <= 3000) {
		printf("Ultra low");
	} else {
		printf("Other bands");
	}
	
	return 0;
}