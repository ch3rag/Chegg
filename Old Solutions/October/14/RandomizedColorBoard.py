import random


# Swaps Two Items In The Array
def swap(arr, i, j):
	arr[i], arr[j] = arr[j], arr[i]

# Returns A Random Index
def getRandIdx(bound):
	return random.randint(0, bound - 1)

def solve(height, width, colors):
	# Using List As 2D Array
	board = [[0] * width for i in range(height)]

	# Using Dictionary As HashMap
	colorsIdx = {}
	for i in range(len(colors)):
		colorsIdx[colors[i]] = i
	
	for i in range(height):
		for j in range(width):
			excludeIdx = len(colors) - 1
			if j > 1 and board[i][j - 2] == board[i][j - 1]:
				val = board[i][j - 2]
				excludeItemCurrIdx = colorsIdx[val]
				lastItem = colors[excludeIdx]
				swap(colors, excludeItemCurrIdx, excludeIdx)
				colorsIdx[val] = excludeIdx
				colorsIdx[lastItem] = excludeItemCurrIdx
				excludeIdx -= 1
			
			if i > 1 and board[i - 2][j] == board[i - 1][j]:
				val = board[i - 2][j]
				excludeItemCurrIdx = colorsIdx[val]
				lastItem = colors[excludeIdx]
				swap(colors, excludeItemCurrIdx, excludeIdx)
				colorsIdx[val] = excludeIdx
				colorsIdx[lastItem] = excludeItemCurrIdx
				excludeIdx -= 1

			randIdx = getRandIdx(excludeIdx + 1)
			board[i][j] = colors[randIdx]
	return board


board = solve(4, 4, [3, 1, 2, 4])
for row in board:
	print(row)