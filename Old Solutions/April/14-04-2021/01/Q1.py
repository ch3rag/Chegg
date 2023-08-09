def calcCharges(hours):
	if hours < 1 or hours > 24:
		print("Invalid Input.")
		return

	minCharges = 200
	maxCharges = 1000
	chargesPerHour = 50

	totalCharges = minCharges
	extraCharges = 0

	if hours > 3:
		extraCharges = (hours - 3) * chargesPerHour
		totalCharges = minCharges + extraCharges
		if 	totalCharges > maxCharges:
			totalCharges = maxCharges
			extraCharges = maxCharges - minCharges
	
	print("Standard 3 Hours Charge: " + str(minCharges))
	print("Charges For Additional Hours: " + str(extraCharges))
	print("Total Charges: " + str(totalCharges))


print()
calcCharges(2)
print()
calcCharges(45)
print()
calcCharges(24)
print()
calcCharges(12)