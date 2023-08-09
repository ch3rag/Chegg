#include <iostream>
#include <stdlib.h> 	// srand, rand
#include <time.h>		// time
#include "Car.h"
using namespace std;


void simulate() {
	Car cars[5] {
		Car(2020, "Audi A4"), 
		Car(2019, "Lamborghini Aventador"), 
		Car(2021, "Dodge Challenger"), 
		Car(2016, "Cadillac CT6"), 
		Car(2018, "Land Rover Discovery")
	};

	srand(time(NULL));

	for (int i = 0; i < 5; i++) {
		int amount = 5 + rand() % 6;
		cars[i].accelerate(amount);
		cout << cars[i].getMake() << " acceleration speed: " << amount << endl;
	}

	cout << "\n----------------------------------------------------------\n";

	for (int i = 0; i < 5; i++) {
		int amount = 3 + rand() % 4;
		cars[i].brake(amount);
		cout << cars[i].getMake() << " brake speed: " << amount << endl;
	}

	cout << "\n----------------------------------------------------------\n";

	for (int i = 0; i < 5; i++) {
		cout << cars[i].getMake() << " final speed: " << cars[i].getSpeed() << endl;
	}

}

int main() {
	simulate();
	return 0;
}

