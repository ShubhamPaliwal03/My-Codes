import java.util.Scanner;
class Rectangle
{
    private int length;
    private int width;
    private double area;

    void inputDetails()
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("\nEnter the details of the rectangle : ");

        System.out.print("\nLength : ");
        length = kb.nextInt();

        System.out.print("\nWidth : ");
        width = kb.nextInt();

//        kb.close();

        area = length * width;
    }

    void printDetails()
    {
        System.out.println("\nThe details of the rectangle are : ");

        System.out.println("\nLength : "+length);

        System.out.println("\nWidth : "+width);

        System.out.print("\nArea : "+area);
    }

    boolean isLargerThan(Rectangle r)
    {
        // we can directly return true or false

         return area > r.area;

//        if(area > r.area)
//        {
//           return true;
//        }
//        else
//        {
//            return false;
//        }
    }
}
class Main
{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.inputDetails();
        r2.inputDetails();

        System.out.println("\nDetails of the rectangle having larger area is : ");

        if(r1.isLargerThan(r2))
        {
            r1.printDetails(); // length 4 width 5 area 20
        }
        else
        {
            r2.printDetails();
        }
    }
}