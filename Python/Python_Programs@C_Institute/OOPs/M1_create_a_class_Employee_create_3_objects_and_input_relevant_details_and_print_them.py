class Employee:

	def __init__(self):

		print("\nEnter the Details of the Employee : ");
		
		self.name = input("\nName : ")

		self.age = int(input("\nAge : "))

		self.salary = float(input("\nSalary : "))

	def printDetails(self):

		print("\nThe Details of the Employee are : ")

		print(f"\nName : {self.name}\nAge : {self.age}\nSalary : {self.salary}")

e1 = Employee()
e2 = Employee()
e3 = Employee()

e1.printDetails()
e2.printDetails()
e3.printDetails()	

