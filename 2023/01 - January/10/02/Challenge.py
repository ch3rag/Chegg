# Challenge1.pt

# Input Wing Type
wingType = input('Enter the wing type: ').upper()

# Check If Wing Type Is Valid
if (wingType in ['SOUR', 'HOT']):
	# Input The Number Of Wings
	quantity = int(input('Enter the quantity: '))
	# Var For Discount
	discountRate = 0.0
	# For Sour Sauce 
	if wingType == 'SOUR':
		# For Quantity Less Than Equal To 6
		if quantity <= 6:
			# Discount 5%
			discountRate = 0.05
		# For Quantity Greater Than 6 And Less Than Equal To 12
		elif 6 < quantity <= 12:
			# Discount 10%
			discountRate = 0.10
		# For Quantity Greater Than 12 And Less Than Equal To 24
		elif 12 < quantity <= 24:
			discountRate = 0.15
		# For Quantity Greater Than 24
		else:
			discountRate = 0.25
	# For Hot Wings
	elif wingType == 'HOT':
		# For Quantity Greater Than 6 And Less Than Equal To 12
		if 6 < quantity <= 12:
			discountRate = 0.10
		# For Quantity Greater Than 12 And Less Than Equal To 24
		elif 12 < quantity <= 24:
			discountRate = 0.20
		# For Quantity Greater Than 24
		else:
			discountRate = 0.25
	
	# Calculate Sub Total
	subTotal = 0.50 * quantity

	# Discount Amount
	discount = discountRate * subTotal

	# Total
	total = subTotal - discount

	# Print Discount Rate
	print(f'Discount Rate: {discountRate}')
	# Print Sub Total
	print(f'Subtotal: {subTotal}')
	# Print Discount
	print(f'Discount: {discount}')
	# Print Total
	print(f'Total: {total}')
else:
	# Invalid Wing Type
	print('Invalid wing type.')
