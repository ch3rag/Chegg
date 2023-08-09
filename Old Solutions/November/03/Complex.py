# Complex Class
class Complex:
	# Constructor
	def __init__(self, r, i):
		self.real = r
		self.imag = i
	
	# Returns String Representation Of The Object
	def __str__(self):
		if self.imag >= 0:
			return f'({self.real:.1f} + {self.imag:.1f}j)'
		else:
			return f'({self.real:.1f} - {abs(self.imag):.1f}j)'

	# Overloads +
	def __add__(self, o):
		if type(o) in [Complex, complex]:
			return Complex(self.real + o.real, self.imag + o.imag)
		else:
			return Complex(self.real + o, self.imag)

	# Overloads -
	def __sub__(self, o):
		if type(o) in [Complex, complex]:
			return Complex(self.real - o.real, self.imag - o.imag)
		else:
			return Complex(self.real - o, self.imag)

	# Overloads * 
	def __mul__(self, o):
		if type(o) in [Complex, complex]:
			return Complex(self.real * o.real - self.imag * o.imag, self.imag * o.real + self.real * o.imag)
		else:
			return Complex(self.real * o, self.imag * o)
	
	# Overloads /
	def __truediv__(self, o):
		if type(o) in [Complex, complex]:
			r = float(o.real ** 2 + o.imag ** 2)
			return Complex((self.real * o.real + self.imag * o.imag) / r, (self.imag * o.real - self.real * o.imag)  / 2)
		else:
			return Complex(self.real / o, self.imag / o)

# Main Method To Test The Functionality
def main():
	c1 = Complex(2, 3)
	c2 = Complex(1, 1)
	print(f'C1 = {c1}, C2 = {c2}')
	print(f'C1 + C2 = {c1 + c2}')
	print(f'C1 + 3.2 = {c1 + 3.2}')
	print(f'C2 + (4 + 2j) =  {c2 + (4 + 2j)}')
	print(f'C1 - C2 = {c1 - c2}')
	print(f'C1 - 3 = {c1 - 3}')
	print(f'C1 * C2 = {c1 * c2}')
	print(f'C1 * 3 = {c1 * 3}')
	print(f'C2 * (4 + 2j) = {c2 * (4 + 2j)}')
	print(f'C1 / C2 = {c1 / c2}')
	print(f'C1 / 2 = {c1 / 2}')
	print(f'C2 / (4 + 2j) = {c2 / (4 + 2j)}')

if __name__ == '__main__':
	main()
