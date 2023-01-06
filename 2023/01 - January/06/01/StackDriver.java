// StackDriver.java

import java.util.Scanner;

// Stack Driver Class
public class StackDriver {
	// Main
	public static void main(String[] args) {
		// Scanner Object For Input From STDIN
		Scanner input = new Scanner(System.in);
		int choice;
		// Stack
		Stack stack = new Stack();
		int item;

		// Keep Displaying The Menu Until User Exits
		do {
			// Display Menu
			System.out.println("1. Push a value onto Stack");
			System.out.println("2. Pop a value from the Stack");
			System.out.println("3. Print the size of the Stack");
			System.out.println("4. Print the elements of the Stack");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = Integer.parseInt(input.nextLine());

			// Switch On User's Choice
			switch(choice) {
				case 1:
					// Push An Item
					System.out.print("Enter an item: ");
					item = Integer.parseInt(input.nextLine());
					stack.push(item);
					break;
				case 2:
					// Pop An Item
					if (stack.size() > 0) {
						item = stack.pop();
						System.out.println("Popped Value: " + item);
					} else {
						System.out.println("Stack is empty.");
					}
					break;
				case 3:
					// Print Size
					System.out.println("Size of the stack is: " + stack.size());
					break;
				case 4:
					// Print Stack
					stack.print();
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
