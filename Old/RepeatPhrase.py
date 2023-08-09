# Input Phrase from the User
phrase = input('Enter A Phrase: ')

# Input How Many Times User Wants to Repeat It
repeat = int(input('Enter The Times To Repeat: '))

# Repeat the Phrase Using a Loop
for i in range(repeat):
	print(phrase + ' ', end = '')
