package myworks;

public class Student {
	
	/**
	 * @param age
	 * @param rollNumber
	 * @param name
	 */
	
	private int age;
	private int rollNumber;
	private String name;
	
	public Student(int age, int rollNumber, String name) {
		super(); // this can be omitted, as super() is called by default.
		this.age = age;
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", rollNumber=" + rollNumber + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(20, 1001, "Shubham Paliwal");
		System.out.println(s1);
		s1.setAge(21);
		System.out.println(s1);
		System.out.println(s1.getAge());
	}
}
