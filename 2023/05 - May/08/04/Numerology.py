# A Dictionary Contains Map B/W Reduction And Traits
traits = {
	0: 'Emptiness',
	1: 'Independence',
	2: 'Quiet',
	3: 'Charming',
	4: 'Harmony',
	5: 'New Directions',
	6: 'Love',
	7: 'Spirituality',
	8: 'Organization',
	9: 'Romantic',
	11: 'Idealism',
	12: 'Perfectionist',
	22: 'Builder'
}

# Removes All Non-Alphabetic Characters From The Name
# Also Converts It To Lowercase
def cleanName(name):
	# String To Hold Cleaned Name
	cleanedName = ''
	# For Each Character In The Name
	for ch in name:
		# If Character Is Alphabet
		if ch.isalpha():
			# Lowercase It And Add It To Cleaned Name
			cleanedName += ch.lower()
	# Return Cleaned Name
	return cleanedName

# Reduces Name To Numbers
def reduceName(name):
	# Holds Sum Of Characters In The Name
	sum = 0
	# For Each Character In The Name
	for ch in name:
		# Calculate Index Of The Alphabet, E.g., A = 1, B = 2....
		# Add That Index To Sum
		sum += ord(ch) - ord('a') + 1
	# Return Sum
	return sum

# Sums Digit Of A Number
def sumDigits(num):
	# Holds Sum Of Digits In The Number
	sum = 0
	# While Number > 0
	while num > 0:
		# Add Last Digit To Sum
		sum += num % 10
		# Remove Last Digit From The Number
		num //= 10
	# Return The Sum
	return sum

# Main
def main():
	# Input Name
	name = input('Name: ')
	# Clean The Name
	name = cleanName(name)
	# Print Cleaned Name
	print(f'Your "cleaned up" name is: {name}')
	# Reduce Name To Number
	reduction = reduceName(name)
	# Print The First Reduction
	print(f'Reduction: {reduction}')
	# While Reduction Not In The List Of Traits
	while reduction not in traits:
		# Reduce It Further
		reduction = sumDigits(reduction)
		# Print The Current Reduction
		print(f'Reduction: {reduction}')
	# Print The Final And Reduction And Match Trait
	print(f'Your name reduces to ... {reduction} - {traits[reduction]}!')

if __name__ == '__main__':
	main()
