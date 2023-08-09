from exam import Exam

exam = Exam()

exam.add_question("Who is the inventor of Python? ", "Guido van Rossum")
exam.add_question("What does OOP stand for?", "Object-Oriented programming")

question1_str = "In what year was the Python language first released?"
choices1_list = [("1991", True), ("1995", False), ("1998", False), ("2000", False)]
exam.add_choice_question(question1_str, choices1_list)


question2_str = "Which of the following is a built-in type in Python?"
choices2_list = [("array", False), ("record", False), ("dict", True), ("bug", False)]
exam.add_choice_question(question2_str, choices2_list)

exam.present_exam()
print("Your score is {} point(s) out of {} points(s).".format(exam.get_points(), exam.get_num_questions()))