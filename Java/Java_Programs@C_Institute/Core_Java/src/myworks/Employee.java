package myworks;

public class Employee {
	private int salary;
	private int age;
	private String name;
	
	/**
	 * @param salary
	 * @param age
	 * @param name
	 */
	public Employee(int salary, int age, String name) {
		this.salary = salary;
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee(12, 20, "Shubham Paliwal");
		Employee e2 = new Employee(24, 21, "Shivam Bohra");
		Employee e3 = new Employee(14, 20, "Mohit Bishnoi");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		int salary1 = e1.getSalary();
		int salary2 = e2.getSalary();
		int salary3 = e3.getSalary();
		
		Employee min_salary_employee, max_salary_employee;
		
		if(salary1 > salary2 && salary1 > salary3)
		{
			max_salary_employee = e1;
		}
		else if(salary2 > salary3)
		{
			max_salary_employee = e2;
		}
		else
		{
			max_salary_employee = e3;
		}
		
		if(salary1 < salary2 && salary1 < salary3)
		{
			min_salary_employee = e1;
		}
		else if(salary2 < salary3)
		{
			min_salary_employee = e2;
		}
		else
		{
			min_salary_employee = e3;
		}
			
		int maxSalary = min_salary_employee.getSalary();
		int minSalary = max_salary_employee.getSalary();
		
		min_salary_employee.setSalary(minSalary);
		max_salary_employee.setSalary(maxSalary);
		
		System.out.println();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
