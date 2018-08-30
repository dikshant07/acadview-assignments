abstract class Demo
{
public void eat()
{
System.out.println("eating");
}
public void drink()
{
System.out.println("drinking");
}
abstract void display();
}
class Dog extends Demo
{
public void display()
{
System.out.println("Dog");
}
}
class Cat extends Demo
{
public void display()
{
System.out.println("cat");
}
}
public class Abstract
{
public static void main(String[] x)
{
Dog d=new Dog();
d.display();
d.eat();
d.drink();
Cat c=new Cat();
c.display();
c.eat();
c.drink();
}
}