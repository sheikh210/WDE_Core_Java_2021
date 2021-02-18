package javaBasics;

public class OperatorsAndExpressions {

    public static void main(String[] args) {

        /*
         Different types of operators
            1 - Arithmetic Operators (perform calculations)
                +, -, /, *, %
            2 - Assignment Operators (used for assigning value)
                =, +=, -=, *=, /=, %=
            3 - Comparison Operators (used to compare 2 values)
                ==, <, >, <=, >=, !=, .equals() (ONLY FOR STRINGS)
            4 - Logical Operators
                &&, ||
         */


        // Assignment Operators
//        int x = 10;
//        x += 1; // (x = x + 1) - Incrementing
//        System.out.println(x);
//
//        x -= 1; // (x = x - 1) - Decrementing
//        System.out.println(x);
//
//        x *= 3; // (x = x * 3)
//        System.out.println(x);
//
//        x /= 3; // (x = x / 3)
//        System.out.println(x);
//
//        x %= 3; // (x = x % 3)
//        System.out.println(x);
//
//
//        // Comparison Operators
//        x = 10;
//        int y = 10;
//
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x > y);
//        System.out.println(x <= y);
//
//        String name = "George";
//        String lastName = "george";
//
//        System.out.println(name);
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase().equals(lastName));

        // Logical Operators
//        int a = 10;
//        int b = 15;
//        int c = 19;
//        int d = 10;

        /*
         Control Flow Statements
            1 - Conditionals
            2 - Loops
         */
        // Conditionals - Logical OR
//        if ((a == d) || (b > c)) {
//            System.out.println(a + " is equal to " + d + "\nOr " + b + " is less than " + c);
//        } else {
//            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
//        }
//
//        // Logical AND
//        if ((a == d) && (b < c) && (d < c) && (b < a)) {
//            System.out.println(a + " is equal to " + d + "\nAND " + b + " is less than " + c);
//        } else {
//            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
//        }


        int a = 10;
        int b = 15;
        int c = 19;
        int d = 11;

        if (a != d) {
            System.out.println(a + " is not equal to " + d);
        } else {
            System.out.println(a + " is equal to " + d);
        }


    }

}
