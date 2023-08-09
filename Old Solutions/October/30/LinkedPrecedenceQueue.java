interface PrecedenceQueueInterface<T> {
	/**
	 * Adds a New Entry to This Priority Queue.
	 * Add Should Maintain the Entries in Sorted Order by Their Precedences.
	 * That Is, the Highest Precedence Item Should Occur at the End of the Array,
	 * So Removing It Would Leave Other Entries in Their Present Places
	 * @param newEntry An Object to Be Added.
	 */
	public void add(T newEntry);

	/**
	 * Removes and Returns the Entry Having the Highest Precedence.
	 * @return	Either the Object Having the Highest Priority or, If the
	 * Precedence Queue Is Empty before the Operation, Null.
	 */
	public T remove();

	/**
	 * Retrieves and Returns the Entry Having the Highest Priority.
	 * @return	Either the Object Having the Highest Precedence or, If the
	 * Precedence Queue Is Empty, Null.
	 */
	public T peek();

	/**
	 * Detects Whether This Priority Queue Is Empty.
	 * @return	True, If the Precedence Queue Is Empty, or False Otherwise.
	 */
	public boolean isEmpty();


	/**
	 * Gets the Size of This Precedence Queue.
	 * @return	The Number of Entries Currently in the Precedence Queue.
	 */
	public int getSize();


	/**
	 * Removes All the Entries from This Precedence Queue.
	 */
	public void clear();
}	

public class LinkedPrecedenceQueue <T extends Comparable <? super T>> implements PrecedenceQueueInterface<T> {

	// Head Node
	private Node head;
	// Size
	private int size;

	// Add A Node
	public void add(T newEntry) {
		Node newNode = new Node(newEntry);
		if (getSize() == 0) {
			// Precedence Queue is Empty
			head = newNode;
		} else {
			if (head.getData().compareTo(newEntry) < 0) {
				// Head Priority Is Less Then New Entry
				// Make New Entry New Head
				newNode.setNextNode(head);
				head = newNode;
			} else {
				Node current = head;
				// Find Correct Position For New Node According To Its Priority
				while (current.getNextNode() != null && current.getNextNode().getData().compareTo(newEntry) > 0) {
					current = current.getNextNode();
				}
				// Add New Node At Correct Position
				newNode.setNextNode(current.getNextNode());
				current.setNextNode(newNode);
			}
		}

		size++;
	}

	// Remove A Node Value With Highest Priority
	 public T remove() {
		if (isEmpty()) {
			// Precedence Queue is Empty
			return null;
		} else {
			//  Return The Value Of Head Node
			T top = head.getData();
			// Advance Head Node To Next Node
			head = head.getNextNode();
			size--;
			return top;
		}
	 }

	
	// Returns The Node With Highest Priority Without Removing It
	public T peek() {
		if (isEmpty()) {
			// Precedence Queue is Empty
			return null;
		} else {
			//  Return The Value Of Head Node
			return head.getData();
		}
	}

	// Returns If The PrecedenceQueue is Empty
	public boolean isEmpty() {
		return getSize() == 0;
	}

	// Returns Size Of The PrecedenceQueue
	public int getSize() {
		return size;
	}

	// Removes All The Entries From Precedence Queue
	public void clear() {
		head = null;
		size = 0;
	}

	// Extra Method
	// Returns String Representation Of Precedence Queue
	@Override
	public String toString() {
		if (isEmpty()) {
			// PrecedenceQueue is Empty
			return "PrecedenceQueue is Empty.";
		} else {
			// Append All Nodes To String
			StringBuilder sb = new StringBuilder("PrecedenceQueue(" + getSize() + "): ");
			Node current = head;
			while (current != null) {
				sb.append(current.getData() + " ");
				current = current.getNextNode();
			}
			// Return The String
			return sb.toString();
		}
		
	}

	// Node Class
	private class Node {
		private T data;
		private Node next;
	
		private Node(T dataPortion) {
			this.data = dataPortion;
			next = null;
		}
	
		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}

		private T getData() {
			return data;
		}

		private void setData(T newData) {
			data = newData;
		}

		private Node getNextNode() {
			return next;
		}

		private void setNextNode(Node nextNode) {
			next = nextNode;
		}
	}


	// Main
	public static void main(String[] args) {
		// Test Queue's Operations
		LinkedPrecedenceQueue<Integer> queue = new LinkedPrecedenceQueue<Integer>();
		System.out.println(queue);
		System.out.println("Adding 6, 7, 10, 2, 3");
		queue.add(6);
		queue.add(7);
		queue.add(10);
		queue.add(2);
		queue.add(3);
		System.out.println(queue);
		System.out.println("Peek: " + queue.peek());
		System.out.println("Remove: " + queue.remove());
		System.out.println("Remove: " + queue.remove());
		System.out.println("Remove: " + queue.remove());
		System.out.println(queue);
		System.out.println("Clearing...");
		queue.clear();
		System.out.println(queue);
		queue.add(6);
		queue.add(7);
		queue.add(10);
		queue.add(2);
		queue.add(3);
		System.out.println(queue);

	}
}
