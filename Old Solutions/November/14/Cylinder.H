#ifndef CYLINDER_H
#define CYLINDER_H
#include "Circle.H"

class Cylinder : public Circle {
	private:
		// Attributes
		// Stores Cylinder's Height
		double height;
	
	public:
		// Constructor
		Cylinder(string shapeName, double rad, double hgt);
		// Getter For Height
		double getHeight() const;
		// Computes And Returns Volume Of The Cylinder
		double volume() const;
		// Redefine Area For Cylinder
		double area() const;
};
#endif
