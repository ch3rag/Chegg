# Takes A List Of Words
# Returns A Dictionary Whose Keys Are Length Of Word
# And Value Is Number Of Words In The List Which Are Of That Length
def WordLengthFrequency(words):
	# Output Dictionary
	freq = {}
	# Loop Through Each Word In The List
	for word in words:
		# Get Length Of The Word
		length = len(word)
		# Check If A Key Exists Exits In The Dictionary With That Length
		if length in freq:
			# Just Add One To The Value
			freq[length] += 1
		else:
			# Add A New Key With Value 1
			freq[length] = 1
	# Return The Dictionary
	return freq

# Test The Function
def main():
	# Test List
	words = ['Hello', 'Welcome', 'To', 'Python', 'Programming', 'It', 'Is', 'A', 'Very',
		'Beginner', 'Friendly', 'Yet', 'Powerful', 'Language', 'Hope', 'You', 'Enjoy',
		'Learning', 'It', 'Python', 'Is', 'A', 'Scripting', 'Language']
	# Get Frequencies
	freq = WordLengthFrequency(words)
	
	# Print
	print(freq)

if __name__ == '__main__':
	main()