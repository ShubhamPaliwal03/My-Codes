class Main
{
    static void sum(int a, int b)
    {
        System.out.println("\nThe Sum of the two integers "+a+" and "+b+" is : "+(a+b));
    }

    static void sum(int a, int b, int c)
    {
        System.out.println("\nThe Sum of the three integers "+a+" ,"+b+" and "+c+" is : "+(a+b+c));
    }

    static void sum(double a, double b)
    {
        System.out.println("\nThe Sum of the two double values "+a+" and "+b+" is "+(a+b));
    }

    static void sum(double a, double b, double c)
    {
        System.out.println("\nThe Sum of the three double values "+a+" ,"+b+" and "+c+" is : "+(a+b+c));
    }

    public static void main(String[] args)
    {
        sum(1,2,3);

        sum(8,9);

        sum(5.9,7.6,1.8);

        sum(1.5,2.9);

        sum(1.5f,2.9f); // will call sum(double, double)
    }
}