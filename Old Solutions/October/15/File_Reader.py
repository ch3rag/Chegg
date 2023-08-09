import sys

# Read The File In Required Format
def read_file(filename):
	# You Are Already Check For FileNotFoundError In Main()
	# Therefore It's Not Required Again Here
	logs = []
	with open(filename) as f:
		# Read All The Lines And Strip '\n'
		lines = [line.strip() for line in f.readlines()]
		for i in range(0, len(lines), 2):
			# Name, Message
			log = (lines[i], lines[i + 1])
			# Add Log To Logs
			logs.append(log)
	return logs

# Displays The Entry In Required Format
def display_entry(name, message):
	print(f'[{name}] --> {message}')

# Main
def main():
	# Fetch Command Line FileName Arg
	filename = sys.argv[1]
	try:
		# Read File
		logs = read_file(filename)
		
		# Input Name
		name = input('What name to search the log for? ')

		# Print Messages With That Name
		for log in logs:
			if log[0] == name:
				display_entry(log[0], log[1])
	except FileNotFoundError:
		# Print Error Message If File Not Found
		print(f"Error: The file '{filename}' could not be found.")

if __name__ == '__main__':
	main()
