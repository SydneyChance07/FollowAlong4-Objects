package part17;

public class Challenge {

    // Adds numbers while skipping 13 and the number after it
    public static int sumSkip13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                continue;
            }

            if (i > 0 && nums[i - 1] == 13) {
                continue;
            }

            sum += nums[i];
        }

        return sum;
    }

    // Checks if two matching numbers are next to each other
    public static boolean hasPair(int[] nums, int value) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == value && nums[i + 1] == value) {
                return true;
            }
        }

        return false;
    }
}