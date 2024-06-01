abstract class A
{
    abstract void Substraction(int a,int b);
    void Addition(int a,int b)
    {
        System.out.println("Addition is:"+(a+b));
    }
}
class B extends A
{
    void Substraction(int a,int b)
    {
        System.out.println("Substraction is:"+(a-b));
    }
}
public class Abstraction {
    public static void main(String[] args) {
        B obj=new B();
        obj.Substraction(10,5);
    }
}
//abstraction is  basically used to hide implementation details from user and also it provides security and enables to work in team efficiently
//output:
//Substraction is:5