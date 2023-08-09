import java.util.ArrayList;

// Main.java
public class Main {

	// Method To Convert 2D Arrays To 2D ArrayLists
	public static ArrayList<ArrayList<Integer>> array2DToArrayList2D(int[][] array2D) {
		// Create An Empty 2D ArrayList Of Integers
		ArrayList<ArrayList<Integer>> arrayList2D = new ArrayList<ArrayList<Integer>>();

		// Loop Through The 2D Array
		for (int i = 0; i < array2D.length; i++) {
			// Create A 1D ArrayList
			ArrayList<Integer> aList = new ArrayList<Integer>();
			// If Not The First ArrayList, Add 7 To It
			if (i > 0) {
				aList.add(7);
			}
			// Loop Through 1 Row In 2D Array
			for (int j = 0; j < array2D[i].length; j++) {
				// If Element In The Row Is 7
				if (array2D[i][j] == 7) {
					// Add The Existing 1D ArrayList To 2D ArrayList And Create A New 1D ArrayList
					arrayList2D.add(aList);
					aList = new ArrayList<Integer>();
				}
				// Add Current Item In The Row To 1D ArrayList
				aList.add(array2D[i][j]);
			}
			// Add 1D ArrayList To 2D ArrayList
			arrayList2D.add(aList);
		}
		// Return 2D ArrayList
		return arrayList2D;
	}

	public static void main(String[] args) {
		// Test
		int[][] array2DOne = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12, 13},
			{14, 15}};

		int[][] array2DTwo = {
			{3, 3, 3, 3, 3},
			{3, 7, 3, 3, 7, 7, 7, 7, 3},
			{3, 3, 3, 3, 9}
		};
		
		// Print The Results Using A Helper
		print2DArrayList(array2DToArrayList2D(array2DOne));
		print2DArrayList(array2DToArrayList2D(array2DTwo));
	}

	// Prints 2D ArrayList In A Clean Format
	public static void print2DArrayList(ArrayList<ArrayList<Integer>> arrayList2D) {
		System.out.print("[ ");
		for (int i = 0; i < arrayList2D.size(); i++) {
			System.out.print("[ ");
			for (int j = 0; j < arrayList2D.get(i).size(); j++) {
				System.out.print(arrayList2D.get(i).get(j) + " ");
			}
			System.out.print("] ");
		}
		System.out.println("]");
	}
}