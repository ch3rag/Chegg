// StudentInfoSys.java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentInfoSys  {
	// Main
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// Array To Hold All The Course Objects
		Course[] courses = new Course[100];

		// Number Of Courses Read From The File
		int numCourses = 0;

		// Display Welcome Message
		System.out.println("Welcome To Student Info System.");

		// Infinite Loop
		while (true) {
			// Display Options To The User
			System.out.println("Please Select an Option:");
			System.out.println("(R)ead A Student Report");
			System.out.println("(S)Show All Courses And GPA");
			System.out.println("(E)xit");
			System.out.print("Enter Your Option >> ");

			// Read Choice
			String choice = input.nextLine();
		
			// Switch On The Basis Of Choice
			switch(choice.toUpperCase()) {
				case "R":
					// Read Course Data
					// Input Student Id
					System.out.print("Enter Student Id: ");
					String studentId = input.nextLine();

					// Open The File For Reading
					// Append .txt To Student Id For The File Name
					try (BufferedReader br = new BufferedReader(new FileReader(new File(studentId + ".txt")))) {
						// A Single Line Read From The File
						String record;
						// Reset Number Of Courses
						numCourses = 0;
						// While There Are Courses To Read From The File
						while ((record = br.readLine()) != null) {
							// Split The Single Record Into Fields
							String[] fields = record.split(",");

							// Extract Code, Credit And Letter Grade
							String code = fields[0].strip();
							int credit = Integer.parseInt(fields[1].strip());
							String letterGrade = fields[2].strip();

							// Add Current Courses To The Array
							courses[numCourses++] = new Course(code, credit, letterGrade);
						}
					} catch (FileNotFoundException ex) {
						// File Not Found
						System.out.println("Student Id Not Found.");
					} catch (IOException ex) {
						// IO Error
						System.out.println("An Error Occurred While Reading The File.");
					}
					break;
				case "S":
					// Display Course Info And GPA
					// Check If Any Courses Are Read
					if (numCourses > 0) {
						// Initial GPA And Total Credits
						double gpa = 0.0;
						int credits = 0;
						// Loop Though Each Course
						for (int i = 0; i < numCourses; i++) {
							// DIsplay Course Info
							System.out.printf("Course #%d: %s\n", (i + 1), courses[i]);
							// Add Points X Credit Into GPA
							gpa += courses[i].getPoints() * courses[i].getCredit();
							// Accumulate Total Credits
							credits += courses[i].getCredit();
						}

						// Divide Total Credits By GPA
						gpa /= credits;

						// Display GPA
						System.out.printf("GPA: %.2f\n", gpa);
					} else {
						System.out.println("No Courses Read.");
					}
					break;
				case "E":
					// Exit The Program
					System.out.println("Thank You For Using!");
					input.close();
					System.exit(0);
				default:
					// Invalid Input
					System.out.println("Invalid Choice.");
			}
		}
	}
}
