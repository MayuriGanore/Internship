#include<iostream>
using namespace std;
struct Node
{
    struct Node *prev;
    int data ;
    struct Node *next;
};
struct Node *first=NULL;
void create(int A[],int n)
{
    struct Node *t,*last;
   first=new Node;
   first->data=A[0];
   first->prev=first->next=NULL;
   last=first;
   for(int i=1;i<n;i++)
   {
    t=new Node;
    t->data=A[i];
    t->next=last->next;
    t->prev=last;
    last->next=t;
    last=t;
   }

}
void Display(struct Node *p)
{
    while(p!=NULL)
    {
        cout<<p->data<<"\t";
        p=p->next;
    }
    cout<<"\n";
}
int length(struct Node *p)
{
    int len=0;
    while(p!=NULL)
    {
        len++;
        p=p->next;
    }
    return len;
}
void Insert(struct Node *p,int index,int x)
{
    struct Node  *t;
    if(index<0 ||index>length(p))
    return;
    if(index==0)
    {
        t->data=x;
        t->next=first;
        t->prev=NULL;
        first->prev=t;
        first=t;
    }
    else
    {
        for(int i=0;i<index-1;i++)
        {
            p=p->next;
        }
        t=new Node;
        t->data=x;
        t->prev=p;   //t is new node to be inserted
                    //p is at 4 if you want to insert t at 5 position. 
        t->next=p->next;
        if(p->next!=NULL)
        p->next->prev=t;
        p->next=t;
    }
}
int Delete(struct Node*p,int index)
{
    struct Node *t;
    int x=-1;
    if(index<1 || index >length(p))
    return -1 ;
    if(index==1)
    {
        first=first->next;
        if(first!=NULL)
        {
            first->prev=NULL;
        }
        x=p->data;
        delete(t); 
    }
    else
    {
        for(int i=0;i<index-1;i++)
        {
            p=p->next;
        }
        p->prev->next=p->next;
        if(p->next!=NULL)
        {
            p->next->prev=p->prev;
        }
        x=p->data;
        delete(p);

    }
    return 0;

}
void Reverse(struct Node*p)
{
    struct Node *temp;
    while(p!=NULL)
    {
        temp=p->next;
        p->next=p->prev;
        p->prev=temp;
        p=p->prev;
        if(p!=NULL && p->next==NULL)//last node
        first=p;
    }
}
int main()
{
    int A[]={1,2,3,4,5};
    create(A,5);
    cout<<"length is:"<<length(first)<<"\n";
    Display(first);
    Insert(first,3,5);
    Display(first);
    Delete(first,6);
    Display(first);
    Reverse(first);
    Display(first);


    return 0;
}