package methodPractice;

public class Parameterization {

    public static void main(String[] args) {

        int x = 45;
        int y = 20;

        System.out.println(doAddition(x, y));
        System.out.println(doSubtraction(x, y));
        System.out.println(doMultiplication(x, y));
        System.out.println(doDivision(x, y));

    }

    // Parameters - Values that we pass to methods (when we call them), so that methods can use them
    public static int doAddition(int num1, int num2) {
        return num1 + num2;
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
