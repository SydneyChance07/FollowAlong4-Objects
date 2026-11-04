package part18;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        taco
        null
        2
        */

        // Creates an array with two food spots
        Food[] lunch = new Food[2];

        // Adds a taco to the first spot
        lunch[0] = new Food("taco");

        // Prints the food name
        System.out.println(lunch[0].name);

        // Prints the empty spot
        System.out.println(lunch[1]);

        // Prints the array size
        System.out.println(lunch.length);

        // Creates an array of fridge items
        String[] fridge = {"milk", "eggs", "cheese"};

        // Prints each fridge item
        for (String item : fridge) {
            System.out.println("In the fridge: " + item);
        }

        // Creates a garage and a BMW
        Garage garage = new Garage();
        Car bmw = new Car("BMW");

        // Parks and removes the BMW
        garage.park(bmw);
        garage.leave(bmw);

        // Creates an array of cars
        Car[] lot = {
                new Car("Honda"),
                new Car("Ford"),
                new Car("Kia")
        };

        // Parks every car in the lot
        for (Car car : lot) {
            garage.park(car);
        }
    }
}