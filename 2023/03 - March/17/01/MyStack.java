import linkedlist.Node;

// MyStack.java
// MyStack Interface

public interface MyStack<T> {
	// Push An Element Onto The Stack
	public void push(T o);
	// Pop The Top Element Off The Stack And Return It
	public Node<T> pop();
	// Return The Top Element Of The Stack Without Popping It
	public Node<T> peek();
	// Returns The Size Of The Stack
	public int size();
	// Returns True If The Stack Is Empty, False Otherwise
	public boolean isEmpty();
}
