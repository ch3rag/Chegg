#include <stdio.h>

// Total Food Function
void totalFood(int, double, int);

int main() {
	// Part 1(A)
	// Meal Number As An Integer
	int mealNumber;
	// Number Of Food Items As An Integer
	int foodItems;
	// Amount In Ounces That Is Served In Main Dish As Double
	double amtMainDish;
	// Number Of Hobbits Sharing The Meal As Integer
	int numHobbits;
	// Name Of The Hobbit As Character String
	char hobbitName[] = "Rosie Bumbleroot";

	// Input The Meal Number
	printf("Hello %s, which meal? The possible meal numbers are:\n", hobbitName);
	printf("1: Breakfast\n2: Second Breakfast\n3: Elevenses\n4: Luncheon\n");
	printf("5: Afternoon Tea\n6: Dinner\n7: Supper\n");
	printf("Enter A Choice: ");
	scanf("%d", &mealNumber);

	// Input Number Of Food Items
	printf("How many of food items will be served in the selected meal?: ");
	scanf("%d", &foodItems);

	// Input The Amount Of Ounces Of Main Dish
	printf("How many ounces of the main dish in each serving?: ");
	scanf("%lf", &amtMainDish);

	// Input The Number Of Hobbits Sharing The Meal
	printf("How many hobbits will be sharing the meal?: ");
	scanf("%d", &numHobbits);

	// Part - 1(A) Ends
	// Part - 1(B) Starts
	// Print The Value Of Each Variable That User Has Entered
	printf("\nYou have entered following values:\n");
	printf("Selected meal number: %d\n", mealNumber);
	printf("Number of food items: %d\n", foodItems);
	printf("Amount of main dish in each serving: %.2f\n", amtMainDish);
	printf("Number of hobbits sharing the meal: %d\n\n", numHobbits);

	// Calculations
	// Calculate Total Ounces Of Main Dish Needed
	double totalAmtMainDish = amtMainDish * numHobbits;
	// Display It As A Message
	printf("In order for %d hobbits to each have %.2f ounces of the main dish, a total of %.2f ounces of the main dish will be needed.\n\n",
		numHobbits, amtMainDish, totalAmtMainDish);

	// Calculate Total Number Of Food Item Servings
	int totalFoodItems = numHobbits * foodItems;
	// Display It As A Message
	printf("In order for %d hobbits to each have %d food items, a total of %d food items serving will be needed.\n\n",
		numHobbits, foodItems, totalFoodItems);
	
	// Call Total Food Function
	totalFood(foodItems, amtMainDish, numHobbits);

	return 0;
}

// Displays The Total Food Served
void totalFood(int foodItems, double amtMainDish, int numDiners) {
	// Calculate Total Ounces Of Total Food Served
	double totalFoodServed = (amtMainDish * numDiners) + (foodItems * numDiners);
	printf("For %d diners, each having %.2f ounces of the main dish and %d food items, a total of %.2f ounces of food will be served.\n\n",
		numDiners, amtMainDish, foodItems, totalFoodServed);
}