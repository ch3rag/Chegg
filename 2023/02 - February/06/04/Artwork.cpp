#include "Artwork.h"

// Default Constructor
Artwork::Artwork() : Artwork("unknown", -1, Artist()) { }

// Parameterized Constructor
Artwork::Artwork(std::string title, int yearCreated, Artist artist) {
	this->title = title;
	this->yearCreated = yearCreated;
	this->artist = artist;
}

// Getter For Title
std::string Artwork::GetTitle() const {
	return title;
}


// Getter For Year Created
int Artwork::GetYearCreated() const {
	return yearCreated;
}

// Prints Artwork Info
void Artwork::PrintInfo() const {
	// Print Artist Info
	artist.PrintInfo();
	// Print Title And Year Created
	std::cout << "Title: " << title << ", " << yearCreated << std::endl;
}
