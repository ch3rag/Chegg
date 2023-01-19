// GroceryList.java

import java.util.Scanner;

public class GroceryList {
	// Main Function
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// Input Store's Name
		System.out.print("Store: ");
		String storeName = input.nextLine();

		// Input Food Item - 1
		System.out.print("Amount - 1: ");
		int amount1 = input.nextInt();
		System.out.print("Food Item - 1: ");
		String food1 = input.next();
		

		// Input Food Item - 2
		System.out.print("Amount - 2: ");
		int amount2 = input.nextInt();
		System.out.print("Food Item - 2: ");
		String food2 = input.next();

		// Input Drink
		System.out.print("Amount - 3: ");
		int amount3 = input.nextInt();
		System.out.print("Drink: ");
		String drink = input.next();

		// Input Food Item - 3
		System.out.print("Weight - 1: ");
		double weight1 = input.nextDouble();
		System.out.print("Food Item - 3: ");
		String food3 = input.next();

		// Input Food Item - 4
		System.out.print("Weight - 2: ");
		double weight2 = input.nextDouble();
		System.out.print("Food Item - 4: ");
		String food4 = input.next();

		
		// Pass Args To Function
		String groceryList = makeGroceryList(storeName, amount1, amount2, amount3, weight1, weight2, food1, food2, food3, food4, drink);

		// Print Grocery List
		System.out.println();
		System.out.print(groceryList);

		// Clean Up
		input.close();
	}

	public static String makeGroceryList(String store, int amount1, int amount2, int amount3,
		double weight1, double weight2, String food1, String food2, String food3, String food4,
		String drink) {

			// !! Replace The Below String With Your Actual Name !!
			String myName = "Peter Parker";

			String groceryList = "";

			// Make Grocery List
			groceryList += "Grocery List for " + myName + "\n";
			groceryList += "I am going to " + store.trim().toUpperCase() + " to get:\n\n";
			groceryList += amount1 + " " + food1.trim().toLowerCase() + "\n";
			groceryList += amount2 + " " + food2.trim().toLowerCase() + "\n";
			groceryList += amount3 + " gallons of " + drink.trim().toLowerCase() + "\n";
			groceryList += weight1 + " pounds of " + food3.trim().toLowerCase() + "\n";
			groceryList += weight2 + " pounds of " + food4.trim().toLowerCase();

			// Return List
			return groceryList;
	}
}