#include <iostream>

using namespace std;

double offenceTypeCharge() {
    int choice;
    cout << "Please Enter Type Of Offence:\n\n";
    while(true) {
        cout << "\t 1. Minimum Offence\n";
        cout << "\t 2. Medium Offence\n";
        cout << "\t 3. Major Offence\n";
        cout << "\t Enter Your Choice (1-3): ";
    
        cin >> choice;
        
        switch (choice) {
            case 1:
                return 100.0;
            case 2:
                return 250.0;
            case 3:
                return 500.0;
            default:
                cout << "Invalid Choice, Try Again.\n";
            break;
        }
    }
}

double ageDiscount(double totalAmount) {
    int age;
    cout << "\nEnter Your Age: ";
    cin >> age;
    if (age <= 16 || age >= 65) {
        return totalAmount * 0.05;
    } else {
        return 0;
    }
}

double offenceFrequencyDiscount(double totalAmount) {
    int choice;
    cout << "\nHow often you commit offence?:\n\n";
        while(true) {
        cout << "\t 1. It's My First Offence\n";
        cout << "\t 2. I'm A Frequent Law Breaker\n";
        cout << "\t 3. None Of Above\n";
        cout << "\t Enter Your Choice (1-3): ";
    
        cin >> choice;
        
        switch (choice) {
            case 1:
                return totalAmount * 0.1;
            case 2:
                return totalAmount * 0.15;
            case 3:
                return 0;
            default:
                cout << "Invalid Choice, Try Again.\n";
            break;
        }
    }
}


int main()
{
    int choice;
    
    
    cout << "Welcome!\n";
    
    double offenceCharge = offenceTypeCharge();
    double ageDiscountAmount = ageDiscount(offenceCharge);
    double offenceFrequencyDiscountAmount = offenceFrequencyDiscount(offenceCharge);
    
    double totalAmount = offenceCharge - ageDiscountAmount - offenceFrequencyDiscountAmount;
    
    cout << "-----------------------------------------\n";
    cout << "Offence Charge: $" << offenceCharge << "\n";
    cout << "Age Discount: $" << ageDiscountAmount << "\n";
    cout << "Offence Frequency Discount: $" << offenceFrequencyDiscountAmount << "\n\n";
    cout << "Your Total Will Be: $" << totalAmount << "\n";
    cout << "-----------------------------------------\n";
    
    

    return 0;
}

