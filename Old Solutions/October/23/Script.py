# Open File For Reading
with open('Strings.txt') as f:
	# For Each Line In The File
	for line in f.readlines():
		# Strip Leading And Trailing WhiteSpace And Convert
		# To Uppercase
		line = line.strip().upper()
		# Output The String
		print(line)

		# Dictionary To Store Frequency Of Each Alphabet
		freq = {}
		# For Each Character In Line
		for ch in line:
			# If Character Is Alphabet
			if str.isalpha(ch):
				# Update Frequency Dict
				if ch in freq:
					freq[ch] += 1
				else:
					freq[ch] = 1

		# Display The Dictionary
		print(f'Dictionary: {freq}')
		# Get Least Frequency From Dict
		min_freq = freq[min(freq, key = freq.get)]
		
		# Print Letters With Min Frequency
		min_freq_ch = [key for key, value in freq.items() if value == min_freq]
		print(f'Letters With Min Count Of {min_freq}: {min_freq_ch}')
		
		# Delete Min Frequency Letters From Dict
		for ch in min_freq_ch:
			del freq[ch]
		
		# Print
		print(f'Dictionary After Min Letter Removed: {freq}')

		# Create A List From Dictionary Keys And Sort It
		freq_list = [key for key in freq]
		# Sort It
		freq_list.sort()
		# Print It
		print(f'Letters Sorted: {freq_list}')

		print()

