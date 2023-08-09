package Lab3;
import Lab3.Lab03P5Wrapper.ArrayList;
public class Test {
	public static void main(String[] args) {
		// Create An ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();	
		// Add Some Elements
		list.add(100);
		list.add(20);
		list.add(6);
		list.add(-1);
		list.add(-15);
		list.add(5);

		// Sort It Using Merge Sort
		ArrayList<Integer> sortedList = (ArrayList<Integer>)Lab03P5Wrapper.sort(list, list.getComparator());

		// Print The Sorted List
		for (int e : sortedList) {
			System.out.println(e);
		}
	}
	
}
