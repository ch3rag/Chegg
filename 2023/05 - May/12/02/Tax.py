# Declarations
price = 0
STATE_TAX_RATE = 0.06
CITY_TAX_RATE = 0.02
totalTax = 0
total = 0

# Start
def start():
	startUp()
	while price != 0:
		mainLoop()
	# EndWhile
	finishUp()
# Stop

def startUp():
	global STATE_TAX_RATE, CITY_TAX_RATE, price

	# Input State Sales Tax
	print('Enter state sales tax')
	STATE_TAX_RATE = float(input())

	print('Enter city sales tax')
	CITY_TAX_RATE = float(input())

	print('Enter a price or 0 to quit')
	price = float(input())
# Return

def mainLoop():
	global STATE_TAX_RATE, CITY_TAX_RATE, price
	
	totalTax = price * STATE_TAX_RATE + price * CITY_TAX_RATE
	total = price + totalTax
	print('Price is', price, 'and total tax is', totalTax)
	print('Total is', total)
	print('Enter a price or 0 to quit')
	price = float(input())
# Return

def finishUp():
	print('End of program')
# Return

start()
