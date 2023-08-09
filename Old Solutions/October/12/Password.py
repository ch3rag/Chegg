def StoredPasswords(checkPass):
	# Create A Tuple With 50 Most Common Passwords
	passwords = ('123456', '123456789', '12345', 'qwerty', 'password', '12345678', '111111', '123123', '1234567890', '1234567',
				 'qwerty123', '000000', '1q2w3e', 'aa12345678', 'abc123', 'password1', '1234', 'qwertyuiop', '123321', 'password123',
				 '1q2w3e4r5t', 'iloveyou', '654321', '666666', '987654321', '123', '123456a', 'qwe123', '1q2e3e4r', '7777777',
				 '1qaz2wsx', '123qwe', 'zxcvbnm', '121212', 'asdasd', 'a123456', '555555', 'dragon', '112233', '123123123', 'monkey',
				 '11111111', 'qazwsx', '159753', 'asdfghjkl', '222222', '1234qwer', 'qwerty1', '123654', '123abc')

	# Check Is User's Password is in Tuple
	for password in passwords:
		if checkPass == password:
			found = 'Your password is too common. Please consider changing it.'
			# Print Password's Location In The Tuple
			print(f'Password was found at index: {passwords.index(checkPass)}')
			return found

	notFound = 'You have a strong password'
	return notFound



def getUserPass():
	# Ask The User For Username And Password
	username = input('Enter Username: ')
	password = input('Enter Password: ')

	# Call StoredPassword() From getUserPass()
	result = StoredPasswords(password)

	# Print Result
	print(result)

# Main
def main():
	# Call getUserPass() From main()
	getUserPass()

if __name__ == '__main__':
	main()