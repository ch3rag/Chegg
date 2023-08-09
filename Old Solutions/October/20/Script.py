# Build CSV From String
def build_csv_string(data):
	# Result String
	result = 'name,assignment,grade\n'
	#  For Each Item In The List of Data
	for elem in data:
		# Declare Name, Assignment, Grade With Default Value
		name = elem[0]
		assignment = 'N/A'
		grade = 0
		# If Assignment Is Available, Assign It
		if len(elem) > 1:
			assignment = elem[1]
		# If Grade Is Available, Assign It
		if len(elem) > 2:
			grade = elem[2]
		# Append To Result
		result += f'{name},{assignment},{grade}\n'
	# Return Result
	return result.strip()

if __name__ == '__main__':
	# Test Build CSV String
	print(build_csv_string([['Sam', 'Lab 01', 5.4]]))
	print(build_csv_string([['Sam', 'Lab 01', 5.4], ['Zoe'], ['Amanda', 'Quiz 04', 100]]))