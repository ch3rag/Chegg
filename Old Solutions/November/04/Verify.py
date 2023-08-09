import sys

# Returns True If Document Is in Correct Format
def validate(lines):
	# Stack
	stack = []
	# For Every Line
	for line in lines:
		# For Every Character
		for ch in line:
			# If Opening Brackets, Push To Stack
			if ch in ['(', '[', '{']:
				stack.append(ch)
			# If Closing Brackets, Pop And Check If
			# Matching Opening Bracket Is Popped
			if ch in [')', ']', '}']:
				top = stack.pop()
				if ch == ')' and top != '(' or ch == ']' and top != '[' or  ch == '}' and top != '{':
					return False
	# Stack Should Be Empty At The End
	return len(stack) == 0

#  Read All The Lines From STDIN Into A List
lines = []
for line in sys.stdin:
	lines.append(line)

# Validate Data Using Function And Print Result Accordingly
if validate(lines):
	print('valid')
else:
	print('invalid')
