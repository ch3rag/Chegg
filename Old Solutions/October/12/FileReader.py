# Create a Function That Reads the Lines from a File into a List
# and Returns That List of Lines Back to the Calling Function

def fileReader(nameOfFile):
	# Open File for Reading
	f = open(nameOfFile, 'r')
	# Read All Lines from the File into a List
	lines = [line.strip() for line in f.readlines()]
	# Returns List of Lines to the Calling Function
	return lines

def main():
	# Read and Print All Lines in the File 'names.Txt' Using fileReader() Function
	fileName = 'names.txt'
	linesFromFile = fileReader(fileName)
	print(linesFromFile)


main()