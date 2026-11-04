package part18;

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Creates three food objects
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hot dog");

        // Stores the foods in an array
        Food[] refrigerator = {food1, food2, food3};

        // Prints each food name
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}