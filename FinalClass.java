package ExceptionHandling;

final class Test{
    void TestFinal()
    {
        System.out.println("This is Final Class");
    }
}
// class Test1 extends Test
// {
//     void TestFinal()
//     {
//         System.out.println("This is Extended Final Class");
//     }
// }
public final class FinalClass {
    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.TestFinal();
    }
}

// output:
// FinalClass.java:7: error: cannot inherit from final Test
// class Test1 extends Test
//                     ^
// 1 error