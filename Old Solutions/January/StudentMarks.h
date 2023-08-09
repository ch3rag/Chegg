// StudentMarks.H

#ifndef STUDENTMARKS_H
#define STUDENTMARKS_H
#include <iostream>

class StudentMarks {
	// Private Attributes
	private:
		int course_id;
		std::string course_name;
		int first_mark;
		int second_mark;
		int final_mark;
	// Public Methods
	public:
		// Constructor
		StudentMarks();
		StudentMarks(int, std::string, int, int, int);
		StudentMarks(const StudentMarks&);
		~StudentMarks();
		int calc_total();
		void print_details();
};
#endif