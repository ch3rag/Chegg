import java.util.ArrayList;

/**
 * A question with a text and an answer.
 */

public class Question {
	private String text;
	private String answer;
	private ArrayList<String> choices;
	/**
	 * Constructs a question with empty question and answer.
	 */
	public Question() {
		text = "";
		answer = "";
		choices = new ArrayList<String>();
	}
	/**
	 * Sets the question text.
	 * @param questionText the text of this question
	 */
	public void setText(String questionText) {
		text = questionText;
	}
	/**
	 * Sets the answer for this question.
	 * @param correctResponse the answer
	 */
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	/**
	 * Checks a given response for correctness.
	 * @param response the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
		// Display Choices
		for (int i = 0; i < choices.size(); i++) {
			System.out.printf("  %-2d) %s\n", i + 1, choices.get(i));
		}
	}

	/**
	 * Adds an answer choice
	 * @param choice the choice to add in the choices
	 */
	public void addChoice(String choice) {
		choices.add(choice);
	}
}