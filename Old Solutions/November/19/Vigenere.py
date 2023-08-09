# Encrypts A Message Using Vigenere Cipher
def vigenere_encrypt(plain_text, key):
	# Uppercase Key And Plain Text
	plain_text = plain_text.upper()
	key = key.upper()
	encrypted = ''
	# For Each Character In The Plain Text
	for i in range(len(plain_text)):
		# Compute Encrypted Character At Index I
		ch = (ord(plain_text[i]) + ord(key[i % len(key)]) + 26) % 26 + ord('A')
		# Append It To Encrypted Text
		encrypted += chr(ch)
	# Return Encrypted Text
	return encrypted

# Decrypts A Message Using Vigenere Cipher
def vigenere_decrypt(cipher_text, key):
	# Uppercase Key And Cipher Text
	cipher_text = cipher_text.upper()
	key = key.upper()
	decrypted = ''
	# For Each Character In The Plain Text
	for i in range(len(cipher_text)):
		# Compute Decrypted Character At Index I
		ch = (ord(cipher_text[i]) - ord(key[i % len(key)]) + 26) % 26 + ord('A')
		# Append It To Decrypted Text
		decrypted += chr(ch)
	# Return Decrypted Text
	return decrypted.lower()

# Test Code
print(vigenere_encrypt('yourfutureourpromise', 'aurora'))
print(vigenere_decrypt('EOEMIAMXBCFPNAE', 'bart'))