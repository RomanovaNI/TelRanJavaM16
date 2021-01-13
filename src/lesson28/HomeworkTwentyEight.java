package lesson28;

import lesson24.HomeworkTwentyFour;

import java.util.Arrays;

public class HomeworkTwentyEight {
    public static void main(String[] args) {
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10
        System.out.println(endOther("Hiabc", "abc")); //→ true
        System.out.println(endOther("AbC", "HiaBc")); //→ true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(round10(4));
        HomeworkTwentyFour.printMaschine(makePi());
    }

    private static int[] makePi() {
        double pi = 3.14;
        double tempPi = pi * 100;
        int magicPi = (int) tempPi;
        // System.out.println(magicPi);
        int[] arrayPi = new int[]{magicPi};

        return arrayPi;
    }

    private static boolean endOther(String str1, String str2) {
        String newStr1 = str1.toLowerCase();
        String newStr2 = str2.toLowerCase();
        return newStr1.endsWith(newStr2) || newStr2.endsWith(newStr1);
    }

    private static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int number) {


        if (number % 10 == 1 || number % 10 == 2 || number % 10 == 3 || number % 10 == 4 || number % 10 == 0) {
            return number - number % 10;
        } else if (number % 10 <= 9) {
        }
        return number + (10 - number % 10);

    }

}
