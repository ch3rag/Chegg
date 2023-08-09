#include <iostream>
#include <fstream>
#include <iomanip>

using namespace std;
void Score();

int ALL, MAX = 100;
double B1, B2;

int main() {

	string folder;
	cout << "Please mention the filepath: " << endl;
	cin >> folder;
	ifstream inputName(folder);
	string LastName;

	while (inputName >> LastName >> ALL >> MAX) {
		
		B1 = (double)ALL / MAX;
		B2 = B1 * 100;

		cout << LastName << " ";
		cout << (int)B2 << "%" << " ";
		cout << fixed << setprecision(5) << B1 << " ";
		Score();
	}
	return 0;
}

void Score() {
	if (B2 >= 90) {
		cout << "Excellent" << endl;
		return;
	}

	if (B2 >= 80) {
		cout << "Well done" << endl;
		return;
	}

	if (B2 >= 70) {
		cout << "Good" << endl;
		return;
	}

	if (B2 >= 60) {
		cout << "Need Improvement" << endl;
		return;
	}

	if (B2 >= 50) {
		cout << "Barely Passed" << endl;
	} else {
		cout << "Fail" << endl;
	}
}