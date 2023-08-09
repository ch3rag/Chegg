import java.util.ArrayList;
import java.util.Arrays;

// Question7.java

public class Question7 {
	// Returns True If The Array List Contains Any Duplicates, False Otherwise
	public static boolean hasDuplicate(ArrayList<Integer> list) {
		// Iterate Through Every Value And Check If It Occurs Anywhere Else In The ArrayList
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					// Duplicate Exists
					return true;
				}
			}
		}
		// No Duplicates
		return false;
	}


	// Test The Method In Main()
	public static void main(String[] args) {
		System.out.println(hasDuplicate(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90))));
		System.out.println(hasDuplicate(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90, 20))));
		System.out.println(hasDuplicate(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90, 90))));
		System.out.println(hasDuplicate(new ArrayList<Integer>(Arrays.asList(10, 70, 20, 90, 10))));
	}
}
