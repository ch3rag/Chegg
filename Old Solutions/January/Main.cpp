// Main.cpp
// Driver
#include <iostream>
#include "Student.h"
using namespace std;

StudentMarks getMarks();

// Main
int main() {
	// Create A Student
	string student_name;
	int student_no;

	// Input Student Name
	cout << "Enter Student Name: ";
	cin >> student_name;

	// Input Student Number
	cout << "Enter Student Number: ";
	cin >> student_no;

	// Create A Student With Number Of Courses Equals 3
	Student student(student_name, student_no, 3);

	// Create An Array Of Student Marks With Size 3
	StudentMarks* marks = new StudentMarks[3];

	// Input Marks From The User
	for (int i = 0; i < 3; i++) {
		marks[i] = getMarks();
	}

	// Update Marks
	student.addCourses(marks);

	// Print All Info
	cout << endl << "---- Student Details ----" << endl;
	student.print_details();

	// Delete All StudentMark
	student.delete_all_courses();

	// Record One New Student Mark
	delete marks;
	marks = new StudentMarks[3];
	marks[0] = getMarks();
	student.addCourses(marks);

	// Print All Info
	cout << endl << "---- Student Details ----" << endl;
	student.print_details();

	// Clean Up
	delete marks;
}

// Input Marks From User
StudentMarks getMarks() {
	int course_id, first_mark, second_mark, final_mark;
	string course_name;

	// Get Course Id
	cout << "Input Course Id: ";
	cin >> course_id;

	// Get Course Name
	cout << "Input Course Name: ";
	cin >> course_name;

	// Input First, Second And Final Mark
	cout << "Input First Mark, Second Mark & Final Mark: ";
	cin >> first_mark >> second_mark >> final_mark;

	// Return A New StudentMark Object
	return StudentMarks(course_id, course_name, first_mark, second_mark, final_mark);
}