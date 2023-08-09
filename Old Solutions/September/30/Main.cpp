/*******************************************************************************
* Description:
* 	Starting point of the program. Creates three objects of the
* 	`RectanglePyramid` class: normally, using a pointer, and dynamically.
*
* Input:
* 	N/A
*
* Output:
* 	An integer that signals the exit code to the operating system (OS)
*******************************************************************************/

#include "RectanglePyramid.h"
#include <iostream>
using namespace std;

int main() {
	// Create An Object Using Constructor
	RectanglePyramid rp(3.54, 5.61, 4.098);
	cout << "Accessing via the object\n";

	cout << "Length: " << rp.getLength() << endl;
	cout << "Width: " << rp.getWidth() << endl;
	cout << "Height: " << rp.getHeight() << endl;
	cout << "Volume: " << rp.calcVolume() << endl << endl;

	// Create A Pointer To That Object
	RectanglePyramid* ptr = &rp;

	ptr->setLength(6.5);
	ptr->setWidth(6.5);
	ptr->setHeight(6.5);

	cout << "Accessing via a pointer to the object\n";
	cout << "Length: " << ptr->getLength() << endl;
	cout << "Width: " << ptr->getWidth() << endl;
	cout << "Height: " << ptr->getHeight() << endl;
	cout << "Volume: " << ptr->calcVolume() << endl << endl;

	// Create A Pointer To A Dynamic Object
	ptr = new RectanglePyramid(1.6, 0.875, 18.467);

	cout << "Accessing via a pointer to a dynamic object\n";
	cout << "Length: " << ptr->getLength() << endl;
	cout << "Width: " << ptr->getWidth() << endl;
	cout << "Height: " << ptr->getHeight() << endl;
	cout << "Volume: " << ptr->calcVolume() << endl << endl;

	delete ptr;
	ptr = nullptr;

	// Terminate
	return 0;
}