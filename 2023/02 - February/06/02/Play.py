# Main
def main():
	# Prices For Each Category 1-5
	prices = [5.00, 7.00, 2.00, 6.00, 50.00]
	# Print Prices
	print('PLAY PRICES PER TICKET')
	print(' 1. Student $5.00')
	print(' 2. Veteran $7.00')
	print(' 3. Show Sponsor $2.00')
	print(' 4. Retiree $6.00')
	print(' 5. General Public $50.00')
	print()

	# Input Category
	category = int(input('Please enter the number of the category you fit for purchasing Tickets: '))
	# If Category Is Valid
	if 1 <= category <= 5:
		# Input Number Of Tickets
		numTickets = int(input('How many tickets would you like to buy: '))
		# Calculate Discount Based On Number Of Tickets
		if numTickets < 4:
			discount = 0
		elif numTickets <= 8:
			discount = 10
		elif numTickets <= 15:
			discount = 15
		else:
			discount = 20
		# Compute Total Before Discount
		total = numTickets * prices[category - 1]
		# Compute Discount Amount
		discountAmount = total * (discount / 100.0)
		# Compute Net Total After Applying Discount
		netTotal = total - discountAmount

		# Display Total Before Discount
		print(f'Cost of tickets before any discounts were applied: ${total:.2F}')
		# Print Discount %
		print(f'% Discount applicable: {discount:.2F} %')
		# Print Discount Amount
		print(f'Discount amount: ${discountAmount:.2F}')
		# Print Total Cost After Discount Is Applied
		print(f'Cost of tickets after discounts were applied: ${netTotal:.2F}')
	else:
		# Invalid Category
		print('Invalid category.')

if __name__ == '__main__':
	main()
