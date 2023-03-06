import sys

# Main
def main():
	# Get File Name From Arg
	# Check If The Arg Was Passed
	if len(sys.argv) == 1:
		# Print Usage Info
		print('Usage: python Unscramble.py <INPUT_FILE>')
	# Fetch File Name
	inputFileName = sys.argv[1]
	# Create An Output File
	outputFileName = 'novel_text.txt'
	# Create A Summary File
	summaryFileName = 'novel_summary.txt'
	# Open The Files For Reading And Writing
	with open(inputFileName, 'r', encoding = 'utf8') as inFile, open(outputFileName, 'w', encoding = 'utf8') as outFile, open(summaryFileName, 'w') as sumFile:
		# Create A Dictionary To Hold Info, Contains A Map Of Code And List Of Sentences
		data = {}

		# For Each Line In Input File
		for line in inFile:
			# Fetch Sentence, Line Number And Code
			sentence, lineNumber, code = line.strip().split('|')
			# Get A List Of That Code From Data
			sentences = data.get(code, [])
			# Append A Tuple Containing Sentence And Line Number
			sentences.append((int(lineNumber), sentence))
			# Update Data Dictionary
			data[code] = sentences
		
		# Now We Have A Mapping In Data As { Code: [(LineNo, Sentence), ...] }
		# Iterate Over Each Code
		for code, sentences in data.items():
			# Sort The Sentences By Line Number
			sentences = sorted(sentences, key = lambda x: x[0])
			# Write Code To Output File
			outFile.write(f'{code}\n')
			# To Keep Track Of Average Lengths, Longest Length
			totalLength = 0
			longest = None
			shortest = None

			# Write Lines To Output File
			for pair in sentences:
				# Fetch Line Number And Sentence
				lineNumber, sentence = pair
				# Write Sentence To File
				outFile.write(sentence)
				# Length Of Current Sentence
				sentenceLength = len(sentence)
				# Add To Total Length
				totalLength += sentenceLength
				# Check For Longest And Shortest
				if longest is None or len(longest[1]) < sentenceLength:
					longest = (lineNumber, sentence)
				if shortest is None or len(shortest[1]) > sentenceLength:
					shortest = (lineNumber, sentence)
			# Print Separator
			outFile.write('\n-----\n')
			# Compute Average Length
			averageLength = totalLength // len(sentences)
			# Write Summary
			sumFile.write(f'{code}\n')
			sumFile.write(f'Longest Line ({longest[0]}): {longest[1]}\n')
			sumFile.write(f'Shortest Line ({shortest[0]}): {shortest[1]}\n')
			sumFile.write(f'Average Length: {averageLength}\n\n')

if __name__ == '__main__':
	main()
