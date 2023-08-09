#include "Pizza.h"
#include <iostream>
using namespace std;

// Default Constructor
Pizza :: Pizza() {
	size = SMALL;
	type = HANDTOSSED;
	pepperoniToppings = 0;
	cheeseToppings = 1;
}

// Setters

// Setter For Size
void Pizza :: setSize(int size) {
	// Validate Size And Assign
	if (size == SMALL || size == MEDIUM || size == LARGE) {
		this->size = size;
	}
}

// Setter For Type
void Pizza :: setType(int type) {
	// Validate And Assign
	if (type == HANDTOSSED || type == PAN || type == DEEPDISH) {
		this->type = type;
	}
}

// Setter For Cheese Toppings
void Pizza :: setCheeseToppings(int cheeseToppings) {
	// Validate And Assign
	if (cheeseToppings >= 0) {
		this->cheeseToppings = cheeseToppings;
	}
}

// Setter For Pepperoni Toppings
void Pizza :: setPepperoniToppings(int pepperoniToppings) {
	// Validate And Assign
	if (pepperoniToppings >= 0) {
		this->pepperoniToppings = pepperoniToppings;
	}
}

// Getters
// Getter For Size
int Pizza :: getSize() {
	return size;
}

// Getter For Type
int Pizza :: getType() {
	return type;
}

// Getter For Cheese Toppings
int Pizza :: getCheeseToppings() {
	return cheeseToppings;
}

// Getter For Pepperoni Toppings
int Pizza :: getPepperoniToppings() {
	return pepperoniToppings;
}

// Prints Pizza Infomation
void Pizza :: outputDescription() {
	string size, type;

	// Find Size
	switch (this->size) {
		case SMALL: size = "Small"; break;
		case MEDIUM: size = "Medium"; break;
		case LARGE: size = "Large"; break;
	}

	// Find Type
	switch (this->type) {
		case HANDTOSSED: type = "Hand Tossed"; break;
		case PAN: type = "Pan"; break;
		case DEEPDISH: type = "Deep Dish"; break;
	}

	// Print Pizza Information
	cout << "The pizza is: " << size << ", " << type << ", with "
		 << pepperoniToppings << " pepperoni toppings and " << cheeseToppings
		 << " cheese toppings." << endl;
}

// Computes Pizza's Cost
double Pizza :: computePrice() {
	int baseCost;

	// Find Base Code
	switch (this->size) {
		case SMALL: baseCost = 10; break;
		case MEDIUM: baseCost = 14; break;
		case LARGE: baseCost = 17; break;
	}

	// Add Toppings Cost
	int total = baseCost + (pepperoniToppings + cheeseToppings) * 2;

	// Return Total
	return total;
}
