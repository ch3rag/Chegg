# TotalCost.py

def total_cost(purchases: list[tuple[str, int]], prices: dict[str, int]) -> int:
	"""Sum Of Costs Of Purchases, Where
	("Item", n) in Purchases Means N Unit Of Item,
	"Item": K in Prices Means Each Unit Of Item Costs K Cybercoins
	>>> total_cost([("apple", 2), ("banana", 3)], { "pizza": 12, "apple": 2, "banana": 1 })
	7
	>>> total_cost([], {"yacht": 99_000_000, "apple": 2})
	0
	"""
	# Total Cost
	total = 0

	# For Each Purchase In Purchases
	for purchase in purchases:
		# Name Of The Item
		name = purchase[0]
		# Quantity Purchased
		quantity = purchase[1]
		# If Name Of The Item Is In The Dictionary 'Prices' Then
		if name in prices:
			# Price Of One Item
			price = prices[name]
			# Calculate (Cost Of One Item X Number Purchased)
			# And Add To Total
			total = total + price * quantity
	# Return Total
	return total

# Main
def main():
	# Test
	print(total_cost([("apple", 2), ("banana", 3)], { "pizza": 12, "apple": 2, "banana": 1 }))
	print(total_cost([], {"yacht": 99_000_000, "apple": 2}))

if __name__ == '__main__':
	main()

