package ExceptionHandling;

public class FinalKeyword {
    void FinalVariable()
    {
        final int A=8;
        System.out.println("Value of Final Keyword:"+A);
    }
    final void FinalMethod()
    {
        System.out.println("This is Final Methoad!!");
    }
    class Test extends FinalKeyword{
        // @Override
        // void FinalMethod()
        // {
        //     System.out.println("This is Final Methoad in child Class!!");
        // }
    }
    public static void main(String[] args) {
        FinalKeyword obj =new FinalKeyword();
        obj.FinalVariable();
    }
}
// output:
// FinalKeyword.java:13: error: FinalMethod() in FinalKeyword.Test cannot override FinalMethod() in FinalKeyword
//         void FinalMethod()
//              ^
//   overridden method is final