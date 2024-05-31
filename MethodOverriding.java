class Calculate
{
    public int Add(int a,int b)
    {
        System.out.println("This is Parent Class");
        return a+b;
    }
}
class CalculateComplex extends Calculate
{
    public int Add(int a,int b,int c)
    {
        System.out.println("This is Child Class");
        return a+b+c;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        CalculateComplex obj1=new CalculateComplex();
        System.out.println("Addition is: "+obj1.Add(5,6,7));
        Calculate obj2=new Calculate();
        System.out.println("Addition is:"+obj2.Add(2,3));
    }
}
// output:
// This is Child Class
// Addition is: 18
// This is Parent Class
// Addition is:5