from turtle import Turtle
import turtle
import math

# Method: drawCircle
# Description: Draws A Circle At Co-ordinate X, Y With A Radius R
# Arguments: The drawCircle Methods Expects 4 Arguments:
#   1. t: The Turtle Object
#   2. X: The X Co-ordinate Of Center
#   3. Y: The Y Co-ordinate Of Center
#   4. R: The Radius Of The Circle
# Returns: Nothing
def drawCircle(t, x, y, r):
	t.penup()
	# Move To X + R, Y
	t.goto(x + r, y)
	# Rotate Left By 90 Degrees
	t.left(90)
	# Draw Drawing
	t.pendown()
	# Loop 120 Times
	for i in range(120):
		# Move Forward By (Circumference / 120.0)
		t.forward((2 * math.pi * r) / 120.0)
		# Rotate Left By 3 Degrees
		t.left(3)

# Method: main
# Description: Entry Point Of The Program
# Arguments: 0
# Returns: Nothing
def main():
	# Create A New Turtle
	myTurtle = Turtle()
	# Draw A Circle
	drawCircle(myTurtle, 50, 75, 100)
	# Drawing Done
	turtle.done()

if __name__ == '__main__':
	main()