import java.util.Scanner;

// PhoneKeyPad.java
public class PhoneKeyPad {
    // Main
    public static void main(String[] args) {
        // Scanner For User Input
        Scanner input = new Scanner(System.in);
        
        // Display Prompt
        System.out.print("Enter a Letter: ");
        // Input Letter
        char ch = input.nextLine().charAt(0);

        // Convert Character To Upper Case For Easier Comparision
        ch = Character.toUpperCase(ch);

        // Check If The Letter Is Valid Alphabet
        if (ch < 'A' || ch > 'Z') {
            System.out.println(ch + " is an invalid input.");
        } else {
            // Calculate Letter Position
            // Example: A = 0, B = 1, C = 2, ..., Z = 25
            int letterPosition = ch - 'A';
            // Key Number Wil Be = (Position / 3) + 2
            int key = (letterPosition / 3) + 2;

            // Special Cases
            if (key > 9) key = 9;
            if (ch == 'V') key = 8;
            if (ch == 'S') key = 7;

            // Print Key Number
            System.out.println("The corresponing number is " + key);
        }
        // Clean Up
        input.close();
    }
}
