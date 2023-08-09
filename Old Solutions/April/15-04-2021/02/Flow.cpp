#include <iostream>
#define g 9.81

using namespace std;

int main() {

	double w_pump = 7000, w_actual, max_flow_rate;
	double pump_efficiency, fluid_density, height;

	// input all the required valuees
	cout << "Please enter the pump efficiency: ";
	cin >> pump_efficiency;
	cout << "Please enter the density in kg/lt: ";
	cin >> fluid_density;
	cout << "Please enter the height in meters: ";
	cin >> height;

	// calculate w_actual
	w_actual = pump_efficiency * w_pump;

	// calculate maximum flow rate
	max_flow_rate = w_actual / (fluid_density * g * height);

	// display the result
	cout << "The flow rate of liquid is " << max_flow_rate << " cubic meter per second";
	
	return 0;
}