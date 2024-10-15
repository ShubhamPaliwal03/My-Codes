import com.sun.org.apache.bcel.internal.generic.RETURN;

public class TryCatchFinallyDemo {

    public static void main (String[] args) {

        try
        {
            int res = 10 / 0;
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }
        finally
        {
            System.out.println("finally");
        }

        System.out.println("rest of the code");
    }
}