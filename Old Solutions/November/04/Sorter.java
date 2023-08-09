// Sorter Class
public class Sorter {
	// Swaps The Element At Index I With The Element At J
	// Of Array 'Numbers'
	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	// Returns The Pair Of Indexes
	// Where The Elements Are Inverted
	public static int[] findInversion(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}

	// Sorts The Array Using findInversion And swap
	public static void sort(int[] numbers) {
		int[] inversion;
		// While Inversions Are Present, Sort Them
		while ((inversion = findInversion(numbers)) != null) {
			swap(numbers, inversion[0], inversion[1]);
		}
	}
}