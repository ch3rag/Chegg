from CarInventoryNode import CarInventoryNode
from Car import Car

# Car Inventory Class
class CarInventory:
	# Constructor
	def __init__(self):
		# Create An Empty Root
		self.root = None
	
	# Add Car Recursive Helper
	def __addCar(self, car, current):
		# If Current Node Is Null
		if current is None:
			return CarInventoryNode(car)
		# Current Node's Car Equals Car
		elif current.car == car:
			current.cars.append(car)
		# Current Node's Car < Car
		elif current.car < car:
			current.right = self.__addCar(car, current.right)
		# Current Node's Car > Car
		else:
			current.left = self.__addCar(car, current.left)
		# Return Current Node
		return current

	# Adds A Car Into BST
	def addCar(self, car):
		self.root = self.__addCar(car, self.root)

	# InOrder Helper
	def __inOrder(self, current):
		if current:
			return f'{self.__inOrder(current.left)}{str(current)}\n{self.__inOrder(current.right)}'
		else:
			return ''
		
	# Performs InOrder Traversal
	def inOrder(self):
		return self.__inOrder(self.root)

	# Performs InOrder Traversal
	def preOrder(self):
		return self.__preOrder(self.root)
	
	# PreOrder Helper
	def __preOrder(self, current):
		if current:
			return f'{str(current)}\n{self.__preOrder(current.left)}{self.__preOrder(current.right)}'
		else:
			return ''
	
	# Performs PostOrder Traversal
	def postOrder(self):
		return self.__postOrder(self.root)
	
	# PostOrder Helper
	def __postOrder(self, current):
		if current:
			return f'{self.__postOrder(current.left)}{self.__postOrder(current.right)}{str(current)}\n'
		else:
			return ''
	
	# GetBestCar Helper
	def __getBestCar(self, car, current):
		# If Current Node Is Not None
		if current is not None:
			# If Current Node's Car Equals CarToBeSearched
			if car == current.car:
				# Find The Best Car In The List Of Cars
				bestCar = current.car
				for myCar in current.cars:
					if bestCar.year < myCar.year:
						bestCar = myCar
					elif bestCar.year == myCar.year and bestCar.price < myCar.price:
						bestCar = myCar
				# Return The Best Car
				return bestCar
			# Search Left
			elif car < current.car:
				return self.__getBestCar(car, current.left)
			# Search Right
			else:
				return self.__getBestCar(car, current.right)

	# Returns The Car With Newest Year
	def getBestCar(self, make, model):
		# Create A Dummy car
		carToBeSearched = Car(make, model, 0, 0)
		# User Helper To Search Best Car
		return self.__getBestCar(carToBeSearched, self.root)

	# GetWorstCar Helper
	def __getWorstCar(self, car, current):
		# If Current Node Is Not None
		if current is not None:
			# If Current Node's Car Equals CarToBeSearched
			if car == current.car:
				# Find The Worst Car In The List Of Cars
				worstCar = current.car
				for myCar in current.cars:
					if worstCar.year > myCar.year:
						worstCar = myCar
					elif worstCar.year == myCar.year and worstCar.price > myCar.price:
						worstCar = myCar
				# Return The Best Car
				return worstCar
			# Search Left
			elif car < current.car:
				return self.__getBestCar(car, current.left)
			# Search Right
			else:
				return self.__getBestCar(car, current.right)

	# Returns The Car With Oldest Year
	def getWorstCar(self, make, model):
		# Create A Dummy car
		carToBeSearched = Car(make, model, 0, 0)
		# User Helper To Search Worst Car
		return self.__getWorstCar(carToBeSearched, self.root)

	# GetTotalInventoryPrice Helper
	def __getTotalInventoryPrice(self, current):
		if current:
			# Sum Up All The Prices In Current Node's Car List
			sum = 0
			for car in current.cars:
				sum += car.price
			# Return The Sum Of Prices From Right & Left Sub-Tree + Current Node's Prices
			return self.__getTotalInventoryPrice(current.left) + sum + self.__getTotalInventoryPrice(current.right)
		else:
			return 0
		
	# Return Total Inventory Value
	def getTotalInventoryPrice(self):
		return self.__getTotalInventoryPrice(self.root)

	# DoesCarExist Helper
	def __doesCarExist(self, car, current):
		if current is not None:
			# If Make And Model Matches
			if current.car == car:
				# Check For Year And Price
				for myCar in current.cars:
					# Match Found
					if myCar.year == car.year and myCar.price == car.price:
						return True
				# Match Not Found
				return False
			# Search Left
			elif current.car > car:
				return self.__doesCarExist(car, current.left)
			# Search Right
			else:
				return self.__doesCarExist(car, current.right)
		return False
	
	# Returns True If Car Exits In The Tree
	def doesCarExist(self, car):
		return self.__doesCarExist(car, self.root)
