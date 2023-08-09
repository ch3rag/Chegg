package linkedlist;

public class MyLinkedList<T> {
	Node<T> front = null;
	Node<T> rear = null;

	int size = 0;

	public void addFirst(Node <T> node) {
		if (front == null) {
			front = node;
			rear = node;
		} else {
			node.next = front;
			front = node;
		}
		size++;
	}

	public void addLast(Node <T> node) {
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		size++;
	}

	public Node<T> removeFirst() {
		if (front == null ) {
			return null;
		}
		Node<T> temp = front;
		front = front.next;
		temp.next = null;
		size--;
		if (size == 0) {
			rear = null;
		}
		return temp;
	}

	public Node<T> first() {
		return front;
	}

	public int size() {
		return size;
	}
}
