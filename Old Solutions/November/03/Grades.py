# This Is Student Grade Class To Store Student Name And Score
class StudentGrade:
	# Constructor
	def __init__(self):
		# Set Class Attributes To Their Default Values
		self._studentName = ''
		self._homework1 = 0
		self._homework2 = 0
		self._project1 = 0
		self._project2 = 0
		self._percentGrade = 0
		self._finalLetterGrade = 'F'

	# Reads A Single Score
	def readScore(prompt, min, max):
		while True:
			score = int(input(prompt))
			# Validates If The Score Is In Valid Range
			if min <= score <= max:
				# If Yes, Return It
				return score
			# Else Display Error And Retake Input
			else:
				print(f'Score is out of range and must be between {min} and {max}.')

	# This Method Reads The User Info And Check Whether They Are Valid Or Not
	def readStudentData(self):
		# Read Name
		self._studentName = input('Enter Student Name: ')
		# Read Home Work - 1 Score
		self._homework1 = StudentGrade.readScore('Enter Score of Homework - 1: ', 0, 10)
		# Read Home Work - 2 Score
		self._homework2 = StudentGrade.readScore('Enter Score of Homework - 2: ', 0, 10)
		# Read Project - 1 Score
		self._project1 = StudentGrade.readScore('Enter Score of Project - 1: ', 0, 100)
		# Read Project - 2 Score
		self._project2 = StudentGrade.readScore('Enter Score of Project - 2: ', 0, 100)
		# Compute Grade Percent
		self.getPercentGrade()
		# Compute Letter Grade
		self.findFinalLetterGrade(self._percentGrade)

	# Sets Student Name
	def setStudentName(self, name):
		self._studentName = name
	
	# Sets Homework - 1 Score
	def setHomeWork1(self, score):
		self._homework1 = score

	# Sets Homework - 2 Score
	def setHomeWork2(self, score):
		self._homework2 = score

	# Sets Project - 1 Score
	def setProject1(self, score):
		self._project1 = score
	
	# Sets Project - 2 Score
	def setProject2(self, score):
		self._project2 = score
	
	# Sets The Percent Grade
	def setPercentGrade(self, grade):
		self._percentGrade = grade
	
	# Sets Final Letter Grade
	def setFinalLetterGrade(self, grade):
		self._finalLetterGrade = grade

	# Returns Student's Name
	def getStudentName(self):
		return self._studentName

	# Returns Homework - 1 Score
	def getHomeWork1(self):
		return self._homework1

	# Returns Homework - 2 Score
	def getHomeWork2(self):
		return self._homework2
	
	# Returns Project - 1 Score
	def getProject1(self):
		return self._project1

	# Returns Project - 2 Score
	def getProject2(self):
		return self._project2

	# Gets The Percent Grade And Also Returns It
	def getPercentGrade(self):
		self._percentGrade = int(25.0 * (self._homework1 + self._homework2) / 20.0
			+ 25.0 * self._project1 / 100.0
			+ 50.0 * self._project2 / 100 + 0.5)
		return self._percentGrade
	
	# Computes And Returns Final Letter Grade 
	def findFinalLetterGrade(self, percentGrade):
		if percentGrade >= 90:
			self._finalLetterGrade =  'A'
		elif 80 <= percentGrade <= 89:
			self._finalLetterGrade = 'B'
		elif 70 <= percentGrade <= 79:
			self._finalLetterGrade = 'C'
		elif 60 <= percentGrade <= 69:
			self._finalLetterGrade = 'D'
		elif percentGrade < 60:
			self._finalLetterGrade = 'F'

		return self._finalLetterGrade

	# Prints Student's Data
	def displayStudentData(self):
		# Name
		print(f'Student\'s Name: {self._studentName}')
		# Scores In Homeworks And Project
		print('Student\'s Score')
		print(f'\tHomework - 1: {self._homework1}')
		print(f'\tHomework - 2: {self._homework2}')
		print(f'\tProject - 1: {self._project1}')
		print(f'\tProject - 2: {self._project2}')
		# Percent Grade And Letter Grade
		print(f'Student\'s Percent Grade: {self._percentGrade}')
		print(f'Student\'s Final Letter Grade: {self._finalLetterGrade}')
		
# Main
def main():
	choice = 1
	while choice == 1:
		sg = StudentGrade()
		# Read Student Data
		sg.readStudentData()
		sg.displayStudentData()

		# Correct Student Name
		sg.setStudentName(input(f'Correct Student Name: ({sg.getStudentName()}): '))
		# Correct Home Work Scores
		sg.setHomeWork1(StudentGrade.readScore(f'Correct Student Homework - 1 Marks ({sg.getHomeWork1()}): ', 0, 10))
		sg.setHomeWork2(StudentGrade.readScore(f'Correct Student Homework - 2 Marks ({sg.getHomeWork2()}): ', 0, 10))
		# Correct Project Scores
		sg.setProject1(StudentGrade.readScore(f'Correct Student Project - 1 Marks ({sg.getProject1()}): ', 0, 100))
		sg.setProject2(StudentGrade.readScore(f'Correct Student Project - 2 Marks ({sg.getProject2()}): ', 0, 100))
		# Update Final Letter Grade
		sg.setFinalLetterGrade(sg.findFinalLetterGrade(sg.getPercentGrade()))

		# Print Altered Record
		print('=================== Latest Student Record ===================')
		sg.displayStudentData()
		choice = int(input('Do you want to enter another record press(1) otherwise press(0): '))

if __name__ == '__main__':
	main()