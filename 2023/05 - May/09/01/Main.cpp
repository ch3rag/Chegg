#include <iostream>
#include "Circle.h"
using namespace std;

Circle createCircle();

int main() {
	Circle circle1 ("purple", 5.2);
	Circle circle2;

	circle2 = createCircle();

	cout << endl;

	circle1.printCircleInfo();
	circle2.printCircleInfo();

	cout << endl;
	if (circle1 < circle2) {
		cout << "Circle1 has a smaller area than circle2" << endl;
	}
	
	if (circle1 == circle2) {
		cout << "Circle1 has the same area than circle2" << endl;
	}

	cout << "Circle1 Info" << endl;
	cout << circle1;

	cout << "Circle2 Info" << endl;
	cout << circle2;

	cout << "Or you can print them both this way, too" << endl;
	cout << circle1 << circle2;

	return 0;

}

Circle createCircle() {
	string color;
	double radius;
	cout << "Enter the color: ";
	cin >> color;
	cout << "Enter radius: ";
	cin >> radius;
	Circle circle(color, radius);
	return circle;
}
