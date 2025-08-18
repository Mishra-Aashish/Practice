interface Engine {
    void start();
}

interface MusicSystem {
    void music();
}

class Carr implements Engine, MusicSystem {
    public void start() {
        System.out.println("Car engine starts");
    }

    public void music() {
        System.out.println("Music system playing..");
    }
}

public class Test20 {
    public static void main(String[] args) {
        Carr car = new Carr();
        car.start();
        car.music();
    }
}

// Car engine starts...
// Music system playing...