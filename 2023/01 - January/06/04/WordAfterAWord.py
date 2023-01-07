# Python Script To Return The Words Followed By A Word Starting With Letter 'A'

import re


def wordsNextToAWord(text):
	# Parts Of Regex:
	# 1. (?:^|\s) Matches Beginning Of The Line Or WhiteSpace
	# 2. [Aa][A-z']+ Matches A Word Starting With Letter A or a
	# 3. [\s\-\.\d,!]+ Matches The Space OR Punctuation Or Digits After A-Word
	# 4. ([A-z']+) Matches And Captures Next Word After The Previous A-Word
	pattern = re.compile("(?:^|\s)[Aa][A-z']+[\s\-\.\d,!]+([A-z']+)")
	return re.findall(pattern, text)
	
# Test
str1 = "Doesn't anybody stay in one place anymore. It would be so fine to see your face at my door."
str2 = "Doesn't anybody-stay in one place anymore. It would be so fine to see your face at 2 my door."
str3 = "As Doesn't anybody-stay in one place anymore! It would be so fine to see your face at, 2 my door."

print(wordsNextToAWord(str1))
print(wordsNextToAWord(str2))
print(wordsNextToAWord(str3))
