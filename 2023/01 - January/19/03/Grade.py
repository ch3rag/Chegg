""" Reads All CSV In A Directory And Displays Stats """
import glob, re, math

""" Reads .CSV File And Stores Data In A Dictionary """
def readCSV(fileName):
	# Open File For Reading
	with open(fileName) as f:
		# Read All Data And Split It
		dataStr = f.read().strip()
		data = re.split('\n|,', dataStr)
		# Read Headers
		dataDict = {
			'Percent_Total': int(data[1]),
			'Max_Points': int(data[4]),
			'First_Names': [],
			'Last_Names': [],
			'Points': []
		}

		# Read Each Student Data
		for i in range(12, len(data), 3):
			dataDict['Last_Names'].append(data[i])
			dataDict['First_Names'].append(data[i + 1])
			dataDict['Points'].append(int(data[i + 2]))

		# Return Data Dictionary
		return dataDict

""" Returns Mean (Avg Of Data) """
def getMean(data):
	total = sum(data)
	return total / len(data)

""" Returns Median Of The Data """
def getMedian(data):
	sortedData = sorted(data)
	return sortedData[len(data) // 2]

""" Returns Mode Of Data """
def getMode(data):
	frequency = {}
	# For Each Item In Data
	for item in data:
		if item in frequency:
			frequency[item] += 1
		else:
			frequency[item] = 1

	# Find Max
	max = data[0]
	maxFreq = frequency[max]
	for (k, f) in frequency.items():
		if (f > maxFreq) or (f == maxFreq and k > max):
			maxFreq = f
			max = k
	return max

""" Returns Standard Deviation Of The Data """
def getStdDeviation(data):
	# Get Mean
	mean = getMean(data)
	# Get Std Deviation
	return math.sqrt(sum(list(map(lambda x: (x - mean) ** 2, data))) / len(data))

""" Returns Grade Letter Corresponding To A Point """
def getGradeLetter(points):
	if points >= 90:
		return 'A'
	elif points >= 80:
		return 'B'
	elif points >= 70:
		return 'C'
	elif points >= 60:
		return 'D'
	else:
		return 'F'

""" Entry Point Of Program"""
def main():
	# Input The Name Of The Directory Containing CSV
	dirName = input('Please enter the name of the directory containing the homeworks: ')
	
	# For Each .CSV In Directory
	for fName in glob.glob(f'{dirName}/*.csv'):
		# Read CSV And Get Data
		data = readCSV(fName)
		data['Percent_Score'] = list(map(lambda x: (x / data['Max_Points'] * 100), data['Points']))
		data['Grades'] = list(map(getGradeLetter, data['Percent_Score']))
		mean = getMean(data['Percent_Score'])
		median = getMedian(data['Percent_Score'])
		mode = getMode(data['Percent_Score'])
		stdDeviation = getStdDeviation(data['Percent_Score'])
		# Print Mean, Median, Mode, Std Deviation
		print('Mean | Median | Mode | Standard Deviation')
		print(f'{mean:.2F} | {median:.2F} | {mode:.2F} | {stdDeviation:.2F}')
		# Print Student Stats
		print('Last Name | First Name | Percent | Letter')
		# Sort Student Data
		stuData = sorted(list(zip(data['Last_Names'], data['First_Names'], data['Percent_Score'], data['Grades'])),
			key = lambda x: x[0] + ' ' + x[1])
		# Print Student Data
		for item in stuData:
			print(f'{item[0]} | {item[1]} | {item[2]:.2F} | {item[3]}')

if __name__ == '__main__':
	main()
