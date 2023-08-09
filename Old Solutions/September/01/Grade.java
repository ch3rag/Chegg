
import java.util.Scanner;
// Grade.java
public class Grade {
    // Main
    public static void main(String[] args) {
        // Name And Marks Of Student With Maximum Name
        String maxName = "";
        int maxMarks = Integer.MIN_VALUE;

        // Scanner For User Input
        Scanner input = new Scanner(System.in);

        String data;
        // While The User Does Not Enters A Empty Line
        while ((data = input.nextLine()).length() != 0) {
            // Split The Data Into Tokens
            String[] tokens = data.split("\\s");
            // Get Marks
            int marks = Integer.parseInt(tokens[2]);
            // Check If Current Marks Greater Than Max Marks
            if (marks > maxMarks) {
                // Assign Name And Marks To MaxName And MaxMarks
                maxName = tokens[0] + " " + tokens[1];
                maxMarks = marks;
            }
        }

        // Print Max And Max Names
        System.out.printf("%s %d\n", maxName, maxMarks);

        // Clean Up
        input.close();
    }
}