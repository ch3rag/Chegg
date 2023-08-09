#include "Person.h"
#include <iostream>

// Constructor
Person :: Person(std::string name, char gender, int age) {
	// Initialize Instance Variables
	this->name = name;
	this->gender = gender;
	this->age = age;
}


// Prints The Person's Info
void Person :: print() {
	std :: cout << "Name: " << name << std :: endl
				<< "Gender: " << gender << std :: endl
				<< "Age: " << age << std :: endl;
}