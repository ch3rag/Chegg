
# Function To Convert From Fahrenheit To Celcius
function FahrenheitToCelcius([double] $fahrenheit) {
	$celcius = ($fahrenheit - 32) / 1.8
	return $celcius
}

# Function To Convert From Celsius To Fahrenheit
function CelsiusToFahrenheit([double] $celcius) {
	$fahrenheit = ($celsius * 1.8) + 32.0
	$fahrenheit
}

# Loop
:outer while($true) {
	# Display Title
	Write-Host("        Temperature Converter")
	Write-Host("=" * 37)
	# Display Menu
	Write-Host("1. Celsius to Fahrenheit")
	Write-Host("2. Fahrenheit to Celsius")
	# Input Choice
	[int] $choice = Read-Host("Select Option")
	Write-Host("")

	# Switch Based On User's Choice
	switch($choice) {
		# Choice #1
		1 {
			# Input Temperature In Celsius
			[double] $celsius = Read-Host("What is the temperature in Celsius")
			# Convert To Fahrenheit
			$fahrenheit = CelsiusToFahrenheit($celsius)
			# Display Result
			Write-Host("Celsius $celsius is Fahrenheit $fahrenheit")
		}

		2 {
			# Input Temperature In Fahrenheit
			[double] $fahrenheit = Read-Host("What is the temperature in Fahrenheit")
			# Convert To Fahrenheit
			$celsius = FahrenheitToCelcius($fahrenheit)
			# Display Result
			Write-Host("Fahrenheit $fahrenheit is Celsius $celsius")
		}

		Default {
			# Invalid Choice
			Write-Host("Invalid choice! Please enter either 1 or 2.")
			Write-Host ""
			Continue outer
		}
	}

	while ($true) {
		Write-Host ""
		# Ask If User Wants To Convert More
		[String] $choice = Read-Host("Do you want to continue? (y/Y or 1 = Yes, n/N or 0 = No)")
		# User Wants TO Continue
		if ('y', 'Y', '1' -contains $choice) {
			Write-Host ""
			Continue outer
		# User Wants To Exit
		} elseif ('n', 'N', '0' -contains $choice) {
			Write-Host ""
			Write-Host("Thank you, Bye!")
			break outer
		} else {
			# Invalid Choice
			Write-Host("Invalid option. Please enter any of the allowed options.")
		}
	}
}
