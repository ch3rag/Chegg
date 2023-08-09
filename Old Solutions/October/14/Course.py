# Initial Class
Class = [["Tom", 0]]

# Input Student Information
while (True):
	# Input Name
	name = input('Name? ')
	# If Name is Empty, End Input
	if name == '':
		break
	# Input Major
	major = input('Major? ')
	# Input Classification
	classification = input('Classification? ')
	# Add To Class
	Class.append([name, major, classification])
	Class[0][1] += 1

# Print Course Information
print('** Course Information **')
# Print Instructor Name
print ("Instructor:", Class[0][0])
# Print Number Of Students
print ("Number of students:", Class[0][1])
# Print Student Information
for i in range(1, len(Class)):
	print('Student Name:', Class[i][0])
	print('Major:', Class[i][1])
	print('Classification:', Class[i][2])