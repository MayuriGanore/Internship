#include<iostream>
using namespace std;
struct Node
{
    int data;
    struct Node *next;
};
struct Node *head=NULL;

void Create(int A[],int n)
{
    //last will to insert list always at last
    struct Node *t,*last;
    head=new Node;
    head->data=A[0];
    head->next=NULL;
    last=head;
    for(int i=1;i<n;i++)
    {
        t=new Node;
        t->data=A[i];
        t->next=last->next;
        last->next=t;
        last=t;
    }
}
void Display(struct Node *p)
{
    do
    {
        cout<<p->data<<"\t";
        p=p->next;
    }while(p!=head);
    cout<<"\n";
}
void  RDisplay(struct Node *p)
{
    static int flag =0;
    if(p!=head || flag ==0)
    {
        flag=1;
        cout<<p->data<<"\t";
        RDisplay(p->next);
    }
    flag=0;
}
void Insert(struct Node *p,int index,int x)//(not working)
{
    struct Node*t;
    if(index==0)
    {
        t=new Node;
        t->data=x;
        if(head==NULL)
        {
            head=t;
            head->next=head;
        }
        else
        {
            while(p->next !=head)p=p->next;
            
                
        
                p->next=t;
                t->next=head;
                head=t;
            
        }
    }
    else
    {
        for(int i=0;i<index-1;i++)
        {
            t=new Node;
            t->data=x;
            t->next=p->next;
            p->next=t;
        }
    }
}
int Delete(struct Node *p,int index)
{
    struct Node *q;
    int i,x;
    if(index==1)
    {
        while(p->next!=head)p=p->next;
        x=head->data;
        if(head==p)
        {
            delete(head);
            head=NULL;
        }
        else
        {
            p->next=head->next;
            delete(head);
            head=p->next;
        }
    }
    else{
        for(int i=0;i<index-2;i++)
        p=p->next;
        q=p->next;
        p->next=q->next;
        x=q->data;
        delete q;
    }
    return x;
}
int main()
{
    int A[]={1,2,3,4,5};
    Create(A,5);
    Display(head);
    RDisplay(head);
    Insert(head,3,99);
   Delete(head,3);
    Display(head);
    return 0;
}