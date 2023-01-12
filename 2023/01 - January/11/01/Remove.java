import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Remove {
	public static int removeAll(Collection<String> a, Collection<String> b) {
		// Number Of Items Removed
		int count = 0;
		// For Each Item In A
		for (String element : a) {
			// Try To Remove Element From B
			if (b.remove(element)) {
				// If Success, Increment Count
				count++;
			}
		}
		// Return Count
		return count;

	}

	public static void main(String[] args) {
		String[] aList = new String[] { "A", "C", "F "};
		String[] bList = new String[] { "A", "B", "C", "D", "E"};
		ArrayList<String> a = new ArrayList<String>(Arrays.asList(aList));
		ArrayList<String> b = new ArrayList<String>(Arrays.asList(bList));
		System.out.println(removeAll(a, b));
	}
}
