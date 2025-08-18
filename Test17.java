/*
// Parent class
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }
}

// Child class Car
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
}

// Child class Bike
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class Test17 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // inherited
        c.drive();  

        Bike b = new Bike();
        b.start();  // inherited
        b.ride();
    }
}

*//*============================================/*
Vehicle starting...
Car is driving...
Vehicle starting...
Bike is riding...
=================================================*/

class Car{
void start()
{
System.out.println("Car Starts...");
}
void drive()
{
System.out.println("Car Driving...");
}
}

class Bike{
void start()//Duplicated again
{
System.out.println("Bike Starts...");
}
void ride()
{
System.out.println("Bike Riding....");
}
}

public class Test17
{
public static void main(String[]args)
{
	Car c = new Car();
	c.start();
	c.drive();

	Bike b = new Bike();
	b.start();
	b.ride();
}
}






