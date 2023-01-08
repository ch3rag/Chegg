// LabProgram.java

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Lab Program Class
public class LabProgram {
	// Main
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner scnr = new Scanner(System.in);

		// Read The File Name From The User
		System.out.print("Enter Input Data File Name: ");
		String fileName = scnr.nextLine();

		// Read The Data From The File Using Buffered Reader
		try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			// Number Of Students
			int numStudents = 0;
			// Average Scores
			double avgMidTerm1Score = 0.0;
			double avgMidTerm2Score = 0.0;
			double avgFinalScore = 0.0;

			// Output File
			File outputFile = new File("report.txt");
			PrintWriter writer = new PrintWriter(outputFile);
			
			// Read The File Line By Line
			String line;
			while ((line = br.readLine()) != null) {
				// Process The Data
				// Split The Data Using Tab Separator
				String[] data = line.split("\t");
				
				// Get Individual Data Points
				// First And Last Names
				String lastName = data[0];
				String firstName = data[1];

				// Scores
				int midTerm1Score = Integer.parseInt(data[2]);
				int midTerm2Score = Integer.parseInt(data[3]);
				int finalScore = Integer.parseInt(data[4]);
				
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
			
		} catch (IOException ex) {
			System.out.print(ex.getMessage());
		}

		// Clean Up
		scnr.close();
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


