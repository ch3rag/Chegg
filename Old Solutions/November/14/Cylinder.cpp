#include "Cylinder.H"

// Computes And Returns Surface Area of Cylinder
double Cylinder :: area() const {
	double rad = getRadius();
	return  2 * PI * rad * height + 2 * PI * rad * rad;
}

// Constructor
// We'll Re-Use Circle's Constructor For Name And Radius
Cylinder :: Cylinder(string name, double rad, double hgt)
	: Circle(name, rad) {
		height = hgt;
}

// Getter For Height
double Cylinder :: getHeight() const {
	return height;
}

// Computes And Returns Volume Of The Cylinder
double :: Cylinder :: volume() const {
	// Volume Of Cylinder = Pi * R^2 * H
	double rad = getRadius();
	return PI * rad * rad * height;
}
