// QueueOfIntegers.java

public class QueueOfIntegers {
	// Private Attributes
	// To Store Integers
	int[] elements;
	// Item Currently In The Queue
	int size;

	// Default Constructor
	// Create A Queue Of Capacity = 16
	public QueueOfIntegers() {
		elements = new int[16];
		size = 0;
	}

	// Parameterized Constructor
	// Creates A Queue Of Specified Capacity
	public QueueOfIntegers(int capacity) {
		elements = new int[capacity];
		size = 0;
	}

	// Returns If The Queue Is Empty;
	public boolean empty() {
		return size == 0;
	}

	//  Returns The Integer At The Top of The Queue
	// Without Removing It
	public int peek() {
		if (getSize() > 0) {
			return elements[0];
		} else {
			System.out.println("Error: Queue is Empty.");
			return -1;
		}
	}

	// Adds An Item In The Queue
	public int push(int value) {
		if (size < elements.length) {
			elements[size] = value;
			size++;
			return value;
		} else {
			System.out.println("Error: Queue is Full.");
			return -1;
		}
	}

	// Removes An Item From The Queue
	public int pop() {
		if (getSize() > 0) {
			int item = peek();
			// Shift Each Element To Left
			// Removing The First One
			for (int i = 1; i < getSize(); i++) {
				elements[i - 1] = elements[i];
			}
			size--;
			return item;
		} else {
			System.out.println("Error: Queue is Empty.");
			return -1;
		}
	}

	public int getSize() {
		return size;
	}
}

