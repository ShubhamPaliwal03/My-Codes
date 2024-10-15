// Q2. Define a class named Employee with following members
// age--> int,private
// rollNumber--> int,private
// name ---> String,private

// Employee(int,int,String) --> public
// static Employee getEldestEmployee(Employee,Employee,Employee) --> public
// void printDetails() ---> public

// Create three objects in main(), and call getEldestEmployee() pass three objects to it and collect the returned object in a Employee reference and print the details of eldest employee.


class Employee
{
	private int age;

	private int rollNumber;

	private String name;

	public Employee(int age, int rollNumber, String name)
	{
		this.age = age;

		this.rollNumber = rollNumber;

		this.name = name;
	}

	public void printDetails()
	{
		System.out.print("\n\nName : "+name);

		System.out.print("\n\nRoll Number : "+rollNumber);

		System.out.print("\n\nAge : "+age);
	}

	public static Employee getEldestEmployee(Employee e1, Employee e2, Employee e3)
	{
		if(e1.age > e2.age && e1.age > e3.age) // if e1 is eldest
		{
			return e1;
		}
		else if(e2.age > e1.age && e2.age > e3.age) // if e2 is eldest
		{
			return e2;
		}
		else // if e3 is eldest, or all of them are of same age
		{
			return e3;
		}
	}
}

class TestQ2
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(21, 1001, "Shubham Paliwal");

		Employee e2 = new Employee(27, 1002, "Mohit Bishnoi");

		Employee e3 = new Employee(36, 1003, "Tarun Verma");

		Employee eldest = Employee.getEldestEmployee(e1, e2, e3);

		System.out.println("\nThe Details of the Eldest Employee are : ");

		eldest.printDetails();
	}
}