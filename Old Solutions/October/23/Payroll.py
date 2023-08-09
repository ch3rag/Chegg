# Open File For Reading
infile = open('JJS.txt', 'r')

# Read Name
empName = infile.readline().rstrip('\n')
# Read Id
empId = infile.readline().rstrip('\n')
# Read Payroll Date
workEndDate = infile.readline().rstrip('\n')
# Read Hourly Wage
hourlyWage = float(infile.readline().rstrip('\n'))
# Read Hours Worked
hoursWorked = int(infile.readline().rstrip('\n'))
# Calculate PayAmount
payAmount = hourlyWage * hoursWorked

# Print Payroll Report
print('Payroll Report')
print(f'Employee Name: {empName} ({empId})')
print(f'Payroll Date: {workEndDate}')
print(f'Pay Amount: {payAmount}')

# Close InFIle
infile.close()
