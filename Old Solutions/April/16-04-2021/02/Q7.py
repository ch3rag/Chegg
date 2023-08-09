def make_length_dict(list):
	dict = {}
	for item in list:
		dict[item] = len(item)
	return dict

print(make_length_dict(["green", "blue", "yellow"]))