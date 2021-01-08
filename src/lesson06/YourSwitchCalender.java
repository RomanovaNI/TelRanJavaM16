package lesson06;

public class YourSwitchCalender {
    public static void main(String[] args) {
        String month = "february";
        System.out.println(stringToIntMonthNumber(month));

    }

    public static int stringToIntMonthNumber(String month) {
        month=month.toLowerCase();
        int monthNumber = 0;
        switch (month) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default:
                monthNumber= -1;
        }


        return monthNumber;
    }
}
