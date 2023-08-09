#include <iostream>
#include <vector>
#include <string.h>
#include <time.h>

using namespace std;

int main() {
	vector<string> strings;
	int beginHr, beginMin, endHr, endMin;
	string str, result;
	char buffer[100];
	

	cout << "Enter start time hour (24 hour clock): >> ";
	cin >> beginHr;
	cout << "Enter start time minute: >> ";
	cin >> beginMin;
	cout << "Enter end time hour (24 hour clock): >> ";
	cin >> endHr;
	cout << "Enter end time minute: >> ";
	cin >> endMin;
	cout << "Enter reminder text: ";
	cin.ignore(); getline(cin, str);

	// { seconds, minutes, hours }
	tm begin = { 0, beginMin, beginHr };
	tm end = { 0, endMin, endHr };

	strftime(buffer, 100 ,"%H:%M - ", &begin);
	result.append(buffer );
	strftime(buffer, 100 ,"%H:%M - ", &end);
	result.append(buffer);
	result.append(str);


	strings.push_back(result);
	cout << strings.at(0);


	return 0;
}