def search(array, value):
	isThere = False
	for i in range(0, len(array)):
		if array[i] == value:
			print(f'The array includes value {value}')
			isThere = True
			break
	if not isThere:
		print(f'The array does not include value {value}')

array = [1, 5, 4, 0, 2, -1, 20, 9]
keys = [1, 2, 3, 5, -2, -1]
for key in keys:
	search(array, key)