package ExceptionHandling;
public class TryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("This is try block!!");
            int a = 9;
            int b = 0;
            System.out.println("The Division is:" + a / b);
        } catch (Exception e) {
            System.out.println("Exception Occured:" + e);
        }
    }
}
// output:
// This is try block!!
// Exception Occured:java.lang.ArithmeticException: / by zero