# A Dictionary for the Simplified Dragon Text Game
# The Dictionary Links a Room to Other Rooms

rooms = {
	'Great Hall': {'South': 'Bedroom'},
	'Bedroom': {'North': 'Great Hall', 'East': 'Cellar'},
	'Cellar': {'West': 'Bedroom'}
}

current_room = 'Great Hall'

# Keep Looping Until User Chooses To Exit
while current_room != 'Exit':
	# Print The Current Room That User Is In
	print('You are in', current_room)

	# Input A Direction A Move
	direction = input('Choose direction to move: ').capitalize()

	if direction == 'Exit':
		# User Wants To Exit
		print('You exited the game.')
		current_room = 'Exit'
	elif direction in rooms[current_room]:
		# Valid Direction
		# Switch The Room
		current_room = rooms[current_room][direction]
	else:
		# Invalid Direction
		# Print Error Message
		print('Sorry, invalid move. Choose another direction.')
