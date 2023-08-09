from StaticArray import *

# SA_RANGE Takes Two Integers Start And End And Returns A StaticArray
# That Contains All The Consecutive Integers Between Start And End (Inclusive).
def sa_range(start: int, end: int) -> StaticArray:
	# Create A Static Array Of Appropriate Size
	stat_range_arr = StaticArray(abs(end - start) + 1)
	
	# Starting Value
	i = start
	# Current Index In StaticArray
	j = 0
	# Step To Increase Or Decrease After Each Value
	step = 1 if start < end else -1

	# While All The Value Are Not Filled
	while (j < stat_range_arr.length()):
		# Assign Current Value To Current Index
		stat_range_arr[j] = i
		# Increase/Decrease I By Step
		i += step
		# Increment Current Index Of StaticArray
		j += 1

	# Return The Result Static Array
	return stat_range_arr

# Test Cases
cases = [
	(1, 3), (-1, 2), (0, 0), (0, -3), (-95, -89), (-89, -95)
]

# Test Each Test Case
for start, end in cases:
	print(f'Start: {start: 4}, End: {end: 4}, {sa_range(start, end)}')
