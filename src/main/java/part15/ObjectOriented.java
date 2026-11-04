package part15;

public class ObjectOriented {
    public static void main(String[] args) {
        // Creates the first car
        Car myCar1 = new Car();
        // Creates the second car
        Car myCar2 = new Car();

        // Prints the first car's make
        System.out.println(myCar1.make);
        // Prints the first car's model
        System.out.println(myCar1.model);
        // Adds a blank line
        System.out.println();
        // Prints the second car's make
        System.out.println(myCar2.make);
        // Prints the second car's model
        System.out.println(myCar2.model);

        // Calls the first car's drive method
        myCar1.drive();
        // Calls the first car's brake method
        myCar1.brake();
    }
}