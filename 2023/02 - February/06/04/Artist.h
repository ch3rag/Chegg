#ifndef ARTIST_H
#define ARTIST_H

#include <iostream>

// Artist Class
class Artist {
	// Private Attributes
	private:
		// Artist Name
		std::string artistName;
		// Birth Year
		int birthYear;
		// Death Year
		int deathYear;
	public:
		// Default Constructor
		Artist();
		// Parameterized Constructor
		Artist(std::string, int, int);
		// Getter For Name
		std::string GetName() const;
		// Getter For Birth Year
		int GetBirthYear() const;
		// Getter For Death Year
		int GetDeathYear() const;
		// Prints Artist Information
		void PrintInfo() const;
};
#endif