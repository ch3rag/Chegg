public class Main {
	public static void main(String[] args) {
		// Create A Queue
		MyQueue queue = new MyQueue();

		// Print The Queue
		System.out.println(queue);

		// Enqueue Some Items
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		// Print The Queue
		System.out.println(queue);

		// Peek At The Queue
		System.out.println("Peek Returns: " + queue.peek());

		// Find Index Of Some Items
		System.out.println("Index Of 20? " + queue.indexOf(20));
		System.out.println("Index Of 30? " + queue.indexOf(30));
		System.out.println("Index Of 40? " + queue.indexOf(40));

		// DeQueue Some Items
		System.out.println("DeQueue Returns: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("DeQueue Returns: " + queue.dequeue());
		System.out.println(queue);
		System.out.println("DeQueue Returns: " + queue.dequeue());
		System.out.println(queue);
	}
}
