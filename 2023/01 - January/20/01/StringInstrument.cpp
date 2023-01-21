#include "StringInstrument.h"

// Define mutator functions -
// SetNumOfStrings(), SetNumOfFrets()
void StringInstrument :: SetNumOfStrings(string userNumString) {
	numString = userNumString;
}

void StringInstrument :: SetNumOfFrets(string userNumFrets) {
	numFrets = userNumFrets;
}

// Define accessor functions -
// GetNumOfStrings(), GetNumOfFrets()
string StringInstrument :: GetNumOfStrings() {
	return numString;
}
string StringInstrument :: GetNumOfFrets() {
	return numFrets;
}
