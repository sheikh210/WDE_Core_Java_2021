package emailApplicationChallenge;

import java.util.Random;
import java.util.Scanner;

public class EmployeeInfo {

    static Scanner scanner;
    private String firstName;
    private String lastName;
    private String fullName;
    private String department;
    private String emailAddress;
    private String password;
    private final String COMPANY_NAME = "Tesla";

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public String getFullName() {
        if (fullName == null) {
            return "None";
        }

        return fullName;
    }


    String generatePassword() {
        int length = 15;
        String defaultChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()?.,";

        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        int index;
        char randomChar;

        for (int i = 0; i < length; i++) {
            // generate a random index number
            index = random.nextInt(defaultChars.length());

            // found a random character, using that random index
            randomChar = defaultChars.charAt(index);

            // appended that random character to the stringbuilder
            stringBuilder.append(randomChar);
        }

        password = stringBuilder.toString();
        return password;
    }


    String generateEmailAddress() {
        emailAddress = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "."
                + COMPANY_NAME.toLowerCase() + ".com";

        return emailAddress;
    }


    String inputEmployeeName() {
        firstName = "";
        lastName = "";
        fullName = "";

        scanner = new Scanner(System.in);

        while (!checkLetters(firstName)) {
            System.out.print("ENTER FIRST NAME: ");
            firstName = scanner.next();
        }

        while (!checkLetters(lastName)) {
            System.out.print("ENTER LAST NAME: ");
            lastName = scanner.next();
        }

        fullName = firstName + " " + lastName;

        return fullName;
    }


    String inputDepartment() {
        department = "";

        scanner = new Scanner(System.in);

        System.out.println("PLEASE SELECT YOUR DEPARTMENT:\n\t1 - SALES\n\t2 - ACCOUNTING\n\t3 - LEGAL\n\t4 - HR" +
                "\n\t5 - INFORMATION TECHNOLOGY\n\t6 - PUBLIC RELATIONS\n\t7 - WAREHOUSE\nEnter 0 for none");
        department = determineDeptName(scanner.next());

        return department;
    }

    boolean checkLetters(String str) {
        boolean flag = false;

        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] lettersArray = letters.toCharArray();
        char[] stringArray = str.toLowerCase().toCharArray();

        for (char c : stringArray) {
            for (char l : lettersArray) {
                if (c == l) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    String determineDeptName(String deptNumber) {
        String deptName;

        switch(deptNumber){
            case "1":
                deptName = "sales";
                break;
            case "2":
                deptName = "accounting";
                break;
            case "3":
                deptName = "legal";
                break;
            case "4":
                deptName = "hr";
                break;
            case "5":
                deptName = "it";
                break;
            case "6":
                deptName = "pr";
                break;
            case "7":
                deptName = "warehouse";
                break;
            default:
                deptName = null;
        }
        return deptName;
    }



    public void generateEmployee() {
        EmployeeInfo ei = new EmployeeInfo();

        System.out.println("Welcome, " + ei.inputEmployeeName());
        System.out.println("You work in the " + ei.inputDepartment() + " department");

        System.out.println();

        System.out.println("YOUR NEW EMAIL ADDRESS IS: " + ei.generateEmailAddress());
        System.out.println("YOUR NEW PASSWORD IS: " + ei.generatePassword());
    }
}
