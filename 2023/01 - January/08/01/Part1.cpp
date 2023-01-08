// Part1.cpp
#include <iostream>
using namespace std;

// Declare Struct For XY Point
// This Struct Holds An X Coordinate And A Y Coordinate For A Data Point
struct XYPoint {
	double xCoord;
	double yCoord;
};


// Declare Polygon Struct
struct Polygon {
	// Number Of Sides In The Polygon
	int numSides;
	// Pointer To The Dynamic Array Of XYPoint Values For Each Coordinate
	XYPoint* vertexCoordinates;
};

void outputDataPoint(XYPoint dataPoint) {
	cout << "(" << dataPoint.xCoord << ", ";
	cout << dataPoint.yCoord << ")";
}

int main() {
	// IDK What Your Code Is, So I Have Come Up With The Code To Match Sample Output
	cout << "Welcome to part 1 of Prof. Erickson's Struct Sandbox!" << endl;
	cout << "Sample code:" << endl;
	cout << "Initializing ExamplePoint to (1,2):" << endl;
	
	XYPoint ExamplePoint;
	ExamplePoint.xCoord = 1;
	ExamplePoint.yCoord = 2;
	outputDataPoint(ExamplePoint);
	
	cout << endl;
	cout << "Enter a new x value for ExamplePoint:" << endl;
	cin >> ExamplePoint.xCoord;
	cout << "Enter a new y value for ExamplePoint:" << endl;
	cin >> ExamplePoint.yCoord;
	outputDataPoint(ExamplePoint);
	cout << endl;

	Polygon square;
	square.numSides = 4;
	square.vertexCoordinates = new XYPoint[4];

	cout << "Initializing square's vertexCoordinates[4] to zero:" << endl;

	for (int i = 0; i < square.numSides; i++) {
		square.vertexCoordinates[i].xCoord = 0;
		square.vertexCoordinates[i].yCoord = 0;
	}

	cout << "The values in the square Polygon struct are:" << endl;
	for (int i = 0; i < square.numSides; i++) {
		outputDataPoint(square.vertexCoordinates[i]);
		cout << endl;
	}

	cout << "End of sample code. Part 1 begins here." << endl << endl;
	// End Of Sample Code
	
	// Start Of Actual Part - 1 Code
	cout << "Part 1: Initializing an unknown Polygon struct." << endl;
	cout << "How many sides does the unknown polygon have?" << endl;
	// Input Number Of Sides
	int numberOfSides;
	cin >> numberOfSides;

	// Initialize Polygon & VertexCoordinates Array
	Polygon unknown;
	unknown.numSides = numberOfSides;
	unknown.vertexCoordinates = new XYPoint[numberOfSides];

	// Input Coordinates Of Each Side
	for (int i = 0; i < unknown.numSides; i++) {
		cout << "Enter the next x coordinate:" << endl;
		cin >> unknown.vertexCoordinates[i].xCoord;
		cout << "Enter the next y coordinate:" << endl;
		cin >> unknown.vertexCoordinates[i].yCoord;
	}

	// Output Unknown Polygon's Sides
	cout << "The values in the unknown Polygon struct are:" << endl;
	for (int i = 0; i < unknown.numSides; i++) {
		outputDataPoint(unknown.vertexCoordinates[i]);
		cout << endl;
	}

	// Clean Up
	delete unknown.vertexCoordinates;
	delete square.vertexCoordinates;

	return 0;
}
