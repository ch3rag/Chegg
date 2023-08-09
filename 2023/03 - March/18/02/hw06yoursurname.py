import random

# Seed Random
random.seed(199)

# Alphabet Constant
ALPHABET = 'abcdefghijklmnopqrstuvwxyz'

# Encryption Function
def encrypt(plainText, key):
	# Convert The Message To Lowercase
	plainText = plainText.lower()
	# Convert Plain Text To List
	letters = list(plainText)
	# Exchange First Character With Third Character
	letters[0], letters[2] = letters[2], letters[0]
	# Replace Spaces With Random Integers
	letters = list(map(lambda x: str(random.randrange(10)) if x == ' ' else x, letters))
	# Shift Character Using RULE - 1
	letters = list(map(lambda x: ALPHABET[(ord(x[1]) - ord('a') + len(key)) % 26] if x[1].isalpha() and x[0] % 2 == 0 else x[1], enumerate(letters)))
	# Get The Magic Number
	magicNumber = ord(key[len(key) // 2]) - ord('a')
	# Shift Character Using RULE - 2
	letters = list(map(lambda x: ALPHABET[(ord(x[1]) - ord('a') + magicNumber) % 26] if x[1].isalpha() and x[0] % 2 == 1 else x[1], enumerate(letters)))
	return ''.join(letters)

# Decryption Function
def decrypt(encryptedText, key):
	# Convert Encrypted Text To List
	letters = list(encryptedText)
	# Exchange First Character With Third Character
	letters[0], letters[2] = letters[2], letters[0]
	# Replace Digits With Spaces
	letters = list(map(lambda x: ' ' if x.isdigit() else x, letters))
	# Shift Character Using RULE - 1
	letters = list(map(lambda x: ALPHABET[(ord(x[1]) - ord('a') - len(key)) % 26] if x[1].isalpha() and x[0] % 2 == 0 else x[1], enumerate(letters)))
	# Get The Magic Number
	magicNumber = ord(key[len(key) // 2]) - ord('a')
	# Shift Character Using RULE - 2
	letters = list(map(lambda x: ALPHABET[(ord(x[1]) - ord('a') - magicNumber) % 26] if x[1].isalpha() and x[0] % 2 == 1 else x[1], enumerate(letters)))
	return ''.join(letters)

# Main
def main():
	# Input Plain Text
	plainText = input('Please enter the text you want to encrypt: ')
	# Validate Plain Text
	while len(plainText) < 3:
		print('Error: Length of the plain text must be at least 3 characters.')
		plainText = input('Please enter the text you want to encrypt: ')

	# Input Key
	key = input('Please enter the key: ')
	# Validate Key
	while not (len(key) % 2 == 1 and key.isalpha() and key.islower()):
		print('Error: Invalid key!')
		key = input('Please enter the key: ')

	# Print Plain Text
	print(f'Input message: {plainText}')
	# Encrypt The Message
	encryptedText = encrypt(plainText, key)
	# Print The Encrypted Message
	print(f'Encrypted message: {encryptedText}')
	# Decrypt The Message
	decryptedText = decrypt(encryptedText, key)
	# Print The Decrypted Message
	print(f'Decrypted message: {decryptedText}')

if __name__ == '__main__':
	main()
