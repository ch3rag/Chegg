// TheHungryKnight.java
import java.util.Scanner;

public class TheHungryKnight {
    public static void main(String[] args) {
        // Scanner For User Input
        Scanner input = new Scanner(System.in);

        // Print Welcome Message
        System.out.println("Welcome to the Red Baron's Inn and Tavern, Sir. We are honored to serve the King's men during these trying days as our Kingdom readies itself for War. Your warhorses shall be looked after at our stable and your rooms prepared for you once you have broken your fast with us for the night. Please free to encourage your men to eat and drink as much as desired, Sir Knight. The Crown will pay for your meal and lodging for you and your horses, Sir. We merely need to keep our accounting accurate for the Baron's tax collector.\n");

        // Input Name of The Hungry Knight From The User
        System.out.println("May I ask for your name for my records, Sir Knight?");
        String name = input.nextLine();

        // Break The Name Into Tokens (Words)
        String[] tokens = name.split(" ");
        // Check If The Name Is In Correct Format
        // For Example If User Enter "Robin Brave" Change To "Sir Robin the Brave"
        if (tokens.length == 2) {
            name = "Sir " + tokens[0] + " the " + tokens[1];
        }

        // Input Number Of Roast Pheasant
        System.out.println("\nHow many plates of Roast Pheasant will your party require us to prepare,  " + name + "?");
        int pheasant = Integer.parseInt(input.nextLine());

        // Input Number Of Beef Stew
        System.out.println("\nHow many bowls of Beef Stew will your party require us to prepare, " + name + "?");
        int stew = Integer.parseInt(input.nextLine());

        // Input Number Of Fine Bread
        System.out.println("\nHow many loafs of fine bread will your party require us to prepare, " + name + "?");
        int bread = Integer.parseInt(input.nextLine());

        // Input Number Of Fresh Fruit
        System.out.println("\nHow many pieces of fresh fruit will your party require us to prepare, " + name + "?");
        int fruit = Integer.parseInt(input.nextLine());

        // Calculate Sub-Total
        double subTotal = 15.15 * pheasant + 3.79 * stew + 5.37 * bread + 1.29 * fruit;

        // Display Sub-Total
        System.out.printf("\nThe Sub-Total is: %.2f silver pieces.\n", subTotal);

        // Calculate Tax
        double tax = subTotal * 0.05;

        // Display Tax
        System.out.printf("The Baro's 5%% tax on your order is: %.4f silver pieces.\n", tax);

        // Calculate Total
        double total = subTotal + tax;

        // Display Total
        System.out.printf("The final tally for the meal tonight is: %.4f silver pieces.\n", total);
    }
}