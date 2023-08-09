// LabProgram.java
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

// Lab Program Class
public class LabProgram {
	// Main
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner scanner = new Scanner(System.in);

		// Read The File Name From The User
		System.out.print("Enter Input Data File Name: ");
		String fileName = scanner.nextLine();

		// Read The Data From The File Using Scanner
		try (Scanner fileScanner = new Scanner(new FileInputStream(fileName))) {
			// Number Of Students
			int numStudents = 0;
			// Average Scores
			double avgMidTerm1Score = 0.0;
			double avgMidTerm2Score = 0.0;
			double avgFinalScore = 0.0;

			// Output File
			PrintWriter writer = new PrintWriter(new FileOutputStream("report.txt"));
			
			// Read The File Using Scanner
			while (fileScanner.hasNext()) {
				// Process The Data				
				// Get Individual Data Points
				// First And Last Names
				String lastName = fileScanner.next();
				String firstName = fileScanner.next();

				// Scores
				int midTerm1Score = fileScanner.nextInt();
				int midTerm2Score = fileScanner.nextInt();
				int finalScore = fileScanner.nextInt();
				
				// Average
				double average = (midTerm1Score + midTerm2Score + finalScore) / 3.0;

				// Grade
				char grade = getGradeLetter(average);

				// Add Scores To Average
				avgMidTerm1Score += midTerm1Score;
				avgMidTerm2Score += midTerm2Score;
				avgFinalScore += finalScore;
				numStudents++;

				// Output Data To Report.txt
				writer.printf("%s\t%s\t%d\t%d\t%d\t%c\n",
					lastName, firstName, midTerm1Score, midTerm2Score, finalScore, grade);
			}

			// Print Empty Line
			writer.println();

			// Compute Averages
			avgMidTerm1Score /= numStudents;
			avgMidTerm2Score /= numStudents;
			avgFinalScore /= numStudents;

			// Print Averages
			writer.printf("Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n",
				avgMidTerm1Score, avgMidTerm2Score, avgFinalScore);

			// Clean Up
			writer.close();
			fileScanner.close();

		} catch (IOException ex) {
			System.out.print(ex.getMessage());
		}
		// Clean Up
		scanner.close();
	}

	// Return Grade Letter Based On The Average
	public static char getGradeLetter(double average) {
		if (average >= 90) {
			return 'A';
		} else if (average >= 80) {
			return 'B';
		} else if (average >= 70) {
			return 'C';
		} else if (average >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}


