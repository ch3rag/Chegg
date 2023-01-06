// Node.java

// Node Class
public class Node {
	// Private Attributes
	private int data;
	private Node next;

	// Constructors
	public Node(int data) {
		this(data, null);
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	// Returns The Data
	public int getData() {
		return data;
	}

	// Returns Next Node
	public Node getNext() {
		return next;
	}

	// Sets Next Node
	public void setNext(Node next) {
		this.next = next;
	}
}
