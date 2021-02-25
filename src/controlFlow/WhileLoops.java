package controlFlow;

import java.util.Scanner;

public class WhileLoops {


    public static void main(String[] args) {
//        int i = 1;
//        int x = 5;

//        while (true) {
//            System.out.println(i);
//            i++;
//
//            if (i > 10) {
//                break;
//            }
//        }

//        while (i <= x) {
//            System.out.println(i);
//            i++;
//        }

//        int sum = 0;
//        int input = 0;
//        Scanner stdin = new Scanner(System.in);

        /**
         * WHILE-LOOP
         *      We use While-Loops, when the number of iterations (loops) required is unclear
         *             Run the loop `n` number of times
         */

//        System.out.println("Please enter your first number");
//        input = stdin.nextInt();
//
//        while (input >= 0) {
//            sum += input;
//
//            System.out.println("Please enter another number: ");
//            input = stdin.nextInt();
//
//        }
//
//        stdin.close();
//
//        System.out.println(sum);

        /**
         * DO-WHILE LOOP
         *      Always perform an operation, before checking condition.
         *      Program will ALWAYS run at least 1 time
         */

        int a = 10;
        int b = 5;
        int sumOfNumbers = 0;

        do {
            sumOfNumbers = a + b;
            b++;
        } while (b < a);

        System.out.println(sumOfNumbers);

    }
}
