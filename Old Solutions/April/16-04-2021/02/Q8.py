def matching_lines(fileName):
	i = 1
	dict = {}
	with open(fileName) as file:
		for line in file:
			# Add Line To Dictionary And Trim Any New Line Or Whitespace Character
			dict[i] = line.strip()
			i = i + 1
	return dict	

print(matching_lines('random.txt'))