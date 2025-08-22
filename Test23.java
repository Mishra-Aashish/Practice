/*
class Test
{
public void m1(int i)
{
System.out.println("Age : "+i);
}
public void m2(String s)
{
System.out.println("Aashish : "+s);
}
}
public class Test23
{
public static void main(String[]args)
{
Test t = new Test();
t.m1(26);
t.m2("Aashish");
}
}

*/

class Test
{
public String m1(String s)
{
return s;
}
public int m2(int i)
{
return i;
}
}
public class Test23{
public static void main(String[]args)
{
Test t = new Test();
String name = t.m1("Aashish Mishra");
int age  = t.m2(26);


System.out.println("Name : "+name);
System.out.println("Age : "+age);
}
}

