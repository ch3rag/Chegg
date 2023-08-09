# Load TSV File Of Records In A Dictionary
# This Dictionary Maps ZIP Code With Tuple Of
# (State, St. Address, City, ZIP)
def load_records(filename):
	# Dictionary To Hold The Records
	records = {}
	# Open File Name For Reading
	with open(filename) as f:
		# For Each Line In The File
		for line in f:
			# Strip New Line Character From The Line
			# And Split It At Tab Characters
			fields = line.strip().split('\t')
			# Add The Record To Dictionary
			# Key = ZIP Code
			# Value = Tuple Of (State, St. Address, City, ZIP)
			records[fields[3]] = tuple(fields)

	# Return Records
	return records

# Load All The Records In Minor5.TSV Using Helper
records = load_records('minor5.tsv')

# Infinite Loop
while True:
	# Input City/Zip From The User
	query = input('Enter Zip/City: ').upper()

	# If User Enters QUIT, End The Program
	if (query.upper() == 'QUIT'):
		break

	# If Input Is Numeric, User Entered A ZIP Code
	if query.isnumeric():
		# If Record Dictionary Contains The Key
		if query in records:
			# Print The Record
			print(', '.join(records[query]))
		else:
			# Else, Print Error Message
			print('No records found in this zip code.')
	else:
		# User Entered City Value (Non-Numeric)
		# Flag To Keep Track If Any Matching Record Is Found
		found = False
		# Iterate Over Values In The Dictionary
		for record in records.values():
			# If City Name Matches The User Input
			if record[2].upper() == query:
				# Set Found Flag
				found = True
				# Print The Record
				print(', '.join(record))
		# If No Records Are Found
		if not found:
			# Print Error Message
			print('No records found in this town.')
