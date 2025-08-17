package pack2;


class Wheels extends Car
{
public static void main(String[]args)
{
Car c = new Car();
c.m1();
Wheels w = new Wheels();
w.m1();
Car c1 = new Wheels();
c1.m1();
}
}