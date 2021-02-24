package controlFlow;

public class LeapYearChallenge {

    /*
    Write a method isLeapYear() with a parameter of type int named year
        The parameter needs to be greater than or equal to 1 AND less than or equal to 9999
        If the parameter is not in that range, return false
        Otherwise, if it’s in the valid range, calculate if year is a leap year, and return true if it is
            HINT: A year is a leap year if it is divisible by 4, but not by 100, or if it is divisible by 400
                Examples:
                isLeapYear(-1600);
                Returns false, since the argument is not within the range
                isLeapYear(1600);
                Returns true
                isLeapYear(2022);
                Returns false, since 2022 is not a leap year
                isLeapYear(2020);
                Returns true
    */
    /*
    Write another method getDaysInMonth() which accepts 2 parameters of type int, called month and year
        If the parameter month is <1 or >12, return -1
        If the parameter year is <1 or >9999, then return -1
        This method needs to return the number of days in a month
        BE CAREFUL ABOUT LEAP YEARS (29 days in month 2)
            Examples:
            getDaysInMonth(1, 2020);
            Returns 31, since Jan has 31 days
            getDaysInMonth(2, 2020);
            Returns 29
            getDaysInMonth(2, 2021);
            Returns 28
            getDaysInMonth(-7, 2026);
            Returns -1, since month parameter is invalid
            getDaysInMonth(2, -2020);
            Returns -1, since parameter year is outside of range (1-9999)
     */

    public static void main(String[] args) {
        LeapYearChallenge obj = new LeapYearChallenge();

        System.out.println("DAYS IN MONTH: " + obj.getDaysInMonth(7, 2015));
        System.out.println("DAYS IN MONTH: " + obj.getDaysInMonth(11, 2019));
        System.out.println("DAYS IN MONTH: " + obj.getDaysInMonth(2, 2021));
        System.out.println("DAYS IN MONTH: " + obj.getDaysInMonth(2, 2020));
    }

    public int getDaysInMonth(int month, int year) {
        int daysInMonth = -1;

        if ((month < 1) || (month > 12)) {
            return daysInMonth;
        } else if ((year < 1) || (year > 9999)) {
            return daysInMonth;
        } else {

            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if (isLeapYear(year) == false) {
                        daysInMonth = 28;
                    } else {
                        daysInMonth = 29;
                    }
                }
            }
        return daysInMonth;
    }

    public boolean isLeapYear(int year) {
        boolean flag = false;

        if (year < 1 || year > 9999) {
            return flag;

        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            flag = true;
            return flag;
        }
        return flag;
    }

}
