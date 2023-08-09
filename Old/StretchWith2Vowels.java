import java.util.Scanner;

public class StretchWith2Vowels {
    public static void main(String[] args) {
        // Scanner For User Input
        Scanner in = new Scanner(System.in);
        
        // While * Is Not Entered
        while (true) {
            // Count Of Words Cotaining A Stretch Of Non-Z Characters
            int count = 0;
            // Sentence
            String sentence;

            // Input Sentence From The User
            System.out.print("Sentence: ");
            sentence = in.nextLine();

            // Check If The Sentence is '*'
            if (sentence.equals("*")) {
                System.out.println("Done");
                break;
            }


            // Split The Sentence Into Words
            String[] words = sentence.split("\\s+");
            // For Each Word in Words
            for (String word : words) {
                // Check If The Word Contains A Stretch Of Non-Z Characters
                if (containsNonZStretch(word)) {
                    // If Yes, Increase The Count
                    count++;
                }
            }

            // Print Count
            System.out.println("Matching Words = " + count);
        }
    }

    // Checks If The Word Contains A Stretch Of Non-Z Characters
    private static boolean containsNonZStretch(String word) {
        // Loop Through Each Character In The Word
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            // Get Current Character
            char ch = Character.toUpperCase(word.charAt(i));

            // Check If The Character Is Vowel
            if (isVowel(ch)) {
                // Increment The Vowel Count
                vowelCount++;
            }

            // If The Stretch Ended And Vowel Count Is Exactly 2 Vowels
            if ((i == (word.length() - 1) || ch == 'Z') && vowelCount == 2) {
                return true;
            } else if (ch == 'Z') {
                // If It's Z, Reset The Vowel Count
                vowelCount = 0;
            }

            // Debug
            // System.out.printf("Char = %c, Vowel Count = %d\n", ch, vowelCount);
        }
        return false;
    }

    // Checks If The Letter Is Vowel
    private static boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}