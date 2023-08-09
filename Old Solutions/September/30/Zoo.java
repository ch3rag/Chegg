// Zoo.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zoo {
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner input = new Scanner(System.in);

		// ArrayList To Hold Animals
		ArrayList <String> animals = new ArrayList <String>();

		// Input First Animal
		System.out.print("Enter An Animal In The Zoo (Enter 'Done' To End): ");
		String animal = input.nextLine();
		// Keep Adding Animals Until User Enters "Done"
		while (!animal.equalsIgnoreCase("Done")) {
			animals.add(animal);
			// Input Next Animal
			System.out.print("Enter The Next Animal In The Zoo (Enter 'Done' To End): ");
			animal = input.nextLine();
		}

		// Sort The Animals In Alphabetical Order
		Collections.sort(animals);

		// Display The Inventory
		System.out.println("\nAnimal Inventory\n----------------");
		for (String myAnimal : animals) {
			System.out.println(myAnimal);
		}

		// Clean Up
		input.close();
	}
}