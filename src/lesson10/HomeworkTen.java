package lesson10;

public class HomeworkTen {
    public static void main(String[] args) {

        System.out.println(evenNumber(-20));
        split();
        System.out.println(oddNumber(15));
        split();
        //  Напишите программу, которая проверяет год на високосность. Кратный четырём.
        System.out.println(leapYear(2020));//true
        System.out.println(leapYear(2021));//false
        System.out.println(leapYear(1995));// false
        split();
        System.out.println(leapYearExtra(2021));
        split();
        findNumbers();

    }
    public static boolean evenNumber(int number) {
        return number % 2 == 0;
    }
    public static void split() {
        System.out.println("============");
    }

    public static boolean oddNumber(int number) {
       // return number % 2 != 0;
        return !evenNumber(number);
    }
    private static boolean leapYear(int year) {
        return year % 4 == 0;
    }

    //  Напишите программу, которая находит числа кратные 11 между a и b.

    public static boolean leapYearExtra(int year) {
        //return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        // return year%400==0||year%4==0^^year%100==0;
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    public static void findNumbers() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i + " required digits");
            }
        }

    }
}
