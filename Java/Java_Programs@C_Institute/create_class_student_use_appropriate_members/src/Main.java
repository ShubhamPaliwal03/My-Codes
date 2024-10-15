import java.util.Scanner;

class Student
{
    // data members, or instance variables, or properties, or attributes
    private String name;
    private int roll;
    private String institute;

    // methods, or member methods, or behaviours, or actions
    void inputDetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("\nEnter the details of the student : ");

        System.out.print("\nName : ");
        name = kb.nextLine();

        System.out.print("\nInstitute : ");
        institute = kb.nextLine();

        System.out.print("\nRoll No. : ");
        roll = kb.nextInt();
    }

    void printDetails()
    {
        System.out.println("\n\nThe details of the student are : ");

        System.out.print("\nName : "+name);

        System.out.print("\nInstitute : "+institute);

        System.out.print("\nRoll No. : "+roll);
    }
}

class Main
{
    public static void main(String[] args)
    {
        // creating a reference variable
        Student s1;

        // creating reference value (object/instance) and assigning it into the reference variable
        s1 = new Student();

        Student s2 = new Student(); // the same task as above can be done in short like this

        s1.inputDetails();
        s2.inputDetails();

        s1.printDetails();
        s2.printDetails();
    }
}