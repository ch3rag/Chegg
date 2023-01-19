import java.util.NoSuchElementException;

public class MyLinkedList implements MyList {
	// Fields
	private Node head = null;
	private int size = 0;

	// Appends A Node At The End Of The Linked List
	@Override
	public void append(Object o) {
		// Create A New Node
		Node node = new Node();
		node.data = o;
		node.next = null;

		// If List Is Empty, New Node Is Head
		if (head == null) {
			head = node;
		} else {
			// Append To The End
			// Traverse To Last Node
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			// Append To End
			current.next = node;
			// Increment The Size
			size++;
		}
	}


	// Appends A Node At The Ith Index Of The Linked List
	@Override
	public void insertAt(int index, Object o) {
		// Check If The Index Is Valid
		if (index < 0 || index > size + 1) {
			throw new NoSuchElementException("Index is out of range.");
		} else {
			// Create A New Node
			Node node = new Node();
			node.data = o;

			// If I == 0, Insert At Head
			if (index == 0) {
				node.next = head;
				head = node;
			} else {
				// Get To The (I - 1)th Node 
				Node current = head;
				for (int i = 0; i < index - 1; i++) {
					current = current.next;
				}
				// Append New Node Next To It
				node.next = current.next;
				current.next = node;
			}
			// Increment The Size
			size++;
		}
	}

	// Removes The Ith Element From The 
	@Override
	public void removeAt(int index) {
		// Check If Index Is Valid
		if (index < 0 || index > size) {
			throw new NoSuchElementException("Index is out of range.");
		} else {
			// Check If Index == 0, Remove Head
			if (index == 0) {
				head = head.next;
			} else {
				// Get To The (I - 1)th Node 
				Node current = head;
				for (int i = 0; i < index - 1; i++) {
					current = current.next;
				}
				// Remove Ith Node
				if (current.next != null) {
					current.next = current.next.next;
				} else {
					// Tail Node
					current.next = null;
				}
			}
			// Decrement The Size
			size--;
		}
	}

	// Returns The Element At Ith Index
	@Override
	public Object getAt(int index) {
		if (index < 0 || index > size) {
			throw new NoSuchElementException("Index is out of range.");
		} else {
			// Get To Ith Index
			Node current = head;
			for (int i = 0; i < index; i++) {
				current = current.next;
			}
			return current.data;
		}
	}

	// Returns The Size Of The Linked List
	@Override
	public int getSize() {
		return size + 1;
	}

	@Override
	public MyListIterator getIterator() {
		return new MyLinkedListIterator();
	}

	private class MyLinkedListIterator implements MyListIterator {

		Node currentNode = null;

		@Override
		public Object next() {
			if (currentNode != null) {
				currentNode = currentNode.next;
			} else {
				currentNode = head;
			}

			return currentNode.data;
		}

		@Override
		public boolean hasNext() {
			if (currentNode != null) {
				return currentNode.next != null;
			} else {
				return head != null;
			}
		}

	}

	class Node {
		public Object data;
		public Node next = null;
	}
	
}
