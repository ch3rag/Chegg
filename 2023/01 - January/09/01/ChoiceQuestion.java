// ChoiceQuestion.java

/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
	// Add any needed instance variables, but don't store the choices
	// The choices should be added to the text of the superclass
	/* Your code goes here */

	/**
	 * Constructs a choice question with a given text and no choices.
	 * 
	 * @param questionText the text of this question
	 */
	public ChoiceQuestion(String questionText) {
		super.addLine(questionText);
	}

	/**
	 * Adds an answer choice to this question.
	 * 
	 * @param choice  the choice to add
	 * @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		// If The Choice is Correct, Set It As The Correct Answer
		if (correct) {
			setAnswer(choice);
		}
		// Add Current Choice To Question Text
		addLine(choice);
	}

}