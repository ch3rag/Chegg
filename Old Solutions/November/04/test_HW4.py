import os
import sys
from tud_test_base import *
from HW4 import *

def test_HW4():
	try:
		exists = os.path.exists("HW4.py")
		assert exists == True
	except:
		sys.exit()
	
	# Test 1
	set_keyboard_input([78, 'y', 67, 'Y', 'red', 87, 'n'])
	main()
	output = get_display_output()

	assert output == [
		'Coin Return Calculator',
		'\nEnter change amount to convert: ',
		'3 quarter(s)',
		'3 penny(ies)',
		'Want to calculate another amount? (y/n): ',
		'\nEnter change amount to convert: ',
		'2 quarter(s)',
		'1 dime(s)',
		'1 nickle(s)',
		'2 penny(ies)',
		'Want to calculate another amount? (y/n): ',
		'\nEnter change amount to convert: ',
		'Error! Invalid integer entered please try again.',
		'\nEnter change amount to convert: ',
		'3 quarter(s)',
		'1 dime(s)',
		'2 penny(ies)',
		'Want to calculate another amount? (y/n): ',
		'\nBye!'
	]
