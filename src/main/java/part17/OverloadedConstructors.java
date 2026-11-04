package part17;

public class OverloadedConstructors {
    public static void main(String[] args) {
        // Creates a pizza with four ingredients
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");

        // Prints the pizza ingredients
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}