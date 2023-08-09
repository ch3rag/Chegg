class Tree:
	def __init__(self, key):
		self.key = key
		self.children = []
	
	def setRootKey(self, key):
		self.key = key
	
	def getRootKey(self):
		return self.key
	
	def getChildren(self):
		return self.children
	
	def addChild(self, node):
		self.children.append(node)
	
	""" New Code Starts """

	# Returns Child With The Specified Key
	def getChild(self, key):
		# Loop Through Every Child In The Children List
		for child in self.children:
			# If Child's Key Equals Specified Key
			if child.getRootKey() == key:
				# Return The Child
				return child
		# Key Not Found, Return None
		return None

	# Returns String Representation Of The Tree
	def __str__(self):
		# Key + Opening Braces
		s = self.key + '['
		# For Each Node In The Children
		for node in self.children:
			# Recursively Add Their String Representations
			s += str(node)
		# End With Closing Braces
		s += ']'
		return s
	
	""" New Code Ends """

# Test Code
if __name__ == '__main__':
	r = Tree('a')
	print(r.getRootKey())
	assert r.getRootKey() == 'a'

	print(r)
	assert str(r) == 'a[]'

	r.addChild(Tree('b'))
	r.addChild(Tree('c'))
	print(r)
	assert str(r) == 'a[b[]c[]]'

	r.getChild('b').addChild(Tree('d'))
	r.getChild('b').addChild(Tree('e'))
	r.getChild('b').addChild(Tree('f'))
	print(r)
	assert str(r) == 'a[b[d[]e[]f[]]c[]]'

	print(r.getChild('b'))
	assert str(r.getChild('b')) == 'b[d[]e[]f[]]'

	print(r.getChild('c'))
	assert str(r.getChild('c')) == 'c[]'

	print('Everything works fine!')