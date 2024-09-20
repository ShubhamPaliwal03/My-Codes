import java.util.Scanner;

class Employee
{
    private String name;
    private int salary;
    private int age;
    private String designation;

    void inputDetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("\nName : ");
        name = kb.nextLine();
        System.out.print("\nAge : ");
        age = kb.nextInt();
        System.out.print("\nDesignation : ");
        kb.next();
        // to clear the newline character present in the buffer, due to the newline of the enter key when taking input
        designation = kb.nextLine();
        System.out.print("\nSalary : ");
        salary = kb.nextInt();
    }

    int getAge()
    {
        return age;
    }

    void printDetails()
    {
        System.out.print("\nName : "+name);
        System.out.print("\nAge : "+age);
        System.out.print("\nDesignation : "+designation);
        System.out.print("\nSalary : "+salary);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Employee e[] = new Employee[5];

        for(int i=0;i<e.length;i++)
        {
            e[i] = new Employee();

            System.out.println("\nEnter the Details of the "+(i+1)+"th employee");

            e[i].inputDetails();;
        }

        int min = e[0].getAge();
        int youngest=0;

        for(int i=1;i< e.length;i++)
        {
            if(e[i].getAge()<min)
            {
                min = e[i].getAge();
                youngest = i;
            }
        }

        System.out.println("\nThe Details of the Youngest employee are : ");

        e[youngest].printDetails();
    }
}