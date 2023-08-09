#include <iostream>
#include <stdlib.h>

using namespace std;

const int numFortunes = 10;
string fortunes[numFortunes] = {
    "A dubious friend may be an enemy in camouflage.", 
    "Your success will astonish everyone.", 
    "You will soon be surrounded by good friends and laughter.", 
    "Many will travel to hear you speak.",
    "Now is a good time to buy stock.",
    "Physical activity will dramatically improve your outlook today.",
    "Say hello to others. You will have a happier day.",
    "You should be able to undertake and complete anything.",
    "You will be pleasantly surprised tonight.",
    "You will be traveling and coming into a fortune.",
};

string RandomFortune() {
	return fortunes[rand() % 10];
}

int main() {
	for (int i = 0; i < 10; i++) {
		cout << RandomFortune() << endl;
	}
}