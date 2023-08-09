#ifndef DEALERSHIP_H
#define DEALERSHIP_H
#include <iostream>
#include <vector>
#include "Vehicle.h"
using namespace std;


class Dealership {
	private:
		string dealershipName;
		int lotCapacity;
		vector<Vehicle> vehicles;

	public:
		Dealership();
		Dealership(string dealershipName, int lotCapacity);
		int getLotCapacity();
		void setLotCapacity(int newCapacity);
		string getDealershipName();
		void setDealershipName(string newName);
		void addVehicle();
		void listVehicles();
};

#endif