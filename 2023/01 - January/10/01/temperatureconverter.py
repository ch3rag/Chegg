from breezypythongui import EasyFrame

class TemperatureConverter(EasyFrame):
	# Constructor
	def __init__(self):
		# Init Easy Frame
		EasyFrame.__init__(self)
		# Set Title
		self.setTitle('Temperature Converter')
		# Add Labels
		self.addLabel(text = "Celsius", row = 0, column = 0)
		self.addLabel(text = "Fahrenheit", row = 0, column = 1)
		# Add Text Fields
		self.txtCelsius = self.addTextField(text = '0.0', row = 1, column = 0, width = 30)
		self.txtFahrenheit = self.addTextField(text = '32.0', row = 1, column = 1, width = 30)
		# Add Buttons
		self.addButton(text = '>>>>', row = 2, column = 0, command = self.computeFahr)
		self.addButton(text = '<<<<', row = 2, column = 1, command = self.computeCelsius)


	# Converts Fahrenheit From Celsius
	def computeFahr(self):
		# Get Celsius Temperature
		celsius = float(self.txtCelsius.getText())
		# Convert It Into Fahrenheit
		fahrenheit = celsius * (9 / 5) + 32
		# Output Fahrenheit To Text Box
		self.txtFahrenheit.setText(fahrenheit)

	# Converts Celsius From Fahrenheit
	def computeCelsius(self):
		# Get Fahrenheit Temperature
		fahrenheit = float(self.txtFahrenheit.getText())
		# Convert It Into Celsius
		celsius = ((fahrenheit - 32) * 5) / 9
		# Output Fahrenheit To Text Box
		self.txtCelsius.setText(celsius)

# Main
def main():
	# Instantiate Window
	TemperatureConverter().mainloop()

if __name__ == '__main__':
	main()
