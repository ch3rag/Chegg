# Car Class
class Car:
	# Constructor
	def __init__(self, make, model, year, price):
		self.make = make.upper()
		self.model = model.upper()
		self.year = year
		self.price = price

	# Overload <
	def __lt__(self, rightCar):
		# Compare Make
		if self.make < rightCar.make:
			return True
		# Compare Model, If Make Is Same
		elif self.make == rightCar.make:
			if self.model < rightCar.model:
				return True
		return False
	
	# Overload >
	def __gt__(self, rightCar):
		# Compare Make
		if self.make > rightCar.make:
			return True
		# Compare Model, If Make Is Same
		elif self.make == rightCar.make:
			if self.model > rightCar.model:
				return True
		return False

	# Overload ==
	def __eq__(self, rightCar):
		# Compare Make And Model
		return self.make == rightCar.make and self.model == rightCar.model
	
	# Returns String Representation Of Car
	def __str__(self):
		return f'Make: {self.make}, Model: {self.model}, Year: {self.year}, Price: ${self.price}'
