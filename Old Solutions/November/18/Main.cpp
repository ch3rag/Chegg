#include <iostream>
using namespace std;

// Square Class
class Square {
	private:
		// Length Of The Side
		double side;

	public:
		// Constructor
		Square(double side) {
			this->side = side;
		}

		// Getter For Side
		double getSide() {
			return side;
		}

		// Setter For Side
		void setSide(double side) {
			this->side = side;
		}

		// Calculates The Area Of The Square
		double calculateArea() {
			return side * side;
		}
};

// Circle Class
class Circle {
	private:
		// Radius Of The Circle
		double radius;

	public:
		// Constructor
		Circle(double radius) {
			this->radius = radius;
		}

		// Getter For Radius
		double getRadius() {
			return radius;
		}

		// Setter For Radius
		void setRadius(double radius) {
			this->radius = radius;
		}

		// Calculates The Area Of The Circle
		double calculateArea() {
			return 3.14 * radius * radius;
		}
};

// ChangeShapes Function
void changeShapes(Circle circle, Square square) {
	string choice;
	double cirArea = circle.calculateArea();
	double sqrArea = square.calculateArea();

	// Display Initial Circle Radius And Area
	cout << "Circle [Radius: " <<  circle.getRadius() << ", Area: " << cirArea << "]" << endl;
	// Prompt User If They Want To Change The Radius Of The Circle
	cout << "Do you want to change the radius of circle(Y/N)? ";
	// Input User Choice
	cin >> choice;
	// If Yes Then
	if (choice == "Y" || choice == "y") {
		// Input New Radius
		double radius;
		cout << "Input new radius: ";
		cin >> radius;
		// Set It Using Setter
		circle.setRadius(radius);
		// Calculate New Area
		double newCirArea = circle.calculateArea();
		// Display New Circle Radius And Area
		cout << "Circle [Radius: " <<  circle.getRadius() << ", Area: " << newCirArea << "]" << endl;
		// Output Whether Circle is Increased Or Decreased In Area
		if (cirArea > newCirArea) {
			cout << "Circle has decreased in area." << endl;
		} else if (cirArea < newCirArea) {
			cout << "Circle has increased in area." << endl;
		} else {
			cout << "No change in the area of the circle." << endl;
		}
	}
	cout << endl;
	// Display Initial Square Side And Area
	cout << "Square [Side: " <<  square.getSide() << ", Area: " << sqrArea << "]" << endl;
	// Prompt User If They Want To Change The Side Of The Square
	cout << "Do you want to change the side of square(Y/N)? ";
	// Input User Choice
	cin >> choice;
	// If Yes Then
	if (choice == "Y" || choice == "y") {
		// Input New Side
		double side;
		cout << "Input new side: ";
		cin >> side;
		// Set It Using Setter
		square.setSide(side);
		// Calculate New Area
		double newSqrArea = square.calculateArea();
		// Display New Square Side And Area
		cout << "Square [Side: " <<  square.getSide() << ", Area: " << newSqrArea << "]" << endl;
		// Output Whether Square is Increased Or Decreased In Area
		if (sqrArea > newSqrArea) {
			cout << "Square has decreased in area." << endl;
		} else if (sqrArea < newSqrArea) {
			cout << "Square has increased in area." << endl;
		} else {
			cout << "No change in the area of the square." << endl;
		}
	}
}

// Main
int main() {
	// Create A Square And Circle Of Side/Radius = 1
	Circle circle(1);
	Square square(1);

	changeShapes(circle, square);

	return 0;
}

