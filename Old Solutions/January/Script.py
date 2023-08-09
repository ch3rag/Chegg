import unittest

def getFactors(x):
	""" Returns a List of Factors """
	factors = []
	# Loop Through I = 1 To X
	for i in range(1, x + 1):
		# If I Divides X, Add It To List
		if x % i == 0:
			factors.append(i)
	return factors

def isPrime(x):
	""" Returns True If the Number Is Prime, False Otherwise """
	# If Number of Factors Are 2, Then Number Is Prime
	return len(getFactors(x)) == 2

def isComposite(x):
	""" Returns True If the Number Is Composite, False Otherwise """
	# If X Is Not Prime and Not Equals 1 Then It's Composite
	return not (x == 1 or isPrime(x))

# Test
composite_numbers = [4, 6, 8, 9, 10, 12, 14, 15, 16,
	18, 20, 21, 22, 24, 25, 26, 27,
	28, 30, 32, 33, 34, 35, 36,
	38, 39, 40, 42, 44, 45, 46, 48,
	49, 50, 51, 52, 54, 55, 56, 57,
	58, 60, 62, 63, 64, 65, 66, 91, 93]

for i in composite_numbers:
	assert isComposite(i) == True

not_composite_numbers = [1, 2, 3, 5, 7, 11, 13, 17, 19, 23,
	29, 31, 37, 41, 43, 47, 53, 59,
	61, 67, 71, 73, 79, 83, 89]

for i in not_composite_numbers:
	assert isComposite(i) == False

# DocString Test
assert len(isComposite.__doc__) > 1

print('Success!')