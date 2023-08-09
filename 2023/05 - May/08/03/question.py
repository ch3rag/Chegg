# Question Class
class Question:
	# Constructor
	def __init__(self):
		# Create Two Instance Variables For Question And Answer
		self.question = ''
		self.answer = ''

	# Sets The Question Text
	def set_question(self, question):
		self.question = question

	# Sets The Answer
	def set_answer(self, answer):
		self.answer = answer

	# Returns If User's Response Equals Answer
	# Check Case - Insensitively
	def check_answer(self, answer):
		return self.answer.lower() == answer.lower()

	# Returns Only Question Text
	def __str__(self):
		return self.question
	
	# Returns Question Along With Answer
	def __repr__(self):
		return f'Q: {self.question} A: {self.answer}'