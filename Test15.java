class A
{
private void m1()
{
System.out.println("A class main method");
}
}
public class Test15
{
public static void main(String[]args)
{
A a = new A();
a.m1();
}
}