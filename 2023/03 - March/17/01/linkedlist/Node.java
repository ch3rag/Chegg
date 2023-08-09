package linkedlist;

public class Node <T> {
	T element;
	Node<T> next;

	public Node(T e) {
		this.element = e;
	}

	public T getElement() {
		return element;
	}

	@Override
	public String toString() {
		return "Node with element " + element.toString();
	}
}