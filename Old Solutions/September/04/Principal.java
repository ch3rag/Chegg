// Principal.java

import java.util.Scanner;

public class Principal {
    // Main
    public static void main(String[] args) {
        // Scanner For User Input
        Scanner input = new Scanner(System.in);
        // Choice To Continue Input
        char choice;
        // Do While The User Exits
        do {
            // Input Student Id
            System.out.print("Enter Student Id: ");
            String id = input.nextLine();

            // Input Student Name
            System.out.print("Enter Student Name: ");
            String name = input.nextLine();

            // Input Student Semester
            System.out.print("Enter Student Semester: ");
            int semester = Integer.parseInt(input.nextLine());

            // String Of 4 Modules
            String[] modules = new String[4];
            // 2-D Array To Store Marks Of 2 Assignments In 4 Modules
            int[][] marks = new int[4][2];

            // For Each Module
            for (int i = 0; i < modules.length; i++) {
                // Input Module Name
                System.out.print("Enter The Module Name: ");
                modules[i] = input.nextLine();

                // Input Marks
                for (int j = 0; j < marks[0].length; j++) {
                    // Marks Should Be An Integer Between 0 And 100 Inclusize
                    // If User Enters Any Value Outside The Range, The Program Will Display Error Message
                    // And Ask The User To Enter The Value Again
                    System.out.printf("Enter The Marks In Assignment - %d (0-100): ", i);
                    marks[i][j] = Integer.parseInt(input.nextLine());
                    while (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.printf("Invalid Marks. Try Again: ");
                        marks[i][j] = Integer.parseInt(input.nextLine());
                    }
                }
            }

            // Create A Student Object With Captured Information
            Student student = new Student(id, name, semester, modules, marks);

            // Show Student Transcript
            student.showTranscript();

            // Ask User If He Wants To Input More Students
            System.out.print("\nEnter Y/y To Continue Or Any Other Character To Exit: ");
            choice = input.nextLine().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        // Clean Up
        input.close();
    }
}
