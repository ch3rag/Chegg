# Generates Receipt For A Pizza Order
# Args: pizzaOrder - List Of Tuples Of Pizza Order
def generateReceipt(pizzaOrder):
	
	# Mapping Of Pizza Size To Cost
	basePrice = {
		'S': 7.99,
		'M': 9.99,
		'L': 11.99,
		'XL': 13.99
	}

	# Mapping Of Pizza Size To Extra Topping Cost
	extraToppingCost = {
		'S': 0.50,
		'M': 0.75,
		'L': 1.00,
		'XL': 1.25
	}

	if len(pizzaOrder) > 0:
		# Total For Complete Order
		orderTotal = 0.0
		# For Each Order
		print('Your Order:')
		for i in range(len(pizzaOrder)):
			# Get Current Order
			order = pizzaOrder[i]
			# Base Cost
			pizzaSize = order[0]
			baseCost = basePrice[pizzaSize]

			# Print Pizza # Along With Size
			print(f'Pizza {i + 1}: {pizzaSize}\t\t{baseCost:6.2F}')

			toppings = order[1]
			# Print List Of Toppings
			for topping in toppings:
				print(f'- {topping}')

			toppingCost = 0
			# Print Extra Topping (If Any)
			if len(toppings) > 3:
				# Extra Topping Cost
				toppingCost = (len(toppings) - 3) * extraToppingCost[pizzaSize]
				print(f'Extra Topping ({pizzaSize})\t{toppingCost:6.2F}')
			
			# Compte Total And Tax
			total = baseCost + toppingCost
			tax = total * 0.13
			finalTotal = total + tax
			orderTotal += finalTotal

			# Print Tax And Total
			print(f'Tax:\t\t\t{tax:6.2F}')
			print(f'Total:\t\t\t{finalTotal:6.2F}')
			print('-' * 30)
		# Print Order Total
		print(f'Order Total:\t\t{orderTotal:6.2F}')
		print('-' * 30)
	else:
		# No Pizzas Ordered
		print('You did not order anything')
