public class Main {
	// isSorted Method
	// Checks If Thee Integers Are In Ascending Order
	public static boolean isSorted(int a, int b, int c) {
		return (a <= b) && (b <= c);
	}
	
	public static void main(String[] args) {
		// Test isSorted
		System.out.println("isSorted(1, 2, 3): " + isSorted(1, 2, 3));
		System.out.println("isSorted(2, 3, 1): " + isSorted(2, 3, 1));
		System.out.println("isSorted(2, 3, 3): " + isSorted(2, 3, 3));
	}
}