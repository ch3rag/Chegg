#include <iostream>
#include "Dealership.h"
#include "Vehicle.h"

using namespace std;

Dealership::Dealership() {}

Dealership::Dealership(string dealershipName, int lotCapacity) {
	this->dealershipName = dealershipName;
	this->lotCapacity = lotCapacity;
}

string Dealership::getDealershipName() {
	return dealershipName;
}

void Dealership::setDealershipName(string newName) {
	dealershipName = newName;
}

int Dealership::getLotCapacity() {
	return lotCapacity;
}

void Dealership::setLotCapacity(int newCapacity) {
	lotCapacity = newCapacity;
}

void Dealership::addVehicle() {
	string make, model;
	int year;

	cout << "Enter The Make Of The Vehicle: ";
	getline(cin, make);
	cout << "Enter Model Of The Vehicle: ";
	getline(cin, model);
	cout << "Enter Year Of The Vehicle: ";
	cin >> year;

	Vehicle vehicle(make, model, year);
	vehicles.push_back(vehicle);
}

void Dealership::listVehicles() {
	for (Vehicle vehicle : vehicles) {
		vehicle.print();
	}
}