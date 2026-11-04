package part16;

import java.util.Random;

public class DiceRoller {
    // Stores the random number generator
    Random random;
    // Stores the dice number
    int number;

    // Sets up the dice roller
    DiceRoller() {
        random = new Random();
        roll();
    }

    // Rolls the dice
    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}