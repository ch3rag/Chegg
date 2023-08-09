import java.util.Scanner;

/**
 * Main routine for quiz
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    /**
     * Quiz student on set of arithmetic problems
     * @param args ignored
     */
    public static void main(String[] args) {
        int numQuestions = 6;
        int correct = 0;
        int wrong = 0;
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);

        System.out.println("*** Arithmetic Quiz - Answer " + numQuestions + " Questions ***");
		for (int i = 0; i < numQuestions; ++i) {
			if (quiz.doQuiz()) {
				correct++;
			} else {
				wrong++;
			}
		}

        System.out.println("Your score: " + correct + " Correct  " + wrong + " Wrong");
		if (wrong == 0) {
			System.out.println("Excellent!");
		}
    }
}