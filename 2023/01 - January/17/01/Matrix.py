# Matrix.py

# SquareMatrix Class
class SquareMatrix:
	def __init__(self, order):
		self.order = order
		# Create A Square Matrix Of Order Dimension
		# Populate The Matrix With Zero
		self.rows = [
			[0 for j in range(order)]
			for i in range(order)
		]

	# Returns String Representation Of The Matrix
	def __str__(self):
		return '\n'.join([' '.join([str(e) for e in row]) for row in self.rows])

	# Sets The Value Of Matrix[I][J] Element
	def set_value(self, i, j, value):
		self.rows[i][j] = value
	
	# Gets The Value Of Matrix[I][J]
	def get_value(self, i, j):
		return self.rows[i][j]
	
	# Returns The Maximum Value In The Matrix
	def max(self):
		return max([max(row) for row in self.rows])
	
	# Returns The Minimum Value In The Matrix
	def min(self):
		return min([min(row) for row in self.rows])
	
	# Returns The Sum Of All Values In The Diagonal Of The Matrix
	def trace(self):
		return sum([self.rows[i][i] for i in range(self.order)])

	# Returns The Summary Of The Matrix In A Dictionary
	def summary(self):
		return {
			'order': self.order,
			'max': self.max(),
			'min': self.min(),
			'trace': self.trace(),
		}

	# Save The Result Of Str In A File
	def save(self, fileName):
		with open(fileName, 'w') as f:
			f.write(str(self))

	# Parses Text To SquareMatrix Instance
	@classmethod
	def parse(cls, text):
		# Parse The Text
		parsedMatrix = ([[int(e) for e in row] for row in [row.strip().split(' ') for row in text.strip().split('\n')]])
		# Create New Instance Of Square Matrix
		squareMatrix = SquareMatrix(len(parsedMatrix))
		# Set The Rows
		squareMatrix.rows = parsedMatrix
		# Return
		return squareMatrix

	# Loads A Square Matrix From File
	@classmethod
	def load(cls, fileName):
		with open(fileName, 'r') as f:
			return SquareMatrix.parse(f.read())
		
# Test
def main():
	m1 = SquareMatrix(3)
	m1.set_value(0, 0, 1)
	m1.set_value(1, 1, 1)
	m1.set_value(2, 2, 1)
	print('-- M1 --')
	print(m1)
	print(m1.summary())

	m2_text = '''\
	1 2 3
	4 5 6
	7 8 9'''
	print('-- M2 --')
	m2 = SquareMatrix.parse(m2_text)
	print(m2)
	print(m2.summary())

	m2.save('m3.txt')
	
	print('-- M3 --')
	m3 = SquareMatrix.load('m3.txt')
	print(m3)
	print(m3.summary())

if __name__ == '__main__':
	main() 