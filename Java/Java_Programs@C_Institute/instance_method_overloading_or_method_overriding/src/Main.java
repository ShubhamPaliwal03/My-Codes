class A
{
    public void show()
    {
        System.out.println("\nHi from show() of A class");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("\nHi from show() of B class");
    }
}

class Main
{
    public static void main(String[] args)
    {
        A obj = new B();
        obj.show();

        obj = new A();
        obj.show();
    }
}