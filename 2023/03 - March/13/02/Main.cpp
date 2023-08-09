// Main.cpp
#include "Stack.h"
#include <iostream>
#include <string>
using namespace std;

int main() {
	// For User Choice
	int choice;
	// Person Details
	string name;
	char gender;
	int age;

	// Create A Stack
	Stack stack;

	// Infinite Loop
	while (true) {
		// Display Menu
		cout << "1. Add a Person (PUSH)" << endl
			 << "2. Remove a Person (POP)" << endl
			 << "3. Is the Stack Empty (ISEMPTY)" << endl
			 << "4. Who is On Top? (PEEK)" << endl
			 << "5. How Many Peoples are there? (SIZE)" << endl
			 << "0. Exit" << endl
			 << "Enter a Command: ";

		// Input User's Choice
		cin >> choice;
		cout << endl;

		// Check If Choice Is In Range
		if (choice < 0 || choice > 5) {
			continue;
		}

		// Switch
		switch (choice) {
			case 1:
				// PUSH
				// Flush STDIN Before Input
				fflush(stdin);
				cout << "Who would you like to add?" << endl << endl;
				// Input Name
				cout << "Enter Name: ";
				getline(cin, name);
				// Input Gender
				cout << "Enter Gender: ";
				cin >> gender;
				// Input Age
				cout << "Enter Age: ";
				cin >> age;
				// Push Onto Stack
				stack.push(new Person(name, gender, age));
				break;
			case 2:
				// POP
				if (stack.isEmpty()) {
					cout << "Can't POP from an empty stack!" << endl;
				} else {
					cout << "Popping: " << endl;
					// Get Top Person
					Person * person = stack.pop();
					// Print And delete
					person->print();
					delete person;
				}
				break;
			case 3:
				// ISEMPTY
				if (stack.isEmpty()) {
					cout << "Yes, the stack is empty." << endl;
				} else {
					cout << "The stack is NOT empty." << endl;
				}
				break;
			case 4:
				// PEEK
				if (stack.isEmpty()) {
					cout << "There is nobody to PEEK at!!" << endl;
				} else {
					cout << "Peeking At: " << endl;
					stack.peek()->print();
				}
				break;
			case 5:
				// SIZE
				if (stack.isEmpty()) {
					cout << "Nobody is on the stack!" << endl;
				} else if (stack.size() == 1) {
					cout << "There is one person on the stack." << endl;
				} else {
					cout << "There are " << stack.size() << " people on the stack." << endl;
				}
				break;
			case 0:
				// EXIT
				return 0;
			default:
				// Choice Out Of Range
				cout << "**** Please input a number between 0 and 5 ****" << endl;
		}
		cout << endl;
	}
}
 