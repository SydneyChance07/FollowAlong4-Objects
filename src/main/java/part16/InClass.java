package part16;

public class InClass {
    public static void main(String[] args) {
        // Creates two jerseys
        Jersey jersey1 = new Jersey("Davis", 11);
        Jersey jersey2 = new Jersey("Brooks", 84);

        // Describes both jerseys
        jersey1.describe();
        jersey2.describe();

        // Creates a local number
        int number = 99;

        // Prints both numbers
        System.out.println("number in main: " + number);
        System.out.println("number in jersey1: " + jersey1.number);
    }
}

class Jersey {
    // Stores the player's name
    String name;
    // Stores the jersey number
    int number;

    // Creates a jersey
    Jersey(String name, int number) {
        this.name = name;
        this.number = number;
    }

    // Prints the jersey information
    void describe() {
        String label = name + " #" + number;
        System.out.println(label);
    }
}