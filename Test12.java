abstract class Vechile {
    public abstract int getnoofwheels();
}

class Bus extends Vechile {
    public int getnoofwheels() {
        return 6;
    }
}

class Auto extends Vechile {
    public int getnoofwheels() {
        return 3;
    }
}

class Test12 {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.getnoofwheels());
        Auto a = new Auto();
        System.out.println(a.getnoofwheels());
    }
}