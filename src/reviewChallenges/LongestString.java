package reviewChallenges;

public class LongestString {

    /*
    Find the longest String in an array (without using any in-built methods that count the number of characters in a string)
        Basically, no shortcuts
    Print out that string
     */

    public static void main(String[] args) {
        String[] stringArray = {"proper", "chart", "smash", "computing", "sale", "conventional", "mold", "coma", "turn", "captivate", "empirical"};
        String longestString = "";
        int stringLength = 0;

        for(String s : stringArray) {
            if (s.toCharArray().length > stringLength) {
                stringLength = s.toCharArray().length;
                longestString = s;
            }
        }
        System.out.println(longestString);
    }
}
