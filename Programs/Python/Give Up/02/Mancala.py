class Player:
	def __init__(self, name):
		self.__name = name

class Mancala:
	# Constructor
	def __init__(self):
		# 6 Pits And 1 Stores For Each Player
		self.__board = [4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 4, 4, 4, 0]
		self.__player1 = None
		self.__player2 = None

	# Creates A Player
	def create_player(self, name):
		# If Player - 2 Not Created
		if self.__player1 == None:
			self.__player1 = Player(name)
			return self.__player1
		# If Player - 2 Not Created
		elif self.__player2 == None:
			self.__player2 = Player(name)
			return self.__player2

	# Plays A Single Round
	def play_game(self, player_index, pit_index):
		if  0 < pit_index <= 6:
			if player_index == 2:
				pit_index += 6
			count = self.__board[pit_index]
			for i in range(count):
				pass
		else:
			return "Invalid number for pit index"


	# Prints Board
	def print_board(self):
		print("player1:")
		print(f'store: {self.__board[6]}')
		print(self.__board[:6])
		print("player2:")
		print(f'store: {self.__board[13]}')
		print(self.__board[7:13])
	
	# Prints Winner Name
	def return_winner(self):
		pass


def main():
	game = Mancala()
	player1 = game.create_player("Lily")
	player2 = game.create_player("Lucy")
	print(game.play_game(1, 3))
	game.play_game(1, 1)
	game.play_game(2, 3)
	game.play_game(2, 4)
	game.play_game(1, 2)
	game.play_game(2, 2)
	game.play_game(1, 1)
	game.print_board()
	print(game.return_winner())

if __name__ == "__main__":
	main()