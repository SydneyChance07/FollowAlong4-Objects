package part17;

public class Car {
    // Stores the car information
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    // Empty constructor
    Car() {
    }

    // Constructor with four values
    Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Returns the car information
    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}