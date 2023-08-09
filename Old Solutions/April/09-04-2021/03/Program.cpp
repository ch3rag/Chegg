#include <iostream>
#include <ctype.h>

using namespace std;

int main()
{

	char input;
	int a, b, c, d, e, id;
	char studentGrades[20];

	// Input All Grades
	for (int i = 0; i < 20; i++)
	{
		cout << "Enter The Grades Of Student #" << (i + 1) << ": ";
		cin >> input;
		input = toupper(input);
		if (!(input == 'A' || input == 'B' || input == 'C' || input == 'D' || input == 'E'))
		{
			cout << "Invalid Grade. Please Retry." << endl;
			i--;
		}
		else
		{
			studentGrades[i] = input;
		}
	}

	// Show Total And  Ask User If He Want To Update Any
	while (true)
	{
		a = b = c = d = e = 0;
		for (int i = 0; i < 20; i++)
		{
			switch (studentGrades[i])
			{
			case 'A':
				a++;
				break;
			case 'B':
				b++;
				break;
			case 'C':
				c++;
				break;
			case 'D':
				d++;
				break;
			case 'E':
				e++;
				break;
			}
		}
		cout << endl;
		cout << "Number Of Students Who Scored Grade A: " << a << endl;
		cout << "Number Of Students Who Scored Grade B: " << b << endl;
		cout << "Number Of Students Who Scored Grade C: " << c << endl;
		cout << "Number Of Students Who Scored Grade D: " << d << endl;
		cout << "Number Of Students Who Scored Grade E: " << e << endl << endl;

		cout << "Do you want to update grades of any student?(y/n): ";
		cin >> input;
		if (toupper(input) == 'Y')
		{
			cout << "Enter Student #: ";
			cin >> id;
			if (id < 1 || id > 20)
			{
				cout << "Invalid Id. Please Retry";
			}
			else
			{
				cout << "Enter The Grades Of Student #" << id << ": ";
				cin >> input;
				input = toupper(input);
				if (!(input == 'A' || input == 'B' || input == 'C' || input == 'D' || input == 'E'))
				{
					cout << "Invalid Grade. Please Retry." << endl << endl;
				}
				else
				{
					studentGrades[id - 1] = input;
					cout << "Updated.";
				}
			}
		}
		else
		{
			break;
		}
	}
	return 0;
}