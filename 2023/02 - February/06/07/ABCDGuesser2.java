import java.util.Scanner;

public class ABCDGuesser2 {

	// De Jager Approximation
	public static void deJagerApproximate(double constant, double w, double x, double y, double z) {
		// Array Of Exponents
		double[] e = {-5, -4, -3, -2, -1, -1/2.0, -1/3.0, -1/4.0, 0, 1/4.0, 1/3.0, 1/2.0, 1, 2, 3, 4, 5};
		// Relative Error
		double relError = Double.MAX_VALUE;
		double a = 0, b = 0, c = 0, d = 0;
		// Best Approximation So Far
		double bestGuess = 0;
		// Nest While Loops
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				for (int k = 0; k < e.length; k++) {
					for (int l = 0; l < e.length; l++) {
						// No Repetition Of Digits
						if (i != j && i != k && i != l && j != k && j != l && k != l) {
							// Calculate Guess For Current Combination
							double guess = Math.pow(w, e[i]) * Math.pow(x, e[j]) * Math.pow(y, e[k]) * Math.pow(z, e[l]);
							// Compute Relative Error
							double error = Math.abs(guess - constant) / constant;
							// If Current Relative Error Less Than Previous Best Guess
							if (error < relError) {
								relError = error;
								// Save A, B, C, D
								a = e[i]; b = e[j]; c = e[k]; d = e[l];
								// Save The Current Guess
								bestGuess = guess;
							}
						}
					}
				}
			}
		}

		// Print The Results
		System.out.printf("A = %.1f\nB = %.1f\nC = %.1f\nD = %.1f\n", a, b, c, d);
		System.out.printf("Real Value = %f\n", constant);
		System.out.printf("Best Guess = %f\n", bestGuess);
		System.out.printf("Error = %.2f%%\n", relError * 100);
	}

	// Main
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// Ask User What Constant Should Be Approximated
		System.out.print("Enter Constant That Should Be Approximated: ");
		double constant = input.nextDouble();

		// Ask W X Y Z
		System.out.print("Enter The Value Of W: ");
		double w = input.nextDouble();
		System.out.print("Enter The Value Of X: ");
		double x = input.nextDouble();
		System.out.print("Enter The Value Of Y: ");
		double y = input.nextDouble();
		System.out.print("Enter The Value Of Z: ");
		double z = input.nextDouble();

		// Call DeJagerApproximate
		// deJagerApproximate(238900, 14, 102329, 1936, 13);
		deJagerApproximate(constant, w, x, y, z);

		// Clean Up
		input.close();
		
	}
}
