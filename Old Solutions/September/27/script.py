# Import Math Library And Random Library
import math, random

# Pick A Random Number Between 0 And 180
Dangle = random.randint(0, 10)

# Print Random Angle Selected
print(f'The angle selected at random is {Dangle}')

# Convert The Angle From Radians To Degrees
Rangle = (Dangle * math.pi) / 180.0

# Print Random Angle Selected In Radians
print(f'The angle t in radians is: {Rangle}')

# Find Sin(t), Cos(t) And Tan(t)
sint = math.sin(Rangle)
cost = math.cos(Rangle)
tant = math.tan(Rangle)

# Print Sin(t), Cos(t) And Tan(t)
print(f'sin(t): {sint}')
print(f'cos(t): {cost}')
print(f'tan(t): {tant}')

# Find The Value Of Expression
result = sint - tant * cost

# Print The Value Of Expression
print(f'sin(t) - tan(t) * cos(t) is: {result}')

# Print Empty Line
print()
