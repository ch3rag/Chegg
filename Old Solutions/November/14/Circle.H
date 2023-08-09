#ifndef CIRCLE_H
#define CIRCLE_H

#include <iostream>
using namespace std;

const double PI = 3.1415927;

class Circle {
	public:
		Circle(string name, double rad);
		double area() const;
		string getShapeName() const;
		double getRadius() const;
	private:
		double radius;
		string shapeName;
};

#endif