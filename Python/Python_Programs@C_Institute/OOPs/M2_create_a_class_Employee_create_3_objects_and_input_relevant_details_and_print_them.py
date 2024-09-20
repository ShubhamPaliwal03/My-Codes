class Employee:

	def __init__(self,name,age,salary):

		self.name = name
		self.age = age
		self.salary = salary

	def PrintDetails(self):

		print("\nThe Details of the Employee are : ")

		print("f\nName : {self.name}\nAge : {self.age}\nSalary : {self.salary}")

name = ""
age = 0
salary = 0

def inputDetails():

	print("Enter the details of the Employee : ")

	name = input("\nName : ")

	age = input("\nAge : ")

	salary = input("\nSalary : ")

inputDetails()
e1 = Employee(name,age,salary)

inputDetails()
e2 = Employee(name,age,salary)

inputDetails()
e3 = Employee(name,age,salary)