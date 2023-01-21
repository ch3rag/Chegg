// MyBSTreeTest.java

public class MyBSTreeTest {
	// Main
	public static void main(String[] args) {
		MyBSTree<Integer> tree = new MyBSTree<>();
		// Test Insert
		tree.insert(40);
		tree.insert(30);
		tree.insert(50);
		tree.insert(25);
		tree.insert(35);
		tree.insert(45);
		tree.insert(60);
		tree.insert(15);
		tree.insert(28);
		tree.insert(55);
		tree.insert(70);

		// Test In-Order
		System.out.print("In Order Traversal: ");
		tree.printInOrder();

		// Test Contains
		System.out.printf("\nTree Contains 15?: %s\n", tree.containsItem(15));
		System.out.printf("Tree Contains 18?: %s\n", tree.containsItem(18));
		System.out.printf("Tree Contains 27?: %s\n", tree.containsItem(27));
		System.out.printf("Tree Contains 28?: %s\n", tree.containsItem(28));
		System.out.printf("Tree Contains 70?: %s\n", tree.containsItem(70));

		// Test Get-Size
		System.out.printf("Size Of The Binary Tree: %d\n", tree.getSize());
	}	
}
