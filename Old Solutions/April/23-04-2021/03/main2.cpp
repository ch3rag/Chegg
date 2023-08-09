#include <stdio.h>
using namespace std;

using uc = unsigned char;


void blackAndWhite(uc * const data, int width, int height) {
	uc * const end = data + width * height * 3;
	uc * beg = data;
	while (beg != end) {

		// Compute Average
		uc R = *beg;
		uc G = *(beg + 1);
		uc B = *(beg + 2);
		uc Average = (R + G + B) / 3;
		
		// Assign Average To R, G, B
		*beg = Average;
		*(beg + 1) = Average;
		*(beg + 2) = Average;
		beg += 3;
	}
	
}

int main() {
			printf("%d %d %d %d\n", R, G, B, Average);
		printf("%d %d %d\n", *beg, *(beg + 1), *(beg + 2));
	uc data[] = {
		100, 200, 255,		54, 32, 67,
		10, 56, 101,		200, 0, 0
	};
	blackAndWhite(data, 2, 2);
	return 0;
}