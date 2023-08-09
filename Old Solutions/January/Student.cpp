// Student.CPP

#include "Student.h"
#include <iostream>

// Constructor
Student :: Student(std::string student_name, int student_no, int number_of_courses) {
	this->student_name = student_name;
	this->student_no = student_no;
	this->number_of_courses = number_of_courses;
}

// Destructor
Student :: ~Student() {
	// Delete The Dynamically Allocated Marks Array
	delete student_marks;
}

// Copy Constructor
Student :: Student(const Student& student) {
	student_name = student.student_name;
	student_no = student.student_no;
	number_of_courses = student.number_of_courses;

	// Perform Deep Copy Of Marks
	student_marks = new StudentMarks[number_of_courses];
	for (int i = 0; i < number_of_courses; i++) {
		student_marks[i] = student.student_marks[i];
	}
}

// Add Courses
void Student :: addCourses(StudentMarks* c) {
	student_marks = new StudentMarks[number_of_courses];
	for (int i = 0; i < number_of_courses; i++) {
		student_marks[i] = c[i];
	}
}

// Delete All Courses
void Student :: delete_all_courses() {
	delete student_marks;
	student_marks = new StudentMarks[number_of_courses];
}

// Print Details
void Student :: print_details() {
	std::cout << "Student Name: " << student_name << std::endl
			  << "Student Number: " << student_no << std::endl
			  << "Number Of Courses: " << number_of_courses << std::endl;
	for (int i = 0; i < number_of_courses; i++) {
		student_marks[i].print_details();
		std::cout << std::endl;
	}
}