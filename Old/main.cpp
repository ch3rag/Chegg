#include <iostream>
#include <cmath>
#include <string>
#include <iomanip>

using namespace std;

int main() {
    // Declare Variables
    string name;
    double principal = 0.0;
    double interestRate = 0.0;
    int times = 0;

    // Get Input
    // Input The Name
    cout << "Enter Account Holder Name: ";
    getline(cin, name);

    // Input The Principal Amount
    cout << "Enter Principal Amount: ";
    cin >> principal;

    // Input Interest Rate
    cout << "Enter Interest Rate: ";
    cin >> interestRate;

    // Input The Number Of Times Interest Is Compounded
    cout << "Enter The Number Of Times Interest is Compouded: ";
    cin >> times;

    // Perform Calculations
    double amount = principal * pow((1 + ((interestRate * 0.01) / times)), times);

    // Display Output
    cout << fixed << showpoint << setprecision(2);
    cout << endl << endl;
    // Display Account Holder Name
    cout << left << setw(40) << "Account Holder:" << right << setw(15) << name << endl;
    // Display Interest Rate
    cout << left << setw(40) << "Interest Rate:" << right << setw(14) << interestRate << "%" << endl;
    // Display Times Compounded
    cout << left << setw(40) << "Times Compounded:" << right << setw(15) << times << endl;
    // Display Principal
    cout << left << setw(40) << "Principal:" << "$" << right << setw(14) << principal << endl;
    // Display Interest
    cout << left << setw(40) << "Interest Earned:" << "$" << right << setw(14) << amount - principal << endl;
    // Display Final Balance
    cout << left << setw(40) << "Final Balance:" << "$" << right << setw(14) << amount << endl;
}