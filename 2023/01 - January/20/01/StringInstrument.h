#ifndef STR_INSTRUMENTH
#define STR_INSTRUMENTH

#include "Instrument.h"

class StringInstrument : public Instrument {
	// Declare private data members: numStrings, numFrets
	private:
		string numString;
		string numFrets;

	// Declare mutator functions -
	// SetNumOfStrings(), SetNumOfFrets()
	public:
		void SetNumOfStrings(string userNumString);
		void SetNumOfFrets(string userNumFrets);

	// Declare accessor functions -
	// GetNumOfStrings(), GetNumOfFrets()
		string GetNumOfStrings();
		string GetNumOfFrets();
};

#endif