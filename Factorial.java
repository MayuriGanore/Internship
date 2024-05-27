import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number to find Factorial:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
}
// Output:
// Enter the Number to find Factorial:
// 15
// 1
// 3
// 5
// 15