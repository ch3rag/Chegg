# Return List Of Remain After Removing First Occurrence Of Subsequence 't'
def missingWords(s, t):
	# List Of All Words
	allWords = s.split(' ')
	# List Of Words To Remove
	toRemove = t.split(' ')
	# List To Hold Result
	result = []
	# Index For ToRemove
	j = 0
	# Iterate Over Each Word In allWords
	for i in range(len(allWords)):
		# All Words Are Removed
		if j == len(toRemove):
			result += allWords[i:]
			break
		# If Current Word In allWords Does Not Equals To Current Word In toRemove
		elif allWords[i] != toRemove[j]:
			# Add It To Result
			result.append(allWords[i])
		else:
			# Else, Increment J
			j += 1
	return result

# Main
def main():
	# Input
	s = input()
	t = input()
	# Output
	for word in missingWords(s, t):
		print(word)

if __name__ == '__main__':
	main()

