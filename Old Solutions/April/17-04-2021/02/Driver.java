import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Meal[] meals = loadMeals();
		System.out.println("--------------- Meals At BJ's Restaurant ---------------");
		for (Meal meal : meals) {
			System.out.print(meal);
			System.out.println("---------------------------------------------------------");
		}
		System.out.print("What item are you searching for? ");
		String input = scanner.nextLine();

		boolean found = false;
		for (Meal meal : meals) {
			
			if (meal.contains(input)) {
				System.out.println("This meal had " + input + ":");
				System.out.println(meal);
				found = true;
			}
		}

		if (!found) {
			System.out.println("Meal not found!");
		}

		scanner.close();
	}

	public static Meal[] loadMeals() throws FileNotFoundException {
		Meal[] meals = new Meal[4];

		File dateFile = new File("data_file.txt");
		Scanner scanner = new Scanner(dateFile);

		for (int i = 0; i < 4; i++) {
			String appetizerName = scanner.nextLine(); 
			double appetizerCost = scanner.nextDouble(); scanner.nextLine();
			MealItem appetizer = new MealItem(appetizerName, appetizerCost);
			

			String entreeName = scanner.nextLine(); 
			double entreeCost = scanner.nextDouble(); scanner.nextLine();
			MealItem entree = new MealItem(entreeName, entreeCost);

			
			String dessertName = scanner.nextLine();
			double dessertCost = scanner.nextDouble(); scanner.nextLine();
			MealItem dessert = new MealItem(dessertName, dessertCost);

			meals[i] = new Meal(appetizer, entree, dessert);	
		}
		scanner.close();
		return meals;
	}
}
