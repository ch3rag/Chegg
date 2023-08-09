import math

def main():
	x = 0
	for i in range(20):
		x = 1 / (2 + x)
		sqrt2 = 1 + x
		print(str(sqrt2) + "\t" + str(sqrt2 - math.sqrt(2)))

if __name__ == "__main__":
	main()