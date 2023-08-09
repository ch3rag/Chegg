# Using While Loop

x = 3
n = 5
y = 1


s = 1
while (n > 0):
	n = n - 1
	numerator = (12 + n * 3)
	denominator = numerator + 1
	s = s * ((numerator ** x) / (denominator ** (y + 1)))

print(s)