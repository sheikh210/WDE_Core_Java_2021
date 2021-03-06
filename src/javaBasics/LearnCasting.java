package javaBasics;

public class LearnCasting {

    static int x = 10;
    static double d = 3.14;

    static String numberString = "3324";
    static char aChar = 'a';

    public static void main(String[] args) {
        /*
        2 Types of Casting
            Widening - There is no data loss
            Narrowing - There is data loss
         */

        System.out.println(x);
        System.out.println((double) x);

        System.out.println(d);
        System.out.println((int) d);

        // Wrapper classes to convert non-primitive -> primitive and vice versa
        System.out.println(numberString);
        System.out.println(String.valueOf(x));

        System.out.println(Integer.parseInt(numberString));
        System.out.println(Double.parseDouble(numberString));
        System.out.println(Short.parseShort(numberString));
        System.out.println(Long.parseLong(numberString));
        System.out.println(Float.parseFloat(numberString));
    }
}
