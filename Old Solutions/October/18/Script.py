def percentError(actual, theoretical):
	"""This  Function Will Calculate
	The Percent Error For Yellow And
	Green Pea Pods."""
	if actual != 0:
		# percentError = float(abs(float(actual - theoretical)) / (float(theoretical)) * 100
		percentError = float(abs(float(actual - theoretical) / float(theoretical))) * 100
	elif actual == 0 and theoretical == 0:
		percentError = "undefined"
	else: # This is When Both Actual And Theoretical Equals 100%
		percentError = 0
	return percentError



value_approx = 8
value_exact = 12
percent_error = percentError(8, 12)
print(percent_error)