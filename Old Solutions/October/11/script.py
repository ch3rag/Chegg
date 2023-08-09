import re
from pprint import pprint

# A Dictionary To Store Words
words = {}

# Open DataFile For Reading
file_name = 'Data.txt'

with open(file_name, 'r') as f:
	# For Every Line In File
	for line in f:
		# For Every Token In The Line
		for token in line.split():
			# Remove All Non-Word Characters From The Token
			# And Transform It To Lowercase
			word = re.sub(r'[^\w]', '', token).lower()
			# Add The Resulting Word To Dictionary
			# If It's Already There Update The Frequency
			if word in words:
				words[word] += 1
			else:
				words[word] = 1

# Write The Result In File
with open('Result.txt', 'wt') as f:
	pprint(words, stream = f)

# Print The Frequency Of The Word 'Honest'
freq_of_honest = 0
if 'honest' in words:
	freq_of_honest = words['honest']
print(f'Frequency Of The World "Honest": {freq_of_honest}')

# We Need To Sort The Dictionary By Frequency And Iterate Through It
# Print 15th Entry Of The Dictionary
i = 1
for (k, v) in sorted(words.items(), key = lambda x : x[1], reverse = True):
	if i == 15:
		print(f'15th Most Frequent Word: {k}, Frequency: {v}')
		break
	i += 1
