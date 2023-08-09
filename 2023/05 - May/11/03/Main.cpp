#include "Pizza.h"
#include <iostream>
using namespace std;

// Test Code
int main() {
	Pizza cheesy;
	Pizza pepperoni;
	cheesy.setCheeseToppings(3);
	cheesy.setType(HANDTOSSED);
	cheesy.outputDescription();
	cout << "Price of Cheesy: " << cheesy.computePrice() << endl;

	pepperoni.setSize(LARGE);
	pepperoni.setPepperoniToppings(2);
	pepperoni.setType(PAN);
	pepperoni.outputDescription();
	cout << "Price of Pepperoni: " << pepperoni.computePrice() << endl;
}