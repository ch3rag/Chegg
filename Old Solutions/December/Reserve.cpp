#include <iostream>
#include <iomanip>
using namespace std;

// Prints Seats Status Onto The Console
void printSeats(char A[13][6]) {
	cout << "       A B C D E F" << endl;
	for (int r = 0; r < 13; r++) {
		cout << "Row" << setw(3) << r + 1 << " ";
		for (int c = 0; c < 6; c++) {
			cout << A[r][c] << ' ';
		}
		cout << endl;
	}
}

// Book A Seat
void book(char A[13][6], int rowMin, int rowMax) {
	// For Row And Column Input From User
	int row;
	char col;

	// Input Row And Column
	cout << "Enter Row(" << rowMin << "-" << rowMax << "): ";
	cin >> row;
	cout << "Enter Column(A-F): ";
	cin >> col;

	// Convert Column To Uppercase
	col = toupper(col);

	// Check If A Valid Seat
	if (row >= rowMin && row <= rowMax && col >= 'A' && col <= 'F') {
		// Check If Seat is Empty
		if (A[row - 1][col - 65] == '*') {
			// Book It
			cout << "Seat booked." << endl;
			A[row - 1][col - 65] = 'X';
		} else {
			// Already Booked
			cout << "Sorry, this seat is already booked." << endl;
		}
	} else {
		// Invalid Seat
		cout << "Invalid seat." << endl;
	}
	cout << endl;
}

int main() {
	// 3D Array To Keep Track Of Seat Availability
	char A[13][6];

	// Print Welcome Message
	cout << "A program that lets you choose your seating arrangement on an airplane" << endl;

	// Initial All Seats To Be Empty
	for (int r = 0; r < 13; r++) {
		for (int c = 0; c < 6; c++)
			A[r][c] = '*';
	}

	// User's Choice To Book More Seats
	char bookMore;

	// Ticket Type
	char ticketType;

	// User Can Book A Seat As Long As He Likes
	do {
		printSeats(A);

		cout << endl
			 << "* -- Available Seat" << endl
			 << "X -- Occupied Seat" << endl
			 << endl
			 << "Rows 1 and 2 are for first class passengers." << endl
			 << "Rows 3 through 7 are for business class passengers." << endl
			 << "Rows 8 through 13 are for economy class passengers." << endl
			 << endl;

		// Input Ticket Type From The User
		cout << "E: Economy Class" << endl
			 << "B: Business Class" << endl
			 << "F: First Class" << endl << endl
			 << "Input ticket type: ";


		cin >> ticketType;

		// Switch On TicketType
		switch (ticketType) {
			// Economy Class
			case 'E':
			case 'e':
				book(A, 8, 13);
				break;
			// Business Class
			case 'B':
			case 'b':
				book(A, 3, 7);
				break;
			// First Class
			case 'F':
			case 'f':
				book(A, 1, 2);
				break;
			// Invalid Choice
			default:
				cout << "Invalid ticket type.";
				break;
		}

		// Ask User If He Wants To Book More Seats
		cout << "Book More? (Yy/Nn):";
		cin >> bookMore;
		cout << endl;
	} while (bookMore == 'Y' || bookMore == 'y');

	printSeats(A);

	return 0;
}
