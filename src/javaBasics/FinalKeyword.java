package javaBasics;

public class FinalKeyword {

    // Anything declared with a `final` non-access modifier, CANNOT be changed after initialization

    final static String STUDENT_NAME = "Alexandra";
    final static String JANUARY = "January";
    final static String FEBRUARY = "February";

    public static void main(String[] args) {
        System.out.println(FinalKeyword.STUDENT_NAME);

        String month = "February";

        if (month.toLowerCase().equals(Months.FEBRUARY.toString().toLowerCase())) {
            System.out.println("It is " + month);
        }
    }
}
