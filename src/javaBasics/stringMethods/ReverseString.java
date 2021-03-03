package javaBasics.stringMethods;

public class ReverseString {

    // Palindrome = A word that is the same forward and backwards (racecar)

    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecaf"));
    }

    public static boolean isPalindrome(String text) {
        char[] textArray = text.toLowerCase().toCharArray();
        char[] reverseArray = new char[textArray.length];
        boolean flag = false;


        for (int i = textArray.length - 1; i >= 0; i--) {
            reverseArray[(textArray.length - 1) - i] = textArray[i];
        }

//        for (int i = 0; i < textArray.length; i++) {
//            if (textArray[i] != reverseArray[i]) {
//                flag = false;
//            } else {
//                flag = true;
//            }
//        }

        // For-Each Loop

        int i = 0;

        for (char c : textArray) {
            if (c != reverseArray[i]){
                flag = false;
            } else {
                flag = true;
            }
           i++;
        }

        return flag;
    }


}
