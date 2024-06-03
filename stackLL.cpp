#include<iostream>
using namespace std;
class Stack
{
int data;
Stack *next;
Stack *top;
Stack *ptr;
int n;

public :
Stack()
{
top=NULL;
}
void push();
void pop();
void display();
Stack* create();
};

int main()
  {
  int ch;
  char q;
  Stack x;
  do
  {
  cout<<"1: Push"<<"\t"<<"2: Pop"<<"\t"<<"3.display"<<"\t"<<endl;
  cout<<"Enter your choice :";
  cin>>ch;
switch(ch)
{
case 1: x.push();
break;
case 2:x.pop();
break;
case 3:x.display();
break;
}
cout<<"\nDo you want to continue? (y/n)"<<endl;
cin>>q;
}while(q!='n');
 
  return 0;
  }

Stack* Stack::create()
{
Stack *newnode =new Stack();
int num;
cout<<"Enter a number";
cin>>num;
newnode -> data=num;
newnode -> next=NULL;
return newnode;
}

void Stack::push()
{
Stack *newnode = create();
if(top==NULL){
top=newnode;
cout<<top->data;
}
else{
  newnode->next=top;
  top=newnode;
  cout<<top->data;
}

}

void Stack::pop()
{
Stack *ptr;
if(top==NULL){
cout<<"The stack is Empty";
}
else{
ptr=top;
top=top->next;
delete(ptr);
}
}
void Stack::display()
{
Stack *temp;
temp==top;
if(top==NULL){
cout<<"empty Stack:\n";
}
else{
temp=top;
while(temp !=NULL){
cout<<temp->data<<" ";
temp=temp->next;
}
}
}