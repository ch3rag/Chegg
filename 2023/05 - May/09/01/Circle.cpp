#define _USE_MATH_DEFINES
#include "Circle.h"
#include <iostream>
#include <cmath>

using namespace std;

// Circle Class Declaration

// Default Constructor
Circle :: Circle() {
	// Set Radius = 1 And Color To Black
	radius = 1;
	color = "black";
}


// Parameterized Constructor
Circle :: Circle(string color, double radius) {
	// Assign Parameters To Instance Variables
	this->radius = radius;
	this->color = color;
}

// Setters
// Setter For Color
void Circle :: setColor(string color) {
	this->color = color;
}

// Setter For Radius
void Circle :: setRadius(double radius) {
	this-> radius = radius;
}

// Getters
// Getter For Color
string Circle :: getColor() {
	return color;
}

// Getter For Radius
double Circle :: getRadius() {
	return radius;
}

// Returns The Area Of The Circle
double Circle :: getArea() {
	// Round Upto 2 Decimals
	return M_PI * radius * radius;
}

// Prints Circle Information
void Circle :: printCircleInfo() {
	cout << "The " << color << " circle has a area " << getArea() << endl;
}

// Operator Overloads
// Less Than Overload
bool Circle :: operator <(Circle rhs) {
	// Compare The Areas
	double a = getArea();
	double b = rhs.getArea();
	// We Are Using an EPSILON Value To Check The Equality Of Floats Upto N Decimals
	// FABS Return Absolute Value Of Floats
	return (b - a) > ( (fabs(a) < fabs(b) ? fabs(b) : fabs(a)) * 1E-3);
}

// Equals Overload
bool Circle :: operator ==(Circle rhs) {
	// Compare The Areas
	// We Are Using an EPSILON Value To Check The Equality Of Floats Upto N Decimals
	// FABS Return Absolute Value Of Floats
	return fabs(getArea() - rhs.getArea()) < 1E-3;
}

// OStream Overload
ostream& operator <<(ostream& out, const Circle& circle) {
	// Output Color And Radius
	out << "Circle color: " << circle.color << endl
		<< "Circle radius: " << circle.radius << endl;
}
