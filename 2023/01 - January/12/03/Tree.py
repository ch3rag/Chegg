# Mode Class
class Node:
	# Constructor
	def __init__(self, value):
		# Value Of Node
		self.value = value
		# Left And Right Child
		self.right = None
		self.left = None

# Tree Class
class Tree:
	# Constructor
	def __init__(self):
		self.root = None

	# Insert Helper
	# Inserts A Node Recursively In The Binary Tree
	def _insert(self, current, value):
		if current is None:
			return Node(value)
		
		if value < current.value:
			current.left = self._insert(current.left, value)
		else:
			current.right = self._insert(current.right, value)
		return current

	# Insert A Node
	def insert(self, value):
		if self.search(value):
			return False
		else:
			self.root = self._insert(self.root, value)
			return True

	# Search Helper
	# Searches The Tree Recursively For A Key
	def _search(self, current, key):
		if current is None:
			return False
		elif current.value == key:
			return True
		elif current.value > key:
			return self._search(current.left, key)
		else:
			return self._search(current.right, key)

	# Returns True If The Key Is In Tree
	def search(self, key):
		return self._search(self.root, key)

	# Prints The Binary Tree
	def print(self):
		self._print(self.root)


	# Print Helper
	# Recursively Prints The Tree
	def _print(self, current, indent = 0):
		if current is None:
			return
		# Print The Tree In In Order Traversal
		self._print(current.left, indent + 1)
		print((' ' * indent) + str(current.value))
		self._print(current.right, indent + 1)

	# Returns A Node With Minimum Value In Tree
	def _getMinValueNode(self, current):
		while (current.left is not None):
			current = current.left
		return current

	# Delete Helper
	# Recursively Deletes A Node
	def _delete(self, current, key):
		# Base Case
		if current is None:
			return current
		# Find Node To Be Deleted
		if key < current.value:
			current.left = self._delete(current.left, key)
		elif key > current.value:
			current.left = self._delete(current.right, key)
		# Found Node Whose Value == Key
		else:
			# Now We Have Delete It (Current)
			# For Nodes With Single Child
			if current.left is None:
				node = current.right
				current = None
				return node
			elif current.right is None:
				node = current.left
				current = None
				return node
			# Find Node With Minimum Value In The Right SubTree
			minValNode = current.right
			while (minValNode.left is not None):
				minValNode = minValNode.left
			# Assign Current Node, The Minimum Value
			current.value = minValNode.value
			# Delete Minimum Value Node From The Right SubTree
			current.right = self._delete(current.right, minValNode.value)
		return current
	
	# Deletes A Node From The Tree
	def delete(self, key):
		if self.search(key):
			self.root = self._delete(self.root, key)
			return True
		else:
			return False


#  Main
def main():
	# Create A Tree
	tree = Tree()

	# Interpret Commands
	while (True):
		# Process And Input Args
		try:
			args = input().strip().upper()
		except EOFError:
			break
		
		# Print Args
		print(args)
		# Split Args
		args = args.split()
		# Print Command
		if len(args) == 1 and args[0] == 'P':
			tree.print()
		elif len(args) == 2 and args[0] == 'I':
			# Insert
			if tree.insert(int(args[1])):
				print('Prvek vlozen')
			else:
				print('Prvek uz ve strome byl')
		elif len(args) == 2 and args[0] == 'D':
			# Delete
			if tree.delete(int(args[1])):
				print('Prvek vlozen')
			else:
				print('Prvek uz ve strome byl')

if __name__ == '__main__':
	main()
	