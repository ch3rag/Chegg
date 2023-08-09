import java.nio.file.ClosedWatchServiceException;

// QuestionTwo.java

public class QuestionTwo {
	// Main
	public static void main(String[] args) {
		int index = 0;
		while (index < 100000) {
			index += 1;

			// If Index is Between 5 And 7, Continue
			if (index >= 5 && index <= 8) {
				continue;
			}

			// Display The Index
			System.out.print(index + " ");

			// If Index is 10, Exit The Loop
			if (index == 10) {
				break;
			}
		}
	}
}
