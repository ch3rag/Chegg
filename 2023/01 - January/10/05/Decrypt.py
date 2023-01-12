# Message To Encrypt
M = 'hello there secret friend'


# Encrypt A Message Letter By Letter
def encrypt(message, e, n):
	# List To Store The Encrypted Char Values
	C = list()

	# Iterate Through Each Letter In The Message
	for letter in message:
		# Convert A Char Into An Integer Value
		m = ord(letter)

		# Calculate (M ^ E Mod N) And Add It To The List
		C.append(pow(m, e, n))
	return C

# Decrypts A Message
def decrypt(cipher, d, n):
	# List To Store Decrypted Message
	P = list()
	# For Each Value In Cipher Text
	for v in cipher:
		# Decrypt The Value And Add It To List
		P.append(chr(pow(v, d, n)))
	# Make Message Out Of List
	decrypted_message = ''.join(P)
	# Return Message
	return decrypted_message


# Some Test Values
e = 5
d = 77
n = 119

# Assertion And Test Values
cipher = encrypt(M, e, n)
decrypted_message = decrypt(cipher, d, n)
assert decrypted_message == M

print('Passed!')
