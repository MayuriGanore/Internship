package ExceptionHandling;

public class FinallyKeyword {
    public static void main(String[] args) {
        try
        {
            System.out.println("This is try Block!!");
            int c=(10/0);
            System.out.println("Result is:"+c);
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred!!"+e);
        }
        finally
        {
            System.out.println("This is Finally Block!!");
        }
        System.out.println("This is Outside Finally Block");
    }
}
// output:
// This is try Block!!
// Exception Occurred!!java.lang.ArithmeticException: / by zero
// This is Finally Block!!
// This is Outside Finally Block