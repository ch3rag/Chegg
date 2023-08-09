from choice_question import ChoiceQuestion

def answer_question(a_question):
	print(a_question)
	response = input("Your answer: ")
	print(a_question.check_answer(response))

# Main
q = ChoiceQuestion()
q.set_question("In what year was the Python language first released?")
q.add_choice("1991", True)
q.add_choice("1995", False)
q.add_choice("1998", False)
q.add_choice("2000", False)

answer_question(q)
print(repr(q))