# Converts A Range Into A String
def range_to_string(start, stop, step):
	# Result String
	result = ''
	# Iterator I, Assign It To Initial Start Value
	i = start
	# Loop, While I < Stop
	while i < stop:
		# Append I To Result
		result += f'{i} '
		# Increment I By Step
		i += step
	# Return Result String
	return result.strip()

# Main
def main():
	# Input Start, Stop, Step From User
	start = int(input('start: '))
	stop = int(input('stop: '))
	step = int(input('step: '))
	# Test Range_To_String By Calling It
	print(range_to_string(start, stop, step))

if __name__ == '__main__':
	main()
