import java.util.Random;

// QuestionOne.java

public class QuestionOne {
	// Main
	public static void main(String[] args) {
		// Create A Random Object To Seed Our Starting Value
		Random randomizer = new Random();

		// Set Our Variable
		int count = randomizer.nextInt(5);
		String message;

		
		if (count == 0) {
			// If Count is Zero, Output Will Be No Items
			message = "There are no items.";
		} else if (count == 1) {
			// If Count is 1, Output Will Be "There is 1 item."
			message = "There is 1 item.";
		} else {
			// If Count is Greater Than 1, Output Will Be "There are {count} items.",
			// Where {count} is replaced by the value of count.
			message = "There are " + count + " items.";
		}

		System.out.println(message);
	}
}
