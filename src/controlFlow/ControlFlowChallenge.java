package controlFlow;

public class ControlFlowChallenge {

    /*
     Write a control flow program that prints only even numbers from 1-100, inclusive
          Extra: Write a program that does the same for odd numbers
     */

    public static void main(String[] args) {
        evenNumberSort();
        oddNumberSort();
        evenOrOddSort();
    }

    public static void evenNumberSort() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number " + i);
            }
        }
    }

    public static void oddNumberSort() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("This number is odd " + i);
            }
        }
    }

    public static void evenOrOddSort(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is even number " + i);
            } else {
                System.out.println("This number is odd " + i);
            }
        }
    }
}