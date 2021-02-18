package methodPractice;

public class Parameterization {

    public static void main(String[] args) {

        int x = 45;
        int y = 20;

//        System.out.println(doAddition(x, y));
        System.out.println(doSubtraction(x, y));
        System.out.println(doMultiplication(x, y));
        System.out.println(doDivision(x, y));

        System.out.println(printName("Sami", "Sheikh"));
    }

    // Parameters - Values that we pass to methods (when we call them), so that methods can use them
    public static String printName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }


    public static int doAddition(String num1, String num2) {
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);

        return firstNum + secondNum;
    }

    public static int doSubtraction(int num1, int num2) {

        return num1 - num2;
    }

    public static int doMultiplication(int num1, int num2) {

        return num1 * num2;
    }

    public static int doDivision(int num1, int num2) {

        return num1 / num2;
    }

}
