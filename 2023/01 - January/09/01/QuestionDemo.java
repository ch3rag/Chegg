// QuestionDemo.java

import java.util.Scanner;

// Question Demo Class
public class QuestionDemo {
	// Main
	public static void main(String[] args) {
		// Create A Quiz With Two Questions
		Question[] quiz = new Question[2];

		// First Question In The Quiz
		quiz[0] = new Question();
		quiz[0].addLine("Who was the inventor of Java?");
		quiz[0].setAnswer("James Gosling");

		// Second Question In The Quiz
		ChoiceQuestion question = new ChoiceQuestion(
				"In which country was the inventor of Java born?");
		question.addChoice("Australia", false);
		question.addChoice("Canada", true);
		question.addChoice("Denmark", false);
		question.addChoice("United States", false);
		quiz[1] = question;

		// Scanner Object For User Input
		Scanner in = new Scanner(System.in);

		// For Each Question In The Quiz
		for (Question q : quiz) {
			// Display The Question
			q.display();
			// Input User's Answer
			System.out.println("Your answer: ");
			String response = in.nextLine();
			// Check The Answer And Print The Result
			System.out.println(q.checkAnswer(response));
		}

		// Clean Up
		in.close();
	}
}