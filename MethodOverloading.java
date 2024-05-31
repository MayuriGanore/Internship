public class MethodOverloading {
    public int Add(int a,int b)
    {
        return a+b;
    }
    public int Add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double Add(double a,double b)
    {
       return a+b;
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        System.out.println("Addition of Two Numbers is :"+obj.Add(5, 6));
        System.out.println("Addition of Three Numbers is :"+obj.Add(5, 6,8));
        System.out.println("Addition of Two Integers is :"+obj.Add(5.8, 1.6));
    }
}
//output
// Addition of Two Numbers is :11
// Addition of Three Numbers is :19
// Addition of Two Integers is :7.4