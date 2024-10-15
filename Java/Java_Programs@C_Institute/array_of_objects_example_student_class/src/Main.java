import java.util.Scanner;

class Student
{
    // data members, or instance variables, or attributes, or properties
    private String name;
    private int age;
    private int roll;

    // methods, or member methods, or behaviours, or actions
    protected void inputDetails() //we can use any access specifier except private, as public, protected, and friendly access (set by default) will work like the same before the concept of interfaces.
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nAge : ");
        age = kb.nextInt();

        System.out.print("\nRoll No. : ");
        roll = kb.nextInt();

        System.out.print("\nName : ");
        kb.nextLine();// to overcome the problem of string buffer while taking a string as input after taking a int as input
        name = kb.nextLine();;
    }

    public void printDetails()
    {
        System.out.print("\nAge : "+age);

        System.out.print("\nRoll No. : "+roll);

        System.out.print("\nName : "+name);
    }
}

class Main
{
    public static void main(String[] args)
    {
        // declare and allocate memory to array of references (array of reference variables)

        Student[] s = new Student[5];

        // assigning a reference value to every reference variable / object reference (element of array of references)

        for(int i=0;i<s.length;i++)
        {
            s[i] = new Student();

            System.out.println("\nEnter the details of the "+(i+1)+"th student : ");

            s[i].inputDetails();
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.println("\n\nThe details of the "+(i+1)+"th student are : ");

            s[i].printDetails();
        }
    }
}