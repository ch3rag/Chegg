#include <iostream>
#include <iomanip>
#include <fstream>

using namespace std;

void menu();
void printLastName();
void Score();

int ALL, MAX;
double B1, B2;

int main() {
	string folder;
	cout << "Please mention the filepath: " << endl;
	cin >> folder;
	ifstream inputName(folder);
	string LastName;

	B1 = (double)ALL / MAX;
	B2 = B1 * 100;

	cout << (int)B2;
	cout << "%";
	cout << std::fixed;
	cout << setprecision(5) << B1 << "";

	int selection;
	do
	{
		menu();
		cout << "Enter the input file name : ";
		cin >> selection;

		switch (selection)
		{
		case 1:
			printLastName();
			break;
		case 2:
			Score();
			break;
		default:
			break;
		}
	} while (selection != 2);
	while (inputName >> LastName >> ALL >> MAX);
}

void printLastName() {
	cout << "LastName" << endl;
}

void Score() {
	if (B1 > 90)
	{
		cout << "Excellent" << endl;
		return;
	}

	if (B1 > 80 || B1 <= 90)
	{
		cout << "Well done" << endl;
		return;
	}

	if (B1 > 70 || B1 <= 80)
	{
		cout << "Good" << endl;
		return;
	}

	if (B1 >= 60 || B1 <= 70)
	{
		cout << "Need Improvement" << endl;
		return;
	}

	if (B1 >= 50 && B1 < 60)
	{
	} else
	{
		cout << "Fail" << endl;
	}
}