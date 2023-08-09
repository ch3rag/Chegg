from question import Question

def answer_question(a_question):
	print(a_question)
	response = input("Your answer: ")
	print(a_question.check_answer(response))

# Main
q = Question()
q.set_question('Who is the inventor of Python?')
q.set_answer("Guido van Rossum")

answer_question(q)
print(repr(q))