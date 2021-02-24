package controlFlow;

public class DaysInAMonthChallenge {

    /*
    Create a program that returns the number of days in a month, with the name of the month passed as a parameter to the method
            Ex - January = 31, November = 30, May = 31, etc
     */


    public static void main(String[] args) {

//        String name = "SAMI";
//        System.out.println(name);
//        System.out.println(name.toLowerCase());

        System.out.println(getDaysInMonth("FeBruArY"));
        System.out.println(getDaysInMonth("decEMbeR"));
        System.out.println(getDaysInMonth("NovEmber"));
        System.out.println(getDaysInMonth("MAY"));
        System.out.println(getDaysInMonth("July"));
        System.out.println(getDaysInMonth("AUGust"));
    }

    public static int getDaysInMonth(String month) {
        int numOfDays = -1;

        switch(month.toLowerCase()) {
            case "january": case "march": case "may": case "july": case "august": case "october": case "december":
                numOfDays = 31;
                break;
            case "february":
                numOfDays = 28;
                break;
            case "april": case "june": case "september": case "november":
                numOfDays = 30;
                break;
            default:
                return numOfDays;
        }
        return numOfDays;
    }

}
