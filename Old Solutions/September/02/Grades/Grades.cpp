#include <iostream>
#include <fstream>
#include <algorithm>
#include <iomanip>
using namespace std;

class Student {
    private:
        // Stores Name Of The Student
        string name;
        // Stores 3 Marks Of The Student
        double marks[3];
    public:
        // Default Constructor
        Student() { }
        // Parameterized Constructor
        Student(string name, double marks[]) {
            // Initialize Name And Marks
            this->name = name;
            for (int i = 0; i < 3; i++) {
                this->marks[i] = marks[i];
            }
        }

        // Getters
        // Name
        string getName() {
            return name;
        }

        // Marks Array
        double * getMarks() {
            return marks;
        }

        // Returns Average Marks
        double getAverage() {
            return (marks[0] + marks[1] + marks[2]) / 3;
        }

        // Comparator
        // Compares Two Student Based On Name
        // This Is Used To Sord The Student Array
        bool operator <(Student const &other) {
            return this->name < other.name;
        }
};

// A Funtion To Read Student Data From A File
// Accepts File Name As Parameter And Returns Student Object
Student readStudentData(string fileName) {
    // Create Input Stream
    ifstream in(fileName);
    // Name Of The Student
    string name;
    // Read Name From The File
    getline(in, name);
    // Array To Hold Marks
    double marks[3];
    // Read Marks From The File
    for (int i = 0; i < 3; i++) {
        in >> marks[i];
    }

    // Create An New Student Object And Return It
    return Student(name, marks);
}

// Main
int main() {
    // Create 3 Student Object Array
    Student students[3];
    // Read S1.txt, S2.txt And S3.txt
    students[0] = readStudentData("s1.txt");
    students[1] = readStudentData("s2.txt");
    students[2] = readStudentData("s3.txt");

    // Sort The Student Based On Their Name
    sort(students, students + 3);

    // Find Max Marks In Each Subject
    double maxMarks[3];
    for (int i = 0; i < 3; i++) {
        maxMarks[i] = students[0].getMarks()[i];
        if (students[1].getMarks()[i] > maxMarks[i]) maxMarks[i] = students[1].getMarks()[i];
        if (students[2].getMarks()[i] > maxMarks[i]) maxMarks[i] = students[2].getMarks()[i];
    }

    // Output Result
    // First Display The Student Info
    for (int i = 0; i < 3; i++) {
        double * marks = students[i].getMarks();
        cout << left << setw(20)
             << students[i].getName() 
             << right << fixed << setprecision(2)
             << setw(7) << marks[0]
             << setw(7) << marks[1]
             << setw(7) << marks[2]
             << setw(7) << students[i].getAverage()
             << endl;
    }

    // Display Max Marks
    cout << left << setw(20)
         << "Max" 
         << right << fixed << setprecision(2)
         << setw(7) << maxMarks[0]
         << setw(7) << maxMarks[1]
         << setw(7) << maxMarks[2]
         << endl;
         
    return 0;
}