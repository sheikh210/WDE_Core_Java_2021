package reviewChallenges;

public class HighestNumber {

    /*
    Print out the largest number in an array
     */

    public static void main(String[] args) {
        int[] nums = {24, 32, 1, 0, -57, 982, 446, 11, 177, 390, 2923, 7648, 242, 234, 1123, 875};
        int maxValue = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        System.out.println("Max Value in Array: " + maxValue);
    }

}
