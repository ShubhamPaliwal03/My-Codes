class Teacher
{
    private String name;
    private int age;
    private double salary;

    public Teacher() // Default Constructor
    {
        name = "Tarun Verma";
        age = 34;
        salary = 2.4;
    }

    public Teacher(String n, int a, double s) // Parameterized Constructor
    {
        name = n;
        age = a;
        salary = s;
    }

    public Teacher(Teacher t) // Copy Constructor
    {
        name = t.name;
        age = t.age;
        salary = t.salary;
    }

    public void printDetails()
    {
        System.out.println("\nThe Details of the Teacher are : ");
        System.out.println("\nName : "+name);
        System.out.println("\nAge : "+age);
        System.out.println("\nSalary : "+salary);
    }
}

class UseTeacher
{
    public static void main(String args[])
    {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Sumit Sharma", 36, 2.4);
        Teacher t3 = new Teacher(t2);

        t1.printDetails();
        t2.printDetails();
        t3.printDetails();
    }
}