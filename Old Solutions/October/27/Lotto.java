import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Lotto {

	// Random Object For Random Number Generation
	public static Random rand = new Random();

	// Checks If The Value is In Array
	public static boolean contains(int[] arr, int key) {
		for (int value : arr) {
			if (value == key) {
				return true;
			}
		}
		return false;
	}

	// Returns An Array Of N Distinct Random Numbers From 1 - 40 (Inclusive)
	public static int[] getRandomNumbers(int n) {
		// Create An Array Of Size N
		int[] randomNumbers = new int[n];

		// Populate Array
		int i = 0;
		while (i < n) {
			// Generate A Number B/W 1-40 Inclusive
			int randNum = rand.nextInt(40) + 1;
			// If Array Does Not Contain It Already,
			// Add It. Else Retry
			if (!contains(randomNumbers, randNum)) {
				randomNumbers[i++] = randNum;
			}
		}
		return randomNumbers;
	}

	// Prints Array With A Message
	public static void printArr(int[] arr, String message) {
		System.out.print(message + ": ");
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	// Main
	public static void main(String[] args) {
		int[] userNumbers;

		JOptionPane.showMessageDialog(null, "Welcome to Lotto!", "Lotto", JOptionPane.INFORMATION_MESSAGE);
		int result = JOptionPane.showConfirmDialog(null, "Do you want to input lottery numbers manually?", "Lotto",
				JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			userNumbers = new int[7];
			int i = 0;
			while (i < userNumbers.length) {
				int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Give Number #" + (i + 1)));
				if (contains(userNumbers, number)) {
					JOptionPane.showMessageDialog(null, "You already chose that number!", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (number >= 1 && number <= 40) {
					userNumbers[i++] = number;
				} else {
					JOptionPane.showMessageDialog(null, "Number is out of range! (1-40)", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		} else {
			userNumbers = getRandomNumbers(7);
		}

		// Random Numbers
		// Index 0 - 6 Main Numbers
		// Index 6 - 9 Bonus Numbers
		int[] randomNumbers = getRandomNumbers(10);
		int[] mainNumbers = Arrays.copyOfRange(randomNumbers, 0, 7);
		int[] bonusNumbers = Arrays.copyOfRange(randomNumbers, 7, 10);

		// printArr(randomNumbers, "All Numbers");

		// Print Main Numbers
		printArr(mainNumbers, "Main Numbers");
		// Print Bonus Numbers
		printArr(bonusNumbers, "Bonus Numbers");
		// Print User Numbers
		printArr(userNumbers, "User Numbers");

		// Find Matches
		int mainMatches = 0;
		int bonusMatches = 0;
		for (int value : userNumbers) {
			if (contains(mainNumbers, value)) {
				mainMatches++;
			}

			if (contains(bonusNumbers, value)) {
				bonusMatches++;
			}
		}

		// Print Matches
		System.out.println("Main Numbers Correct: " + mainMatches);
		System.out.println("Bonus Numbers Correct: " + bonusMatches);
	}
}