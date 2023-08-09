#include <iostream>
#include <iomanip>      

using namespace std;

int main() {

	int empId;
	double grossSales;
	double commissionRate;
	double baseSalary;
	double newSalary;

	while (true) {
		cout << "Enter employee id (or -1 to quit): ";
		cin >> empId;

		if (empId == -1) {
			break;
		}

		cout << "Enter gross sales: ";
		cin >> grossSales;
		cout << "Enter commission rate: ";
		cin >> commissionRate;
		cout << "Enter base salary: ";
		cin >> baseSalary;

		newSalary = baseSalary + grossSales * commissionRate;
		cout << "Salary is $" << fixed <<  setprecision(2) << newSalary << endl;
	}

	return 0;
}