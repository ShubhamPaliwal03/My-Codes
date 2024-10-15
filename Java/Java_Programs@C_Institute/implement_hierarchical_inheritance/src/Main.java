import java.util.Scanner;

class Person
{
    private int age;
    private String name;

    public void SetPersonalDetails(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void printPersonalDetails()
    {
        System.out.println("\nThe Personal Details are : ");

        System.out.println("\nAge : " + this.age);

        System.out.println("\nName : " + this.name);
    }
}

class Student extends Person
{
    private int roll;
    private int year;

    public void SetAcademicDetails(int roll, int year)
    {
        this.roll = roll;
        this.year = year;
    }

    public void printAcademicDetails()
    {
        System.out.println("\nThe Academic details are : ");

        System.out.println("\nRoll Number : "+this.roll);

        System.out.println("\nYear of Study : "+this.year);
    }
}

class Employee extends Person
{
    private int id;
    private String company_name;

    public void setProfessionalDetails(int id, String company_name)
    {
        this.id = id;
        this.company_name = company_name;
    }

    public void printProfessionalDetails()
    {
        System.out.println("\nThe Professional Details are : ");

        System.out.println("\nID : "+this.id);

        System.out.println("\nCompany Name : "+this.company_name);
    }
}

class ImplementHierarchicalInheritance
{
    public static void main(String[] args)
    {
        Person P1 = new Person();

        P1.SetPersonalDetails(20,"Shubham Paliwal");

        P1.printPersonalDetails();

        Employee E1 = new Employee();

        E1.SetPersonalDetails(20,"Shubham Paliwal");
        E1.setProfessionalDetails(1151,"Microsoft");

        E1.printPersonalDetails();
        E1.printProfessionalDetails();

        Student S1 = new Student();

        S1.SetPersonalDetails(20,"Shubham Paliwal");
        S1.SetAcademicDetails(37,2);

        S1.printPersonalDetails();
        S1.printAcademicDetails();
    }
}
