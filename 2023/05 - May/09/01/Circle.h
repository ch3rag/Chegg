#ifndef CIRCLE_H
#define CIRCLE_H

#include <iostream>
using namespace std;

// Circle Class Declaration
class Circle {
	// Private Attributes
	private:
		// Color For The Circle
		string color;
		// Radius Of The Circle
		double radius;

	// Public Methods
	public:
		// Default Constructor
		Circle();
		// Parameterized Constructor
		Circle(string, double);

		// Setters
		void setColor(string);
		void setRadius(double);

		// Getters
		string getColor();
		double getRadius();

		// Prints Circle Information
		void printCircleInfo();

		// Returns The Area Of The Circle
		double getArea();

		// Operator Overloads
		// Less Than Overload
		bool operator <(Circle);

		// Equals Overload
		bool operator ==(Circle);

		// OStream Overload
		friend ostream& operator <<(ostream&, const Circle&);
};
#endif
