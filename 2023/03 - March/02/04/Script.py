from Data import capitals, countries, countries_and_capitals
import json

# Prints Countries And Their Capitals In A JSON Format
def print_json_countries_and_capitals():
	# Indexer
	idx = 0
	# List To Hold All The Data
	data = []
	# Loop Through Each Country And Capital
	while idx < len(countries_and_capitals):
		# Append Country And Capital In Data
		data.append({
			'country_name': countries_and_capitals[idx][0],
			'capital_city': countries_and_capitals[idx][1]
		})
		# Increment Index
		idx += 1
	# Print Data In JSON Format
	print(json.dumps(data, indent = 3))

# Returns List Of All Countries Whose Nth Letter Matches The Letter In Arg
def get_list_of_countries_whose_nth_letter_is(n, letter):
	# Result List
	result = []
	# Loop Over Each Country
	for country in countries:
		# If N Is Less Than Length Of Name Of Country And Letter At Nth Index Equals Letter
		if n < len(country) and country.upper()[n - 1] == letter.upper():
			# Append The Country To Result
			result.append(country)
	# Return The Result
	return result

# Returns A List Of Capital Cities In Which Letter Preceding And Following The Arg Letter
# Is Changed To Uppercase
def get_funny_case_capital_cities(letter):
	# Result List
	result = []
	# Loop Over Each Capital
	for capital in capitals:
		# Convert Current Capital Name To A List
		capitalList = list(capital.lower())
		# If Letter In Arg Is In The List
		if letter in capitalList:
			# Loop Through Each Letter
			for i in range(len(capitalList)):
				# If Current Letter In List Equals Letter In Arg
				if capitalList[i] == letter:
					# Upper Case Predecessor It Unless It's Out Of Bounds Or Same As Letter In Arg
					if i - 1 >= 0 and capitalList[i - 1] != letter:
						capitalList[i - 1] = capitalList[i - 1].upper()
					# Upper Case Successor It Unless It's Out Of Bounds Or Same As Letter In Arg
					if i + 1 < len(capitalList) and capitalList[i + 1] != letter:
						capitalList[i + 1] = capitalList[i + 1].upper()
			# Convert List Back To String And Append To Result List
			result.append(''.join(capitalList))
	return result

# Returns A Tuple Of Countries That Have Consecutive Letters In Them
def get_doubled_letter_countries():
	# A List To Hold Results
	result = []
	# Loop From Letter 'a' To 'z'
	for i in range(ord('a'), ord('z') + 1):
		# Ch Holds The Current Alphabet
		ch = chr(i)
		# Loop Through Each Country
		for country in countries:
			# Convert Country Name To Lowercase
			country = country.lower()
			# Loop Through Each Letter In Country Name
			for j in range(len(country) - 1):
				# If Current And Next Letter In Country Name Are Same And It's Also Same As Current Alphabet
				if country[j] == country[j + 1] and country[j] == ch:
					# Append The Country Name To Result List
					result.append(country)
	# Convert Result List To Tuple And Return It
	return tuple(result)

# Main
def main():
	print('I should not be called')

if __name__ == '__main__':
	# print_json_countries_and_capitals()
	# print(get_list_of_countries_whose_nth_letter_is(3, 'M'))
	# print(get_funny_case_capital_cities('w'))
	print(get_doubled_letter_countries())
	# main()
	pass