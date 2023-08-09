#include <stdio.h>

int main() {
	int i, j, denom;
	double pi = 3;
	printf("%7s%15s\n", "Iteration", "Pi");
	for (int i = 0; i <= 15; i++) {
		printf("%9d%15.6lf\n", i, pi);
		denom = 1;
		for (int j = i * 2 + 2; j <= i * 2 + 4; j++) {
			denom = denom * j;
		}
		if (i % 2 == 0) {
			pi = pi + ((double)4 / denom);
		} else {
			pi = pi - ((double)4 / denom);
		}
	}
	return 0;
}