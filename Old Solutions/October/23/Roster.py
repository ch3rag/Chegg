# Student Class
class Student:
	# Constructor
	def __init__(self, first, last, gpa):
		self.first = first
		self.last = last
		self.gpa = gpa
	
	# Getters
	def get_first(self):
		return self.first
	
	def get_last(self):
		return self.last

	def get_gpa(self):
		return self.gpa

# Course Class
class Course:
	# Constructor
	def __init__(self):
		# Set Roster As Empty List
		self.roster = []
	
	# Adds A Student To Roster
	def add_student(self, student):
		self.roster.append(student)
	
	# Drops A Student From Roster
	def drop_student(self, student):
		self.roster.remove(student)
	
	# Returns The Number Of Students In Roster
	def count_students(self):
		return len(self.roster)

# Main
def main():
	# Test
	# Create A Course
	myCourse = Course()
	# Create 4 Students
	henry = Student('Henry', 'Nguyen', 3.5)
	brenda = Student('Brenda', 'Stern', 2.0)
	lynda = Student('Lynda', 'Robinson', 3.2)
	sonya = Student('Sonya', 'King', 3.9)

	# Add Student To Course
	myCourse.add_student(henry)
	myCourse.add_student(brenda)
	myCourse.add_student(lynda)
	myCourse.add_student(sonya)

	# Display Size
	print(f'Course Size: {myCourse.count_students()}')

	# Drop Stern
	myCourse.drop_student(brenda)

	print(f'Course After Drop: {myCourse.count_students()}')

if __name__ == '__main__':
	main()