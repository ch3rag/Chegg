# bubble_sort.py

# Sort The List 'X' Using Bubble Sort Algorithm
def bsort(x):
	# If Any Elements Were Swapped
	# True For First Iteration
	swapped = True
	while swapped:
		# Set Swapped To False
		swapped = False
		# For Each Element In Array
		for i in range(len(x) - 1):
			# If Current And Next Elements Are Not In Order
			# Swap Them
			if x[i] > x[i + 1]:
				x[i], x[i + 1] = x[i + 1], x[i]
				# Set Swapped To True
				swapped = True


if __name__ == '__main__':
	# Test
	x = [5, 6, -1, 0, 95, -7, 2]
	print('Unsorted X = ', x)
	bsort(x)
	print('Sorted X = ', x)
