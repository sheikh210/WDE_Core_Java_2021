package controlFlow;

public class IfElse {

    /*
         Control Flow Statements
            1 - Conditionals
            2 - Loops
         */

    public static void main(String[] args) {
        System.out.println(doAddition(1, 100));

//        int a = 10;
//        int b = 15;
//        int c = 19;
//        int d = 10;
//
//
////         Conditionals - Logical OR
//        if ((a == d) || (b > c)) {
//            System.out.println(a + " is equal to " + d + "\nOr " + b + " is less than " + c);
//        } else {
//            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
//        }
//
////        Logical AND
//        if ((a == d) && (b < c) && (d < c) && (b < a)) {
//            System.out.println(a + " is equal to " + d + "\nAND " + b + " is less than " + c);
//        } else {
//            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
//        }
    }


    public static int doAddition(int num1, int num2) {
        // I only want this method to add numbers between the range of 1-100, inclusive.

        if (num1 > 100 || num1 < 1) {
            System.out.println(num1 + " is not a valid argument");
            return -1;
        } else if (num2 > 100 || num2 < 1) {
            System.out.println(num2 + " is not a valid argument");
            return -1;
        } else {
            return num1 + num2;
        }


    }

}
