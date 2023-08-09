#include <iostream>
#include <iomanip>
using namespace std;

// Function Prototypes
void displayOriginalGraphic();
void displayGladiolus(int);
string space(int);

// Main
int main() {
	// For Storing User's Menu Choice
	int choice;
	// For Storing Number Of Sections
	int numSections;

	// Print Welcome Message
	cout << "Program 1: Gladiolus" << endl;
	// Display The Menu
	cout << "Choose from among the following options:" << endl
		 << "\t1. Display original graphic" << endl
		 << "\t2. Display Gladiolus" << endl
		 << "\t3. Exit the program" << endl
		 << "Your choice -> ";
	
	// Input User's Choice
	cin >> choice;

	// Swich On Choice
	switch (choice) {
		// Display Original Graphic
		case 1:
			displayOriginalGraphic();
			break;
		// Draw Gladiolus
		case 2:
			// Inout Number Of Sections
			cout << "Number of sections -> ";
			cin >> numSections;
			// Draw Gladiolus
			displayGladiolus(numSections);
			break;
		// Exit The Program
		case 3:
			break;
		// Invalid Choice
		default:
			cout << "Invalid choice" << endl;
			break;
	}

	// End Of Program
	cout << "Exiting" << endl;
}

void displayGladiolus(int numSections) {
	// For Each Section
	for (int i = 0; i < numSections; i++) {
		// Display ---
		cout << space(numSections) << "---" << endl;
		// Number Of Rows Per Section
		int rows = i * 2 + 1;
		for (int j = 0; j < rows; j++) {
			// Upper Half Of The Flower
			if (j <= rows / 2) {
				// Display (
				cout << space(numSections - j - 1) << "(";
				// Display @
				if (j == rows / 2) {
					cout << space(j + 1) << "@"
						 << space(j + 1) << ")" << endl;
					continue;
				}
				// Display ")"
				cout << space(3 + j * 2) << ")";
				cout << endl;
			// Lower Half
			} else {
				// Display (
			 	cout << space(numSections + j - rows) << "(";
				// Display ")"
				cout << setw(2 + (rows - j) * 2) << ")";
				cout << endl;
			}
		}	
	}
	// Display ---
	cout << space(numSections) << "---" << endl;
	// Draw The Stick
	bool stemRight = true;
	for (int i = 0; i < numSections; i++) {
		if (stemRight) {
			cout << space(numSections + 1) << "|" << "/" << endl
				 << space(numSections + 1) << "|" << endl;
		} else {
			cout << space(numSections ) << "\\" << "|" << endl
				 << space(numSections + 1) << "|" << endl;
		}
		// Toggle Stem Direction
		stemRight = !stemRight;
	}

}

// Displays ASCII ART
void displayOriginalGraphic() {
cout << "    ____   __                       ______         " << endl
	 << "   /  _/  / /   ____ _   _____     / ____/__    __ " << endl
	 << "   / /   / /   / __ \\ | / / _ \\   / /  __/ /___/ /_" << endl
	 << " _/ /   / /___/ /_/ / |/ /  __/  / /__/_  __/_  __/" << endl
	 << "/___/  /_____/\\____/|___/\\___/   \\____//_/   /_/   " << endl
	 << endl;
		

}

string space(int num) {
	string result = "";
	for (int i = 0; i < num; i++) {
		result += " ";
	}
	return result;
}