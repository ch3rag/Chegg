// Restaurant.cpp

#include <iostream>
#include <fstream>
#include <sstream>
using namespace std;

// Reads Restaurant Data
int readRestaurantData(string fileName, string restaurants[], int ratings[][3], int arrSize) {
	// Create A File Input Stream
	ifstream in;
	// Index To Write Data
	int index = 0;
	// Open File For Reading
	in.open(fileName);

	// Check Is File Opened Successfully
	if (in.is_open()) {
		// Read Data
		string line;
		while (!in.eof() && index < arrSize) {
			// Read The Current Line
			in >> line;
			// Create A StringStream
			stringstream streamData(line);
			// Single Field Read From File
			string field;
			// Number Of Fields Read From The File
			int fieldsIdx = 0;
			// While There Are Fields To Read
			while (getline(streamData, field, '~')) {
				if (fieldsIdx == 0) {
					// Field 0 Is Name
					restaurants[index] = field;
				} else if (fieldsIdx < 4) {
					// Field 1, 2, 3 Are Ratings
					ratings[index][fieldsIdx - 1]  = stoi(field);
				} else {
					// Field Count > 4 Are Invalid Data
					fieldsIdx++;
					break;
				}
				fieldsIdx++;
			}
			if (fieldsIdx == 4) {
				// If Exactly 4 Fields Are Read, Then Increment Index
				index++;
			}
		}
	} else {
		// Print Error
		cout << "Count not open file.";
	}
	return index;
}


// Prints The Name Of Each Restaurant
void printNames(string restaurants[], int arrSize) {
	for (int i = 0; i < arrSize; i++) {
		cout << "names[" << i << "] = " << restaurants[i] << endl;
	}
}

// Prints Rating
void printRatings(int ratings[][3], int arrSize) {
	for (int i = 0; i < arrSize; i++) {
		cout << "food quality: " << ratings[i][0] << "/10, "
			 << "cleanliness: " << ratings[i][1] << "/5, "
			 << "wait time: " << ratings[i][2] << "/5" << endl;
	}
}

// Prints Overall Score For Each Restaurant
void calcOverallScore(string restaurants[], int ratings[][3], int arrSize) {
		for (int i = 0; i < arrSize; i++) {
		double score =  (6.3 * ratings[i][0]) + (4.3 * ratings[i][1]) + (3.4 * (5 - ratings[i][2]));
		cout << restaurants[i] << " overall score: " << score << endl;
	}
}

// Main
int main() {
	string filename = "restaurant_samples.txt";

	// Max Number of Restaurants to Read
	int num_restaurants = 3;

	// Make Arrays to Store Data
	string restaurants[num_restaurants];
	int ratings[num_restaurants][3];

	// Call Read Data Function
	int num_lines = readRestaurantData(filename, restaurants, ratings, num_restaurants);

	// Output Results, If Any
	if (num_lines == -1) {
		cout << "Could not open file." << endl;
	} else {
		cout << "Number of lines: " << num_lines << "." << endl;
		printNames(restaurants, num_lines);
		printRatings(ratings, num_lines);
		calcOverallScore(restaurants, ratings, num_lines);
	}
	return 0;
}