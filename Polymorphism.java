class Animal
{
    void MakeSound()
    {
        System.out.println("Some Generic Animal Sound!!");
    }
}
class Cat extends Animal
{
    void MakeSound()
    {
        System.out.println("Cat Makes Meow Sound!!");
    }
}
class Dog  extends Animal
{
    void MakeSound()
    {
        System.out.println("Dog Make Bhow Sound!!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal obj=new Animal();
        Cat obj1=new Cat();
        Dog obj2=new Dog();
        obj.MakeSound();
        obj1.MakeSound();
        obj2.MakeSound();
    }
}
//output:
// Some Generic Animal Sound!!
// Cat Makes Meow Sound!!
// Dog Make Bhow Sound!!
