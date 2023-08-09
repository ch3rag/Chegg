import java.util.Scanner; 

public class BadDate {

    // Inputs An Int From The User And Returns It To The Caller 
    private static int houesKeeping(String prompt) {
        // Display Prompt
        System.out.print(prompt);
        // Scanner For User Input
        Scanner input = new Scanner(System.in);
        // Input Value And Parse String To Integer
        int value = Integer.parseInt(input.nextLine());
        // Return The Value To The Caller
        return value;
    }

    // Receives A Date And Checks If The Date is Valid
    // Returns A Boolean Indicating The Validity Of The Date
    private static boolean detailLoop(int month, int day, int year) {
        // Constant For Min Max Day, Month, and Year Values
        final int MIN_YEAR = 0, MIN_MONTH = 1, MAX_MONTH = 12, MIN_DAY = 1, MAX_DAY = 31;
        boolean validDate = true;

        // Check Year
        if (year <= MIN_YEAR) {
            validDate = false;
        // Check Month
        } else if (month < MIN_MONTH || month > MAX_MONTH) {
            validDate = false;
        // Check Day
        } else if (day < MIN_DAY || day > MAX_DAY) {
            validDate = false;
        }

        // Return Date Validity
        return validDate;
    }

    // Display The Result Of The Date Validation
    private static void endOfJob(int month, int day, int year, boolean validDate) {
        if (validDate) {
            // Date Is Valid
            System.out.printf("%02d/%02d/%04d is a Valid Date.",
                month, day, year);
        } else {
            // Date Is Invalid
            System.out.printf("%02d/%02d/%04d is a Invalid Date.",
                month, day, year);
        }
    }

    // Main
    public static void main(String args[]) {
        // Input Day, Month, Year
        int month = houesKeeping("Enter Month: ");
        int day = houesKeeping("Enter Day: ");
        int year = houesKeeping("Enter Year: ");

        // Validate Inputs
        boolean validDate = detailLoop(month, day, year);

        // Display Results
        endOfJob(month, day, year, validDate);
    }
}