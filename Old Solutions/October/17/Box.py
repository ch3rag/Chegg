# Inputs An Returns A Positive Integer From The User
# Keeps Taking Input Until User Enters A Positive Integer
def read_input(prompt):
	# Infinite Loop
	while True:
		# Take Input
		num = int(input(prompt))
		# If Number > 0 Return It, Else Keep Looping!
		if num > 0:
			return num

def main():
	width = read_input("Enter the width of a frame: ")
	height = read_input("Enter the height of a frame: ")
	mark = input("Enter a print mark: ")


	print_box(width, height, mark)

def print_box(w, h, m):
	'''Function prints the desired box from the input the width and height of the frame and lastly the wanted mark.
	Function takes parameters <<w>>, <<h>> and <<m>>

	:parameter w: int, the width of a frame.
	:parameter h: int, the height of a frame.
	:parameter m: str, the desired mark.
	'''

	for i in range(h):
		print(m*w)

if __name__ == "__main__":
	main()