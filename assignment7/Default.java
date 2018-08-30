
import java.util.*;
class Demo
{
Demo(int x)
{
System.out.println("Default constructor");
}
Demo(int x,int y)
{
System.out.println("two parameters in condtructor");
}
Demo(int x,int y,int z)
{
System.out.println("three parameters in constructor");
}
}
public class Default
{
public static void main(String[] x)
{
Demo d=new Demo(10);
Demo d1=new Demo(10,20);
Demo d2=new Demo(10,20,30);
}
}