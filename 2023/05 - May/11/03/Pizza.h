#ifndef PIZZA_H
#define PIZZA_H
#include <iostream>
using namespace std;

// Constants For Size
const int SMALL = 0;
const int MEDIUM = 1;
const int LARGE = 2;

// Constants For Base
const int DEEPDISH = 3;
const int HANDTOSSED = 4;
const int PAN = 5;

// Pizza Class Declaration
class Pizza {
	private:
		// Private Attributes
		int size;
		int type;
		int pepperoniToppings;
		int cheeseToppings;

	public:
		// Public Functions
		// Default Constructor
		Pizza();
		
		// Setters
		void setSize(int);
		void setType(int);
		void setCheeseToppings(int);
		void setPepperoniToppings(int);

		// Getters
		int getSize();
		int getType();
		int getCheeseToppings();
		int getPepperoniToppings();

		// Prints Pizza Infomation
		void outputDescription();

		// Computes Pizza's Cost
		double computePrice();
};
#endif