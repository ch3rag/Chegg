# Inserts Dog Into Proper List in Dog_Dict Using Color As Key
def dog_sort(dog_dict, color, dog):
	# Check If Color Exits In The Dog_Dict
	if color in dog_dict:
		# Yes, Then Insert Dog Into The List Of Breeds
		dog_dict[color].append(dog)
	else:
		# Create A New Key With The Color In Dog_Dict
		dog_dict[color] = [dog]

# Returns The Number Of Dogs Of The Given Color In Dog_Dict
def dog_count(dog_dict, color):
	# Check If Color Exits In The Dog_Dict
	if color in dog_dict:
		# Return Number Of Dogs With That Color
		return len(dog_dict[color])
	# No Dogs With The Given Color Exists
	return 0

# Prints List Of The Dogs With The Given Color And Number
def print_dogs(dog_dict, color):
	count = dog_count(dog_dict, color)
	# Dog With Color Exits
	if count > 0:
		# For Count Less Than 2
		if count < 2:
			print(f'I have {count} {color} dog that is a:')
			print(dog_dict[color])
			print('Best doggo!')
		# For Count >= 2 And <= 5
		elif 2 <= count <= 5:
			print(f'I have {count} {color} dogs that are the following breeds:')
			print(dog_dict[color])
			print('Many doggo!')
		# For > 5
		else:
			print(f'I have {count} {color} dogs that are the following breeds:')
			print(dog_dict[color])
			print('All the doggo!')

# Test Code
def main():
	# Create A Dog_Dict
	dog_dict = {}
	# Add Some Dogs
	dog_sort(dog_dict, 'white', 'Corgi')
	dog_sort(dog_dict, 'black', 'Tibetan Mastiff')
	dog_sort(dog_dict, 'black', 'Kai Ken')

	# Print Them
	print_dogs(dog_dict, 'white')
	print()
	print_dogs(dog_dict, 'black')

if __name__ == '__main__':
	main()