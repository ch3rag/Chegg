# Inputs Favorite Animals From The User And Stores Them In A File
Function InputAnimals([int] $numAnimals) {
	# Create New File For Output
	Out-File "FavouriteAnimals.txt"
	# Loop NumAnimals Times
	for ([int] $i = 0; $i -lt $numAnimals; $i++) {
		# Input An Animal
		[string] $favAnimal = Read-Host 'Input favourite animal' ($i + 1)
		# Output To File
		$favAnimal | Out-File "FavouriteAnimals.txt" -Append
	}
	# Output Contents Of File On Console
	Get-Content "FavouriteAnimals.txt"
}

# Input Number Of Favourite Animals From The User
[int] $numAnimals = Read-Host 'How many favourite animals do you have?'

# Pass The Number of Animals To The Input Function
InputAnimals($numAnimals)