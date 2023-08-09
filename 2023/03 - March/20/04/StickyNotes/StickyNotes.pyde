# List Of All Sticky Notes
notes = []

# Setup Function
def setup():
    size(800, 600)
    textMode
    
# Draw Function
def draw():
  # Clear The Background
  background(255)
  
  # Draw All The Sticky Notes
  for note in notes:
      # Get Text Length
      txtWidth = textWidth(note['text'])
      # Create A Yellow Rectangle At The Location
      stroke(0)
      fill(255, 255, 0)
      rect(note['x'], note['y'], txtWidth + 8, 16)
      # Draw The Text
      fill(0)
      text(note['text'], note['x'] + 4, note['y'] + 14)
  
# When The User Clicks The Mouse
def mouseClicked():
    # Add A New Sticky Node
    notes.append({'x': mouseX, 'y': mouseY, 'text': ''})
    
# When A Keyboard Key Is Pressed
def keyPressed():
    # If Enter Key Is Pressed
    if key == ENTER:
        # Delete All Notes
        del notes[:]
    elif len(notes) > 0:
        # Get The Last Added Note
        lastNote = notes[len(notes) - 1]
        if key == BACKSPACE:
            # Remove The Last Character
            lastNote['text'] = lastNote['text'][:-1]
        elif keyCode == SHIFT:
            # Ignore Shift Key
            pass
        else:
            # Append The Text
            lastNote['text'] += key
