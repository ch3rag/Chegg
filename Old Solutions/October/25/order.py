from pizzaReceipt import generateReceipt

toppings = ['ONION', 'TOMATO', 'GREEN PEPPER', 'MUSHROOM', 'OLIVE', 'SPINACH', 'BROCCOLI',
		'PINEAPPLE', 'HOT PEPPER', 'PEPPERONI', 'HAM', 'BACON', 'GROUND BEEF', 'CHICKEN',
		'SAUSAGE']
# List Of Orders
orders = []

while True:
	# Input User Choice
	userInput = input('Do you want to order a pizza? ').upper()

	# Print Receipt
	if userInput == 'NO' or userInput == 'Q':
		generateReceipt(orders)
		break
	else:
		# Input Pizza Size
		pizzaSize = ''
		while pizzaSize not in ['S', 'M', 'L', 'XL']:
			pizzaSize = input('Choose a size: S, M, L, or XL: ').upper()
		currentToppings = []
		# Input Toppings
		while True:
			print('Type in one of our toppings to add it to your pizza. To see the list of toppings, enter "LIST". When you are done adding toppings, end "X"\n')
			userInput = input().upper()
			if userInput == 'LIST':
				# Display List Of Toppings
				print(toppings)
			elif userInput in toppings:
				# Add Topping
				currentToppings.append(userInput)
				print(f'Added {userInput} to your pizza.')
			elif userInput == 'X':
				# Add Order
				order = (pizzaSize, currentToppings)
				orders.append(order)
				break
			else:
				# Input Topping
				print('Invalid Topping')