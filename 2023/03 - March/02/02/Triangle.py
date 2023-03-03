# Triangle.py
import math

# Returns If The Triangle Is Valid
def isValidTriangle(ab, bc, ca):
	return (ab + bc) > ca and (ab + ca) > bc and (ca + bc) > ab

# Returns If The Triangle Is Degenerate
def isDegenerateTriangle(ab, bc, ca):
	return (ab + bc) == ca or (ab + ca) == bc or (ca + bc) == ab\

# Return Interior Angles of A Triangle In Radians
def getInteriorAngles(ab, bc, ca):
	a = math.acos((ab ** 2.0 + ca ** 2.0 - bc ** 2.0) / (2.0 * ab * ca))
	b = math.acos((ab ** 2.0 + bc ** 2.0 - ca ** 2.0) / (2.0 * ab * bc))
	c = math.acos((bc ** 2.0 + ca ** 2.0 - ab ** 2.0) / (2.0 * bc * ca))
	return [a, b, c]

# Prints Sides Of A Triangle
def printSides(ab, bc, ca):
	print('\nTriangle Sides')
	print(f'\t Length of side AB: {ab:.1f}')
	print(f'\t Length of side BC: {bc:.1f}')
	print(f'\t Length of side CA: {ca:.1f}')

# Prints Interior Angles (Rad)
def printRadAngles(angles):
	print('\nRadian measure of interior angles:')
	print(f'\tAngle A: {angles[0]:.1f}')
	print(f'\tAngle B: {angles[1]:.1f}')
	print(f'\tAngle C: {angles[2]:.1f}')

# Prints Interior Angles (Deg)
def printDegAngles(angles):
	print('Degree measure of interior angles:')
	print(f'\tAngle A: {angles[0]:.1f}')
	print(f'\tAngle B: {angles[1]:.1f}')
	print(f'\tAngle C: {angles[2]:.1f}')

# Computes And Prints Area And Perimeter Of Triangle
def printAreaAndPerimeter(ab, bc, ca):
	# Perimeter
	perimeter = ab + bc + ca
	# Semi Perimeter
	s = perimeter / 2
	area = math.sqrt(s * (s - ab) * (s - bc) * (s - ca))
	# Print Area And Perimeter
	print('\nPerimeter and Area of Triangle:')
	print(f'\tPerimeter of Triangle: {perimeter:.1f}')
	print(f'\tArea of Triangle: {area:.1f}')

# Print Types Of Triangle
def printTypes(ab, bc, ca, angles):
	print('\nTypes of Triangle')
	if ab == bc and bc == ca:
		print('\tEquilateral Triangle')

	if ab == bc or bc == ca or ab == ca:
		print('\tIsosceles Triangle')

	if ab != bc and bc != ca:
		print('\tScalene Triangle')

	if angles[0] == 90 or angles[1] == 90 or angles[2] == 90:
		print('\tRight Triangle')
	else:
		print('\tOblique Triangle')
	
	if angles[0] > 90 or angles[1] > 90 or angles[2] > 90:
		print('\tObtuse Triangle')
# Main
def main():
	# Number Of Valid Triangles
	numTriangles = 0
	while True:
		# Input User's Choice To Process A Triangle
		choice = input('Do you wish to process a triangle (Y or N)? ').upper()
		# User Wants To Exit
		if choice == 'N':
			# Print Valid Triangles		
			print(f'Number of valid triangles: {numTriangles}')
			# Exit The Loop
			break
		# User Wants To Process A Triangle
		elif choice == 'Y':
			# Input Sides
			ab = int(input('Enter length of side AB: '))
			bc = int(input('Enter length of side BC: '))
			ca = int(input('Enter length of side CA: '))
			print()

			# Test Validity
			if isDegenerateTriangle(ab, bc, ca):
				print('Degenerate Triangle')
			elif not isValidTriangle(ab, bc, ca):
				print('Not a Triangle')
			else:
				# Valid Triangle, Process It!
				print('Valid Triangle')
				# Increment Number Of Valid Triangles
				numTriangles += 1
				# Print Sides
				printSides(ab, bc, ca)
				# Get Interior Angles In Radians
				anglesRad = getInteriorAngles(ab, bc, ca)
				anglesDeg = list(map(math.degrees, anglesRad))
				# Print Interior Angles In Degrees
				printDegAngles(anglesDeg)
				# Print Interior Angles In Radians
				printRadAngles(anglesRad)
				# Print Area And Perimeter
				printAreaAndPerimeter(ab, bc, ca)
				# Print Types Of Triangle
				printTypes(ab, bc, ca, anglesDeg)
		else:
			print('Invalid input.')
		print()

if __name__ == '__main__':
	main()
