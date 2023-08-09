# Our Pixel Data Class
class Pixel:
	# Constructor
	def __init__(self, red, green, blue):
		self.red = red;
		self.green = green
		self.blue = blue
	
	# Str
	def __str__(self):
		return f'(R: {self.red}, G: {self.green}, B: {self.blue})'

# Creates A Pixel From Color Name
# Four Possible Colors Are: Cyan, Black, Magenta, And Yellow
def make_pixel(color):
	if color == 'yellow':
		# Yellow Color
		return Pixel(1.0, 1.0, 0.0)
	elif color == 'cyan':
		# Cyan Color
		return Pixel(0.0, 1.0, 1.0)
	elif color == 'magenta':
		# Magenta Color
		return Pixel(1.0, 0.0, 1.0)
	elif color == 'black':
		# Black Color
		return Pixel(0.0, 0.0, 0.0)
	else:
		# Default Color is White
		return Pixel(1.0, 1.0, 1.0)

# Test Code
print(make_pixel('yellow'))
print(make_pixel('cyan'))
print(make_pixel('magenta'))
print(make_pixel('black'))
print(make_pixel('brown'))