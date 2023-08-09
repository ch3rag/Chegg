// Test Class
public class MyLinkedListStackTest {
	// Main
	public static void main(String[] args) {
		// Initialize A New Stack
		MyLinkedListStack<Integer> stack = new MyLinkedListStack<Integer>();

		// Print Size
		System.out.println("Size Of Stack: " + stack.size());

		// Print Is Empty
		System.out.println("Stack isEmpty?: " + stack.isEmpty());

		// Add Some Items In The Stack
		System.out.println("Pushing 10, 5, 18, 22");
		stack.push(10);
		stack.push(5);
		stack.push(18);
		stack.push(22);

		// Print Size
		System.out.println("Size Of Stack: " + stack.size());

		// Print Is Empty
		System.out.println("Stack isEmpty?: " + stack.isEmpty());

		// Top Of The Stack
		System.out.println("Peeking On The Top Element: " + stack.peek());

		// Popping Some Elements
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());

		// Print Size
		System.out.println("Size Of Stack: " + stack.size());

		// Print Is Empty
		System.out.println("Stack isEmpty?: " + stack.isEmpty());

	}
}
