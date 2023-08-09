#include <iostream>
#include "Vehicle.h"

Vehicle::Vehicle() { }

Vehicle::~Vehicle() { }

Vehicle::Vehicle(string make, string model, int year) {
	this->make = make;
	this->model = model;
	this->year = year;
}

string Vehicle::getMake() {
	return make;
}

void Vehicle::setMake(string newMake) {
	make = newMake;
}

string Vehicle::getModel() {
	return model;
}

void Vehicle::setModel(string newModel) {
	model = newModel;
}

int Vehicle::getYear() {
	return year;
}

void Vehicle::setYear(int newYear) {
	year = newYear;
}

void Vehicle::print() {
	cout << "----------------------------------" << endl;
	cout << "Make: " << make << endl;
	cout << "Model: " << model << endl;
	cout << "Year: " << year << endl;
}