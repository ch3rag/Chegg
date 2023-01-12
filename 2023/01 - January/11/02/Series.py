# You Code
from math import sqrt

pSum = 0
# Changed 10 To 1000
my_iter = range(1, 10, 1)
for x in my_iter:
	pSum += ((-1) ** (x - 1)) / ((2 * x - 1) * 3 ** (x - 1))
pRes = sqrt(12) * pSum

print(pRes)
