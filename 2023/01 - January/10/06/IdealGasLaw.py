# IdealGasLaw.py
import pint

# Create A Unit Registry
unitReg = pint.UnitRegistry(autoconvert_offset_to_baseunit = True)

# Calculates The Volume Of Has In Liters Using Ideal Gas Equation
def CalculateVolume(P, n, T):
	# Value Of R In Atm-Lt/mole-K
	R = 0.0821 * (unitReg.atmosphere * unitReg.litre) / (unitReg.mole * unitReg.kelvin)
	# Calculate V
	V = (n * R * T) / P
	# Return V
	return V

# Print The Result Nicely
def testCalculateVolume(P, n, T):
	print(f'For the inputs,\n\tP = {P:.2f}\n\tn = {n:.2f}\n\tT = {T:.2f}\n')
	V = CalculateVolume(P, n, T)
	print(f'Result,\n\tV = {V:.2f}\n{"-=" * 20}-')

# Test Case - 1
T = (70 * unitReg.degF).to(unitReg.kelvin)
P = 1 * unitReg.atmosphere
n = 1 * unitReg.mole
testCalculateVolume(P, n, T)

# Test Case - 2
T = (500 * unitReg.degC).to(unitReg.kelvin)
P = 1 * unitReg.atmosphere
testCalculateVolume(P, n, T)

# Test Case - 3
T = (100 * unitReg.degF).to(unitReg.kelvin)
P = (30 * unitReg.inHg).to(unitReg.atmosphere)
testCalculateVolume(P, n, T)

# Test Case - 3
T = 500 * unitReg.kelvin
P = (5 * unitReg.psi).to(unitReg.atmosphere)
testCalculateVolume(P, n, T)
