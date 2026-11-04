package part17;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    // Constructor with four ingredients
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    // Constructor with three ingredients
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // Constructor with two ingredients
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    // Constructor with one ingredient
    Pizza(String bread) {
        this.bread = bread;
    }

    // Empty constructor
    Pizza() {
    }

    // Returns the pizza description
    public String toString() {
        return bread + " pizza with " + sauce + ", " + cheese + " and " + topping;
    }
}