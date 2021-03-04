package javaBasics.exceptionHandling;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    // Exception Handling - A way to make a program more user-friendly (also a way to catch run-time exceptions)

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");

        // Try-Catch(Finally) Block

//        try {
//            int x = scanner.nextInt();
//            System.out.println(x);
//        } catch (Exception e) {
//            System.out.println("Incorrect Data Type --- Please try again");
//        } finally {
//            System.out.println("Closing program");
//        }

        try{
            System.out.println(doDivision(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("CANNOT DIVIDE BY ZERO");
        }

    }


    public static int doDivision(int x, int y) throws Exception {
        return x / y;
    }

}
