/*abstract class Test11
{
public abstract void m1();
public abstract void m2();
}
class SubTest extends Test11
{
public void m1(){}
}

-------------------------------------------------------------------------------------------------------*/
/*
abstract class Test11
{
public abstract void m1();
public abstract void m2();
}
class SubTest extends Test11
{
public void m1(){}
public void m2(){}
}

-----------------------------------------------------------------------------------------------------------*/

abstract class Test11
{
public abstract void m1();
public abstract void m2();
}
abstract class SubTest extends Test11
{
public void m1(){}
}
abstract class SubSubTest extends Test11
{
public void m2(){}
}

