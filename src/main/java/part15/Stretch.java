package part15;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
        blue
        red
        red
        3000.0
        */

        // Creates two cars
        Car a = new Car();
        Car b = new Car();

        // Changes the second car's color
        b.color = "red";

        // Prints both colors
        System.out.println(a.color);
        System.out.println(b.color);

        // Makes both variables point to the same car
        a = b;

        // Prints the new color
        System.out.println(a.color);

        // Creates a tax constant
        final double TAX_RATE = 0.06;

        // Prints the tax amount
        System.out.println(a.price * TAX_RATE);

        // Creates the first phone
        Phone phone = new Phone();

        // Charges the phone twice
        phone.charge();
        phone.charge();

        // Prints the phone information
        System.out.println(phone.brand + " battery: " + phone.battery);

        // Creates a second phone
        Phone phone2 = new Phone();
        phone2.brand = "Samsung";

        // Prints both phones
        System.out.println(phone.brand + " / " + phone2.brand);
        System.out.println(phone.battery + " / " + phone2.battery);

        // Creates a phone with a nearly full battery
        Phone full = new Phone();
        full.battery = 95;

        // Charges it twice
        full.charge();
        full.charge();
    }
}

class Phone {
    // Stores the phone brand
    String brand = "Apple";
    // Sets the maximum battery
    final int MAX_BATTERY = 100;
    // Stores the battery level
    int battery = 80;

    // Charges the phone
    void charge() {
        battery = battery + 10;

        if (battery > MAX_BATTERY) {
            battery = MAX_BATTERY;
        }

        System.out.println("Charging... " + battery + "%");
    }
}