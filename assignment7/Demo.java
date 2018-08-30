interface Animal
{
void display();
}
class Dog implements Animal
{
public void display()
{
System.out.println("i am dog");
}
}
class Cat implements Animal
{
public void display()
{
System.out.println("i am cat");
}
}
public class Demo
{
public static void main(String[] x)
{
Dog d=new Dog();
Cat c=new Cat();
d.display();
c.display();
}
}