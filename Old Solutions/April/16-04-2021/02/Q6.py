from random import randint

def saveScore():
	score = 0
	randomNumber = -1

	# Generate Score
	while randomNumber != 0:
		randomNumber = randint(0, 10)
		score = score + randomNumber

	# Write To File
	file = open('score.txt', 'w')
	file.write("{}".format(score))
	file.close()


saveScore()