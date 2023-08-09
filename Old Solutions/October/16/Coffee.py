# Beverage Class
class Beverage:
	# Constructor
	def __init__(self, ounces, price):
		# Initialize Ounces And Price
		self.ounces = ounces
		self.price = price
	
	# GetInfo
	def getInfo(self):
		return f'{self.ounces} oz, ${self.price:.2f}'

# Coffee Class
# Coffee IS-A Beverage
class Coffee(Beverage):
	# Constructor
	def __init__(self, ounces, price, style):
		# Call Base Constructor To Initialize Ounces And Price
		super().__init__(ounces, price)
		# Initialize Style
		self.style = style

	# Override GetInfo
	def getInfo(self):
		return f'{self.style} Coffee, {super().getInfo()}'

# Test
coffee = Coffee(8, 3.0, 'Espresso')
print(coffee.getInfo())