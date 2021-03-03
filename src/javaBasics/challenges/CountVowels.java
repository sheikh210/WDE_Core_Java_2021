package javaBasics.challenges;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(countVowels("We Are Finally Done"));
    }

    public static int countVowels(String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] textArray = text.toLowerCase().toCharArray();
        int count = 0;

        for (char c : textArray) {
            for (char v : vowels) {
                if (c == v) {
                    count++;
                }
            }
        }
        return count;
    }

}
