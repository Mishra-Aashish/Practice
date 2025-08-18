/*
class P
{
public void m1()
{
System.out.println("Parent");
}
}
class C extends P
{
public void m2()
{
System.out.println("Child");
}
}
class Test16
{
public  static void main(String[]args)
{
P p = new P();
p.m1();
}
}
================================================================*/
/*
class P
{
public void m1()
{
System.out.println("Parent");
}
}
class C extends P
{
public void m2()
{
System.out.println("Child");
}
}
class Test16
{
public  static void main(String[]args)
{
P p = new P();
p.m1();
p.m2();
}
}
*//*======================
Test16.java:46: error: cannot find symbol
p.m2();
 ^
  symbol:   method m2()
  location: variable p of type P
1 error
===========================*//*


class P
{
public void m1()
{
System.out.println("Parent");
}
}
class C extends P
{
public void m2()
{
System.out.println("Child");
}
}
class Test16
{
public  static void main(String[]args)
{
C c = new C();
c.m1();
c.m2();
}
}

*//*======================
C:\Users\aashi\Desktop\Practice>java Test16
Parent
Child
==========================*/

/**/
class P
{
public void m1()
{
System.out.println("Parent");
}
}
class C extends P
{
public void m2()
{
System.out.println("Child");
}
}
class Test16
{
public  static void main(String[]args)
{
P p = new C();
p.m1();
p.m2();
}
}
/*===============================
C:\Users\aashi\Desktop\Practice>javac Test16.java
Test16.java:110: error: cannot find symbol
p.m2();
 ^
  symbol:   method m2()
  location: variable p of type P
1 error
*//*================================================================*/
