class Addition{
    int a=9,b=10;
    Addition(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Addition is:"+(a+b));
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        Addition obj=new Addition(5,10);
    }
}
// output:
// Addition is:15