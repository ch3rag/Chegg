// MyBSTree.java

public class MyBSTree<T extends Comparable<T>> implements ITree<T> {
	// Root Of The Binary Search Tree
	private Node root;

	// Inner Nested Node Class
	class Node {
		// Private Attributes
		public T data;
		public Node left;
		public Node right;

		// Constructor
		public Node(T data) {
			this.data = data;
			left = right = null;
		}

		// Insert Item Into Sub-Tree
		// Recursively Adds Item Into The Sub-Tree
		public void insert(T item) {
			// Item > Root's Data
			if (item.compareTo(data) > 0) {
				// Insert To Right
				if (right == null) {
					// If Right Is Null, Create New Node And Assign To Right
					right = new Node(item);
				} else {
					// Else Recursively Insert In Right Subtree
					right.insert(item);
				}
			// Item > Root's Data
			} else if (item.compareTo(data) < 0) {
				// Insert To Left
				if (left == null) {
					// If Left Is Null, Create New Node And Assign To Right
					left = new Node(item);
				} else {
					// Else Recursively Insert In Left Subtree
					left.insert(item);
				}
			// Item == Root's Data
			} else {
				return;
			}
		}
	}

	// Inserts An Item In The Tree
	@Override
	public void insert(T item) {
		// Root Is Null
		if (root == null) {
			root = new Node(item);
		// Root Not Null, Insert Item Recursively
		} else {
			root.insert(item);
		}
	}

	// Helper For Contains Item
	private boolean containsItemHelper(Node currentNode, T item) {
		if (currentNode == null) {
			return false;
		} else if (item.compareTo(currentNode.data) > 0) {
			return containsItemHelper(currentNode.right, item);
		} else if (item.compareTo(currentNode.data) < 0) {
			return containsItemHelper(currentNode.left, item);
		} else {
			return true;
		}
	}

	// Returns True If Tree Contains An Item
	@Override
	public boolean containsItem(T item) {
		return containsItemHelper(root, item);
	}

	// Helper For GetSize
	private int getSizeHelper(Node currentNode) {
		if (currentNode == null) {
			return 0;
		} else {
			return 1 + getSizeHelper(currentNode.left) + getSizeHelper(currentNode.right);
		}
	}

	// Returns The Size Of The Binary Tree
	@Override
	public int getSize() {
		return getSizeHelper(root);
	}

	// Helper To Print In-Order Traversal Of The Tree
	private void printInOrderHelper(Node currentNode) {
		if (currentNode == null) {
			return;
		}
		printInOrderHelper(currentNode.left);
		System.out.print(currentNode.data.toString() + " ");
		printInOrderHelper(currentNode.right);
	}

	// Prints In-Order Traversal Of The Tree
	@Override
	public void printInOrder() {
		printInOrderHelper(root);
	}
}
