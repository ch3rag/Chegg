def max_coupons(n, c, k):
	# 2D Table To Store Value Of Max(I, J)
	table = [[0 for j in range(n + 1)] for i in range(n + 1)]
	# Compute Value Of Max(I, J) For Each I, J
	for i in range(1, n + 1):
		for j in range(1, n + 1):
			# Compute Max(I, J) Using Max Function
			table[i][j] = max(table[i - k - 1][j] + c[i - 1], table[i - 1][j])
	# Return Max Of Last Row
	return max([table[n][j] for j in range(1, n + 1)])

# Main
def main():
	n, k = [int(i) for i in input().split(',')]
	c = []
	for i in range(n):
		c.append(int(input()))
	print(max_coupons(n, c, k))


if __name__ == '__main__':
	main()
