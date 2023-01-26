# Returns Grade Letter According To Score
def getGradeLetter(score):
	if score >= 90:
		return 'A'
	elif score >= 80:
		return 'B'
	elif score >= 70:
		return 'C'
	elif score >= 60:
		return 'D'
	else:
		return 'F'

# Input File Name From The User
fileName = input('Enter Input Data File Name: ')

# Open File For Reading And Report.Txt
with open(fileName, 'r') as inFile, open('report.txt', 'w') as outFile:
	# Averages
	avgMidTerm1Score = 0
	avgMidTerm2Score = 0
	avgFinalScore = 0
	scoreCount = 0

	# Read File Line By Line
	for line in inFile:
		# Split Line Into Fields
		fields = line.strip().split('\t')

		# Fetch Data From Fields
		lastName = fields[0]
		firstName = fields[1]
		midTerm1Score = int(fields[2])
		midTerm2Score = int(fields[3])
		finalScore = int(fields[4])
		avgScore = (midTerm1Score + midTerm2Score + finalScore) / 3.0

		# Accumulate Scores
		avgMidTerm1Score += midTerm1Score
		avgMidTerm2Score += midTerm2Score
		avgFinalScore += finalScore
		scoreCount += 1
		
		# Write Current Line
		outFile.write(f'{lastName}\t{firstName}\t{midTerm1Score}\t{midTerm2Score}\t{finalScore}\t{getGradeLetter(avgScore)}\n')

	# Compute Averages
	avgMidTerm1Score /= scoreCount
	avgMidTerm2Score /= scoreCount
	avgFinalScore /= scoreCount

	# Write Averages
	outFile.write(f'\nAverages: midterm1 {avgMidTerm1Score:.2F}, midterm2 {avgMidTerm2Score:.2F}, final {avgFinalScore:.2F}')
