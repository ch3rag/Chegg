#include "Artist.h"

// Default Constructor
// Initializes Name = Unkown, Birth Year And Death Year To -1
Artist::Artist() : Artist("unknown", -1, -1) {}

// Parametrized Constructor
Artist::Artist(std::string artistName, int birthYear, int deathYear) {
	this->artistName = artistName;
	this->birthYear = birthYear;
	this->deathYear = deathYear;
}

// Getter For Name
std::string Artist::GetName() const {
	return artistName;
}


// Getter For Death Year
int Artist::GetDeathYear() const {
	return deathYear;
}


// Getter For Birth Year
int Artist::GetBirthYear() const {
	return birthYear;
}


// Prints Artist Info
void Artist::PrintInfo() const {
	std::cout << "Artist: " << artistName << " (";

	// If Birth Year And Death Year Both Are Known
	if (birthYear != -1 && deathYear != -1) {
		std::cout << birthYear << " to " << deathYear;
	// If Death Year Is Not Known (Artist Is Still Alive)
	} else if (birthYear != -1) {
		std::cout << birthYear << " to present";
	// If Neither Of Birth Year And Death Year Are Known
	} else {
		std::cout << "unkown";
	}
	std::cout << ")" << std::endl;
}
