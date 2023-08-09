import java.util.Scanner;

// MatrixMultiply.java

public class MatrixMultiply {
	// Scanner For User Input
	public static Scanner input = new Scanner(System.in);

	// Gets Matrix Input From The User
	public static int[][] input2DArray(int rows, int cols) {
		// Matrix
		int[][] matrix = new int[rows][cols];
		// Input NXM Elements From STDIN
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (input.hasNextInt()) 
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// Row And Column Of Each Matrix
		int row1, col1, row2, col2;

		// Input Dimensions Of Each Matrix
		System.out.print("Number of Rows of First Matrix: ");
		row1 = input.nextInt();
		System.out.print("Number of Columns of First Matrix: ");
		col1 = input.nextInt();

		System.out.print("Number of Rows of Second Matrix: ");
		row2 = input.nextInt();
		System.out.print("Number of Columns of Second Matrix: ");
		col2 = input.nextInt();

		if (col1 == row2) {
			// Initialize Matrices
			// Input Matrix
			System.out.println("Input First Matrix:");
			int[][] m1 = input2DArray(row1, col1);
			System.out.println("Input Second Matrix:");
			int[][] m2 = input2DArray(row2, col2);

			// Multiply
			int[][] m3 = multiplyMatrix(m1, m2);
			System.out.println("Multiplication of M1 and M2:");
			printMatrix(m3);

		} else {
			// Display Error
			System.out.print("Error: Number of Columns of the First Matrix must be equal to the Number of Rows of Second Matrix.");
		}
	}

	public static void printMatrix(int[][] matrix) {
		// Print All The Elements Row Wise
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			// Print New Line After Each Row
			System.out.println();
		}
	}

	// Multiplies Two Matrices
	public static int[][] multiplyMatrix(int[][] m1, int[][] m2) {
		// Rows Of Matrix - 1
		int r1 = m1.length;
		// Columns Of Matrix - 1 And Matrix - 2
		int c1 = m1[0].length, c2 = m2[0].length;

		// 2D Array To Hold The Result
		int[][] result = new int[r1][c2];

		// Iterate And Multiply
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				int sum = 0;
				for (int k = 0; k < c1; k++) {
					sum += m1[i][k] * m2[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}
}
