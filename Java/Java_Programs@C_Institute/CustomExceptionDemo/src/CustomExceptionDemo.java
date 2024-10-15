// to create a custom exception, we will have to create a new class that extends the Exception class

import java.util.Scanner;

class NegativeSalaryException extends Exception {

    public NegativeSalaryException(String msg) {

        super(msg);
    }
}

public class CustomExceptionDemo {

    public static void main (String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.print("Enter salary (in $K) : ");

        int salary = kb.nextInt();

        try
        {
            if (salary < 0)
            {
                throw new NegativeSalaryException("Salary can't be negative!");
            }
            else
            {

                System.out.println("The salary is : $" + salary + "K");
            }
        }

        catch (NegativeSalaryException ne)
        {
            System.err.println(ne);
        }
    }
}
