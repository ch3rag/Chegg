#include <iostream>
#include <fstream>
#include <stdio.h>

using namespace std;

void ReadMatrix(double Table[][4], int N, int M) {
	ifstream file("matrix.txt");
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < M; j++) {
			file >> Table[i][j];
		}
	}
}

void MaxValue(double Table[][4], int N, int M, int &maxRow, int &maxCol) {
	double max = Table[0][0];
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			if (max < Table[i][j]) {
				max = Table[i][j];
				maxRow = i;
				maxCol = j;
			}
		}
	}
}


void ShowOutput(double Table[][4], int N, int M, int maxRow, int maxCol) {
	cout << "The matrix is: " << endl;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			printf("%10g ", Table[i][j]);
		}
		cout << endl;
	}
	cout << Table[maxRow][maxCol] << " is the maximum value" << endl;
	cout << "It's location is: " << maxRow << " " << maxCol;
}


int main() {
	double Table[3][4];
	int r, c;

	ReadMatrix(Table, 3, 4);
	MaxValue(Table, 3, 4, r, c);
	ShowOutput(Table, 3, 4, r, c);
	
	return 0;
}