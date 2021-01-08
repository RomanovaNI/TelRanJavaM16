package lesson11;

import lesson12.MyColor;

public class HomeworkEleven {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"
        System.out.println(fizzString("ikibok"));// → "ikibok"
        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true
        split2();
        // System.out.println(lessBy10(1, 7, 11));// → true
        // System.out.println(lessBy10(1, 7, 10));// → false
        // System.out.println(lessBy10(11, 1, 7));// → true
        System.out.println(MyColor.ANSI_PURPLE + (redTicket(2, 2, 2) + MyColor.ANSI_RESET));//→ 10
        System.out.println(redTicket(2, 2, 1)); //→ 0
        System.out.println(redTicket(0, 0, 0));// → 5
        System.out.println(redTicket(0, 2, 2));// → 1
        System.out.println(redTicket(0, 1, 2));// → 1???
        System.out.println(redTicket(5, 5, 5));// → 0
        split2();
        System.out.println(fizzStringTwo(MyColor.ANSI_CYAN + MyColor.ANSI_YELLOW_BACKGROUND + "fig" + MyColor.ANSI_RESET));
    }

    private static int redTicket(int a, int b, int c) {
        if (a > 2||b>2||c>2) {
return 0;
        }
        int min = 0;
        int max = 2;
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
            //   b and c are different from a
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    //  private static boolean lessBy10(int a, int b, int c) {}
    public static void split2() {
        System.out.println("============");
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        // if (a<b<c||a>b<c&&bOk){
        return a < b && b < c || a >= b && a < c && bOk;

    }

    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else {
            return str;
        }
    }

    private static String fizzStringTwo(String str) {

        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equals("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    private static String fizzStringThree(String str) {
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            return "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            return "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            return "Buzz";
        } else {
            return str;
        }
    }

}
