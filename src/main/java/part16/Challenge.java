package part16;

public class Challenge {

    // Doubles every letter in a String
    public static String doubleLetters(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i);
            result += s.charAt(i);
        }

        return result;
    }

    // Counts how many times a word appears without overlaps
    public static int countWord(String s, String word) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}