import sys

# Print Headers
print('--- Custom Print Quote ---\n')
print('Enter The Following Information To Create A Quote:\n')

# Input Product Name
userInput = input('Product Name: ')

# Validate Product Name
if not all(ch.isalpha() or ch.isspace() for ch in userInput):
	# If It's Invalid, Display Error Message End Exit
	print('Invalid Product Name.') 
	sys.exit()

# Assign User Input To Product Name
productName = userInput

# Input Quantity
userInput = input('Quantity: ')

# Validate Quantity
if not userInput.isdigit():
	# If It's Invalid, Display Error Message End Exit
	print('Quantity Must Be A Positive Whole Number.')
	sys.exit()

# Assign User Input To Quantity
quantity = int(userInput)

# Input Cost
print(productName.capitalize(), 'Unit Cost: ', end = '')
userInput = input().strip()

# Validate Cost
# If There Is A Dollar Sign At Beginning, Remove It
if userInput[0] == '$':
	userInput = userInput[1:]

# Try To Parse It Float
try:
	price = float(userInput)
except ValueError:
	# Parsing Failed, Display Error Message And Exit
	print('Invalid Cost.')
	sys.exit()

# Input Colors
userInput = input('How Many Colors Will be Printed: ')

# Validate Colors
if not userInput.isdigit():
	# If It's Invalid, Display Error Message End Exit
	print('Colors Must Be A Positive Whole Number.')
	sys.exit()

# Assign User Input To Colors
colors = int(userInput)

# Calculation
# Setup Charge
setupCharge = 18.00 * colors
# Materials Cost
materialsCost = price * quantity
# Discount
discount = 0
if materialsCost > 350.0:
	discount = materialsCost * 0.12
# Discounted Total
discountedTotal = materialsCost - discount
# Total Before Markup
total = discountedTotal + setupCharge
# Customer Total
customerTotal = total + total * 0.24

# Quote
print('-' * 39)
# Print Confirmation Code
print('Your Order Confirmation Code Is:', productName[:4] + '-' + str(colors))
# Print Product Type
print('Product Type:', productName.capitalize())
print()
# Print Materials Cost
print(f'{"Materials Cost":<20}${materialsCost:10,.2f}')
# Print Discount If Applicable
if discount > 0:
	print(f'{"Minus Discount":<20}${(discount):10,.2f}')
	print(f'{"Discounted Total":<20}${(discountedTotal):10,.2f}')
# Print Setup Cost
print(f'{str(colors) + " Color Setup":<20}${setupCharge:10,.2f}')
print('-' * 31)
# Print Customer Total
print(f'{"Customer Total":<20}${(customerTotal):10,.2f}')
print('-' * 31)
