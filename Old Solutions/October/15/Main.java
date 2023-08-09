import java.util.Scanner;

// Main.java

public class Main {
	// Main
	public static void main(String[] args) {
		// Test Question Class

		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// Create A New Java Question
		Question javaQuestion = new Question();

		// Set It's Text
		javaQuestion.setText("Java Programming Language is an?");

		// Add Some Choices
		javaQuestion.addChoice("Function Oriented Language");
		javaQuestion.addChoice("Instance Oriented Language");
		javaQuestion.addChoice("Procedure Oriented Language");
		javaQuestion.addChoice("Object Oriented Language");

		// Set The Correct Answer
		javaQuestion.setAnswer("Object Oriented Language");

		// Display The Question
		javaQuestion.display();

		// Input User's Answer
		System.out.print("Enter Your Answer: ");
		String answer = input.nextLine();


		// Check If It's Correct And Display Result Accordingly
		if (javaQuestion.checkAnswer(answer)) {
			System.out.println("Correct.");
		} else {
			System.out.println("Incorrect.");
		}

		// Clean Up
		input.close();
	}
}