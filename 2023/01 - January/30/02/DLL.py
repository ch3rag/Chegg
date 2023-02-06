class DLinkedListNode:
	def __init__(self, initData, initNext, initPrevious):
		self.data = initData
		self.next = initNext
		self.previous = initPrevious
	
		if initNext != None:
			self.next.previous = self
		if initPrevious != None:
			self.previous.next = self
	
	def getData(self):
		return self.data
	
	def setData(self, newData):
		self.data = newData
	
	def getNext(self):
		return self.next
	
	def getPrevious(self):
		return self.previous

	def setNext(self, newNext):
		self.next = newNext

	def setPrevious(self, newPrevious):
		self.previous = newPrevious

class DLinkedList:
	def __init__(self):
		self.__head = None
		self.__tail = None
		self.__size = 0
	
	def search(self, item):
		current = self.__head
		found = False
		while current != None and not found:
			if current.getData() == item:
				found = True
			else:
				current = current.getNext()
		return found

	def index(self, item):
		current = self.__head
		found = False
		index = 0
		while current != None and not found:
			if current.getData() == item:
				found = True
			else:
				current = current.getNext()
				index += 1
		if not found:
			index = -1
		return index

	# Returns The Size Of The Linked List
	def getSize(self):
		return self.__size

	# Adds And Item To The Head Of The Linked List
	def add(self, item):
		# Create New Node
		node = DLinkedListNode(item, self.__head, None)
		if (self.__tail == None):
			self.__tail = node
		self.__head = node
		self.__size += 1

	# Returns String Representation Of The Linked List
	def __str__(self):
		current = self.__head
		data = ''
		while current != None:
			data += str(current.getData()) + ' '
			current = current.getNext()
		return data.strip()

	# Return The Item At Ith Index
	def getItem(self, index):
		if (index > 0 and index >= self.getSize()) or (index < 0 and abs(index) > self.getSize()):
			raise Exception('Invalid Index.')
		else:
			if index < 0:
				current = self.__tail
				while index != -1:
					current = current.getPrevious()
					index += 1
			else:
				current = self.__head
				while index != 0:
					current = current.getNext()
					index -= 1
			return current.getData()

	# Removes & Returns Ith Item From The Linked List
	def pop(self, index = None):
		if index == None:
			index = self.getSize() - 1
		if index >= self.getSize():
			raise Exception('Invalid Index.')
		elif self.getSize() == 1:
			current = self.__head
			self.__head = self.__tail = None
		elif index == 0:
			current = self.__head
			self.__head = self.__head.getNext()
			self.__head.setPrevious(None)
		elif index == self.getSize() - 1:
			current = self.__tail
			self.__tail = self.__tail.getPrevious()
			self.__tail.setNext(None)
		else:
			current = self.__head
			while index != 0:
				current = current.getNext()
				index -= 1
			previousNode = current.getPrevious()
			nextNode = current.getNext()
			previousNode.setNext(nextNode)
			nextNode.setPrevious(previousNode)

		self.__size -= 1
		return current.getData()

	# Removes An Item From The List
	def remove(self, item):
		index = self.index(item)
		if (index >= 0):
			self.pop(index)
	
	def insert(self, index, item):
		# TODO: Complete
		pass

def test():
	linked_list = DLinkedList()

	is_pass = (linked_list.getSize() == 0)
	assert is_pass == True, "fail the test"

	linked_list.add("World")
	linked_list.add("Hello")

	is_pass = (str(linked_list) == "Hello World")
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.getSize() == 2)
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.getItem(0) == "Hello")
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.getItem(1) == "World")
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.getItem(0) == "Hello" and linked_list.getSize() == 2)
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.pop(1) == "World")
	assert is_pass == True, "fail the test"

	is_pass = (linked_list.pop() == "Hello")
	assert is_pass == True, "fail the test"

	int_list2 = DLinkedList()

	for i in range(0, 10):
		int_list2.add(i)

	print(int_list2)
	int_list2.remove(1)
	int_list2.remove(3)
	int_list2.remove(2)
	int_list2.remove(0)

	is_pass = (str(int_list2) == "9 8 7 6 5 4")
	assert is_pass == True, "fail the test"

	for i in range(11, 13):
		int_list2.append(i)
	is_pass = (str(int_list2) == "9 8 7 6 5 4 11 12")
test()