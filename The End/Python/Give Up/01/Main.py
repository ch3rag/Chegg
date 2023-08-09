from GameBoard import GameBoard

# Main Method
def main():
	board = GameBoard(5)
	board.add(0, 1)
	board.add(0, 2)
	board.add(1, 1)
	board.add(1, 2)
	board.add(2, 1)
	board.add(2, 2)
	board.add(3, 1)
	board.add(3, 2)
	board.add(4, 1)
	board.display()	


if __name__ == '__main__':
	main()