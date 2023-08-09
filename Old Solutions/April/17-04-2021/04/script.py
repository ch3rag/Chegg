from tkinter import *

windowWidth = 200
windowHeight = 200

state = -1
# default color of lights
defaultColor = ['#00FF00', '#FFFF00', '#FF0000']

# colors when user clicks the window
colors = [
		['#00FF00', '#666666', '#666666'],
		['#666666', '#FFFF00', '#666666'],
		['#666666', '#666666', '#FF0000']
]

# draw the traffic lights using the colors passed as args
def trafficLight(colors):
	centerX = windowWidth / 2
	centerY = windowHeight / 2
	diameter = 50
	radius = diameter / 2
	delta = -diameter
	
	myCanvas.create_rectangle(centerX - radius, centerY - radius + delta, centerX + radius, centerY + radius - delta)
	for i in range(3):
		myCanvas.create_oval(centerX - radius, centerY - radius - delta, centerX + radius, centerY + radius - delta, fill = colors[i])
		delta = delta + diameter

# pick the next color from the list and redraw the traffic lights
def changeColor(e):
	global state
	state = (state + 1) % 3
	trafficLight(colors[state])


root = Tk()
root.title('Graphics')
root.geometry(str(windowWidth) + 'x' + str(windowHeight))
myCanvas = Canvas(root)
myCanvas.bind("<Button-1>", changeColor)
myCanvas.pack()

trafficLight(defaultColor)
root.mainloop()