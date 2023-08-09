# Main
def main():
	# Print Welcome Message
	print('Coin Return Calculator')

	# Keep Looping Until User Wishes To Input
	more = 'y'
	while more == 'y' or more == 'Y':
		# Input Amount
		change = input('\nEnter change amount to convert: ')
		# Check If Amount Is Valid Integer And Less Than 100
		if str(change).isnumeric():
			# Convert Change From String To Int
			change = int(change)
			if change < 100:
				# Call CoinCalc To Get Number Of Quarters, Dimes, Nickles And Pennies
				quarters, dimes, nickles, pennies = coinCalc(change)
				# Print Number Of Coins Only If They Are Not Equal To 0
				if quarters != 0:
					print(f'{quarters} quarter(s)')
				if dimes != 0:
					print(f'{dimes} dime(s)')
				if nickles != 0:
					print(f'{nickles} nickle(s)')
				if pennies != 0:
					print(f'{pennies} penny(ies)')
			else:
				# Invalid Input
				print('Error! Invalid integer entered please try again.')
				continue
			more = input('Want to calculate another amount? (y/n): ')
		else:
			# Invalid Input
			print('Error! Invalid integer entered please try again.')
	print('\nBye!')

# Returns Number Of Quarters, Dimes, Nickles And Pennies
def coinCalc(change):
	quarters = change // 25
	change = change % 25
	dimes = change // 10
	change = change % 10
	nickles = change // 5
	change = change % 5
	pennies = change
	return quarters, dimes, nickles, pennies