class Animal
{
    String name="Animal";
    void Display(){
        System.out.println("Name:"+name);
    }
}
class Dog extends Animal{
    String name="Dog";
    void Display(){
        System.out.println("Child Class Name:"+name);
        System.out.println("Parent Class Name:"+super.name);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.Display();
    }
}
//output:
// Child Class Name:Dog
// Parent Class Name:Animalj
