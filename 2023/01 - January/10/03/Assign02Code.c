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
			// Swap The Nth Bit With Bit 1
			// Swap The (N - 1)th Bit With Bit 2
			// An So On
			bits =   (((bits << 4)			// 5th Bit With 1st
					| ((bits & 2) << 2)		// 4th Bit With 2nd
					| (bits & 4)			// 3rd Bit With 3rd
					| ((bits & 8) >> 2))	// 2nd Bit With 4th
					| (bits >> 4))			// 1st Bit With 5th
					& 0x1F;					// Remove Extra Bits

			// Replace Last 5 Bits Of inChar With Swapped Bits
			outChar = (inChar & 96) | bits;
		}
		putchar(outChar);
	}
}
