package part16;

public class Constructors {
    public static void main(String[] args) {
        // Creates two humans with different information
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        // Prints their names
        System.out.println(human1.name);
        System.out.println(human2.name);

        // Calls their methods
        human1.eat();
        human2.drink();
    }
}