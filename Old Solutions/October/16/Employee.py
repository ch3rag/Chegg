from turtle import title


class Employee:
	# Define The __init__ Method To Initialize The Employee Attributes
	def __init__(self, name, id_number, department, job_title):
		self.name = name
		self.id_number = id_number
		self.department = department
		self.job_title = job_title

	# The Set Method Sets The Attributes
	def set_name(self, name):
		self.name = name
	def set_id_number(self, id_number):
		self.id_number = id_number
	def set_department(self, department):
		self.department = department
	def set_job_title(self, job_title):
		self.job_title = job_title
	
	# Define __Str__ To Return The Object State As String
	def __str__(self):
		return f'Name {self.name}\nId Number: {self.id_number}\nDepartment: {self.department}\nTitle: {self.job_title}'

def main():
	# Create Three Employees
	employee_1 = Employee('Susan Meyers', '47899', 'Accounting', 'Vice President')
	employee_2 = Employee('Mark Jones', '39119', 'IT', 'Vice Programmer')
	employee_3 = Employee('Joy Rogers', '81774', 'Manufacturing', 'Engineer')


	# Print Employee With Employee #:
	# Create A List Of All Employees
	employee_list = [employee_1, employee_2, employee_3]

	# Display Employee # Using Loop
	for i in range(len(employee_list)):
		print(f'Employee {i + 1}:\n{employee_list[i]}\n')


if __name__ == '__main__':
	main()