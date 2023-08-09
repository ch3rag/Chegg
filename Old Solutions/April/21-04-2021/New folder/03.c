#include <stdio.h>

int main() {
	int n, i, j, r;
	int arr[6][6];
	printf("Enter N: ");
	scanf("%d", &n);
	
	

	for (i = 0; i < 6; i++) {
		r = 1 - n + i;
		for (j = 0; j < 6; j++) {
			arr[i][j] = r + 2 * j;
		}
	}

	for (i = 0; i < 6; i++) {
		for (j = 0; j < 6; j++) {
			printf("%-3d ", arr[i][j]);
		}
		printf("\n");
	}

	return 0;
};