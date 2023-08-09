# BattleShip.py

# Spaceship Class
class Spaceship:
	""" Constructor """
	def __init__(self, name, health, shield, attack):
		# Use Setters To Validate And Set Values
		self.set_name(name)
		self.set_levels([health, shield])
		self.set_attack(attack)
	
	""" Sets the Name of the Spaceship """
	def set_name(self, new_name = 'Unnamed Ship'):
		if new_name == '':
			# For Invalid Values, Set The Name To 'Unnamed Ship'
			new_name = 'Unnamed Ship'
		self.name = new_name
	
	""" Returns the Name of the Ship """
	def get_name(self):
		return self.name

	""" Performs A Hit On The Ship """
	def hit(self, other_ship):
		# If We Have Any Shield (> 0) Then
		if self.shield > 0:
			# Reduce Our Shield By 0.10 X Other Ship's Attack
			self.shield -= 0.10 * other_ship.get_attack()
			# Shield Can't Be Less Than 0
			if self.shield < 0:
				self.shield = 0.0
		# If We Don't Have Any Shield (= 0) Then
		elif self.shield == 0:
			# Reduce Our Health By 0.50 X Other Ship's Attack
			self.health -= 0.50 * other_ship.get_attack()
			# The The Health Gets Below Zero
			if self.health < 0:
				# Print Ship Destroyed And Set Ship's Heath To Zero
				print('Ship destroyed.')
				self.health = 0.0

	""" Returns The Health And Shield Level Of The Ship """
	def get_levels(self):
		return [self.health, self.shield]

	""" Validates And Sets Health And Shield Level Of The Ship """
	def set_levels(self, levels):
		# Check If The Parameter Is Valid
		if len(levels) == 2 and 0 <= levels[0] <= 1000 and 0 <= levels[1] <= 100:
			self.health = levels[0]
			self.shield = levels[1]
		else:
			# For Invalid Values, Set The Health And Shield To Default Values
			self.health = 1000
			self.shield = 100

	""" Returns Attack Of The Ship """
	def get_attack(self):
		return self.attack
	
	""" Validates And Sets Attack Of The Ship """
	def set_attack(self, attack):
		if 0 <= attack <= 100:
			self.attack = attack
		else:
			# For Invalid Values, Set The Attack To Default Value
			self.attack = 0

	""" Returns Object's State As String """
	def __str__(self):
		return f'{self.name} [Health: {self.health}, Shield: {self.shield}, Attack: {self.attack}]'

# Main
def main():
	# Create Two Ships
	ship1 = Spaceship('Milano', 160.0, 30.0, 80.0) 
	ship2 = Spaceship('Falcon', 200.0, 20.0, 75.0) 
	# Print Welcome Message And Starting Stats Of Both Ships
	print('*** Welcome To Spaceship Battle ****')
	print(ship1)
	print(ship2)

	# Let Them Fight
	while True:
		print()
		# Ship2 Hits Ship1
		print(f'{ship2.get_name()} Hits {ship1.get_name()}')
		ship1.hit(ship2)
		print(ship1)

		# Check If Ship1 Is Destroyed
		if ship1.get_levels()[0] == 0:
			print(f'{ship2.get_name()} Won!')
			break
		
		# Ship1 Hits Ship2
		print(f'{ship1.get_name()} Hits {ship2.get_name()}')
		ship2.hit(ship1)
		print(ship2)
		
		# Check If Ship2 Is Destroyed
		if ship2.get_levels()[0] == 0:
			print(f'{ship1.get_name()} Won!')
			break

if __name__ == '__main__':
	main()