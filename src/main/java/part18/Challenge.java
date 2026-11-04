package part18;

public class Challenge {

    // Adds numbers that are different from the other two
    public static int uniqueSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c) {
            sum += a;
        }

        if (b != a && b != c) {
            sum += b;
        }

        if (c != a && c != b) {
            sum += c;
        }

        return sum;
    }

    // Adds three numbers after fixing the teens
    public static int sumWithoutTeens(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    // Changes certain teen numbers to zero
    public static int fixTeen(int n) {
        if (n == 13 || n == 14 || n == 17 || n == 18 || n == 19) {
            return 0;
        }

        return n;
    }
}