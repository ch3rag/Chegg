#include "Car.h"
#include <iostream>


Car::Car(int yearModel, string make) {
	this->make = make;
	this->yearModel = yearModel;
	this->speed = 0;
}

string Car::getMake() {
	return make;
}

int Car::getYearModel() {
	return yearModel;
}

int Car::getSpeed() {
	return speed;
}

void Car::accelerate() {
	speed += 5;
}

void Car::accelerate(int amount) {
	speed += amount;
}

void Car::brake() {
	speed -= 5;
	if (speed < 0) {
		speed = 0;
	}
}

void Car::brake(int amount) {
	speed -= amount;
	if (speed < 0) {
		speed = 0;
	}
}

