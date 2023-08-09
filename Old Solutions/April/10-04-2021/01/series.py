# Using For Loop

x = 3
n = 5
y = 1


s = 1
for i in range (n):
	numerator = (12 + i * 3)
	denominator = numerator + 1
	s = s * ((numerator ** x) / (denominator ** (y + 1)))

print(s)