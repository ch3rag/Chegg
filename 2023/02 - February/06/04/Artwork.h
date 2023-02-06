#ifndef ARTWORK_H
#define ARTWORK_H

#include <iostream>
#include "Artist.h"

// Artwork Class
class Artwork {
	// Private Attributes
	private:
		// Title Of The Artwork
		std::string title;
		// Year In With It Was Created 
		int yearCreated;
		// Artist Object Who Created It
		Artist artist;
	public:
		// Default Constructor
		Artwork();
		// Parameterized Constructor
		Artwork(std::string, int, Artist);
		// Getter For Title
		std::string GetTitle() const;
		// Getter For Year Created
		int GetYearCreated() const;
		// Prints Artwork Information
		void PrintInfo() const;
};
#endif