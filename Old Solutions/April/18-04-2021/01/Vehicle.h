#ifndef VEHICLE_H
#define VEHICLE_H
#include <iostream>
using namespace std;

class Vehicle {

	private:
		string make;
		string model;
		int year;

	public:
		Vehicle();
		~Vehicle();
		Vehicle(string make, string model, int year);

		string getMake();
		void setMake(string newMake);

		string getModel();
		void setModel(string newModel);

		int getYear();
		void setYear(int newYear);

		void print();
};

#endif