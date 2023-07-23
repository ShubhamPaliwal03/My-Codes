import java.util.Scanner;

class Triangle 
{
    private int base;
    private int height;
    private float area;
    
    void inputDetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the details of the triangle : ");

        System.out.print("\nBase : ");
        base = kb.nextInt();

        System.out.print("\n\nHeight : ");
        height = kb.nextInt();
        
        area = 0.5f * (float)base * (float)height;
    }
    
    void printDetails()
    {
        System.out.println("\n\nThe details of the triangle are : ");

        System.out.print("\nBase : "+base);

        System.out.print("\n\nHeight : "+height); 

        System.out.print("\n\nArea : "+area);         
    }
    
    Triangle add(Triangle temp)
    {
        Triangle t3 = new Triangle();

        t3.base = base + temp.base;
        
        t3.height = height + temp.height;
        
        t3.area = 0.5f * (float)t3.base * (float)t3.height;
        
        return t3;
    }
}

class Main
{
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Triangle t3 = new Triangle();
        
        t1.inputDetails();// 2 5
        t2.inputDetails();// 5 3
        
        t3 = t1.add(t2);
        
        t1.printDetails();// Base 2 Height 5 Area 5.0
        t2.printDetails();// Base 5 Height 3 Area 7.0
        t3.printDetails();// Base 7 Height 8 Area 28.0
    }
}
