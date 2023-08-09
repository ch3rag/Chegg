def encrypt_text(text, shift, rotation):
	# Normalize Shift
	shift = shift % len(text)
	# Create A Ord List Using Text
	ascii = list(map(ord, [*text]))
	# Shift The List
	ascii = ascii[len(ascii) - shift:] + ascii[:len(ascii) - shift]
	# Rotate Each Character
	ascii = list(map(lambda x: (x + rotation - 32) % 94 + 32, ascii))
	# Insert ~ After Every Value Less Than 48
	result = []
	for ch in ascii:
		result.append(ch)
		if ch < 48:
			result.append(ord('~'))
	# Convert List Back To String
	return ''.join(map(chr, result))
	

def decrypt_text(text, shift, rotation):
	# Create A List Ord Using Text
	ascii = list(map(ord, [*text]))
	# Remove All Occurrences Of ~
	ascii = list(filter(lambda x: x != 126, ascii))
	# Normalize Shift
	shift = shift % len(ascii)
	# Rotate Each Character
	ascii = list(map(lambda x: (x - rotation - 32) % 94 + 32, ascii))
	# Shift The List
	ascii = ascii[shift:] + ascii[:shift]
	# Convert List Back To String
	return ''.join(map(chr, ascii))
	

def hash_text(text, base, hash_size):
	# Create A List Ord Using Text
	ascii = list(map(ord, [*text]))
	# Transform Each Character
	ascii = list(map(lambda x: (x[0] + base) ** x[1], enumerate(ascii)))
	# Sum All Values
	sumAscii = sum(ascii) % hash_size
	# Return Result
	return sumAscii

# Main
def main():
	# Shift And Rotate
	shift = 14
	rotate = 32

	# Input Action
	action = input('Input An Action: (Encrypt/Decrypt): ').upper().strip()
	# action = 'ENCRYPT'
	if action == 'ENCRYPT':
		# Input Plain Text
		plainText = input('Enter Plain Text: ')
		# Encrypt The Text
		encrypted_text = encrypt_text(plainText, shift, rotate)
		# Compute Hash Value
		hash_value = hash_text(plainText, 31, 1000000000)
		# Print Encrypted Text And Hash Value
		print(f'Encrypted Text: {encrypted_text}')
		print(f'Hash Value: {hash_value}')
	elif action == 'DECRYPT':
		# Input Encrypted Text
		encrypted_text = input('Enter Encrypted Text: ')
		# Decrypted The Text
		decrypted_text = decrypt_text(encrypted_text, shift, rotate)
		# Input Expected Hash
		expected_hash = int(input('Enter Expected Hash: '))
		# Compute The Actual Hash
		actual_hash = int(hash_text(decrypted_text, 31, 1000000000))
		# Print Decrypted Text
		print(f'Decrypted Text: {decrypted_text}')
		# Verify Hash Values
		if (expected_hash != actual_hash):
			print('Error: The Hash Value Does Not Match!')
		else:
			print('Hash Verified Successfully.')
	else:
		print('Invalid Action!')

if __name__ == '__main__':
	main()