import os

# Retrieves The Name Of The Current Directory
# And Stores It Into A Variable Then Prints It
def dir_firstname():
	# os.getcwd() Returns The Name Of Current Working Directory
	my_dir_firstname = os.getcwd()
	# Print The Current Directory Onto Console
	print(my_dir_firstname)

# Call The Function
dir_firstname()