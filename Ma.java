
package pack1;

class Am
{
protected void m1()
{
System.out.println("A class protected method");
}
}
class Ma extends Am
{
public static void main(String[]args)
{
Am a = new Am();
a.m1();
Ma m = new Ma();
m.m1();
Am a1 = new Ma();
a1.m1();
}
}




