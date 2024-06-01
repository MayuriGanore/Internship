class A
{
    void Addition(int a,int b)
    {
        System.out.println("Addition in Parent Class is:"+(a+b));
    }
}
class B extends A
{
    void Substraction(int a,int b)
    {
        System.out.println("Substraction in Child Class is:"+(a-b));
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.Substraction(10,5);
        obj.Addition(10,20);
    }

}
//output:
// Substraction in Child Class is:5
// Addition in Parent Class is:30
