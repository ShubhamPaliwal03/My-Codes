import java.util.Scanner;
class Teacher
{
    private String name;
    private int experience;
    private String subject;

    void inputDetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("\n\nEnter the details of the teacher : ");

        System.out.print("\nName : ");
        name = kb.nextLine();

        System.out.print("\nExperience (in years) : ");
        experience = kb.nextInt();

        System.out.print("\nSubject : ");
        subject = kb.next();
    }

    void printDetails()
    {
        System.out.println("\nName : "+name);

        System.out.println("\nExperience (in years) : "+experience);

        System.out.print("\nSubject : "+subject);
    }
    int getExperience()
    {
        return experience;
    }
}

class Main
{
    public static void main(String[] args)
    {
        Teacher t1,t2,t3;

        t1 = new Teacher();
        t2 = new Teacher();
        t3 = new Teacher();

        t1.inputDetails();
        t2.inputDetails();
        t3.inputDetails();

        System.out.println("\nThe details of the teacher having maximum salary is : ");

        if(t1.getExperience()>t2.getExperience() && t1.getExperience()>t3.getExperience())
        {
            t1.printDetails();
        }
        else if(t2.getExperience()>t1.getExperience() && t2.getExperience()>t3.getExperience())
        {
            t2.printDetails();
        }
        else
        {
            t3.printDetails();
        }
    }
}