package part15;

public class Challenge {

    // Rates the party based on snacks and drinks
    public static int partyRating(int snacks, int drinks) {
        if (snacks < 5 || drinks < 5) {
            return 0;
        } else if (snacks >= drinks * 2 || drinks >= snacks * 2) {
            return 2;
        } else {
            return 1;
        }
    }

    // Plays the FizzBuzz game
    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}