#include "Cylinder.H"

int main() {
	// Test Code
	Cylinder myCyl("MyCylinder", 20, 14);
	cout << "MyCylinder: [Radius = " << myCyl.getRadius()
		 << ", Height = " << myCyl.getHeight() << "]" << endl;
	cout << "Volume: " << myCyl.volume() << endl;
	cout << "Area: " << myCyl.area() << endl;
}