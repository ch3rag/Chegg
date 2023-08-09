#include <iostream>
#include <math.h>
using namespace std;

int main() {
	
	char userInput;
	double h, l, sen, x, y, d;
	int a, b, c;

	while (true) {
		cout << "A - Sensitivity Analysis" << endl;
		cout << "B - Quadratic" << endl;
		cout << "D - Exit" << endl;
		cout << "Enter Choice: ";
		cin >> userInput;
		switch (userInput) {
			case 'a':
			case 'A':
				cout << "Enter H: ";
				cin >> h;
				cout << "Enter L:";
				cin >> l;
				sen = (1 - h - (l / h)) * 5;
				cout << "Sen = " << sen << endl;
			break;

			case 'B':
			case 'b':
				cout << "Enter A: ";
				cin >> a;
				cout << "Enter B: ";
				cin >> b;
				cout << "Enter C: ";
				cin >> c;

				d = b * b - 4 * a * c;

				if (d < 0) {
					cout << "No Real Roots." << endl;
				} else if (d == 0) {
					x = -b / (2 * a);
					cout << "X = " << x;
				} else {
					d = sqrt(d);
					x = (-b + d) / 2 * a;
					y = (-b - d) / 2 * a;
					cout << "X = " << x << endl;
					cout << "Y = " << y << endl;
				}
				break;
			case 'd':
			case 'D':
				cout << "Bye." << endl;
				return 0;
			default:
				cout << "Invalid Choice." << endl;;

		}

	}
	return 0;
}