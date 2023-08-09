def YourLastname_Speeding_Fines():

	# Input Speed Limit of the Zone
	speedLimit_zone_firstname = int(input('Speed Limit: '))
	# Input Speed of the Vehicle
	speed_veh_firstname = int(input('Vehicle Speed: '))
	# Input If the Driver Is a Teen
	driv_teen = input('Teen Driver(Teen/T/No/N): ').upper()
	# For Invalid Input, Default To N/No
	if driv_teen not in ['TEEN', 'T', 'NO', 'N']:
		driv_teen = 'NO'
		print('Invalid Input. Defaulted To N/No')
	
	# Difference B/W Speed Limit And Vehicle Speed
	speed_diff = speed_veh_firstname - speedLimit_zone_firstname
	# Fine
	fine = 0.0
	# Display Message
	message = 'You are a good Driver.'

	if speed_diff <= 0:
		# Less Than Speed Limit
		pass
	elif speed_diff < 5:
		fine = 39.50
		message = 'You can do better as a Driver!'
	elif speed_diff < 15:
		fine = 89.00
		message = 'Please reduce your speed!'
	elif speed_diff < 25:
		fine = 109.50
		message = 'Be careful, you are driving reckless!'
	elif speed_diff < 35:
		fine = 149.99
		message = 'You are over speeding!'
	else:
		# Over The Limit
		fine = 0.0
		message = 'Fine has to be calculated by court!!'

	# If Teen Driver, Triple The Fine!
	if driv_teen == 'T' or driv_teen == 'TEEN':
		fine *= 3.0
	
	# Display Fine And Message
	print(f'Total Fine Calculated: ${fine:.2f}')
	print(f'Display: {message}')

# Call The Function
YourLastname_Speeding_Fines()
