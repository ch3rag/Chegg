# isValidNote
# Checks If The Note Is Valid Note
# Receives A Note As A String
# Returns True If The Note Is Valid, Otherwise False
def isValidNote(note):
	# Return Note's Validity
	return len(note) == 2 and note[0] >= 'A' and note[0] <= 'G' and note[1] >= '0' and note[1] <= '9'

# isValidTune
# Checks If The Tune Consist Of Valid Notes
# Receives A String Of Arbitrary Length Containing Notes
# Returns True If The Tune Is Valid, Otherwise False
def isValidTune(tune):
	# For A Valid Tune, Length Should Be Even
	if len(tune) % 2 == 1:
		return False
	
	# Check Each Note In Tune
	for i in range(0, len(tune), 2):
		# If Note Is A Valid, Return False
		if not isValidNote(tune[i : i+2]):
			return False
	return True

# Test
print('isValidTune("A2B4C7"): ', isValidTune('A2B4C7'))
print('isValidTune("M5D2E1"): ', isValidTune('M5D2E1'))
print('isValidTune("A5D2E11"): ', isValidTune('A5D2E11'))
print('isValidTune("Hello1300"): ', isValidTune('Hello1300'))