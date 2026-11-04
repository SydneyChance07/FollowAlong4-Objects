package part17;

public class InClass {
    public static void main(String[] args) {
        // Creates three smoothies
        Smoothie s1 = new Smoothie("strawberry", "medium", "ice");
        Smoothie s2 = new Smoothie("mango", "large");
        Smoothie s3 = new Smoothie();

        // Prints the smoothies
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

class Smoothie {
    // Stores smoothie information
    String fruit;
    String size;
    String extra;

    // Constructor with three values
    Smoothie(String fruit, String size, String extra) {
        this.fruit = fruit;
        this.size = size;
        this.extra = extra;
    }

    // Constructor with two values
    Smoothie(String fruit, String size) {
        this.fruit = fruit;
        this.size = size;
    }

    // Empty constructor
    Smoothie() {
    }

    // Describes the smoothie
    public String toString() {
        return fruit + " " + size + " " + extra;
    }
}