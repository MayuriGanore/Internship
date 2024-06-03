#include<iostream>
using namespace std;
class B;
class A
{
    int a;
    public:
        void input()
        {
            cout<<"Enter the Number:"<<a;
            cin>>a;
        }
        friend void max(A,B);
};
class B
{
    int b;
    public:
    void getdata()
    {
        cout<<"Enter the number:"<<b;
        cin>>b;
    }
    friend void max(A,B);
};
void max(A aa,B bb)
{
    if(aa.a>bb.b)
    {
        cout<<aa.a<<"is greater";
    }
    else
    {
        cout<<bb.b<<"is greater";
    }
}
int main()
{
    A aa;
    B bb;
    aa.input();
    bb.getdata();
    max(aa,bb);
    return 0;
}