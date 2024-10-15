import java.util.Scanner;

class Student
{
    // data members, or instance variables, or attributes, or properties

    private String name;
    private int roll;
    private String institute;

    // methods, or member methods, or instance methods, or actions, or behaviours

    void inputDetails()
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("\nEnter the details of the student : ");

        System.out.print("\n\nName : ");
        name = scanner.nextLine();

        System.out.print("\nInstitute : ");
        institute = scanner.nextLine();

        System.out.print("\nRoll Number : ");
        roll = scanner.nextInt();
    }

    void printDetails()
    {
        System.out.print("\n\nThe details of the students are : ");

        System.out.print("\n\nName : "+name);

        System.out.print("\nInstitute : "+institute);

        System.out.print("\nRoll Number : "+roll);
    }
}

class Main
{
    public static void main(String[] args)
    {
        // Method-1

        // Creating a reference variable

        Student s1;

        // Creating a reference value (object/instance) and assigning it into the reference variable

        s1 = new Student();

        // Method-2

        Student s2 = new Student();

        s1.inputDetails();
        s2.inputDetails();

        s1.printDetails();
        s2.printDetails();
    }

}