# Writes A List Into A File
def write_list_to_file(words, filename):
	# Open File In Write Mode
	f = open(filename, 'w')
	# For Each Word In The List Of Words
	for word in words:
		# Write The Word Followed By New Line
		f.write(word + '\n')
	# Close The File
	f.close()



# Main
def main():
	# List of Words
	words = []

	# Current Word
	word = input('Enter A Word: ')
	# Keep Adding Words Until User Enters 'Done'
	while word != 'done':
		words.append(word)
		word = input('Enter A Word: ')
	
	# Write The Words To File
	filename = 'Output.txt'
	write_list_to_file(words, filename)

	# Notify User
	print(f'ALl Words have been saved to {filename}.')

if __name__ == '__main__':
	main()
