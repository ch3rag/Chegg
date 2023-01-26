# Returns The Sign Of Multiplication When Numbers
# In Range l <= b Are Multiplied Together
def multiSign(l, b):
	# If 0 In Range
	if l == 0 or b == 0 or l < 0 and b > 0:
		return 0
	# If All Number In Range Are Positive
	elif l > 0 and b > 0:
		return 1
	# If All Number In Range Are Negative
	elif l < 0 and b < 0:
		# Count Of Number B/W L & B Inclusive
		count = abs(l - b) + 1
		if count % 2 == 0:
			return 1
		else:
			return -1

# Prints Sign As String
def printSignAsStr(sign):
	if sign == 0:
		print('ZERO')
	elif sign > 0:
		print('POSITIVE')
	else:
		print('NEGATIVE')

# Input LR
l = int(input())
r = int(input())

# Input DU
d = int(input())
u = int(input())

# S Does Not Exists
if d <= l and u >= r:
	print('EMPTY')
else:
	# Sign Of Multiplication B/W Number In Range L <= N < D
	s1 = multiSign(l, d - 1)
	# Sign Of Multiplication B/W Number In Range U < N <= R
	s2 = multiSign(u + 1, r)
	if l < d and u < r:
		printSignAsStr(s1 * s2)
	elif l > d and u < r:
		printSignAsStr(s2)
	elif l < d and u > r:
		printSignAsStr(s1)
