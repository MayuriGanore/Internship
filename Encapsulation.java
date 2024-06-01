class A{
    private int value;//data hiding
    public void setValue(int a)//data abstraction
    {
        value=a;
    }
    public int getValue()
    {
        return ++value;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        A obj=new A();
        obj.setValue(100);
        System.out.println(obj.getValue());
    }
}
//encapsulation is basically used to access private varables outside the class
//for encapsulation data hiding and data abstraction both are used
// output:
// 101
