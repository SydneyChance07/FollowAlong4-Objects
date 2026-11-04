package part17;

public class ToStringMethod {
    public static void main(String[] args) {
        // Creates a car
        Car car = new Car();

        // Prints the car's information
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        // Prints the car using toString
        System.out.println(car.toString());
        System.out.println(car);
    }
}