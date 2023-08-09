// PetInformation.java

import java.util.Scanner;

public class PetInformation {
	public static void main(String[] args) {
		// Scanner For User Input
		Scanner scnr = new Scanner(System.in);

		// Create A Generic Pet
		Pet myPet = new Pet();
		// Create A Cat
		Cat myCat = new Cat();

		// Variables For Pet Information
		String petName, catName, catBreed;
		int petAge, catAge;

		// Input Generic Pet's Name And Age
		petName = scnr.nextLine();
		petAge = scnr.nextInt();
		scnr.nextLine();

		// Input Cat's Name And Age
		catName = scnr.nextLine();
		catAge = scnr.nextInt();
		scnr.nextLine();
		catBreed = scnr.nextLine();

		// Set Generic Pet's Name And Age Using Setters
		myPet.setName(petName);
		myPet.setAge(petAge);

		// Set Cat's Name, Age, And Breed Using Setters
		myCat.setName(catName);
		myCat.setAge(catAge);
		myCat.setBreed(catBreed);

		// Print Generic Pet's Info Using PrintInfo() Method
		myPet.printInfo();
		// Print Cat's Info Using PrintInfo() Method
		myCat.printInfo();
		// Print MyCat's Breed
		System.out.println("	Breed: " + myCat.getBreed());

		// Clean Up
		scnr.close();
	}
}
