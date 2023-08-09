def StringChallenge(strParam):
	count = 1
	le = []
	for i in range(1, len(strParam)):
		if strParam[i] == strParam[i - 1]:
			count += 1
		else:
			le.append(f'{strParam[i - 1]}{str(count)}')
			count = 1 
		if i == len(strParam) - 1:
			le.append(f'{strParam[i]}{str(count)}')

	le.reverse()
	return ''.join(le) + ':c41zoe3ad2r'

print(StringChallenge('aabbcde'))