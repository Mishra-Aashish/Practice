class Car {
    String color;
    void drive() {
        System.out.println(color + " car is driving...");
    }
}

public class Test18 {
    public static void main(String[] args) {
        Car c1 = new Car();   // 1st object
        c1.color = "Red";
        c1.drive();

        Car c2 = new Car();   // 2nd object
        c2.color = "Blue";
        c2.drive();

        Car c3 = new Car();   // 3rd object
        c3.color = "Black";
        c3.drive();
    }
}

/*
Any number of objects we can create from a class */