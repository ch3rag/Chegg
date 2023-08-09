from question import Question

# Choice Question Class
class ChoiceQuestion(Question):
	# Constructor
	def __init__(self):
		# A List To Hold All The Choices
		self.choices = []
	
	# Adds A New Choice To Question
	def add_choice(self, choice, correct):
		# Add Choice To List Of Choices
		self.choices.append(choice)
		# If Correct Flag Is Set, This Is The Correct Answer
		if correct:
			# Set The Answer To The Choice Index
			self.answer = str(len(self.choices))

	# Returns A String Of Question Along WithAll Choices
	def __str__(self):
		# Append Question
		question = self.question
		# Append All Choices
		for i in range(len(self.choices)):
			question += f'\n{i + 1}. {self.choices[i]}'
		# Return The Result
		return question
	