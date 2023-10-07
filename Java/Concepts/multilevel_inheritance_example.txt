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
        System.out.println("\nName : ");

        System.out.println("\nAge : ");
    }
}

class Student extends Person
{
    private int roll;
    private int year;

    public void SetAcademicDetails(int roll, int age)
    {
        this.roll = roll;
        this.year  = age;
    }

    public void PrintAcademicDetails()
    {
        System.out.println("\nRoll : "+this.roll);
        System.out.println("\nYear : "+this.year);
    }
}

class Employee extends Student
{
    private int id;
    private int ;
}