public class TestQueue {
	public static void main(String[] args) {
		QueueOfIntegers myQueue = new QueueOfIntegers(3);
		System.out.println("Create A Queue With Capacity = 3");
		// Print Size
		System.out.println("Size Of Queue: " + myQueue.getSize());

		// Add 3
		System.out.println("=> Adding 90, 55, 20");
		myQueue.push(90);
		myQueue.push(55);
		myQueue.push(20);
		
		
		// Print Size
		System.out.println("Size Of Queue: " + myQueue.getSize());

		// Adding One More
		System.out.println("Adding 60");
		myQueue.push(60);
		
		// Pop
		System.out.println("Peeking An Element: " + myQueue.peek());
		System.out.println("Popping An Element: " + myQueue.pop());
		System.out.println("Popping An Element: " + myQueue.pop());
		System.out.println("Size Of Queue: " + myQueue.getSize());

		// Adding 2 More
		System.out.println("Adding 1, 2");
		myQueue.push(1);
		myQueue.push(2);
		System.out.println("Popping An Element: " + myQueue.pop());
		System.out.println("Popping An Element: " + myQueue.pop());
		System.out.println("Popping An Element: " + myQueue.pop());
		System.out.println("Popping An Element: " + myQueue.pop());
	}
}
