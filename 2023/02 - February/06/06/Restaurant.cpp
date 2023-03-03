// Restaurant.cpp

#include <iostream>
#include <fstream>
using namespace std;

// Splits The String Into Individual Fields
int split(string inputString, char separator, string arr[], int size) {
	// Add A Delimiter At The End Of InputString To Avoid Additional Logic
	inputString += separator;
	// Indexer For InputString
	int i = 0;
	// Total Length of The Input String
	int length = inputString.length();
	// Indexer For Array
	int index = 0;
	// Temporary String To Append Characters
	string data = "";
	// While We Have Characters To Read And Space And Array
	while (i < length && index < size) {
		// If Current Character Is A Seperator
		if (inputString[i] == separator) {
			// If Data Isn't Empty Then
			// Add It To Array, Increment Indexer For Array And Clear Data String
			if (!data.empty()) {
				arr[index++] = data;
				data.clear();
			}
		// Else Append Current Character To Data
		} else {
			data += inputString[i];
		}
		// Increment Indexer For InputString
		i++;
	}
	
	// If End Of String Is Not Reached And Array Is Full
	if (i != length && index == size) {
		// Return -1
		return -1;
	} else {
		// Else, Return Count Of Fields Read
		return index;
	}
}

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
		// Array To Hold Fields
		string fields[4];
		// Read Data Line By Line
		string line;
		while (index < arrSize && getline(in, line)) {
			// Split The Line And If It Contains Exactly 4 Fields
			if (split(line, '~', fields, 4) == 4) {
				restaurants[index] = fields[0];
				ratings[index][0] = stoi(fields[1]);
				ratings[index][1] = stoi(fields[2]);
				ratings[index][2] = stoi(fields[3]);
				index++;
			}
		}
	} else {
		// Failed To Read File!
		return -1;
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
		cout << "food quality: " << ratings[i][0] << " / 10, "
			 << "cleanliness: " << ratings[i][1] << " / 5, "
			 << "wait time: " << ratings[i][2] << " / 5" << endl;
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
		cout << "Lines read: " << num_lines << "." << endl;
		printNames(restaurants, num_lines);
		printRatings(ratings, num_lines);
		calcOverallScore(restaurants, ratings, num_lines);
	}
	return 0;
}