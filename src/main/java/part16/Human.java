package part16;

public class Human {
    // Stores the person's name
    String name;
    // Stores the person's age
    int age;
    // Stores the person's weight
    double weight;

    // Sets up a new human
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Prints that the person is eating
    void eat() {
        System.out.println(this.name + " is eating");
    }

    // Prints that the person is drinking
    void drink() {
        System.out.println(this.name + " is drinking *burp*");
    }
}