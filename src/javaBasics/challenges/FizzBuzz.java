package javaBasics.challenges;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(9)); // Fizz
        System.out.println(fizzBuzz(30)); // FizzBuzz
        System.out.println(fizzBuzz(50)); // Buzz
        System.out.println(fizzBuzz(4)); // "4"
    }

    public static String fizzBuzz(int number) {
        String word = String.valueOf(number);

        if (number % 3 == 0 && number % 5 == 0) {
            word = "FizzBuzz";
        } else if ((number % 3 == 0) && (number % 5 != 0)) {
            word = "Fizz";
        } else if ((number % 3 != 0) && (number % 5 == 0)) {
            word = "Buzz";
        } else {
            return word;
        }
        return word;
    }


}
