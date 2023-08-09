#include <stdio.h>
#include <math.h>


int main() {
	float r1, r2, v;
	printf("Enter Inner Radius: ");
	scanf("%f", &r1);

	printf("Enter Outer Radius: ");
	scanf("%f", &r2);

	v = 0.25 * M_PI * M_PI * (r1 + r2)* pow((r1 - r2), 2);

	printf("Volume Of Torus: %f", v);
	return 0;
	
}