// Stack.java

// Stack Class
public class Stack {
	// Private Attributes
	private int size;
	private Node head;

	// Constructor
	public Stack() {
		this.head = null;
		this.size = 0;
	}

	// Push An Item Onto Stack
	public void push(int item) {
		// Add New Node In The Front
		Node node = new Node(item, head);
		head = node;
		size++;

	}

	// Pop An Item From The Stack
	public int pop() {
		// Remove The Head And Return Data
		int data = -1;
		if (head != null) {
			data = head.getData();
			head = head.getNext();
			size--;
		}
		return data;
	}

	// Returns The Size Of The Stack
	public int size() {
		return size;
	}

	// Prints All Item In The Stack
	public void print() {
		if (size > 0) {
			System.out.print("Stack: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println();
		} else {
			System.out.println("Stack is empty.");
		}
	}
}
