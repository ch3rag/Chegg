class Spinner:
	"""A spinner for a board game.
	A spinner has a certain number of slots, numbered starting at 0 and
	increasing by 1 each slot. For example, if the spinner has 6 slots,
	they are numbered 0 through 5, inclusive.

	A spinner also has an arrow that points to one to these slots.

	=== Attributes ===
	slots:
		The number of slots in this spinner
	position:
		The slot number that the spinner's arrow is currently pointing to.

	== Sample Usage ===
	Creating a spinner:
	>>> s = Spinner(8)
	>>> s.position
	0

	Spinning the spinner:
	>>> s.spin(4)
	>>> s.position
	4
	>>> s.spin(2)
	>>> s.position
	6
	>>> s.spin(2)
	>>> s.position
	0
	"""
	slots: int
	position: int

	def __init__(self, size: int) -> None:
		"""Initialize a new spinner with <size> slots.
		
		A spinner's position always starts at 0.

		Precondition slots >= 1
		"""
		# Validate Size
		if size < 1:
			size = 1
		
		self.slots = size
		self.position = 0
	
	def spin(self, force: int) -> None:
		"""Spin this spinner, advancing the arrow <force> slots.
		
		The spinner wraps around once it reaches its maximum slot, starting
		back at 0. See the class docstring for an example of this.

		Precondition: force >= 0.

		Hint: use the "%" operator to "wrap around" the spinner's position.
			  The "%" operator gets the 'remainder'.
			  For example, 8 % 6 == 2
		"""
		# Validate Force
		if force < 0:
			force = 0
		
		# Advance The Position
		self.position = (self.position + force) % self.slots
		
		