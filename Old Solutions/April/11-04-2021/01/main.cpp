#include <stdio.h>
#include <math.h>

int main() {

	int i;
	double x[7] = {
		0.3, 0.7, 1.1, 1.5, 1.9, 2.3, 2.7
	};

	double cosx, sinx, y;

	printf("%-15s%-15s%-15s%-15s\n", "x", "sin(x)", "cos(x)", "y");
	for (i = 0; i < 7; i++) {
		cosx = cos(x[i]);
		sinx = sin(x[i]);
		y = cosx + sinx;
		printf("%-15.2f%-15.5f%-15.5f%-15.5f\n", x[i], cosx, sinx, y);
	}

	return 0;
}