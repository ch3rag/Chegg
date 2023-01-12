import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOperations {
	public static Set<Integer> removeEven(Set<Integer> numbers) {
		// Create A Set To Store The Removed Items
		Set<Integer> result = new HashSet<>();

		// Create An Iterator
		Iterator<Integer> iter = numbers.iterator();

		// Iterate Over Set
		while (iter.hasNext()) {
			// Get Current Item In Iterator
			int n = iter.next();
			// Check If N Is Even
			if (n % 2 == 0) {
				// Remove It
				iter.remove();
				// Add It To Result
				result.add(n);

			}
		}
		// Return The Result
		return result;
	}

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>(Arrays.asList(
			1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
		Set<Integer> evens = removeEven(numbers);
		System.out.println(evens.toString());
	}
}
