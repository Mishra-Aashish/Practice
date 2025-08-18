class Human {
    String name;
    int age;
    String address;

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Profession extends Human {
    String profession;

    void displayProfessionaInfo() {
        displayPersonInfo();

        System.out.println("Profession" + profession);
    }
}

public class Test19 {
    public static void main(String[] args) 
    {
        Profession p = new Profession();
        p.name = "Aashish Mishra";
        p.age = 25;
        p.address = "Bangalore,Karnataka";
        p.profession = "Software Developer";

        p.displayProfessionaInfo();
   }
}