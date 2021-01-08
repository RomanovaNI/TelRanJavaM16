package lesson10;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class PractiseBoolean2 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));//→ 1
        System.out.println(teaParty(3, 8));// → 0
        System.out.println(teaParty(20, 6));// → 2
        System.out.println(twoAsOne(1, 2, 3));// → true
        System.out.println(twoAsOne(3, 1, 2));// → true
        System.out.println(twoAsOne(3, 2, 2)); //→ false
        split();
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        split2();
        System.out.println(maxMod5(2, 3));// → 3
        System.out.println(maxMod5(6, 2));// → 6
        System.out.println(maxMod5(3, 2));// → 3
        split3();
        System.out.println(blueTicket(9, 1, 0));// → 10
        System.out.println(blueTicket(9, 2, 0));// → 0
        System.out.println(blueTicket(6, 1, 4));// → 10
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab==10||bc==10||ac==10){
            return 10;
        }else if (ab==bc+10||ab==ac+10){
            return 5;
        }else {
            return 0;
        }
    }


    public static void split3() {
        System.out.println("============");
    }

    private static int maxMod5(int value1, int value2) {
        int min = Math.min(value1, value2);// or 0
        int max = Math.max(value1, value2);//or 0
        if (value1 > value2) {
            min = value2;
            max = value1;
        } else {
            min = value1;
            max = value2;
        }
        min = MyLovelyMath.myMin(value1, value2);

        if (value1 == value2) {
            return 0;
        } else if (value1 % 5 == value2 % 5) {
            return min;
        } else {
            return max;
        }
    }

    public static void split2() {
        System.out.println("============");
    }

    private static boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10;
    }

    public static void split() {
        System.out.println("============");
    }

    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

    private static int teaParty(int tea, int candy) {
        if (tea >= candy * 2 || candy >= tea * 2 && tea >= 5 && candy >= 5) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int teaPartyOne(int tea, int candy) {

        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else {
            return 1;
        }
    }

}
