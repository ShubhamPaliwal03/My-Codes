public class MultipleCatchBlocksWithinSingleTry {

    public static void main (String[] args) {

        int[] arr = new int[5];

        String s = new String("Hello");

        try
        {
            arr[5] = 30 / 0;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Cannot divide by zero! " + ae);
        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
            System.out.println("Cannot access an index of array that is out of bounds! " + aie);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }

        System.out.println("Rest of the code...");
    }
}