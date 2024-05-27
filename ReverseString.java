import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String To Reverse:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuffer sb=new StringBuffer(a);
        System.out.println("Reversed String is:"+sb.reverse());
    }   
}
//output:
// Enter the String To Reverse:
// Mayuri
// Reversed String is:iruyaM
