// Queue.java

// Queue Class
public class Queue {
	// Private Attributes
	private int size;
	private Node head;
	private Node tail;

	// Constructor
	public Queue() {
		this.tail = this.head = null;
		this.size = 0;
	}

	// Enqueue An Item
	public void enqueue(int item) {
		// Add New Node At The Rear
		Node node = new Node(item);
		if (head == null) {
			head = tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
		size++;
	}

	// Dequeue An Item
	public int dequeue() {
		// Remove The Head And Return Data
		int data = -1;
		if (head != null) {
			data = head.getData();
			head = head.getNext();
			size--;
		}

		if (head == null) {
			tail = head;
		}
		return data;
	}

	// Returns The Size Of The Queue
	public int size() {
		return size;
	}

	// Prints All Item In The Queue
	public void print() {
		if (size > 0) {
			System.out.print("Queue: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println();
		} else {
			System.out.println("Queue is empty.");
		}
	}
}
