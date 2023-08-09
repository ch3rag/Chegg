# Baton Pass Function
# Takes Two Integers As Input:
#	friends		int - The Number of Friends
#	time		int	- The Time To Report Who Has Baton
# Returns An Integer Array Containing Who Will Pass And Who Will Receive Baton At Given Time
def batonPass(friends, time):
	# Assume 1 -> 2 Happens At T = 0, This Will Ease The Calculations
	time -= 1
	# This If Will Determine The Direction Of Baton
	# If It's Going To Left Of Right
	if (time // (friends - 1)) % 2 == 0:
	# if (time // friends) % 2 == 0:
		# Going Right, E.g. 1 -> 2, 2 -> 3, 3 -> 4
		# Compute Who Has The Baton
		who_has = 1 + time % (friends - 1)
		# Compute Who Will Receive The Baton
		who_receive = who_has + 1
	else:
		# Going Left, E.g. 4 -> 3, 3 -> 2, 2 -> 1
		# Compute Who Has The Baton
		who_has = friends - time % (friends - 1)
		# Compute Who Will Receive The Baton
		who_receive = who_has - 1

	# Return A List Of Who Has And Who Will Receive The Baton
	return [who_has, who_receive]

# Test
for time in range(1, 30):
	batonStatus = batonPass(5, time)
	print(f'Time = {time:2}, {batonStatus[0]} -> {batonStatus[1]}')

