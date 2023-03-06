#include <stdio.h>

int main(void) {
	int inChar, outChar;
	while ((inChar = getchar()) != EOF) {
		outChar = inChar;

		// New Code
		int bits;
		if ((inChar >= 'A' && inChar <= 'Z') || (inChar >= 'a' && inChar <= 'z')) {
			// Extract The Last 5 Bits
			bits = inChar & 0x1F;

			// Swap Bits
			bits =   (((bits & 2) << 3		// 5th Bit With 2nd
					| ((bits & 1) << 3)		// 4th Bit With 1st
					| (bits & 4)			// 3rd Bit With 3rd
					| ((bits & 16) >> 3))	// 5th Bit With 2nd
					| ((bits & 8) >> 3))	// 4th Bit With 1st
					& 0x1F;					// Remove Extra Bits
			// Replace Last 5 Bits Of inChar With Swapped Bits
			outChar = (inChar & 96) | bits;
		}
		putchar(outChar);
	}
}
