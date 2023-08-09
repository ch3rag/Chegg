#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	// Constants
	// Max, Min # Floors
	const int MIN_FLOORS = 1;
	const int MAX_FLOORS = 5;

	// Max, Min # Rooms
	const int MIN_ROOMS = 1;
	const int MAX_ROOMS = 30;

	// Room Rates
	const int SINGLE_RATE = 60;
	const int DOUBLE_RATE = 75;
	const int KING_RATE = 100;
	const int SUITE_RATE = 150;

	// Totals
	int totalIncome = 0;
	int totalRooms = 0;
	int totalOccupied = 0;
	int totalUnoccupied = 0;
	int floorWithMinRooms = 0;
	int numRoomsInFloorWithMinRooms = MAX_ROOMS + 1;

	// Print Header
	cout << "==========================================" << endl;
	cout << "BlueMont Hotel" << endl;
	cout << "==========================================" << endl;

	// Input The Location Of Hotel Chain
	string location;
	cout << "Enter the location of this hotel chain: ";
	cin >> location;

	// Input The Number Of Floors In The Hotel
	int numFloors;
	
	// Input Loop
	do {
		// Take Input
		cout << "Enter total number of floors in the hotel: ";
		cin >> numFloors;
		// If Value Is In Invalid Range, Display Error
		if (numFloors < MIN_FLOORS || numFloors > MAX_FLOORS) {
			cout << "Number of floor should be between " << MIN_FLOORS
				 << " and " << MAX_FLOORS << " !! Please try again." << endl << endl;
		}
	// Validate Value Range, If Invalid, Loop Again
	} while (numFloors < MIN_FLOORS || numFloors > MAX_FLOORS);

	// For Each Floor
	for (int i = 1; i <= numFloors; i++) {
		// Input The Number Of Rooms In The Current Floor
		int numRooms;
		// Input Loop
		do {
			// Take Input
			cout << endl << "Enter total number of room in the " << i << "th floor: ";
			cin >> numRooms;
			// If Value Is In Invalid Range, Display Error
			if (numRooms < MIN_ROOMS || numRooms > MAX_ROOMS) {
				cout << "Number of rooms should be between " << MIN_ROOMS << " and "
					 << MAX_ROOMS << " !! Please try again." << endl << endl;
			}
		// Validate Value Range, If Invalid, Loop Again
		} while (numRooms < MIN_ROOMS || numRooms > MAX_ROOMS);

		// Input Number Of Single Rooms
		int numSingle;
		cout << "How many SINGLE rooms are occupied in the " << i << "th floor: ";
		cin >> numSingle;

		// Input Number Of Double Rooms
		int numDouble;
		cout << "How many DOUBLE rooms are occupied in the " << i << "th floor: ";
		cin >> numDouble;

		// Input Number Of King Rooms
		int numKing;
		cout << "How many KING rooms are occupied in the " << i << "th floor: ";
		cin >> numKing;

		// Input Number Of Suite
		int numSuite;
		cout << "How many SUITE are occupied in the " << i << "th floor: ";
		cin >> numSuite;

		// Calculate Total Number Of Occupied Rooms
		int numOccupied = numSingle + numDouble + numKing + numSuite;

		// If Total Room Occupied Is More Than Number Of Rooms, Invalid Input
		if (numOccupied > numRooms) {
			cout << "Total number of occupied rooms exceeds the total number of rooms on this floor. "
				 << "Please try again!!" << endl;
			i--;
			continue;
		}

		// Compute Stats For The Current Floor
		// Floor Income
		int floorIncome = numSingle * SINGLE_RATE + numDouble * DOUBLE_RATE + numKing * KING_RATE + numSuite * SUITE_RATE;
		// Unoccupied Rooms
		int numUnoccupied = numRooms - numOccupied;

		// Add To Totals
		totalIncome += floorIncome;
		totalRooms += numRooms;
		totalOccupied += numOccupied;
		totalUnoccupied += numUnoccupied;

		// Check If Current Rooms Has Less Rooms Than Room With Min Rooms
		if (numRooms < numRoomsInFloorWithMinRooms) {
			// Update Values
			floorWithMinRooms = i;
			numRoomsInFloorWithMinRooms = numRooms;
		}
	}

	// Compute Occupancy Rate
	double occupancyRate = ((double)totalOccupied / totalRooms) * 100;

	// Display Statistics
	// Header
	cout << endl << "==========================================" << endl;
	cout << "BlueMont Hotel located at " << location << endl;
	cout << "==========================================" << endl;
	// Display Room Rates
	cout << "Today's Room Rates (US$/Night)" << endl;
	cout << "Single Room\tDouble Room\tKing Room\tSuite" << endl;
	cout << SINGLE_RATE << "\t\t" << DOUBLE_RATE << "\t\t" << KING_RATE << "\t\t" << SUITE_RATE << endl;
	cout << "==========================================" << endl;
	
	// Display Totals
	cout << left;
	cout << setw(29) << "Hotel Income..................: $" << totalIncome << endl;
	cout << setw(30) << "Total # of Rooms..............:  " << totalRooms << endl;
	cout << setw(30) << "Total # Occupied Rooms........:  " << totalOccupied << endl;
	cout << setw(30) << "Total # Unoccupied Rooms......:  " << totalUnoccupied << endl;
	cout << setw(30) << "Occupancy Rate................:  " << fixed << setprecision(2) << occupancyRate << "%" << endl << endl;

	// Display Room With Min Rooms
	cout << floorWithMinRooms << "th floor with " << numRoomsInFloorWithMinRooms << " rooms has the least # of rooms." << endl;
	return 0;
}