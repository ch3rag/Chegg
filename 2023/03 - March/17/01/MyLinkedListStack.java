import linkedlist.MyLinkedList;
import linkedlist.Node;

public class MyLinkedListStack<T> implements MyStack<T> {
	// We Are Going To Implement The Stack Using A Linked List
	MyLinkedList<T> stackList;

	// Constructor
	public MyLinkedListStack() {
		// Initialize The Linked List
		stackList = new MyLinkedList<T>();
	}

	// Push An Element Onto The Stack
	public void push(T o) {
		// Initialize A New Node And Push It In The Front Of The Linked List
		stackList.addFirst(new Node<T>(o));
	}

	// Pop The Top Element Off The Stack And Return It
	public Node<T> pop() {
		// Remove The First Element Off The Linked List And Return It
		return stackList.removeFirst();
	}
	// Return The Top Element Of The Stack Without Popping It
	public Node<T> peek() {
		// Return The First Element Of The Linked List
		return stackList.first();
	}
	// Returns The Size Of The Stack
	public int size() {
		// Return The Size Of The Linked List
		return stackList.size();
	}
	// Returns True If The Stack Is Empty, False Otherwise
	public boolean isEmpty() {
		return stackList.size() == 0;
	}
}
