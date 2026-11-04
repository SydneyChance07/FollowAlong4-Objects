package part16;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        3
        10
        3
        20
        */

        // Creates a counter
        Counter c = new Counter();

        // Shows the counter values
        c.show();

        // Changes the object's count
        c.count = 20;
        c.show();

        // Creates two pets
        Pet pet1 = new Pet("Max", 3);
        Pet pet2 = new Pet("Luna", 5);

        // Prints their information
        pet1.speak();
        pet2.speak();

        // Gives Max a birthday
        pet1.birthday();
        pet1.speak();

        // Creates a broken object
        Broken broken = new Broken("Max", 3);
        System.out.println(broken.name + " " + broken.age);
    }
}

class Counter {
    // Stores the object's count
    int count = 10;

    // Shows the local and object counts
    void show() {
        int count = 3;
        System.out.println(count);
        System.out.println(this.count);
    }
}

class Pet {
    // Stores the pet's information
    String name;
    int age;

    // Creates a pet
    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Describes the pet
    void speak() {
        System.out.println(name + " is " + age + " years old");
    }

    // Adds a year to the pet's age
    void birthday() {
        age++;
        System.out.println("Happy birthday, " + name + "!");
    }
}

class Broken {
    // Stores the broken object's information
    String name;
    int age;

    // Creates an object with the original scope mistake
    Broken(String name, int age) {
        name = name;
        age = age;
    }
}