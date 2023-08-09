# Adds Key,Value In The Dictionary
# If Key Is Already Present, It Displays Error Message
def add_to_dict(dictt, key, value):
	# If Key Is Not In Dictionary
	if not key in dictt:
		# Add It
		dictt[key] = value
	else:
		# Else Key Is In Dictionary
		# Display Error
		print("Error. Key already exits.")
	# Return Dictionary
	return dictt

# Removes A Key From The Dictionary
# Prints Error If Key Does Not Exists
def remove_from_dict(dictt, key):
	try:
		# Try To Delete Key
		del dictt[key]
	except KeyError:
		# Key Does Not Exists
		# Display Error
		print("No such key exists in the dictionary.")
	# Return Dictionary
	return dictt

# Print Value Of Key In The Dictionary
# Prints Error If Key Does Not Exists
def find_key(dictt, key):
	try:
		# Try To Fetch The Value Of Key
		value = dictt[key]
		# On Success, Print It
		print("Value: ", value)
	except KeyError:
		# No Such Key Exists
		print("Key not found.")

def main():
	more = True
	dictt = {}
	dictlst = []
	while more:
		print("Menu: ")
		choice = input("add(a), remove(r), find(f): ")
		if choice.lower() == "a":
			key = input("Key: ")
			value = input("Value: ")
			dictt = add_to_dict(dictt, key, value)
		elif choice.lower() == "r":
			key = input("key to remove: ")
			dictt = remove_from_dict(dictt, key)
		elif choice.lower() == "f":
			key = input("Key to locate: ")
			find_key(dictt, key)
		
		do_more = input("More (y/n)? ")
		if do_more.lower() != 'y':
			more = False
	if dictt:
		for key, value in dictt.items():
			temp = (key, value)
			dictlst.append(temp)
		print(sorted(dictlst))
		
main()