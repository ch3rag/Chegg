def calcYears(popStarvale, popOnak, growthRateStarvale, growthRateOnak):
	# It will never be greater in this condition
	if growthRateStarvale <= growthRateOnak:
		return -1

	years = 0
	while(True):
		years = years + 1
		popStarvale = popStarvale + popStarvale * growthRateStarvale
		popOnak = popOnak + popOnak * growthRateOnak
		if popStarvale > popOnak:
			return years
	

# Initial Starvale = 1000
# Initial Onak = 1000
# Growth % Starvale = 10%
# Growth % Onak = 5%
print(calcYears(1000, 5000, 0.1, 0.05))

