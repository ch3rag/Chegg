from graphics import *


def main():
	# Create A Window
	win = GraphWin('Card', 500, 200)
	# Create A Text 'Happy Birthday' At 250, 100
	text = Text(Point(250, 100), 'Happy Birthday!!!')
	# Set Text Size To 24
	text.setSize(24)
	# Draw Text On The Window
	text.draw(win)

	# Here You Are Making Error
	# Entry Require Following Args To Initialize
	# Entry(Point(X, Y), Width)
	# When You Were Passing Only (250, 150), It's Considered A Tuple
	# And Not A Point Object
	user_Input = Entry(Point(250, 150), 15)
	user_Input.setText('Enter The Receiver\'s Name: ')
	user_Input.draw(win)
	win.getMouse()
	name = user_Input.getText()
	print(name)
	win.close()

if __name__ == '__main__':
	main()
