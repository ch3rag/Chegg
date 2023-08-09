# Shopping.py

# Using Nested Dictionaries To Store Items
# Inventory Contains All The Items From Both Stores
# If Item Is Already In The Inventory, Replace It With Cheaper Alternative
inventory = {}

# Updates The Inventory With The Items In The File
def updateInventory(storeName, dataFile):
	# Open File Name For Reading
	with open(dataFile) as file:
		for line in file:
			# Separate Item Name And Price
			data = [field.strip() for field in line.split('$')]
			itemName = data[0]
			itemPrice = float(data[1])
			# Check If The Item Is In The Inventory Or Price Is Less Than Previous Price
			if not itemName in inventory or inventory[itemName]['Price'] > itemPrice:
				# Update Inventory
				inventory[itemName] = { 'Store': storeName, 'Price': itemPrice }

# Update The Inventory With HarrisTeeter And FoodLion Items
updateInventory('Harris Teeter', 'HarrisTeeter.txt')
updateInventory('Food Lion', 'FoodLion.txt')

# List Of Required Items
requirements = {}

# Read The Required Items From File
with open('List.txt') as file:
	for line in file:
		# Separate Item Name And Price
		data = [field.strip() for field in line.split(',')]
		# Fetch ItemName And Quantity
		if data[0].isdigit():
			itemName = data[1]
			quantity = int(data[0])
		else:
			itemName = data[0]
			quantity = int(data[1])
		# Update Dictionary Of Required Items
		requirements[itemName] = quantity


# List Of Item Not Font
itemsNotFound = []

# Print Final Report
# Total
total = 0.0
# Headers
print(f'{"Store":20}{"Item":25}{"Quantity":10}{"Total Price":>15}')
print('-' * 70)
# For Each Item In Requirements
for itemName in requirements:
	if itemName in inventory:
		itemQuant = requirements[itemName]
		itemPrice = inventory[itemName]['Price'] * itemQuant
		itemStore = inventory[itemName]['Store']
		print(f'{itemStore:20}{itemName:25}{itemQuant:10}{itemPrice:>15.2f}')
		total += itemPrice
	else:
		itemsNotFound.append(itemName)
		
# Print Total
print('-' * 70)
print(f'{"Total:":>55}{total:>15.2f}')
print('-' * 70)
# Print Items Not Found
print('Items Not Found:')
for itemName in itemsNotFound:
	print(itemName)
