package lesson13;

public class HomeworkThirteen {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));// → 10
        System.out.println(redTicket(2, 2, 1));// → 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(1, 2, 5));// → 0
        System.out.println(redTicket(1, 2, 2));// → 1
        System.out.println(redTicket(5, 0, 2));// → 0
        System.out.println(redTicket(5, 5, 5));// → 0
        split();
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java"));// → "ya"
        System.out.println(lastChars("hi", ""));// → "h@"
        System.out.println(lastChars("", "play"));// → "h@"
        System.out.println(lastChars("", ""));// → "h@"
        split();
        double finalPrice = countCost(8, 4, 180, 175);
        System.out.println("Total " + finalPrice);
    }

    private static double countCost(int doors, int windows, double high, double wide) {
        return doorsPrice(doors) + windowsPrice(windows, high, wide);
    }

    private static double windowsPrice(int windows, double high, double wide) {
        high = high / 100;
        wide = wide / 100;
        double framePrice = 100.0;
        double glassPrice=100.0;
        double perimeter =(high+wide)*2;
        double area=high*wide;
        return (perimeter*framePrice+area*glassPrice)*windows;
    }

    private static double doorsPrice(int doors) {
        double doorsMeterPrice = 120.0;
        double framePrice = 100.0;
        double a = 2.0;
        double b = 0.9;
        double perimeter = (a + b) * 2;
        double area = a * b;
        return (perimeter * framePrice + area * doorsMeterPrice) * doors;
    }

    private static String lastChars(String a, String b) {
        String missingChar = "@";


        if (a.length() == 0 && b.length() > 0) {
            return missingChar + b.substring(b.length() - 1);
        } else if (a.length() > 0 && b.length() == 0) {
            return a.substring(0, 1) + missingChar;
        } else if (a.length() == 0 || b.length() == 0) {
            return missingChar + missingChar;
        } else
            return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public static void split() {
        System.out.println("--------------");
    }

    private static int redTicket(int a, int b, int c) {
        if (a > 2 || b > 2 || c > 2) {
            return 0;
        }
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }
}
