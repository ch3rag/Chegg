#ifndef PERSON_H
#define PERSON_H

#include <iostream>

// Person Class
class Person {
	// Private Attributes
	private:
		// Name Of The Person
		std::string name;
		// Gender Of The Person M/F Only
		char gender;
		// Age Of The Person
		int age;
	// Public Methods
	public:
		// Constructor
		Person();
		Person(std::string, char, int);
		// Prints The Person's Info
		void print();
};
#endif