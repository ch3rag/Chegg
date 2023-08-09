// StudentMarks.CPP

#include "StudentMarks.h"
#include <iostream>

// Constructor

StudentMarks :: StudentMarks() {
	course_id = -1;
	course_name = "";
	first_mark = -1;
	second_mark = -1;
	final_mark = -1;
}

StudentMarks :: StudentMarks(int course_id, std::string course_name, int first_mark, int second_mark, int final_mark) {
	this->course_id = course_id;
	this->course_name = course_name;
	this->first_mark = first_mark;
	this->second_mark = second_mark;
	this->final_mark = final_mark;
}

// Copy Constructor
StudentMarks :: StudentMarks(const StudentMarks& marks) {
	course_id = marks.course_id;
	course_name = marks.course_name;
	first_mark = marks.first_mark;
	second_mark = marks.second_mark;
	final_mark = marks.final_mark;
}

// Destructor
StudentMarks :: ~StudentMarks() {
	// No Dynamically Allocated Resource To De-Allocate
}

// Calculates Total
int StudentMarks :: calc_total() {
	return first_mark + second_mark + final_mark;
}

// Print Details
void StudentMarks :: print_details() {
	if (course_name != "")
		std::cout << "Course Id: " << course_id << std::endl
			  << "Course Name: " << course_name << std::endl
			  << "First Mark: " << first_mark << std::endl
			  << "Second Mark: " << second_mark << std::endl
			  << "Final Mark: " << final_mark << std::endl
			  << "Total Mark: " << calc_total() << std::endl;
}