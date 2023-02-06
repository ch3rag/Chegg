package recursion;

public class Recursion {
	public static double harmonic (int n) {
		if (n == 0) {
			throw new IllegalArgumentException("The argument n can't be zero");
		}

		if (n == 1) {
			return 1;
		} else if (n < 0) {
			return -1 * harmonic(-n);
		} else {
			return 1.0/n + harmonic(n - 1);
		}
	}

	// Other Code From Part - 1
}