import csv

# Open CSV File For Reading
inputFile = open('employees.csv', 'r')

# Create A CSV Reader
reader = csv.DictReader(inputFile)

# Create A Output File
outputFile = open('wages.csv', 'w', newline = '')

# Create A CSV Writer
writer = csv.DictWriter(outputFile, ['employee_name', 'pay_rate'])

# Write The Header
writer.writeheader()

# Read Each Row Of Data Data
for row in reader:
	# Create A Dict For Output Row
	outputRow = {
		# Employee Name
		'employee_name': row['employee_name'],
		# Pay Rate = Hours Worked * 15
		'pay_rate': int(row['hours_worked']) * 15
	}
	writer.writerow(outputRow)

# Clean Up
inputFile.close()
outputFile.close()
