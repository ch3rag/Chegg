# Use Try Except To Handle Runtime Error
try:
	# Open File In Read Mode
	fname = open('invoice.txt', 'r')
	# Declare Two Empty List
	items = []
	costs = []
	# Access Each Line Of File
	for line in fname:
		# Strip Each Line
		line = line.strip()
		temp = line.split('#')
		items.append(temp[0])
		costs.append(float(temp[1]))
	# Print Desired Output
	print(f'Item\t\t\tCost')
	for i in range(len(items)):
		print(f'{items[i]}\t\t\t${costs[i]:5.2f}')
	print(f'\nTotal cost\t\t${sum(costs):5.2f}')
	print(f'Number of tools\t\t{len(items):6}')
# If Any Error Occurred Then Print It
except Exception as e:
	print(e)