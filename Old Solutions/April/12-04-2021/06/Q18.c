#include <stdio.h>
#include <math.h>


int main() {
	float ra, rb, v;

	printf("Enter Inner Radius: ");
	scanf("%f", &ra);

	printf("Enter Outer Radius: ");
	scanf("%f", &rb);

	v = M_PI * M_PI * sqrt((rb * rb - ra * ra));

	printf("Surface Area Of Torus: %f", v);
	return 0;
}