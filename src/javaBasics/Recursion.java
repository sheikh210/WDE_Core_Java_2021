package javaBasics;

public class Recursion {

    // Recursive - Calls itself

    // Factorial - 5! = 5 * 4 * 3 * 2 * 1
    // 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println(recursion.getFactorial(3)); // 6
        System.out.println(recursion.getFactorial(5)); // 120
        System.out.println(recursion.getFactorial(12)); // 479001600
    }


    // 3! = 3 * 2 * 1 = 6
//    public long getFactorial(int number) {
//        long factorial = -1;
//
//        if (number <= 0) {
//            return factorial;
//        } else {
//            factorial = 1;
//            for (int i = 1; i <= number; i++) {
//                factorial *= i;
//            }
//            return factorial;
//        }
//    }

    // 3! = 6
    public long getFactorial(int number) {

        if (number <= 0) {
            return 1;
        } else {
            return (number * getFactorial(number - 1));
        }
    }

}
