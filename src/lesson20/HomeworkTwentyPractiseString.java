package lesson20;

public class HomeworkTwentyPractiseString {
    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred"));// → ""
        System.out.println(seeColor("blueTimes"));// → "blue"
        System.out.println("=========");
        System.out.println(makeAbba("Hi", "Bye"));// → "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice"));// → "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up"));// → "WhatUpUpWhat"
        System.out.println("=========");
        System.out.println(extraEnd("Hello"));//→ "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"
        System.out.println("=========");
        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java")); //→ "av"
        System.out.println(withoutEnd("coding"));// → "odin"
        System.out.println("=========");
        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        System.out.println("=========");
        System.out.println(withoutEnd2("Hello"));// → "ell"
        System.out.println(withoutEnd2("abc"));// → "b"
        System.out.println(withoutEnd2("ab"));// → ""
        System.out.println("=========");
        System.out.println(nTwice("Hello", 2));// → "Helo"
        System.out.println(nTwice("Chocolate", 3));// → "Choate"
        System.out.println(nTwice("Chocolate", 1));// → "Ce"
        System.out.println("=========");
        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx"));// → true
        System.out.println(hasBad("xxbadxx"));// → false
        System.out.println("=========");
        System.out.println(conCat("abc", "cat"));// → "abcat"
        System.out.println(conCat("dog", "cat"));// → "dogcat"
        System.out.println(conCat("abc", ""));// → "abc"
        System.out.println("=========");
        System.out.println(frontAgain("edited"));// → true
        System.out.println(frontAgain("edit"));// → false
        System.out.println(frontAgain("ed"));// → true
        System.out.println("=========");
        System.out.println(without2("HelloHe"));// → "lloHe"
        System.out.println(without2("HelloHi"));// → "HelloHi"
        System.out.println(without2("Hi"));// → ""
        System.out.println(without2("HiH"));// → "HiH"
        System.out.println(without2("HappylalaHa"));// → "ppylalaHa"
        System.out.println("=========");
        System.out.println(withoutX("xHix"));// → "Hi"
        System.out.println(withoutX("xHi"));// → "Hi"
        System.out.println(withoutX("Hxix"));// → "Hxi
        System.out.println("=========");
        System.out.println(makeTags("i", "Yay")); //→ "<i>Yay</i>"
        System.out.println(makeTags("i", "Hello"));// → "<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay"));//→ "<cite>Yay</cite>"
        System.out.println("=========");
        System.out.println(firstTwo("Hello"));// → "He"
        System.out.println(firstTwo("abcdefg"));// → "ab"
        System.out.println(firstTwo("ab"));// → "ab"
        System.out.println(firstTwo("x"));// → "x"
        System.out.println("=========");
        System.out.println(comboString("Hello", "hi"));// → "hiHellohi"
        System.out.println(comboString("hi", "Hello"));// → "hiHellohi"
        System.out.println(comboString("aaa", "b"));// → "baaab"
        System.out.println(comboString("aaa", ""));// → "aaa"
        System.out.println("=========");
        System.out.println(right2("Hello"));// → "loHel"
        System.out.println(right2("java"));// → "vaja"
        System.out.println(right2("Hi"));// → "Hi
        System.out.println("=========");
        System.out.println(middleTwo("string"));// → "ri"
        System.out.println(middleTwo("code"));// → "od"
        System.out.println(middleTwo("Practice"));// → "ct"
        System.out.println("=========");

    }

    private static String  middleTwo(String str) {
        int middle=str.length()/2;
        return str.substring(middle-1,middle+1);
    }

    private static String  right2(String str) {
        return str.substring(str.length()-2)+str.substring(0, str.length()-2);
    }

    private static String comboString(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    private static String firstTwo(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    private static String makeTags(String tag, String str) {
        return "<" + tag + ">" + str + "<" + "/" + tag + ">";
    }


    private static String withoutX(String str) {
        if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        } else if (str.startsWith("x")) {
            return str.substring(1);
        } else if (str.endsWith("x")) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }


    private static String without2(String str) {
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }


    private static boolean frontAgain(String word) {
        if (word.length() == 2) {
            return true;
        } else if (word.substring(0, 2).equals(word.substring(word.length() - 2))) {
            return true;
        } else {
            return false;
        }
    }

    private static String conCat(String str1, String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return str1 + str2;
        } else if (str1.substring(str1.length() - 1).equals(str2.substring(0, 1))) {
            return str1 + str2.substring(1);
        } else {
            return str1 + str2;
        }
    }

    private static boolean hasBad(String str) {
        return str.startsWith("bad") ||
                str.substring(1, 2).equals("b") && str.substring(2, 3).equals("a") && str.substring(3, 4).equals("d");
    }

    private static String nTwice(String str, int n) {
        int strLength = str.length();
        int lastPartOfStr = strLength - n;
        //   System.out.println(str.substring(0,n));
        return str.substring(0, n) + str.substring(lastPartOfStr);
    }

    private static String withoutEnd2(String str) {
        int strLengthMinusLastLetter = str.length() - 1;
        return str.substring(1, strLengthMinusLastLetter);
    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        int strLength = str.length() - 1;
        return str.substring(1, strLength);
    }

    private static String extraEnd(String word) {
        int wordLength = word.length() - 2;
        //System.out.println(word.substring(wordLength));
        return word.substring(wordLength) + word.substring(wordLength) + word.substring(wordLength);
    }

    private static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else
            return "";
    }
}
