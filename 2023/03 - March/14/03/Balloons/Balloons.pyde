# List Of All Balloons
balloons = []

# Setup Function
def setup():
    size(800, 600)
    # Set Color Mode To HSB
    colorMode(HSB)
    # Set Strokes
    strokeWeight(1.5)
    stroke(0)
    # Text Size
    textSize(24)

# Draw Function
def draw():
    # Clear The Background
    background(255)
    # Draw The Balloons
    for balloon in balloons:
        # Set Fill Color
        fill(balloon['color'], 255, 255)
        # Draw Circle
        circle(balloon['x'], balloon['y'], balloon['size']);
        # Fill The Letter
        fill(255);
        text(balloon['letter'], balloon['x'] - 5, balloon['y'] + 6)


# When Key Is Pressed
def keyPressed():
    if key == ' ':
        # Pop The Last Added Balloon
        if len(balloons) > 0:
            balloons.pop()
    # If A Letter Key Is Pressed
    elif type(key) == unicode:
        index = ord(key) - ord('a')
        if index >= 0 and index < len(balloons):
            balloons[index]['size'] += 5
            
    
# When The Mouse Is Clicked
def mouseClicked():
    # If All 26 Balloons Were Not Added Yet
    if len(balloons) < 26:
        # Add A New Ballon
        balloons.append({'x': mouseX, 'y': mouseY, 'color': random(255), 'letter': chr(ord('a') + len(balloons)), 'size': 30})
