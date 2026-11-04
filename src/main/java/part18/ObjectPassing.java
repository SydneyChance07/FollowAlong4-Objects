package part18;

public class ObjectPassing {
    public static void main(String[] args) {
        // Creates a garage
        Garage garage = new Garage();

        // Creates two cars
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        // Parks both cars
        garage.park(car1);
        garage.park(car2);
    }
}