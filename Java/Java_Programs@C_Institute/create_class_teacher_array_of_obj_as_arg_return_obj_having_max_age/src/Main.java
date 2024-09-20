import java.util.Scanner;

class Teacher
{
    // instance variables, or member data, or data members, or attributes, or properties
    private String name;
    private String subject;
    private int age;
    private int salary;

    // instance methods, or member methods, or behaviours, or actions

    void inputdetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nName    : ");
        name = kb.nextLine();

        System.out.print("\nSubject : ");
        subject = kb.nextLine();

        System.out.print("\nAge     : ");
        age = kb.nextInt();

        System.out.print("\nSalary  : ");
        salary = kb.nextInt();
    }

    void printDetails()
    {
        System.out.print("\nName    : "+name);

        System.out.print("\nSubject : "+subject);

        System.out.print("\nAge     : "+age);

        System.out.print("\nSalary  : "+salary);
    }

    Teacher getMaxAge(Teacher[] T)
    {
        int max = T[0].age;
        int index_most_aged = 0;

        for(int i=0;i<T.length;i++)
        {
            if(T[i].age>max)
            {
                max = T[i].age;
                index_most_aged = i;
            }
        }

        return T[index_most_aged];
    }
}

class Main
{
    public static void main(String[] args)
    {
        // initialize and allocate memory to array of references
        Teacher[] t = new Teacher[5];

        // initialize and allocate memory to every object reference (element of array of references)
        for(int i=0;i<t.length;i++)
        {
            t[i] = new Teacher();

            System.out.println("\nEnter the details of the "+(i+1)+"th teacher : ");

            t[i].inputdetails();
        }

        System.out.println("\nThe details of the employee having maximum age is :\n");

        Teacher most_aged = new Teacher();

        most_aged = most_aged.getMaxAge(t);

        most_aged.printDetails();
    }
}