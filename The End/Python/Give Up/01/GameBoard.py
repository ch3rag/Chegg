class GameBoard:
	def __init__(self, size):
		self.size = size
		self.num_entries = [0] * size
		self.items = [[0] * size for i in range(size)]
		self.points = [0] * 2
	
	def num_free_positions_in_column(self, column):
		free = self.size - self.num_entries[column]
		return free
	
	def game_over(self):
		for column in range(self.size):
			if self.num_free_positions_in_column(column) != 0:
				return False
		return True
	
	def display(self):
		for column in range(self.size):
			for row in range(self.size):
				if self.items[self.size - column - 1][row] == 1:
					print("o", end = " ")
				elif self.items[self.size - column - 1][row] == 2:
					print("x", end = " ")
				else:
					print(" ", end = " ")
			print()
		print("-" * (2 * self.size - 1))
		
		for x in range(0, self.size):
			print(x, end = " ")
		print()
		
		print("Points player 1:", self.points[0])
		print("Points player 2:", self.points[1])
	
	# function to be implemented in next section
	def num_new_points(self, row, column, player):
		newPoints = 0
		# Check Horizontal 
		for i in range(self.size - 4 + 1):
			if i <= column <= (i + 4 - 1):
				flag = True
				for j in range(i, i + 4):
					if self.items[row][j] != player:
						flag = False
						break
				if flag:
					self.points[player - 1] += 1

	
	# required function
	def add(self, column, player):
		# for non-existing column
		if(column < 0 or column >= self.size):
			return False
		# for full column
		if(self.num_free_positions_in_column(column) == 0):
			return False
	
		# get the first unaccompanied row
		row = self.num_entries[column]
		# update items and num_entries
		self.items[row][column] = player
		self.num_entries[column] = row + 1
		# add new points to player
		self.num_new_points(row, column, player)

		# return true
		return True
