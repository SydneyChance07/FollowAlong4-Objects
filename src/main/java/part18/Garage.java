package part18;

public class Garage {
    // Parks a car in the garage
    void park(Car car) {
        System.out.println("The " + car.name + " is parked in the garage");
    }

    // Removes a car from the garage
    void leave(Car car) {
        System.out.println("The " + car.name + " left the garage");
    }
}