# Initialize Number Of Attempts And N
attempts = 0
n = 1

# Keep Taking Input While N Is Not Divisible By 5 And 10 Both
while not (n % 5 == 0 and n % 10 == 0):
	attempts += 1
	n = int(input('Enter a number divisible 5 & 10 both: '))

# Display N And The Number Of Attempts Taken
print(f'The number entered is : {n}.')
print(f'The number of attempts taken is : {attempts}.')