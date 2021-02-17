package javaBasics;

import java.util.Scanner;

import methodPractice.Parameterization;

public class UseScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("PLEASE ENTER TEXT:");
//        String input = scanner.nextLine();
//        System.out.println(input);

        System.out.println("PLEASE ENTER FIRST NUMBER:");
        int x = scanner.nextInt();

        System.out.println("PLEASE ENTER SECOND NUMBER:");
        int y = scanner.nextInt();

        System.out.println(Parameterization.doAddition(x, y));
        System.out.println(Parameterization.doSubtraction(x, y));
        System.out.println(Parameterization.doMultiplication(x, y));
        System.out.println(Parameterization.doDivision(x, y));

        // Always close scanner objects when done referencing them
        scanner.close();

    }

}
