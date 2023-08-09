#include "Circle.H"

Circle :: Circle(string name, double rad) {
	shapeName = name;
	radius = rad;
}

double Circle :: area() const {	
	return PI * radius * radius;
}

string Circle :: getShapeName() const {
	return shapeName;
}

double Circle :: getRadius() const {
	return radius;
}
