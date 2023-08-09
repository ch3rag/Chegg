#ifndef CAR_H
#define CAR_H
#include <iostream>
#include <vector>
using namespace std;


class Car {
	private:
		int yearModel;
		string make;
		int speed;

	public:
		Car(int yearModel, string make);
		int getSpeed();
		string getMake();
		int getYearModel();
		void accelerate();
		void brake();
		void accelerate(int amount);
		void brake(int amount);
};

#endif