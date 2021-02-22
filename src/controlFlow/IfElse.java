package controlFlow;

public class IfElse {

    /*
         Control Flow Statements
            1 - Conditionals
            2 - Loops
         */

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 19;
        int d = 10;


//         Conditionals - Logical OR
        if ((a == d) || (b > c)) {
            System.out.println(a + " is equal to " + d + "\nOr " + b + " is less than " + c);
        } else {
            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
        }

//        Logical AND
        if ((a == d) && (b < c) && (d < c) && (b < a)) {
            System.out.println(a + " is equal to " + d + "\nAND " + b + " is less than " + c);
        } else {
            System.out.println(a + " is not equal to " + d + "\nAnd " + b + " is not less than " + c);
        }


        int s = 10;
        int t = 15;
        int u = 19;
        int r = 11;

        if (a != d) {
            System.out.println(a + " is not equal to " + d);
        } else {
            System.out.println(a + " is equal to " + d);
        }

    }
}
