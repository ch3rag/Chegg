# Create A List Of All Alphabets
alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			 'u', 'v', 'w', 'x', 'y', 'z']

n = int(input('Please input a positive integer: '))

# One Way
# alphabets[:n] Will Return A..N
# alphabets[:n - 1][::-1] Will Return A..(N - 1) And Then [::-1] Will Reverse It
# Append Both, You Have The Result!

result = alphabets[:n] + alphabets[:n - 1][::-1]
print(result)

# Another Way
# Create An Empty List
result = []

# Add In A..N
for i in range(n):
	result.append(alphabets[i])

# Add In Reverse (N - 1)..A
for i in range(1, n):
	result.append(alphabets[n - i - 1])

# Print
print(result)
