// QueueDriver.java

import java.util.Scanner;

// Queue Driver Class
public class QueueDriver {
	// Main
	public static void main(String[] args) {
		// Scanner Object For Input From STDIN
		Scanner input = new Scanner(System.in);
		int choice;
		// Queue
		Queue queue = new Queue();
		int item;

		// Keep Displaying The Menu Until User Exits
		do {
			// Display Menu
			System.out.println("1. Enqueue an item");
			System.out.println("2. Dequeue an item");
			System.out.println("3. Print the size of the Queue");
			System.out.println("4. Print the elements of the Queue");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(input.nextLine());

			// Switch On User's Choice
			switch(choice) {
				case 1:
					// Enqueue An Item
					System.out.print("Enter an item: ");
					item = Integer.parseInt(input.nextLine());
					queue.enqueue(item);
					break;
				case 2:
					// Pop An Item
					if (queue.size() > 0) {
						item = queue.dequeue();
						System.out.println("Dequeued Value: " + item);
					} else {
						System.out.println("Queue is empty.");
					}
					break;
				case 3:
					// Print Size
					System.out.println("Size of the Queue is: " + queue.size());
					break;
				case 4:
					// Print Queue
					queue.print();
					break;
				case 5:
					// Exit
					System.out.println("Bye.");
					break;
				default:
					// Invalid Choice
					System.out.println("Invalid Choice.");
					break;
			}
			System.out.println();
		} while (choice != 5);

		// Clean Up
		input.close();
	}
}
