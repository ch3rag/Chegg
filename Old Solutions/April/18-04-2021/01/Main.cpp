#include <iostream>
#include<string>

#include "Dealership.h"

using namespace std;

int main() {
	string dealershipName;
	int lotCapacity;
	int numVehicles = 0;

	cout << "Enter the name of the dealership: ";
	getline(cin, dealershipName);
	cout << "Enter the lot capacity of the dealership: ";
	cin >> lotCapacity;
	Dealership dealership(dealershipName, lotCapacity);
	while (true) {
		char selection;
		cout << "----------------------------------" << endl;
		cout << "-------------Main Menu------------" << endl;
		cout << "----------------------------------" << endl;
		cout << "A - Add A New Vehicle" << endl;
		cout << "L - List Vehicles" << endl;
		cout << "Q - Quit" << endl;
		cout << "Selection: ";
		cin >> selection;
		cin.ignore();

		switch(selection) {
			case 'a':
			case 'A':
				if (numVehicles < dealership.getLotCapacity()) {
					dealership.addVehicle();
					numVehicles++;
				} else {
					cout << "Car Lot Is Full!" << endl;
				}
				break;
			case 'l':
			case 'L':
				dealership.listVehicles();
				break;
			case 'q':
			case 'Q':
				return 0;
			default:
				cout << "Invalid Selection." << endl;
		}

	}
	
	return 0;
}