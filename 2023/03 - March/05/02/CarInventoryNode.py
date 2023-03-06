from Car import Car

# Car Inventory Node Class
class CarInventoryNode:
    # Constructor
	def __init__(self, car, parent = None, left = None, right = None):
		self.cars = [car]
		self.parent = parent
		self.left = left
		self.right = right
		self.car = car

	# Returns String Representation Of CarInventoryNode
	def __str__(self):
		return '\n'.join(map(str, self.cars))
			