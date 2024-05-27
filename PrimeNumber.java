import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Range In which you want to display prime numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The Required Prime Numbers Between "+a+" and "+b+" are:");
        while(a<=b)
        {
            int count=0;
            for(int i=1;i<=a;i++)
            {
                if(a%i==0)
                    count++;
            }
            if(count==2)
                System.out.println(a);
            a++;
        }
    }
}
// output:
// Enter the Range In which you want to display prime numbers:
// 1
// 10
// The Required Prime Numbers Between 1 and 10 are:
// 2
// 3
// 5
// 7