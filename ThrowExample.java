package ExceptionHandling;
import java.util.Scanner;
class ThrowEX
{
    void Test()
    {
        System.out.println("Enter age:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18)
        {
            throw new IllegalArgumentException("You are not Eligible for Driving!!");
        }
        else
        {
            System.out.println("You are Eligible for Driving!!");
        }
    }
}
public class ThrowExample
{
    public static void main(String[] args) {
        ThrowEX obj=new ThrowEX();
        try
        {
            obj.Test();
        }
        catch(Exception e)
        {
            System.out.println("Exception Occurred:"+e);
        }
    }
}
// output:
// Enter age:
// 12
// Exception Occurred:java.lang.IllegalArgumentException: You are not Eligible for Driving!!    