package methodPractice;

import java.util.Scanner;

public class ScannerChallenge {

    /*
    Write a program (method) to accept user input,
    prompting user for their first name and then their last name,
    and then return their full name.

    Print their name out in the main()
     */

    public static void main(String[] args) {
        System.out.println(printFullName());
    }

    static String printFullName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        return firstName + " " + lastName;
    }

}
