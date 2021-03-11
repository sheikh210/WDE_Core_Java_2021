package reviewChallenges;

public class NthOddNumber {

    /*
    Given that you have a set of numbers consisting of 100 numbers,
        write a method that accepts 1 parameter of type int and returns the nth odd number from within that set of numbers
     */

    // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 .....} n number of values
    // 20 = 39

    public static void main(String[] args) {

        System.out.println(getOddNumber(57)); // -1
        System.out.println(getOddNumber(-5)); // -1
        System.out.println(getOddNumber(20)); // 39
        System.out.println(getOddNumber(50)); // 99

    }

    static int getOddNumber(int num) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
                75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98,
                99, 100};

        int count = 0;

        if (num > 50 || num <= 0) {
            return -1;
        } else {
            for (int i : nums) {
                if (i % 2 != 0) {
                    count++;
                    if (count == num) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }



}
