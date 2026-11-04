package part17;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        null
        olives
        null
        Ford
        Mustang
        red
        2021
        */

        // Creates three pizzas
        Pizza a = new Pizza("flatbread", "pesto");
        Pizza b = new Pizza("thin crust", "tomato", "cheddar", "olives");
        Pizza c = new Pizza();

        // Prints pizza information
        System.out.println(a.cheese);
        System.out.println(b.topping);
        System.out.println(c.bread);

        // Creates and prints a car
        Car car = new Car();
        System.out.println(car);

        // Creates a car description
        String make = "Honda";
        String model = "Civic";
        int year = 2019;
        String description = year + " " + make + " " + model;
        System.out.println(description);

        // Creates and prints a pizza
        Pizza mine = new Pizza("thin crust", "tomato", "cheddar", "olives");
        System.out.println(mine);

        // Creates another car with different information
        Car other = new Car("Toyota", "Corolla", "blue", 2018);
        System.out.println(other);
    }
}