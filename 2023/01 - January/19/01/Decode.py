import  base64

# Encrypted String
text = 'S3L5eJTxB3LjeIj5KInbKIGidYX0cI9mKI9oKJDad3TnA3TrdoeicY5od3LvAZTrd24iAY5mKIPxdY11donlAZTrd25bKJTqeo91B2iifIjnKJXbBUDxBkDld2Tneayie28ifIjjfEDxdoz5KJTqd3PnKIBxekD3cI9vKJTqBUDrdoBxeo1jfInxdkDreaDrdpTndoTnBEDlAY4ieoXjBEDjdoSieJLxA2XbeaDrfE4='

# Shift From I = 0 To 25
for i in range(26):
	# Stores Shifted Characters
	sChars = []
	# For Each Character In Text
	for ch in text:
		# If Character If Upper Case
		if ch.isupper():
			sChars.append( chr((((ord(ch) - ord('A')) - i) % 26) + ord('A')) )
		# If Character Is Lower Case
		elif ch.islower():
			sChars.append( chr((((ord(ch) - ord('a')) - i) % 26) + ord('a')) )
		# For Every Other Character
		else:
			sChars.append(ch)
	# Join The List To Form A String
	sText = ''.join(sChars)
	# Try To Decode
	try:
		# Print Key And Decoded String If Success
		print(base64.b64decode(sText).decode())
		print(f'Decryption Key: {i}')
	except UnicodeDecodeError as e:
		# Do Nothing!
		pass
