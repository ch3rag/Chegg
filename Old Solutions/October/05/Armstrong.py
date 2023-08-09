# The Following Script Prints All The Armstrong Numbers
# Between 1 And 999

# Checks If The Value is Armstrong Or Not
def is_armstrong(n):
	# Stores Sum Of Digit Cubed
	sum = 0
	# Backup Of N
	v = n
	# Loop Through All Digits
	while n > 0:
		# Get Last Digit Of N
		digit = n % 10
		# Add Digit Cubed To Sum
		sum += digit ** 3
		# Remove Last Digit From N
		n //= 10
	# Check And Return If Sum Of Cubes Equals Number Itself
	return sum == v

for i in range(1, 1000):
	if is_armstrong(i):
		print(i)
