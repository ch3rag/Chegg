#include <stdio.h>
#include <math.h>


// Function Declaration
void print_nxn(int n, double M[n][n]);

/**
* @brief : Calculating the determinant of a square matrix of order n
* @return: the determinant of M
* @param : n - the order of a square matrix M. M - a 2 dimensional array containing values of a matrix M
*/

double determinant(int n, double M[n][n]) {
	// We Will Be Using Recursion to Solve This Problem	
	if (n == 1) {
		// Matrix Size is 1X1
		return M[0][0];
	} else if (n == 2) {
		// Matrix Size is 2X2
		return M[0][0] * M[1][1] - M[0][1] * M[1][0];
	} else {
		// Matrix Size is Atleast 3X3 Or More
		// Variable To Hold Determinant
		double det = 0;
		// Loop Through First Row
		for (int i = 0; i < n; i++) {
			// Sub Matrix (Minor) Of Ith Item In First Row
			double subM[n - 1][n - 1];

			// Calculate Minor For Ith Item In First Row Of The Matrix
			// Indices In Minor Matrix
			int k = 0, l = 0;
			// Loop Through Matrix M
			for (int y = 0; y < n; y++) {
				for (int x = 0; x < n; x++) {
					// If Element Is Not In The First Row
					// And The Column Of Ith Item
					if (y != 0 && x != i) {
						// Include It In The Minor Matrix
						subM[k][l] = M[y][x];
						// Update L And K
						l = (l + 1) % (n - 1);
						if (l == 0) {
							k++;
						}
					}
				}
			}

			// Compute Determinant Of Minor Matrix Recursively And Add To Total Determinant
			det += pow(-1, i) * determinant(n - 1, subM) * M[0][i];
		}
		return det;
	}
}

int main(void) {
	double M1[3][3] = {
		{1.7, 3.2, 2.5},
		{2.3, 4.1, 0.7},
		{1.0, 2.0, 3.0}};

	double M2[4][4] = {
		{2.0, 1.0, 2.0, 1.0},
		{1.7, 3.2, 2.5, 3.0},
		{2.3, 4.1, 0.7, 2.0},
		{1.0, 2.0, 3.0, 4.0}};

	// the Values of M3 Are Hidden on Purpose
	double M3[5][5] = {
		{2.0, 1.0, 2.0, 1.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0}};

	int option;

	scanf("%d", &option);

	switch (option) {
		case 1:
			printf("Matrix M1 = \n");
			print_nxn(3, M1);
			printf("det(M1) = %lf\n", determinant(3, M1));
			break;
		case 2:
			printf("Matrix M2 = \n");
			print_nxn(4, M2);
			printf("det(M2) = %lf\n", determinant(4, M2));
			break;
	   default :
			print_nxn(4, M2);
			break;
   }
	return 0;
}

// Print a Square Matrix M of Order N
void print_nxn(int n, double M[n][n]) {
	int row, col;
	for (row = 0; row < n; row++) {
		printf(" [ ");
		for (col = 0; col < n; col++)
			printf("%6.2lf ", M[row][col]);
		printf("]\n");
	}
	printf("\n");
}