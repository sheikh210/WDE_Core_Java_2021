package controlFlow;

public class WhichMonth {

    public static void main(String[] args) {
        WhichMonth month = new WhichMonth();

        String monthName = month.getMonthName(15);

        System.out.println(monthName);
    }

    // Switch-Case (Another type of conditional control flow statement)
    public String getMonthName(int monthNumber) {

        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
        String monthName;

        switch(monthNumber) {
            case 1:
                monthName =  monthNames[0];
                break;
            case 2:
                monthName =  "February";
                break;
            case 3:
                monthName =  "March";
                break;
            case 4:
                monthName =  "April";
                break;
            case 5:
                monthName =  "May";
                break;
            case 6:
                monthName =  "June";
                break;
            case 7:
                monthName =  "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "NOT A VALID MONTH NUMBER";
                break;
        }

        return monthName;
    }

}
