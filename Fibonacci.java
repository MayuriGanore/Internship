import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        System.out.println("Enter the Range of Fibonacci series:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Required Fibonacci Series is:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
// output:
// Enter the Range of Fibonacci series:
// 7
// Required Fibonacci Series is:
// 0
// 1
// 1
// 2
// 3
// 5
// 8