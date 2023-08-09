// Student.H

#ifndef STUDENT_H
#define STUDENT_H
#include <iostream>
#include "StudentMarks.h"

class Student {
	// Private Attributes
	private:
		std::string student_name;
		int student_no;
		int number_of_courses;
		StudentMarks* student_marks;

	// Public Methods
	public:
		Student(std::string, int, int);
		Student(const Student&);
		~Student();
		void addCourses(StudentMarks*);
		void delete_all_courses();
		void print_details();
};
#endif