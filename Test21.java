
interface Vechile {
    void start();
}

interface Fuel {
    void type();
}

class SUV implements Vechile, Fuel {
    public void start() {
        System.out.println("SUV started");
    }

    public void type() {
        System.out.println("Fuel type: Diesel");
    }
}

class Test21 {
    public static void main(String[] args) {
        SUV sedan = new SUV();
        sedan.start();
        sedan.type();
    }
}

// Expected output:-
// Car starts...
// Fuel type: Petrol
