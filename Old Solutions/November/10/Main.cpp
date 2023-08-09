#include <iostream>
#include <vector>
#include <map>
#include <string>
using namespace std;

// Student Class
class Student {
	private:
		// Class Attributes
		string name;
		map<string, char> grades;
	public:
		// Constructor
		Student(string name) {
			this->name = name;
		}

		// Getters
		string getName() {
			return name;
		}

		// Setters
		void setName(string name) {
			this->name = name;
		}

		// Add A Grade To Student
		void addGrade(string course, char grade) {
			grades.insert(pair<string, char>(course, grade));
		}
		
		// Display
		void display() {
			cout << "Student Name: " << name << endl << "Grades:" << endl;
			for (map<string, char> :: iterator it = grades.begin(); it != grades.end(); it++) {
				cout << "  " << it->first << " - " << it->second << endl;
			}
			cout << endl;
		}
};


// Main
int main() {
	// A Vector To Store Students
	vector<Student> students;

	// Variables To Store User Input
	string name, course;
	char grade;
	
	// Infinite Loop
	while (true) {
		// Input Name
		cout << "Enter Name ('stop' to exit): ";
		getline(cin, name);

		// If Name Equals Stop, Break The Loop
		if (name == "stop") {
			break;
		}

		// Create A New Student
		Student student(name);

		// Input Course
		while (true) {
			cout << "Enter Course('stop' to exit): ";
			getline(cin, course);
			if (course == "stop") {
				break;
			}
			// Input Grade
			cout << "Enter Grade: ";
			cin >> grade;

			// Flush Stdin
			cin.ignore();

			// Add Course
			student.addGrade(course, grade);
		}

		// And Add To Vector
		students.push_back(student);
	}

	// Display All Students
	for (Student student : students) {
		student.display();
	}
	return 0;
}