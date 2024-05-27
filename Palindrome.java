import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find Factorial:");
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        int remainder;
        while(n>0)
        {
            remainder=(n%10);
            sum=(sum*10)+remainder;
            n=n/10;
        }
        if (x==sum)
            System.out.println("Number is Palindrome!!");
        else
            System.out.println("Number is not Palindrome");
    }
}
// Output:
// Enter the Number to find Factorial:
// 121
// Number is Palindrome!!

// Enter the Number to find Factorial:
// 453
// Number is not Palindrome