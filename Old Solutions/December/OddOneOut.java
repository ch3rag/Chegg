public class OddOneOut {

	// Returns The Odd String In The Series
	public static String findOdd(String[] series) {
		// Iterate Through Each String In The Series
		for (int i = 0; i < series.length - 2; i++) {

			// Compare Differences In The Next 3 String With Each Other
			for (int k = 0; k < series[i].length() - 1; k++) {	
				// Find Difference Of Adjacent Character Of The Next 3 Strings
				// Difference Of Adjacent Character In First String
				int diff1 = ((int)series[i].charAt(k) - series[i].charAt(k + 1));
				// Difference Of Adjacent Character In Second String
				int diff2 = ((int)series[i + 1].charAt(k) - series[i + 1].charAt(k + 1));
				// Difference Of Adjacent Character In Third String
				int diff3 = ((int)series[i + 2].charAt(k) - series[i + 2].charAt(k + 1));

				// Compare The Differences
				if (diff1 == diff2 && diff1 != diff3) {
					// Third String Is Odd
					return series[i + 2];
				} else if (diff1 == diff3 && diff1 != diff2) {
					// Second String Is Odd
					return series[i + 1];
				} else if (diff2 == diff3 && diff2 != diff1) {
					// First String Is Odd
					return series[i];
				}
			}
		}
		return null;
	}

	// Main
	public static void main(String[] args) {
		String[] testCase1 = {"ABC", "BCD", "EFG", "DCB"};
		System.out.println(findOdd(testCase1));
		String[] testCase2 = {"ACB", "BDC", "CED", "DEF"};
		System.out.println(findOdd(testCase2));
	}
}
