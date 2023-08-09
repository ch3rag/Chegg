import java.util.NoSuchElementException;

public class MyQueue implements IQueue {

	private Node head;
	private Node tail;
	private int numNodes;

	// Constructor
	public MyQueue() {
		this.head = null;
		this.tail = null;
		this.numNodes = 0;
	}

	// Enqueues An Item At The Tail Of The Queue
	@Override
	public void enqueue(Object item) {
		Node newNode = new Node(item);
		
		// If Queue Is Empty
		if (tail == null) {
			// Make Head And Tail Point To Same Node
			head = tail = newNode;
		} else {
			// Else, Add Next To Tail
			tail.next = newNode;
			// New Node Is Now The New Tail
			tail = newNode;
		}
		// Increment The Number Of Nodes
		numNodes++;
	}

	// Dequeues An Item From The Head Of The Queue
	@Override
	public Object dequeue() {
		Object data;

		// If Queue Is Empty
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty.");
		} else if (head == tail) {
			// There Is Only One Node In The Queue
			data = head.data; // Or tail.data
			head = tail = null;
		} else {
			// Remove The Head
			data = head.data;
			head = head.next;
		}
		// Decrease The Number Of Nodes
		numNodes--;
		// Return The Data
		return data;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty.");
		} else {
			// Return The Item At The Head Of The Queue
			return head.data;
		}
	}

	@Override
	public int indexOf(Object item) {
		int index = -1;
		boolean found = false;
		// Iterate Through Queue
		Node current = head;
		while (current != null && !found) {
			// Compare Current Items
			if (current.data.equals(item)) {
				found = true;
			}
			// Advance Index And Node
			index++;
			current = current.next;
		}

		// Return Index If Found, Else -1
		if (found) {
			return index;
		} else {
			return -1;
		}
	}

	// Returns The Size Of The Queue
	@Override
	public int getSize() {
		// Simply Return NumNodes
		return numNodes;
	}

	// Returns True If The Number Of Nodes Is Zero
	@Override
	public boolean isEmpty() {
		return numNodes == 0;
	}

	// An Additional toString()
	// Returns String Representation Of Queue
	@Override
	public String toString() {
		if (isEmpty()) {
			return "Queue: NULL";
		}
		// Build String
		StringBuilder sb = new StringBuilder("Queue: ");
		// Iterate Through Each Node
		Node current = head;
		while (current.next != null) {
			// Append The Data Of Each Node
			sb.append(current.data + " -> ");
			current = current.next;
		}
		// Append Last Node
		sb.append(current.data);
		// Return String
		return sb.toString();
	}


	// Represents A Single Node In The Queue
	// This Is An Inner Class
	class Node {
		// Data Of The Node
		public Object data;
		// Reference To The Next Node
		public Node next;

		// Constructor
		public Node(Object data) {
			this(data, null);
		}
		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
