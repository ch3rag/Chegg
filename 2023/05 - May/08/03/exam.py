from question import Question
from choice_question import ChoiceQuestion

# Exam Class
class Exam:
	# Constructor
	def __init__(self):
		# List To Hold All Questions
		self.questions = []
		# Score Of The Student
		self.score = 0

	# Add A Normal Question
	def add_question(self, question, answer):
		# Create A New Question
		ques = Question()
		# Set The Question Text
		ques.set_question(question)
		# Set The Answer
		ques.set_answer(answer)
		# Add It To The List Of All Questions
		self.questions.append(ques)
		
	
	# Add A Choice Question
	def add_choice_question(self, question, choices):
		# Create A New Choice Question
		ques = ChoiceQuestion()
		# Set The Question Text
		ques.set_question(question)
		# Add All The Choices
		for choice in choices:
			ques.add_choice(choice[0], choice[1])
		# Add It To The List Of All Questions
		self.questions.append(ques)
	
	# Presents Exam To The Student
	def present_exam(self):
		# For Every Question In The List Of Questions
		for question in self.questions:
			# Print The Question Text
			print(question)
			# Get User's Response
			response = input('Your answer: ')
			# Match It With Correct Answer
			result = question.check_answer(response)
			# Print The Result
			print(result)
			# If Answer Is Correct, Increment The Score
			if result:
				self.score += 1
			print()
	
	# Returns The Points Of The Student
	def get_points(self):
		return self.score
	
	# Returns The Number Of Questions
	def get_num_questions(self):
		return len(self.questions)

