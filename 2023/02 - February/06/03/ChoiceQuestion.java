// ChoiceQuestion.java

/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
	/**
	 * Constructs a choice question with a given text and no choices.
	 * @param questionText the text of this question
	 */
	public ChoiceQuestion(String questionText) {
		addLine(questionText);
	}

	/**
	 * Adds an answer choice to this question.
	 * @param choice the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		addLine(choice);
		if (correct) {
			setAnswer(choice);
		}
	}
}